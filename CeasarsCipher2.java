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
import java.util.Scanner;

public class CeasarsCipher2 {
	public static void main(String[] args) {
		System.out.println("Please enter a message to encrypt: ");
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		
		System.out.println("Please enter the shift value: ");
		int shiftValue = scanner.nextInt();
		
		String encryptedMessage = encrypt(message, shiftValue);
		System.out.println("Encrypted message: " + encryptedMessage);
		
		String decryptedMessage = decrypt(encryptedMessage, shiftValue);
		System.out.println("Decrypted message: " + decryptedMessage);
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
	
	public static String decrypt(String encryptedMessage, int shiftValue) {
		String decryptedMessage = "";
		for (int i = 0; i < encryptedMessage.length(); i++) {
			char currentChar = encryptedMessage.charAt(i);
			
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

