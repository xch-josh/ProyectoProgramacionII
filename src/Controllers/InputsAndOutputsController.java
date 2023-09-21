package Controllers;

import Models.DBConnection;
import Models.InputsAndOutputsModels.HistoryViewModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputsAndOutputsController {
	public List<HistoryViewModel> GetData(){
		try (Connection connection = new DBConnection().Connect()){
			List<HistoryViewModel> lst = new  ArrayList<>();
			Connection cnn = connection;
			Statement st;
			ResultSet rs;
			
			st = cnn.createStatement();
			rs = st.executeQuery("SELECT historialentradassalidas.id, historialentradassalidas.codigoProducto, producto.nombreProducto, historialentradassalidas.cantidad, historialentradassalidas.tipo, historialentradassalidas.fecha FROM historialentradassalidas INNER JOIN producto ON historialentradassalidas.codigoProducto = producto.codigoProducto");
			
			while (rs.next()) {
				HistoryViewModel model = new HistoryViewModel();
				
				model.SetId(rs.getInt("id"));
				model.SetCode(rs.getString("codigoProducto"));
				model.SetName(rs.getString("nombreProducto"));
				model.SetDate(rs.getDate("fecha"));
				model.SetQuantity(rs.getInt("cantidad"));
				model.SetType(rs.getBoolean("tipo") == true ? "Entrada" : "Salida");
				
				lst.add(model);
			}
			
			return lst;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
