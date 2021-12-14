/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Muhammad Iqbal F
 */
public class RockPaperScissor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(""
                + "1. BATU\n"
                + "2. Kertas\n"
                + "3. Gunting");
        System.out.print("Pilihan Anda: ");
        int pilihan = scn.nextInt();
        String player = pilih(pilihan);
        
        String computer = pilih((int) ((Math.random()*100 % 3) + 1));
        
        if (player.equals(computer)) {
            System.out.println("Seri");
        } else {
            switch (player) {
                case "Batu" -> {
                    if ("Gunting".equals(computer)) {
                        System.out.println("Player menang!");
                    } else {
                        System.out.println("Player kalah!");
                    }
                }
                case "Gunting" -> {
                    if ("Kertas".equals(computer)) {
                        System.out.println("Player menang!");
                    } else {
                        System.out.println("Player kalah!");
                    }
                }
                case "Kertas" -> {
                    if ("Batu".equals(computer)) {
                        System.out.println("Player menang!");
                    } else {
                        System.out.println("Player kalah!");
                    }
                }
            }
        }
        System.out.println("Player vs Computer");
        System.out.printf("%s vs %s\n", player, computer);
    }

    public static String pilih(int pilihan) {
        String player;
        switch (pilihan) {
            case 1:
                player = "Batu";
                break;
            case 2:
                player = "Kertas";
                break;
            case 3:
                player = "Gunting";
                break;
            default:
                player = "Batu";
                break;
        }
        return player;
    }
    
}
