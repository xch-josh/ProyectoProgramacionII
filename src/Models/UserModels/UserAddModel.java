package Models.UserModels;

public class UserAddModel {
	String user, pass;
	int id;
	
	public UserAddModel(){	}
	
	public UserAddModel(int id, String user, String pass){
		this.id = id;
		this.user = user;
	}
	
	public int GetId(){
		return  this.id;
	}
	
	public void SetId(int id){
		this.id = id;
	}
	
	public String GetUser(){
		return  this.user;
	}
	
	public void SetUser(String user){
		this.user = user;
	}
	
	public String GetPass(){
		return  this.pass;
	}
	
	public void SetPass(String pass){
		this.pass = pass;
	}
}
