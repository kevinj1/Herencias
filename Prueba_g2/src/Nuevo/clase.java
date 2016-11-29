
package Nuevo;

import javax.swing.JOptionPane;


public class clase {
    public int numero1;
    public int numero2;

    public clase(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void calcular(){
        int alma;
        
        alma = numero1+numero2;
        JOptionPane.showMessageDialog(null,alma);
    }
    
}
