package Pack1;

public class Alumno {
    private String Nombre;
    private String Grupo;
    private String Boleta;
    private String Promedio;
    
    public Alumno(String Nombre, String Grupo, String Boleta, String Promedio) {
	this.Nombre = Nombre;
	this.Grupo = Grupo;
	this.Boleta = Boleta;
	this.Promedio = Promedio;
    }

    public String getNombre() {
	return Nombre;
    }

    public String getGrupo() {
	return Grupo;
    }

    public String getBoleta() {
	return Boleta;
    }

    public String getPromedio() {
	return Promedio;
    }
    
    public String getAttributes(){
	return "Nombre: "+Nombre+"\nGrupo: "+Grupo+"\nBoleta: "+Boleta+"\nPromedio: "+Promedio+"\n";
    }
}
