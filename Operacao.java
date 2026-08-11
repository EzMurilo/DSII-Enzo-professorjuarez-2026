/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Aluno CA
 */
public class Operacao {
    int total_soma;
    int total_multi;
    int total_sub;
    float total_div;
    
    public int soma(int a,int b){
       total_soma = a + b;
       return total_soma;
    }
    public int sub(int c, int d){
        total_sub = c - d;
        return total_sub;
    }
    
    public int multi(int e, int f){
        total_multi = e * f;
        return total_multi;
    }
    public float div(float g, float h){
        total_div = g / h;
        return total_div;
    }
    
 public void imprimir_soma(){
        
    System.out.println("Valor da soma: "+ total_soma);
    }
  public void imprimir_sub(){
        
    System.out.println("Valor da subtração: "+ total_sub);
    }
 
 public void imprimir_multi(){
     System.out.println("Valor da multiplicação: "+ total_multi);
 }
 public void imprimir_div(){
     System.out.println("Valor total divisão: "+ total_div);
 }
    }
    
