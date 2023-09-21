package Models.InputsAndOutputsModels;

import java.util.Date;

public class HistoryViewModel {
	String code, name, type;
	Date date;
	int quantity, id;

	public HistoryViewModel() {
	}
	
	public int GetId(){
		return this.id;
	}
	
	public  void SetId(int id){
		this.id = id;
	}
	
	public String GetCode(){
		return this.code;
	}
	
	public  void SetCode(String code){
		this.code = code;
	}
	
	public String GetName(){
		return this.name;
	}
	
	public  void SetName(String name){
		this.name = name;
	}
	
	public Date GetDate(){
		return this.date;
	}
	
	public  void SetDate(Date date){
		this.date = date;
	}
	
	public int GetQuantity(){
		return this.quantity;
	}
	
	public  void SetQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public String GetType(){
		return this.type;
	}
	
	public  void SetType(String type){
		this.type = type;
	}
}
