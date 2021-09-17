package Prueba;

public abstract class Personaje {
    protected String Nombre;
    protected int HP;

    public Personaje(String Nombre, int HP){
        this.Nombre = Nombre;
        this.HP = HP;
    }

    public String getAttributes(){
        return "Nombre: "+Nombre+"\nHP: "+HP;
    }

    public abstract void Saludo();
}
