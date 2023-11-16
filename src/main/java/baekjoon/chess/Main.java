package baekjoon.chess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] chessPieceCount = {1, 1, 2, 2, 2, 8};
        StringBuffer buffer = new StringBuffer();

        String[] s = input.split(" ");

        for (int i = 0; i < s.length; i++) {
            buffer.append(chessPieceCount[i] - Integer.parseInt(s[i])).append(" ");
        }

        System.out.println(buffer);
    }
}
