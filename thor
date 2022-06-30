import java.util.*;
import java.io.*;
import java.math.*;
 
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor
 * seems not follow your orders.
 **/
class Player {
 
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt();
        ; // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
 
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
 
            // se o x inicial do thor for 5, os movimentos vao alternar entre ne e se
            if (initialTx == 5) {
                System.out.println("NE");
                System.out.println("SE");
            }
 
            // se o x e o y foram esses, vai de N ate a luz
            if (initialTx == 31 && initialTy == 17) {
                System.out.println("N");
            }
 
            // se o y da luz é 17
            if (lightY == 17) {
                // se o y é 17 e o x 0 da luz vai se mover assim
                if (lightX == 0) {
                    // repete o movimento 13 vezes
                    for (int i = 1; i <= 13; i++) {
                        System.out.println("S");
                    }
                    // depois de 13 vezes, ele muda pra esse movimento
                    for (int i = 1; i <= 31; i++) {
                        System.out.println("W");
                    }
                }
 
                // verifica se o x da luz é 36
                if (lightX == 36) {
                    // repetiçoes de movimento
                    for (int i = 0; i < 15; i++) {
                        if (i % 2 == 0) {
                            // se for par vai para direita
                            System.out.println("E");
                        } else {
                            // se não vai para diagonal
                            System.out.println("SE");
                        }
                    }
                }
 
            }
        }
    }
}
