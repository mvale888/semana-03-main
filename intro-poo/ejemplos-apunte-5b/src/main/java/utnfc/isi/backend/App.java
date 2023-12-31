package utnfc.isi.backend;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner miEscaner = new Scanner(System.in);
        System.out.println("Calculador de triängulos");
        
        //Declaro las referencias a los objetos
        Punto p1, p2, p3;
        Triangulo tritri;
        double auxX, auxY;
        
        System.out.println("Ingrese el punto 1");
        System.out.print("Ingrese x: ");
        auxX = miEscaner.nextDouble();
        System.out.print("Ingrese y: ");
        auxY = miEscaner.nextDouble();
        p1 = new Punto(auxX, auxY);
        
        System.out.println("Ingrese el punto 2");
        System.out.print("Ingrese x: ");
        auxX = miEscaner.nextDouble();
        System.out.print("Ingrese y: ");
        auxY = miEscaner.nextDouble();
        p2 = new Punto(auxX, auxY);
        
        System.out.println("Ingrese el punto 3");
        System.out.print("Ingrese x: ");
        auxX = miEscaner.nextDouble();
        System.out.print("Ingrese y: ");
        auxY = miEscaner.nextDouble();
        p3 = new Punto(auxX, auxY);
        
        //Construyo el vector en base a los puntos cargados
        tritri = new Triangulo(p1, p2, p3);

        System.out.println("El triángulo cargado es: " + tritri);
        System.out.println("\tEl perímetro es: " + tritri.perimetro());
        System.out.println("\tEl área es: " + tritri.area());
        System.out.println("Fin!");
        
    }
    
}
