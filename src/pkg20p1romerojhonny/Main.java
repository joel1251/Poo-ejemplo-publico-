/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20p1romerojhonny;
import java.util.Scanner;
/**
 *
 * @author ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        Scanner scanner =new Scanner (System.in);
        
        
        
        System.out.print("Universidad de las fuerzas Armadas Espe");
        System.out.print("Nombre Jhonny romero");
        System.out.print("fundamentos de programacion ");
        System.out.print("Fecha:10/11/2023");

        
        System.out.print("Ingrese el primer  numero");
        double numero1=scanner.nextDouble();
        
        System.out.print("Ingrese el segundo numero:");
        double numero2= scanner.nextDouble();
        
        double resultado =numero1 + numero2;
        double resultado1 =numero1 - numero2;
        double resultado2 =numero1 * numero2;
        double resultado3 =numero1 / numero2;
        
        
        System.out.println(" La suma "+ numero1 +" y "+ numero2+" Es igual "+resultado);
        System.out.println(" La resta "+ numero1 +" y "+ numero2+" Es igual "+resultado1);
        System.out.println(" La multiplicacion "+ numero1 +" y "+ numero2+" Es igual "+resultado2);
        System.out.println(" La division "+ numero1 +" y "+ numero2+" Es igual "+resultado3);
    }
    
}
