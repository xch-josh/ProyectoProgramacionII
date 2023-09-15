package Controllers;

import CustomExceptions.InvalidPassException;
import CustomExceptions.UnexistUserException;
import Models.DBConnection;
import Models.UserModels.UserAddModel;
import Models.UserModels.UserEditModel;
import Models.UserModels.UserViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public class UserController {
	public List<UserViewModel> GetData(){
		try (DBConnection connection = new DBConnection()){
			List<UserViewModel> lst = new  ArrayList<>();
			Connection cnn = connection.Connect();
			Statement st;
			ResultSet rs;
			
			st = cnn.createStatement();
			rs = st.executeQuery("SELECT id, usuario FROM usuarios");
			
			while (rs.next()) {
				UserViewModel model = new UserViewModel(rs.getInt("id"), rs.getString("usuario"));
				lst.add(model);
			}
			
			return lst;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean  Insert(UserAddModel model) {
		try (DBConnection connection = new DBConnection()){
			PreparedStatement insertQuery = null;
			String ecryptedPass = DigestUtils.md5Hex(model.GetPass());
			
			insertQuery = connection.Connect().prepareStatement("INSERT INTO usuarios (usuario, pass) VALUES (?, ?)");
			
			insertQuery.setString(1, model.GetUser());
			insertQuery.setString(2, ecryptedPass);
			
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
	
	public boolean  Update(UserEditModel model) {
		try (DBConnection connection = new DBConnection()){
			PreparedStatement insertQuery = null;
			
			if (model.GetPass() != null){
				String ecryptedPass = DigestUtils.md5Hex(model.GetPass());
				insertQuery = connection.Connect().prepareStatement("UPDATE usuarios SET usuario = ?, pass = ? WHERE id = ?");
				insertQuery.setString(1, model.GetUser());
				insertQuery.setString(2, ecryptedPass);
				insertQuery.setInt(3, model.GetId());
			}
			else{
				insertQuery = connection.Connect().prepareStatement("UPDATE usuarios SET usuario = ? WHERE id = ?");
				insertQuery.setString(1, model.GetUser());
				insertQuery.setInt(2, model.GetId());
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
	
	public void Delete(int id) {
		try (Connection connection = new DBConnection().Connect()){
			PreparedStatement insertQuery  = connection.prepareStatement("DELETE FROM usuarios WHERE id = ?");
			
			insertQuery.setInt(1, id);
			
			insertQuery.executeUpdate();
			
			insertQuery.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean Login(String user, String pass)  {
		try (DBConnection connection = new DBConnection()){
			String encryptedPass = DigestUtils.md5Hex(pass);
			Connection cnn = connection.Connect();
			PreparedStatement query = cnn.prepareStatement("SELECT pass FROM usuarios WHERE usuario = ?");
			query.setString(1, user);
			ResultSet rs = query.executeQuery();
			
			if (rs.next())
				if (rs.getString("pass").equals(encryptedPass)){
					query.close();
					return  true;
				}
				else
					throw  new InvalidPassException("Contraseña incorrecta");
			else
				throw new UnexistUserException("El usuario no existe");
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}
}
