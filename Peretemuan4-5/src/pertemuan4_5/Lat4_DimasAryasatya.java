/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_5;

import java.util.Hashtable;

/**
 *
 * @author USER
 */
public class Lat4_DimasAryasatya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Buat sebuah Hashtable kosong
        Hashtable<Integer, String> hash_table =
        new Hashtable<Integer, String>();
        
        // Petakan string isi menjadi kunci integer
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");
        
        // Tampilkan hasil Hashtable
        System.out.println("Initial Table is: " + hash_table);
        
        // Cek isi dengan nilai 'Geeks'
        System.out.println("Is the value 'Geeks' present? " +
        hash_table.contains("Geeks"));
        
        // Cek isi dengan nilai 'World'
        System.out.println("Is the value 'World' present? " +
        hash_table.contains("World")); 
    }
    
}
