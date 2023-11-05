package com.example.code_ptit;

import java.util.Scanner;

public class NhiPhanDoiXung {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        nhiPhanThuanNghich(n);
        long end = System.nanoTime();
        System.out.println(end-start);
    }

    private static void nhiPhanThuanNghich(int n) {
        int total = (int) Math.pow(2, n);

        for (int i = 0; i < total; i++) {
            String nhiPhan = Integer.toBinaryString(i);
            while (nhiPhan.length() < n) {
                nhiPhan = "0" + nhiPhan;
            }

            StringBuilder builders = new StringBuilder(nhiPhan);
            if (builders.reverse().toString().equals(nhiPhan)) {
                System.out.println(nhiPhan.replace(""," ").trim());
            }
        }
    }
}
