package entidades;

public class Trabajador {
	
	private String dni;
	private String nombre;
	private String apellido;
	private String dirección;
	private String email;
	private float teléfono;
	private int edad;
	private String cargo;
	private boolean sexo;
	private boolean extranjero;
	
	public Trabajador() {
		
		
	}
    
	public Trabajador(String DNI, String Nombre, String Apellido, String Dirección, String Email, float Teléfono,
			int Edad, String Cargo, boolean Sexo, boolean Extranjero) {
		
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDirección(dirección);
		this.setEmail(email);
		this.setTeléfono(teléfono);
		this.setEdad(edad);
		this.setExtranjero(extranjero);
	}
	
	public String getDni() {
		return dni;
		
	}
	
	public void setDni(String dni) {
		if (dni.length() > 9) {
			throw new IllegalArgumentException("El largo campo del dni no puede ser superior a 9");
		}else if (dni.length() < 9) {
			
			//String.format("%09d" , dni);
		}
		
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		if (nombre.length() < 3 || nombre.length() > 30) {
			throw new IllegalArgumentException("El largo debe estar 3 y 30 caracteres");
		}
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		if (apellido.length() < 3 || apellido.length() > 30) {
			throw new IllegalArgumentException("El largo debe estar 3 y 30 caracteres");
		}
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if(edad < 18) {
			new IllegalArgumentException("La persona debe ser mayor de edad");
			
		}
		this.edad = edad;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public boolean isSexo() {
		return sexo;
	}
	
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	public boolean isExtranjero() {
		return extranjero;
	}
	
	public void setExtranjero(boolean extranjero) {
		this.extranjero = extranjero;
	}
	
	public String getDirección() {
		return dirección;
	}
	
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public float getTeléfono() {
		return teléfono;
	}
	
	public void setTeléfono(float teléfono) {
		this.teléfono = teléfono;
	}
	
	public String toString() {
		return "Trabajador [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + dirección
				+ ", email=" + email + ", telefono=" + teléfono + ", edad=" + edad + ", cargo=" + cargo + ", sexo="
				+ sexo + ", extranjero=" + extranjero + "]";
	}
}
