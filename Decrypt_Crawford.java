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
 * @author Julia Crawford
 */
public class Decrypt_Crawford {
	public static void main(String[] args) {
                //declare and initialize variables
                Scanner input = null;
                //Get file and assign to var.
                File file = new File("passwords.txt");
                String currentPassword = "";
                //char array is never used but could used in a future version of this java file.
                char[] passwordsArray;
               // if(file.isFile("passwords.txt")){
		int shiftValue = 5;
             //   }else if(file.isFile())
             //   //try/catch to try and read file
                try {
                   //Scanner finds and loads file
                   input = new Scanner(file);
                   
                    while(input.hasNext()){
                     //reading line in file and assigning to message only "while" there is something to read from current line
                    String message = input.nextLine();
                        System.out.println("");
                        String decryptedMessage = decrypt(message, shiftValue);
                        System.out.println(decryptedMessage);
          
                   }
                    //ORIGIINALLY included for testing file found success. (debug)
                   //System.out.println("File found and opened!");
                   
                   
                 while(input.hasNext()){
                 for (int i = 0; i < 10; i++) { //lines of array.
                        
                   //Reading lines in file 
                   String message = input.nextLine();
                   //System.out.println(decrypt(currentPassword));
                    
                    }
                }
                  //input close is a must in order to "SAVE"
                  input.close();
               } catch (FileNotFoundException ex) {
                   //exception thrown if file not found, exit program
                   System.err.println("Cannot find file " + file + "...");
                   System.exit(0);
               }
	}

        
	public static String decrypt(String message, int shiftValue) {
		String decryptedMessage = "";
                char[] letters;
                letters = message.toCharArray();
                int position = 0;
                
                //Due to time contraints the following comments touch on the suggestions for this assignment.
                //integer sub
                //STILL need to convert file to char array.
                //LOGIC.
                //Read file.
                //Count file lines.
                //value of array size = count of file line.
                //maybe Store String in array at position [i]??
                //SEND string to decrypt... decrypt is then performed on string.
                //
                
		for (int i = 0; i < message.length(); i++) {
			char currentChar = message.charAt(i);
			//conditional statements facilitate ceasar cipher
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
