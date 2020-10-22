/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveutfchars;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author david
 */
public class PrimitiveUTFChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadea="Está en casa ";
            
            String a = "";
      
        try {
            
            
            
            
            DataInputStream ler = new DataInputStream(new FileInputStream("C:/Users/david/Desktop/prueba clase file/text6.dat"));
            
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream("C:/Users/david/Desktop/prueba clase file/text6.dat"));
            
            
            escribir.writeUTF(cadea);
            System.out.println("writeUTF escribindo: "+ cadea);
            System.out.println("bytes totais escritos: "+ escribir.size());
            escribir.writeChars(cadea);
            System.out.println("writeChars escribindo: " + cadea);
            System.out.println("bytes totais escritos: "+ escribir.size());
             escribir.writeUTF(cadea);
            System.out.println("writeUTF escribindo: "+ cadea);
            System.out.println("bytes totais escritos: "+ escribir.size());
            
            escribir.close();
            
            System.out.println("bytes totais por ler = "+ ler.available());
            
            
            System.out.println("lemos a primeira cadea en UTF: " + ler.readUTF());
            System.out.println("numero de bytes por ler: " + ler.available());
            
            for (int i=0;i<cadea.length();i++){
                a=a+ler.readChar();
                
            }
            System.out.println("lemos a segunda cadea  con readChar() en bucle: " + a);
            System.out.println("numero de bytes por ler: " + ler.available());
            
            
            System.out.println("lemos a terceira cadea mediante readUTF: " + ler.readUTF());
            System.out.println("numero de bytes por ler: " + ler.available());
            
             ler.close();
        } catch (IOException e) {
            System.out.println("Error");
        
        
        }
        
       
        
        
    }
    
}
