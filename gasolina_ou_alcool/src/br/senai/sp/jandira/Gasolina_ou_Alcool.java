package br.senai.sp.jandira;

import java.util.Scanner;

public class Gasolina_ou_Alcool {

	public static void main(String[] args) {

   Scanner teclado = new Scanner (System.in);
   
   System.out.println("*****************************");
   System.out.println("  GASOLINA OU ÁLCOOL?");
   System.out.println("*****************************");
	System.out.println();
   
   System.out.println("Preço da gasolina: ");
   double gasolina = teclado.nextDouble();
   System.out.println("Preço da alcool");
   double alcool = teclado.nextDouble();
   System.out.println("*****************************");
   
   double div = alcool/gasolina;
	System.out.println();
    if (div< 0.70) {
    	System.out.println("No momento é mais vantajoso abastecer com Álcool!");
    }else {
    	System.out.println("No momento é mais vantajoso abastecer com Gasolina!");
    	System.out.println();
    	System.out.println("*****************************");
    }
    
   
   
   
   
	  
	  
	}

}
