
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class NUEVO {
    public int n1;
    public int n2;

    public NUEVO(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public void calcular(){
        int alma;
        
        alma = n1*n2;
        JOptionPane.showMessageDialog(null,alma);
    }
    
    
    
}
