/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher_crawford;

import java.io.*;
import java.util.*;

/**
 *
 * @author Alec
 */
public class Decrypt {
	public static void main(String[] args) {
		//String message = "Khoor#Zruog!";
                String message = "ufxxbtwi";
		int shiftValue = 5;
                //ArrayList<Character> password = loadPassword("passwords.txt");
               Scanner scan = null;
               String f = ("passwords.txt");
                try {
                   //Scanner finds and loads file
                   scan = new Scanner(new File(f));
                   System.out.println(f + "loaded!");
               } catch (FileNotFoundException e) {
                   System.err.println("Cannot find file " + f + "...");
                   System.exit(0);
               }
		
		String decryptedMessage = decrypt(message, shiftValue);
		System.out.println(decryptedMessage);
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
