package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        String [] s = scanner.nextLine().split("\\s");
        System.out.println(Arrays.toString(s));
    }
}
