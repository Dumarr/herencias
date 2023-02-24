package clases;

public class empleado extends persona{
	double salario;
	String cargo;



	public empleado(String nombre, String apellido, String direccion, int edad, int telefono, double salario,
			String cargo) {
		super(nombre, apellido, direccion, edad, telefono);
		this.salario = salario;
		this.cargo = cargo;
	}



	public void Showser() {
		System.out.println("nombre: "+nombre+"\napellido: "+apellido+"\nedad: "+edad+"\ntelefono: "+telefono
				+"\ndireccion "+direccion+"\ncargo "+cargo+"\nsalario "+salario);
	}
	

}
