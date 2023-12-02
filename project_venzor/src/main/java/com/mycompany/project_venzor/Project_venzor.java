/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_venzor;

import java.util.Scanner;

/**
 *
 * @author Alfredo Venzor
 */
public class Project_venzor {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //LLENADO DE TAREAS
        System.out.println("Cuantas tareas quieres capturar:");
        int NumT = input.nextInt();
        
        String [] Tareas = new String [NumT + 1];
        Tareas [0] = "Tareas";
        String CTareas;
        for (int i = 1; i < Tareas.length; i++) {
            System.out.println("De que clase es tu " + i + "° " + "tarea.");
            Tareas [i] = CTareas = input.next();
        }
        //FECHA DE TAREAS
        String [] FTareas = new String [NumT + 1];
        FTareas [0] = "";
        String DTareas;
        for (int i = 1; i < FTareas.length; i++) {
            System.out.println("Para cuando es tu " + i + "° " + "tarea. (DD/MM/AA)");
            FTareas [i] = DTareas = input.next();
        }
        
        //LLENADO DE EXAMENES
        System.out.println("Cuantos examenes quieres capturar:");
        int NumE = input.nextInt();
        String [] Examenes = new String [NumE + 1];
        Examenes [0] = "Examenes";
        String CExamenes;
        for (int i = 1; i < Examenes.length; i++) {
            System.out.println("De que clase es tu " + i + "° " + "examen.");
            Examenes [i] = CExamenes = input.next();
        }
        //FECHA EXAMENES
        String [] FExamenes = new String [NumE + 1];       
        FExamenes [0] = ""; 
        String DExamenes;
        for (int i = 1; i < FExamenes.length; i++) {
            System.out.println("Para cuando es tu " + i + "° " + "examen. (DD/MM/AA)");
            FExamenes [i] = DExamenes = input.next();
        }
        

        //LLENADO DE PROYECTOS
        System.out.println("Cuantos proyectos quieres capturar:");
        int NumP = input.nextInt();
        String [] Proyectos = new String [NumP + 1];
        Proyectos [0] = "Proyectos";
        String CProyectos;
        for (int i = 1; i < Proyectos.length; i++) {
            System.out.println("De que clase es tu " + i + "° " + "proyecto.");
            Proyectos [i] = CProyectos = input.next();
        }
        //FECHA PROYECTOS
        String [] FProyectos = new String [NumP + 1];
        FProyectos [0] = ""; 
        String DProyectos;
        for (int i = 1; i < FProyectos.length; i++) {
            System.out.println("Para cuando es tu " + i + "° " + "proyecto. (DD/MM/AA)");
            FProyectos [i] = DProyectos = input.next();
        }
        
        //LLENADO DE TRABAJOS
        System.out.println("Cuantos trabajos quieres capturar:");
        int NumTr = input.nextInt();
        String [] Trabajos = new String [NumTr + 1];
        Proyectos [0] = "Trabajos";
        String CTrabajos;
        for (int i = 1; i < Trabajos.length; i++) {
            System.out.println("De que clase es tu " + i + "° " + "trabajo.");
            Trabajos [i] = CTrabajos = input.next();
        }
        //FECHA DE TRABAJOS
        String [] FTrabajos = new String [NumTr + 1];
        FExamenes [0] = ""; 
        String DTrabajos;
        for (int i = 1; i < FTrabajos.length; i++) {
            System.out.println("Para cuando es tu " + i + "° " + "trabajo. (DD/MM/AA)");
            FTrabajos [i] = DTrabajos = input.next();
        }

        //IMPRIMIMOS TAREAS, EXAMENES, PROYECTOS, TRABAJOS
        System.out.println("-----------------------");
        System.out.println("TAREAS");
        for (int i = 1; i < NumT + 1; i++) {
            System.out.println("Tarea de " + Tareas [i] + " para el dia: " + FTareas[i]); 
        }
        System.out.println("-----------------------");
        System.out.println("EXAMENES");
        for (int i = 1; i < NumE + 1; i++) {
            System.out.println("Examen de " + Examenes [i] + " para el dia: " + FExamenes[i]); 
        }
        System.out.println("-----------------------");
        System.out.println("PROYECTOS");
        for (int i = 1; i < NumP + 1; i++) {
            System.out.println("Proyecto de " + Proyectos [i] + " para el dia: " + FProyectos[i]); 
        }
        System.out.println("-----------------------");
        System.out.println("TRABAJOS");
        for (int i = 1; i < NumTr + 1; i++) {
            System.out.println("Trabajo de " + Trabajos [i] + " para el dia: " + FTrabajos[i]); 
        }
 
        
    }
}
    

