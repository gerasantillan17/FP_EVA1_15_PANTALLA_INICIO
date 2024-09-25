/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      final String USUARIO ="FLACA";
      final String  CONTRA ="PP";
        String usu, contra;
        Scanner captu = new Scanner(System.in);
    System.out.println("Usuario:");
    usu = captu.nextLine();
    System.out.println("Contraseña:");
    contra = captu.nextLine();
    if( usu.equals (USUARIO) && contra.equals (CONTRA))
        System.out.println("ACCESO PERMITIDO");
      else
        System.out.println("USUARIO Y/O CONTRASEÑA INCORRECTA");
    
    }
    
}
