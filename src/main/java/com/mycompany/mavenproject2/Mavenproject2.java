/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        Scanner aa2=new Scanner(System.in);
        String enter = " ";
        System.out.println("aperte enter para ir ao calculo");
        enter = aa2.nextLine();
        

        System.out.println("escreva o primeiro numero");
        int num1 = aa.nextInt();
                
        System.out.println("digite o sinal desejado\n (+)soma (-)subtração (*)multiplicção (/)divisão");
        String sinal = aa2.nextLine();
        
        System.out.println("digite o segundo numero");
        int num2 = aa.nextInt();
        
        System.out.println("o resultado é: " + soma (num1, num2, sinal ));
        
       
            }
             public static int soma (int num1, int num2, String sinal){
                 if(sinal.equalsIgnoreCase("+")){
                     return num1+ num2;
                 }else if(sinal.equalsIgnoreCase("-")){
                     return num1 - num2;
                 }else if(sinal.equalsIgnoreCase("*")){
                     return num1 * num2;
                 }else if(sinal.equalsIgnoreCase("/")){
                     return num1/num2;
                     
                 
       
                 
        }
        return 0;
        
    }
}
