package com.raffa.crypto;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("************************************");
            System.out.println("------------Cryptograph-------------");
            System.out.println("************************************");
            System.out.println("1) Verschlüsseln");
            System.out.println("2) Entschlüsseln");
            System.out.println("0) Schliessen");
            System.out.println("Auswahl: ");
            String opt = input.nextLine();

            if (opt.equals("0")) break;

            System.out.println("Password: ");
            String key = input.nextLine();

            if (opt.equals("1")) {
                System.out.println("Nachricht: ");
                String plain = input.nextLine();
                System.out.println("\nVERSCHLÜSSELT:\n" + RaffaCipher.encode(plain,key));
            } else if (opt.equals("2")) {
                System.out.println("Verschlüsselte Nachricht: ");
                String cipher = input.nextLine();
                System.out.println("\nEntschlüsselt\n" + RaffaCipher.decode(cipher,key));
            } else {
                System.out.println("Ungültige auswahl.");
            }
        }
    }
}
