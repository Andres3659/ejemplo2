/*
 Guillermo tiene n dolares. Luis tiene la mitad de lo que posee Guillermo.
Jun tiene la mitad de lo que posee Luis y Guillermos
juntos. Hacer un programa que calcule e imprima la cantidad
de dinero que tienen entre los tres
 */
package ejemplo2;

import java.util.Scanner;


public class Ejemplo2 {

    public static void main(String[] args) {
        float n,Dluis, Djuan, Tdinero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de dinero que posee Guillermo: ");
        n = entrada.nextFloat();
        
        Dluis = n/2;
        Djuan = (n+Dluis)/2;
        
        Tdinero = n + Dluis + Djuan;
        
        System.out.println("La cantidad de dinero de Guillermo es: "+n);
        System.out.println("La cantidad de dinero de Luis es: "+Dluis);
        System.out.println("La cantidad de dinero de Juan es: "+Djuan);
        System.out.println("La cantidad de dinero entre los tres es de: "+Tdinero);
    }
    
}
