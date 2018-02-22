/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201513637;

import java.util.Scanner;

/**
 *
 * @author Dionicio Torres
 */
public class IPC1Tarea3_201513637 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int mn;
        Scanner b = new Scanner(System.in);
      do{
      System.out.println("[IPC1]Tarea3_201513637");
      System.out.println();
      System.out.println("1.Usuarios");
      System.out.println("2.Contador de digitos");
      System.out.println("3.Tres numeros de mayor a menor");
      System.out.println("4.Calcular promedio");
      System.out.println("5.Salir");
      System.out.println("Ingrese el numero de la opcion que desea utilizar: ");
      System.out.println();
      a=b.nextInt();
      }while(a>=5); 
      switch(a){
          case 1:
               System.out.println();
              System.out.println("Usuarios");
              System.out.println();
              System.out.println("1.Ingresar Usuarios");
              System.out.println("2.Mostrar Usuarios de forma Ascendente");
              System.out.println("3.Mostrar Usuarios de forma Descendente");
              System.out.println("4.Menu Principal");
              System.out.println();
              System.out.print("Ingrese el numero de la opcion que desea utilizar: ");
              break;
          case 2:
               System.out.println();
               System.out.println("Contador de digitos");
                System.out.println();
                 System.out.println("1.Ingrese un Numero");
                  System.out.println("2.Mostrar el numero de digitos del numero Ingresado");
                   System.out.println("3.Menu Principal");
                   System.out.println();
                    System.out.print("Ingrese el numero de la opcion que desea utilizar: ");
              break;
          case 3:
               System.out.println();
               System.out.println("Tres numeros de mayor a menor");
                System.out.println();
                 System.out.println("1.Ingresar numeros");
                  System.out.println("2.Mostrar Ordenados");
                   System.out.println("3.Menu Principal");
                  System.out.println();
                   System.out.print("Ingrese el numero de la opcion que desea utilizar: ");
              break;
          case 4:
              System.out.println();
               System.out.println("Calcular Promedio");
               System.out.println();
                System.out.print("Ingrese el numero de la opcion que desea utilizar: ");
               break;
              
      }
              
      
              
     
      
      
    }
    
}
