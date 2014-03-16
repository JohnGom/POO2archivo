/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentuniversity1;
import Estudiantes.Estudiante;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Centroamérica {
    
public static Estudiante register() {
        Estudiante kid = new Estudiante();
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Introduzca la información acerca del estudiante");
        System.out.print("Identificación del Estudiante: ");
        kid.StudentIdentificationNumber = scnr.nextInt();
        System.out.print("Nombre: ");
        kid.FirstName = scnr.next();
        System.out.print("Apellido: ");
        kid.LastName = scnr.next();
        System.out.print("Número de créditos hasta el momento: ");
        kid.CreditsSoFar = scnr.nextInt();
        System.out.print("el promedio de calificaciones: ");
        kid.GPA = scnr.nextDouble();
        
        return kid;
    }

    public static void save(Estudiante pupil) throws Exception {
        
       
        String strFilename = "";
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Escriba el nombre de archivo:");
        strFilename = scnr.next();
        
        // Make sure the user entered a valid file name
        if( !strFilename.equals("")) {
            // Indicate that you are planning to use a file
            File fleExample = new File(strFilename);
            // Create that file and prepare to write some values to it
            PrintWriter wrtStudent = new PrintWriter(fleExample);

            wrtStudent.println(pupil.StudentIdentificationNumber);
            wrtStudent.println(pupil.FirstName);
            wrtStudent.println(pupil.LastName);
            wrtStudent.println(pupil.CreditsSoFar);
            wrtStudent.println(pupil.GPA);
            
            // After using the PrintWriter object, de-allocated its memory
            wrtStudent.close();
            // For convenience, let the user know that the file has been created
            System.out.println(". Se ha creado el archivo");
        }
    }
    
    public static void show(Estudiante std) throws Exception {
        System.out.println("Informe del Alumno");
        System.out.println("Identificación del Estudiante: " + std.StudentIdentificationNumber);
        System.out.println("Nombre: " + std.FirstName);
        System.out.println("Apellido: " + std.LastName);
        System.out.println("Número de créditos hasta el momento: "+ std.CreditsSoFar);
        System.out.println("el promedio de calificaciones: "  + std.GPA);
    }
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
         String answer = "n";
        Estudiante std = register();
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("¿Desea guardar esta información (s / n)?");
        answer = scnr.next();
        
        if( (answer.equals("s")) || (answer.equals("s")) ) {
	    show(std);
            save(std);
        }
    }
    }
