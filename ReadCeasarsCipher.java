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

public class ReadCeasarsCipher {
	public static void main(String[] args) {
		String fileName = "passwords.txt";
                String desktop = System.getProperty("Alec.home") + "/Desktop/";
                
		int shiftValue = 5;
		
		try {
			//File file = new File(fileName);
                        File file = new File (desktop + "passwords.txt");
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String encryptedLine = encrypt(line, shiftValue);
				System.out.println(encryptedLine);
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File '" + fileName + "' not found!");
		}
	}
	
	public static String encrypt(String message, int shiftValue) {
		String encryptedMessage = "";
		for (int i = 0; i < message.length(); i++) {
			char currentChar = message.charAt(i);
			
			if (currentChar >= 'a' && currentChar <= 'z') {
				currentChar = (char)(currentChar + shiftValue);
				
				if (currentChar > 'z') {
					currentChar = (char)(currentChar - 'z' + 'a' - 1);
				}
				
				encryptedMessage += currentChar;
			} else if (currentChar >= 'A' && currentChar <= 'Z') {
				currentChar = (char)(currentChar + shiftValue);
				
				if (currentChar > 'Z') {
					currentChar = (char)(currentChar - 'Z' + 'A' - 1);
				}
				
				encryptedMessage += currentChar;
			} else {
				encryptedMessage += currentChar;
			}
		}
		
		return encryptedMessage;
	}
}
