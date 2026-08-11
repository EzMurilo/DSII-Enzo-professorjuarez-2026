/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Aluno CA
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacao op = new Operacao();
        
        op.soma(5, 3);
        op.imprimir_soma();
        
        op.sub(5, 3);
        op.imprimir_sub();
        
        op.multi(5, 3);
        op.imprimir_multi();
        
        op.div(5, 3);
        op.imprimir_div();
        // TODO code application logic here
    }
    
}
