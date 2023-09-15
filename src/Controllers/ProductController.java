package Controllers;

import CustomExceptions.InsufficientStokException;
import Models.DBConnection;
import Models.ProductModels.ProductAddModel;
import Models.ProductModels.ProductEditModel;
import Models.ProductModels.ProductViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.naming.InsufficientResourcesException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ProductController {
	public List<ProductViewModel> GetData(){
		try (DBConnection connection = new DBConnection()){
			List<ProductViewModel> lst = new  ArrayList<>();
			Connection cnn = connection.Connect();
			Statement st;
			ResultSet rs;
			
			st = cnn.createStatement();
			rs = st.executeQuery("SELECT * FROM producto");
			
			while (rs.next()) {
				ProductViewModel model = new ProductViewModel(rs.getString("codigoProducto"), rs.getString("nombreProducto"), rs.getDouble("precioUnitario"), rs.getInt("cantidadProducto"), rs.getDate("fechaVencimiento"));
				lst.add(model);
			}
			
			return lst;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean  Insert(ProductAddModel model) {
		try (DBConnection connection = new DBConnection()){
			PreparedStatement insertQuery = null;
			
			insertQuery = connection.Connect().prepareStatement("INSERT INTO producto VALUES (?, ?, ?, ?, ?)");
			
			insertQuery.setString(1, model.GetCodigo());
			insertQuery.setString(2, model.GetNombre());
			insertQuery.setDouble(3, model.GetPrecio());
			insertQuery.setInt(4, model.Getcantidad());
			
			if (model.GetFechaV() != null){
				String dateFormated = new  SimpleDateFormat("yyyy-MM-dd").format(model.GetFechaV()).toString();
				java.sql.Date sqlDate = java.sql.Date.valueOf(dateFormated);
				insertQuery.setDate(5,  sqlDate);
			}
			else{
				insertQuery.setNull(5, java.sql.Types.DATE);
			}
			
			int result = insertQuery.executeUpdate();
			
			insertQuery.close();
			
			if (result > 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean Update(ProductEditModel model) {
		try (DBConnection connection = new DBConnection()){
			PreparedStatement insertQuery  = connection.Connect().prepareStatement("UPDATE producto SET nombreProducto = ?, precioUnitario = ?, cantidadProducto = ?, fechaVencimiento = ? WHERE codigoProducto = ?");
			
			insertQuery.setString(1, model.GetNombre());
			insertQuery.setDouble(2, model.GetPrecio());
			insertQuery.setInt(3, model.Getcantidad());
			
			if (model.GetFechaV() != null){
				String dateFormated = new  SimpleDateFormat("yyyy-MM-dd").format(model.GetFechaV()).toString();
				java.sql.Date sqlDate = java.sql.Date.valueOf(dateFormated);
				insertQuery.setDate(4,  sqlDate);
			}
			else{
				insertQuery.setNull(4, java.sql.Types.DATE);
			}
			
			insertQuery.setString(5, model.GetCodigo());
			
			int result = insertQuery.executeUpdate();
			
			insertQuery.close();
			
			if (result > 0)
				return true;
			else
				return  false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public void Delete(String codigoProducto) {
		try (Connection connection = new DBConnection().Connect()){
			PreparedStatement insertQuery  = connection.prepareStatement("DELETE FROM producto WHERE codigoProducto = ?");
			
			insertQuery.setString(1, codigoProducto);
			
			insertQuery.executeUpdate();
			
			insertQuery.close();
		} catch (Exception e) {
		}
	}
	
	public void ExportToPDF(String root, String archi) {
		try(Connection cnn = new DBConnection().Connect()) {
			String rutaInforme = root;
			JasperPrint informe = JasperFillManager.fillReport(rutaInforme, null, cnn);
			JasperExportManager.exportReportToPdfFile(informe, archi);

			JasperViewer ventanavisor = new JasperViewer(informe, false);
			ventanavisor.setTitle("INFORME");
			ventanavisor.setVisible(false);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR DOCUMENTO");
		}
	}
	
	public boolean Out(String code, int quantity){
		try(Connection cnn = new DBConnection().Connect()){
			PreparedStatement query = cnn.prepareStatement("SELECT cantidadProducto FROM producto WHERE codigoProducto = ?");
			query.setString(1, code);
			
			ResultSet rs = query.executeQuery();
			
			if (rs.next()){
				if (rs.getInt("cantidadProducto") >= quantity){
					PreparedStatement subtractQuery = cnn.prepareStatement("UPDATE producto SET cantidadProducto = cantidadProducto - ? WHERE codigoProducto = ?");
					subtractQuery.setInt(1, quantity);
					subtractQuery.setString(2, code);
					
					int result = subtractQuery.executeUpdate();
					
					subtractQuery.close();
					query.close();
					
					if (result > 0)
						return true;
					else
						return false;
				}
				else
					throw new InsufficientStokException("No hay suficientes existencias");
			}
			else{
				return false;
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			return  false;
		}
	}
}
