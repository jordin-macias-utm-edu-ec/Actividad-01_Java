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
        int totalPreguntas = 2;
        
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
        System.out.println("4. Division");
        System.out.println("5. Mezcla aleatoria");

        int tipoProblema = scanner.nextInt();
        
        while (preguntasCorrectas < totalPreguntas) {
            int numero1 = generarNumeroAleatorio(nivelDificultad);
            int numero2 = generarNumeroAleatorio(nivelDificultad);
            String operador = obtenerOperadorAritmetico(tipoProblema);
            int resultado = realizarOperacion(numero1, numero2, operador);
            
            System.out.print("¿Cuanto es:   " + numero1 + " " + operador + " " + numero2 + "=");
            int respuestaUsuario = scanner.nextInt();
            if (respuestaUsuario == resultado) {
                preguntasCorrectas++;
                System.out.println(obtenerRespuestaPositivaAleatoria());
            }else {
                preguntasIncorrectas++;
                System.out.println(obtenerRespuestaNegativaAleatoria());
            }
        }



    }
        private static int generarNumeroAleatorio(int nivelDificultad) {
        Random random = new Random();
        int maximo = (int) Math.pow(10, nivelDificultad);
        return random.nextInt(maximo);
}

        private static String obtenerOperadorAritmetico(int tipoProblema) {
            switch (tipoProblema) {
                case 1:
                    return "+";
                case 2:
                    return "-";
                case 3:
                    return "*";
                case 4:
                    return "/";
                case 5:
                    Random random = new Random();
                    
                   int operador = random.nextInt(4);
                   switch (operador) {
                       case 0:
                           return "+";
                       case 1:
                           return "-";
                       case 2:
                           return "*";
                       case 3:
                          return "/";
                   }
            }
            return "+";
        }
        
        private static int realizarOperacion(int numero1, int numero2, String operador) {
            switch (operador) {
                case "+":
                    return numero1 + numero2;
                case "-":
                    return numero1 - numero2;
                case "*":
                    return numero1 * numero2;
                case "/":
                    return numero1 / numero2;
            }
            return 0;
        }
        
        
        private static String obtenerRespuestaPositivaAleatoria() {
            String[] respuestasPositivas = {"¡Muy bien!","¡Excelente!",
                "¡Buen trabajo!","¡Sigue así­!"};
            Random random = new Random();
            int indice = random.nextInt(respuestasPositivas.length);
            return respuestasPositivas[indice];
        }
        
        
       
            
  
}