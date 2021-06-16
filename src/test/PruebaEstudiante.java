package test;

import dominio.Estudiante;
import java.util.Scanner;

public class PruebaEstudiante {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        //int [] numeros = new int [3];

        Estudiante[] estudiantes;
        int n = 5;
        estudiantes = new Estudiante[n];
        llenaDatos(estudiantes);
        System.out.println("Estudiantes del Curso");
        for(int i = 0;i<estudiantes.length;i++){
            System.out.println(estudiantes[i]);
        }

    }

    public static void llenaDatos(Estudiante est[]) {
        String nombre;
        char sexo;
        double nota;
        for (int i = 0; i < est.length; i++) {
            System.out.println("Nombre:");
            nombre = datos.nextLine();
            System.out.println("Sexo:");
            sexo = datos.nextLine().charAt(0);
            System.out.println("Nota:");
            nota = datos.nextDouble();
            est[i] = new Estudiante(nombre, sexo, nota);
            datos.nextLine();

        }

    }
}
