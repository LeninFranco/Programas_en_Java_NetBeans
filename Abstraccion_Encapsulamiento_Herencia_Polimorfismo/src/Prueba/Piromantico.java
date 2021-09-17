package Prueba;

public class Piromantico extends Personaje{
    private int AtaqueFisico;
    private int AtaqueMagico;
    private int DefensaMagica;
    private int DefensaFisica;

    public Piromantico(String Nombre, int HP, int AtaqueFisico, int AtaqueMagico, int DefensaFisica, int DefensaMagica){
        super(Nombre,HP);
        this.AtaqueFisico = AtaqueFisico;
        this.AtaqueMagico = AtaqueMagico;
        this.DefensaFisica = DefensaFisica;
        this.DefensaMagica = DefensaMagica;
    }

    @Override
    public String getAttributes(){
        return super.getAttributes()+"\nAtaque Fisico: "+AtaqueFisico+"\nAtaque Magico: "+AtaqueMagico+"\nDefensa Fisica: "+DefensaFisica+"\nDefensa Magica: "+DefensaMagica;
    }

    @Override
    public void Saludo(){
        System.out.println("Hola soy un Piromantico");
    }
}

