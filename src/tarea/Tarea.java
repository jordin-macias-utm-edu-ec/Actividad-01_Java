/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

/**
 *
 * @author USUARIO
 */

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;


public class Tarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int preguntasCorrectas = 0;
        int preguntasIncorrectas = 0;
        int totalPreguntas = 10;
        
        System.out.println("Menu de Opciones");
        System.out.println("Elige el nivel de dificultad:");
        System.out.println("1. Numeros de un solo digito");
        System.out.println("2. Numeros de dos digitos maximo");
        System.out.println("3. Numeros de tres digitos maximo");
        System.out.print("seleccione: ");
        
        int nivelDificultad = scanner.nextInt();
        
        System.out.println("Elige el tipo de problema aritmetico:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Divicion");
        System.out.println("5. Mezcla Aleatoria");

        int tipoProblema = scanner.nextInt();
    }    
}

        
 