package projeto_temperatura_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float c;

        System.out.println("Informe a temperatura em Celsius: ");
        c = input.nextFloat();

        System.out.println("A temperatura em Fahrenheit é: "+((9*c+160)/5));
        
    }
    
}
