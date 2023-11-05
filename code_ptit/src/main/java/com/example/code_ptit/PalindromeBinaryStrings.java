package com.example.code_ptit;

import java.util.Scanner;

public class PalindromeBinaryStrings {
	public static void main(String[] args) {
		long start = System.nanoTime();
		Scanner scanner = new Scanner(System.in);

		// Nhập độ dài của xâu nhị phân
		int n = scanner.nextInt();

		// Liệt kê các xâu nhị phân thuận nghịch
		generatePalindromeBinaryStrings(n);
		long end = System.nanoTime();
		System.out.println(end-start);
	}

	// Hàm để kiểm tra xâu nhị phân có thuận nghịch không
	private static boolean isPalindrome(String binaryString) {
		int length = binaryString.length();
		for (int i = 0; i < length / 2; i++) {
			if (binaryString.charAt(i) != binaryString.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	// Hàm để liệt kê các xâu nhị phân thuận nghịch có độ dài n
	private static void generatePalindromeBinaryStrings(int n) {
		int total = (int) Math.pow(2, n); // Tính số lượng xâu nhị phân có độ dài n
		for (int i = 0; i < total; i++) {
			String binaryString = Integer.toBinaryString(i);

			// Điền đủ số 0 ở đầu nếu cần
			while (binaryString.length() < n) {
				binaryString = "0" + binaryString;
			}

			// Kiểm tra xâu nhị phân có thuận nghịch không và in ra nếu có
			if (isPalindrome(binaryString)) {
				System.out.println(binaryString.replaceAll("", " ").trim());
			}
		}
	}
}

