/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_5;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author USER
 */
public class Lat3_DimasAryasatya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Menginisialisasi sebuah dictionary
        Dictionary dimas = new Hashtable();
        
        // put() method
        dimas.put("123", "Code");
        dimas.put("456", "Program");
        dimas.put("wajah", "Tampan");
        
        //elements() method
        for (Enumeration i = dimas.elements(); i.hasMoreElements();){
            System.out.println("Isi di Dictionary : " + i.nextElement());
        }
        
        //Test jika memanggil key yang tidak kita lakukan put sebelumnya :
        System.out.print("\nValue at key = 6: " + dimas.get("6"));
        
        //Test jika memanggil key yang sudah kita lakukan put sebelumnya :
        System.out.print("\nValue at key = 456: " + dimas.get("456"));
        System.out.print("\nValue at key = wajah: " + dimas.get("wajah"));
        
        //isEmpty() method 
        System.out.println("\nThere is no key-value pair : " + dimas.isEmpty() + "\n");
        // keys() method :
        for (Enumeration k = dimas.keys(); k.hasMoreElements();)
        {
            System.out.println("Keys di Dictionary : " + k.nextElement());
        } 
    
        // remove() method :
        System.out.println("\nRemove : " + dimas.remove("123"));
        System.out.println("Remove : " + dimas.remove("wajah"));
        System.out.println("\nCheck isi dari key yang dihapus : " + dimas.get("123"));
        System.out.println("Check isi dari key yang dihapus : " + dimas.get("wajah"));
        
        System.out.println("\nSize of Dictionary : " + dimas.size()); 
    }
    
}
