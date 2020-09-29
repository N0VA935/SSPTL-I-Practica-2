/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_2;

import java.io.IOException;
import Tools.arrayContainer;
import Tools.Identificador;

/**
 *
 * @author José David Delgado Ramírez
 */
public class Practica_2 {
    public static void main(String[] args) throws IOException{
        /**
         * Creacion de objetos
         */
        arrayContainer ar = new arrayContainer();
        Identificador id = new Identificador();
        
        id.runner("src/TXT/P2ASM.txt", "src/TXT/tabop.txt");    // Carga de metodo de precarga a la comparacion
        ar.finder();    // Llamado al metodo de comparacion
        // Ciclo for para recorrer el resultado final de la comparacion
        for (int i = 0; i < ar.getRESULT().size(); i++) 
            System.out.println(ar.getRESULT().get(i));            
        
    }   // Fin de 
}
