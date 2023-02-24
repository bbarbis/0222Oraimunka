package pkg0222oraimunka;

import java.util.Random;
        
public class Equalizer {
    
    private static void Random Random = new Random();
    
    public static void main(String[] args) {
        equalizer_5_sorban();
        
        
    }

    private static void equalizer_5_sorban() {
        eq();
        eq();
        eq();
        eq();
        eq();
    }

    private static void eq() {
        int db = rnd.nextInt(3, 8);
        String szin =  "\u001B[45m";
        for (int i = 0; i< db; i++){
            System.out.print(szin + " ");
        }
        System.out.println("");
    }
}
