package Models.UserModels;

public class UserViewModel {
	String user;
	int id;
	
	public UserViewModel(){	}
	
	public UserViewModel(int id, String user){
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
}
