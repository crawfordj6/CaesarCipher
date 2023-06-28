/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher_crawford;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Alec
 */
public class readFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keys = new Scanner(System.in);
        String nameOfFile;
        System.out.println("Enter name of file");
        nameOfFile = keys.nextLine();
        
        Scanner input = null;
        try
        {
            input = new Scanner(new File(nameOfFile));
            
        }
        catch(FileNotFoundException s)
        {
            System.out.println("File DNE, try again");
        }
        
        while(input.hasNext())
        {
            String contents = input.next();
            int length;
            
            System.out.println(contents);
            
        }
  
    }
}
