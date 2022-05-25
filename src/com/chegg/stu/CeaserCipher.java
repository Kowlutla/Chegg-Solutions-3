package com.chegg.stu;

public class CeaserCipher {

	public static String encrypt(String message, int key) {

		StringBuffer result = new StringBuffer();
		char encryptedChar, originalChar;
		for (int i = 0; i < message.length(); i++) {
			originalChar = message.charAt(i);
			if (originalChar + key > 126) {
				encryptedChar = (char) (32 + (originalChar + key) - 127);
			} else {
				encryptedChar = (char) (originalChar + key);
			}
			result.append(encryptedChar);
		}
		String encrypted = "";
		for (int i = 2; i < result.length(); i++) {
			encrypted += result.charAt(i);
		}
		encrypted += result.charAt(0);
		encrypted += result.charAt(1);
		return encrypted;
	}

	public static String decrypt(String message, int key) {
		StringBuffer result = new StringBuffer();
		char decryptedChar, originalChar;
		for (int i = 0; i < message.length(); i++) {
			originalChar = message.charAt(i);
			if (originalChar - key < 32) {
				decryptedChar = (char) ((originalChar - key) + 127 - 32);
			} else {
				decryptedChar = (char) (originalChar - key);
			}
			result.append(decryptedChar);
		}

		String decrypted = "";
		for (int i = 0; i < result.length() - 2; i++) {
			decrypted += result.charAt(i);
		}
		decrypted = result.charAt(result.length() - 1) + decrypted;
		decrypted = result.charAt(result.length() - 2) + decrypted;
		return decrypted;

	}

	public static void main(String[] args) {
		String msg1 = "Lost time is never found again";
		String msg2 = "Use it or lose it";
		System.out.println("Message: " + msg1);
		String enc1 = encrypt(msg1, 17);
		System.out.println("Encrypted Message: " + enc1);
		String dec1 = decrypt(enc1, 17);
		System.out.println("Decrypted Message: " + dec1);

		System.out.println("----------------------------------");
		System.out.println("Message: " + msg2);
		String enc2 = encrypt(msg2, 17);
		System.out.println("Encrypted Message: " + enc2);
		String dec2 = decrypt(enc2, 17);
		System.out.println("Decrypted Message: " + dec2);

	}

}
