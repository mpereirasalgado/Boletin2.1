
package boletin2.pkg1;

import java.util.Scanner;

/**@author mpereirasalgado*/
public class Boletin21 
{
    public static void main(String[] args) 
    {
        float base, altura;
        System.out.println("Calculo del triangulo\nIntroducir base: ");
        Scanner dato = new Scanner(System.in);
        base=dato.nextFloat();
        System.out.println("Introducir altura: ");
        altura=dato.nextFloat();
        System.out.println("el area del triangulo es "+base*altura/2);
        
    }
    
}
