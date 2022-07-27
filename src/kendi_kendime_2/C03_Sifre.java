package kendi_kendime_2;

import java.util.Scanner;

public class C03_Sifre {
    public static void main(String[] args) {
        /* Type code to check if a password is valid or not for the following conditions;
        Password must have at least 8 characters different from space character
        Password must have at least 1 symbol
        Example: For ‘A2b!’ your code should print false on the console
        For ‘A2b3cdef’ your code should print false on the console
        For ‘!1a23b4’ your code should print false on the console
        For ‘!1a23b4?es’ your code should print true on the console
        For ‘! a b 3 k’ your code should print false on the console

         */
        Scanner scan = new Scanner(System.in);

        boolean sifreDogruMu = false;
        while (!sifreDogruMu) {
            System.out.println("şifreyi giriniz");
            String sifre = scan.nextLine();
            if (sifre.contains(" ")) {
                System.out.println("şifre boşluk içermemelidir");
            }
            if (sifre.length() < 8) {
                System.out.println("şifre en az sekiz karakter olmalıdır");
            }}}}





