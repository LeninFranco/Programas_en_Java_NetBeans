package Pack1;

import java.util.*;

public class Hash {
    
    private final HashMap<Integer, LinkedList<Alumno>> H1;
    private LinkedList<Alumno> aux;
    
    public Hash(){
	this.H1 = new HashMap();
    }
    
    private Integer getKey(Alumno a){
	String key = "";
	key += a.getBoleta().charAt(4);
	return Integer.parseInt(key);
    }
    
    public void Insert(Alumno a){
	Integer key = getKey(a);
	aux = new LinkedList<>();
	if(H1.containsKey(key)){
	    aux = H1.get(key);
	    aux.add(a);
	    H1.put(key,aux);
	}
	else{
	    aux.add(a);
	    H1.put(key,aux);
	}
	System.out.println("Se ha ingresado el alumno correctamente");
    }
    
    public void Delete(Alumno a){
	Integer key = getKey(a);
	Boolean band = false;
	aux = new LinkedList<>();
	int index = 0;
	if(H1.containsKey(key)){
	    aux = H1.get(key);
	    for(Alumno i:aux){
		if(i.getBoleta().equals(a.getBoleta())){
		    band = true;
		    index = aux.indexOf(i);
		    break;
		}
	    }
	    if(band){
		aux.remove(index);
		H1.put(key,aux);
		System.out.println("Se ha eliminado al alumno correctamente");
	    }
	    else{
		System.out.println("El alumno no esta en el registro, por lo que no se pudo eliminar");
	    }
	}
	else{
	    System.out.println("El alumno no esta en el registro, por lo que no se pudo eliminar");
	}
    }
    
    public void Search(Alumno a){
	Integer key = getKey(a);
	Boolean band = false;
	aux = new LinkedList<>();
	int index = 0;
	if(H1.containsKey(key)){
	    aux = H1.get(key);
	    for(Alumno i:aux){
		if(i.getBoleta().equals(a.getBoleta())){
		    band = true;
		    index = aux.indexOf(i);
		    break;
		}
	    }
	    if(band){
		System.out.println("Se ha encontrado al alumno correctamente");
		System.out.println(aux.get(index).getAttributes());
	    }
	    else{
		System.out.println("El alumno no esta en el registro");
	    }
	}
	else{
	    System.out.println("El alumno no esta en el registro");
	}
    }

    public void Show(){
	aux = new LinkedList<>();
	for(Integer i:H1.keySet()){
	    System.out.println(i+": \n");
	    aux = H1.get(i);
	    for(Alumno j:aux){
		System.out.println(j.getAttributes());
	    }
	    System.out.println("");
	}
    }
   
}
