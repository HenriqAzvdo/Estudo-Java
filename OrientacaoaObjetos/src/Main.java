import entities.Triangle;

import java.util.Scanner;

/*
Exercício para treinar Orientação a Objetos e Criação de Funções

* Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).
* Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
* A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte (fórmula de Heron):
* area = \sqrt{p(p-a)(p-b)(p-c)}
* onde p = (a+b+c)/2
* */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //instanciando 2 triângulos 'x' e 'y'
        Triangle x, y; //inicializar as variáveis
        x = new Triangle(); //objeto x
        y = new Triangle(); //objeto y

        System.out.println("Entre com as dimensões do triângulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as dimensões do triângulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

/*Transformada em função
        double pX = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt( pX * ( pX - x.a ) * ( pX - x.b ) * ( pX - x.c ));
        double pY = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt( pY * ( pY - y.a ) * ( pY - y.b ) * ( pY - y.c ));
*/
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triângulo x: %.4f%n", areaX);
        System.out.printf("Área do triângulo y: %.4f%n", areaY);

/*Transformada em função
        if (areaX > areaY) {
            System.out.println("Maior área: x");
        } else {
            System.out.printf("Maior área: y");
        }
*/
        System.out.println("Maior triângulo: "+max(areaX, areaY));


    }

    //Funções
/*
    public static double areaTriangle(double ladoA, double ladoB, double ladoC) {
        double p = (ladoA + ladoB + ladoC) / 2.0;
        double area = Math.sqrt( p * (p - ladoA) * (p - ladoB) * (p - ladoC));
        return area;
    }
*/
    public static char max(double areax, double areay) {
        char aux;
        if (areax > areay) {
            aux = 'x';
        } else {
            aux = 'y';
        }
        return aux;
    }

}