
package herencias;

import Personas.M_hombre;
import Personas.M_mujer;


public class Herencias {

    public static void main(String[] args) {
        M_hombre objeto= new M_hombre("Kevin","Lojan");
        M_mujer objeto1= new M_mujer("Karina","Lopez");  
        
        System.out.println("Esto es del hombre");
        objeto.setNombres("Juan");
        objeto.setApellidos("Rojas");
        System.out.println(objeto.getNombres()+" "+objeto.getApellidos());
        objeto.comer();
        objeto.dormir();
        objeto.afeitar();
        
        System.out.println("\nEsto es de la mujer");
        objeto1.setNombres("Maria");
        objeto1.setApellidos("Jaramillo");
        System.out.println(objeto1.getNombres()+" "+objeto1.getApellidos());
        objeto1.comer();
        objeto1.maquillar();
        objeto1.dormir();
        
    }
    
}
