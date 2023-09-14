package Models.ProductModels;

import java.util.Date;

public class ProductViewModel {
	private String codigoProducto, nombreProducto;
	private  int cantidadProducto;
	private double precioUnitario;
	private Date fechaVencimiento;
	
	public  ProductViewModel(){
		
	}
	
	public ProductViewModel(String codigoProducto, String nombreProducto, double precioUnitario, int cantidadProducto, Date fechaVencimiento){
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
		this.cantidadProducto = cantidadProducto;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	//METODOS SET Y GET PARA codigoProducto
	public String GetCodigo(){
		return codigoProducto;
	}
	
	public void SetCodigo(String codigoProducto){
		this.codigoProducto = codigoProducto;
	}
	
	//METODOS SET Y GET PARA nombreProducto
	public String GetNombre(){
		return nombreProducto;
	}
	
	public void SetNombre(String nombreProducto){
		this.nombreProducto = nombreProducto;
	}
	
	//METODOS SET Y GET PARA precioUnitario
	public double GetPrecio(){
		return precioUnitario;
	}
	
	public void SetPrecio(double precioUnitario){
		this.precioUnitario = precioUnitario;
	}
	
	//METODOS SET Y GET PARA cantidadProducto
	public int Getcantidad(){
		return cantidadProducto;
	}
	
	public void SetCantidad(int cantidadProducto){
		this.cantidadProducto = cantidadProducto;
	}
	
	//METODOS SET Y GET PARA fechaVencimiento
	public Date GetFechaV(){
		return fechaVencimiento;
	}
	
	public void SetFechaV(Date fechaVencimiento){
		this.fechaVencimiento = fechaVencimiento;
	}
}
