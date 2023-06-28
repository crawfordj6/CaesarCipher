/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher_crawford;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.crypto.Cipher;

/**
 *
 * @author Julia Crawford
 * Lab Assign 3
 */
public class CaesarCipher_Crawford {
      public String passwordForTesting;
   
   public CaesarCipher_Crawford(){
       passwordForTesting = "Users/...";
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Try/catch block to read from the file passwords.txt
       //THEN create an empty string whic will b used tp storea list of empty password
       BufferedReader br = null;
       FileReader fr = null;
       
       Cipher cipher_1 = new Cipher();
       
       fr = new FileReader(cipher_1.file_name);
       br = new BufferedReader(fr);
       
       String current_linr;
       
       while((current_line = br.readLine()) ! = null){
        System.out.println(current_line);
    }
       
       
    }
    
}
