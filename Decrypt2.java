/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher_crawford;

import java.io.File;
import java.io.FileNotFoundException;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alec
 */
public class Decrypt2 {
	public static void main(String[] args) throws FileNotFoundException{
		//String message = "Khoor#Zruog!";
                File file = new File("passwords.txt");
                //String message = "ufxxbtwi";
		//int shiftValue = 5;
                
                //ArrayList<Character> password = loadPassword("passwords.txt");
               //Scanner scan = null;
               
               //String f = ("passwords.txt");
               //GetFile... read a line and complete decrypt() each line.
               while(scan.hasNextLine()){
                   
               }
               
               
               
                try {
                   //Scanner finds and loads file
                  // Scanner input = new Scanner(new File("/somanynumbers.txt/"));
                   Scanner input = new Scanner(new File("passwords.txt"));
                   System.out.println("File found and opened!");
                   
                //   while(input.hasNext()){
                  //     System.out.println(input.nextLine());
                  // }
                   input.close();
               } catch (FileNotFoundException ex) {
                   System.err.println("Cannot find file " + file + "...");
                  // System.exit(0);
               }
		          System.out.println(file);
                          
                          
                         
	//	String decryptedMessage = decrypt(message, shiftValue);
	//	System.out.println(decryptedMessage);
	}
	
	public static String decrypt(String message, int shiftValue) {
		String decryptedMessage = "";
		for (int i = 0; i < message.length(); i++) {
			char currentChar = message.charAt(i);
			
			if (currentChar >= 'a' && currentChar <= 'z') {
				currentChar = (char)(currentChar - shiftValue);
				
				if (currentChar < 'a') {
					currentChar = (char)(currentChar + 'z' - 'a' + 1);
				}
				
				decryptedMessage += currentChar;
			} else if (currentChar >= 'A' && currentChar <= 'Z') {
				currentChar = (char)(currentChar - shiftValue);
				
				if (currentChar < 'A') {
					currentChar = (char)(currentChar + 'Z' - 'A' + 1);
				}
				
				decryptedMessage += currentChar;
			} else {
				decryptedMessage += currentChar;
			}
		}
		
		return decryptedMessage;
	}
}
