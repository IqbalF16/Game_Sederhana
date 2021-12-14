/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author Muhammad Iqbal F
 */
public class Game {
    public static void main(String[] args) {
        int[][] key = new int[3][3];
        
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key[i].length; j++) {
                key[i][j] = (int) (Math.random()*100 % 10);
            }
        }
        
        for (int[] is : key) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        int jackpot = key[(int) (Math.random() * 100) % 3][(int) (Math.random() * 100) % 3];
        System.out.println(jackpot);
        
        
    }
}
