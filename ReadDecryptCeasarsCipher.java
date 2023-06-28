/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher_crawford;

/**
 *
 * @author Alec
 */

    import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDecryptCeasarsCipher {
	public static void main(String[] args) {
		//String fileName = "passwordsForTesting.txt";
               // String fileName = ("C:\\Users\\Alec\\Desktop\\passwordsForTesting.txt");
                	String fileName = "/Users/Alec/Desktop/passwords.txt";
               // String desktop = System.getProperty("user.home") + "/Desktop/";
               // passwordsForTesting.txt
		int shiftValue = 3;
                
		
                //File file = new File(desktop + "passwords.txt");
                File file = new File("passwords.txt");
                try (Scanner scanner = new Scanner(fileName)) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String decryptedLine = decrypt(line, shiftValue);
                        System.out.println(decryptedLine);
                    }   }
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

    

