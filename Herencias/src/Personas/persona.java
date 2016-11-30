
package Personas;

import javax.swing.JOptionPane;


public class persona {
    public String nombres;
    public String apellidos;

    public persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void comer(){
        System.out.println("Comer");
    }
    public void dormir(){
        System.out.println("Dormir");
    }
}
