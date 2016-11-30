
package Personas;


public class M_hombre extends persona{
    //Superconstructor
    
    public M_hombre(String nombres, String apellidos) {
        super(nombres, apellidos);
    }
    
    public void afeitar(){
        System.out.println("Afeitar");
    }
}
