package pkg0222oraimunka;

import java.util.Random;


public class Equalizer {
    private static Random rnd = new Random();
    public static void main(String[] args) {
        
        
    }

    private static void equalizer_5_sorban() {
        eq();
        eq();
        eq();
        eq();
        eq();
    }

    private static void eq(boolean ertekLatszik) {
        int db = rnd.nextInt(7-3+1)+3;
        eq(db, ertekLatszik);
    }

    

    private static void eq(int db, boolean ertekLatszik) {
        
        String szin =  "\u001B[45m";
        for (int i = 0; i< db; i++){
            System.out.print(szin + "*");
        }
        if(ertekLatszik){
            System.out.print(" " + "(" + db + ")");
        }
        System.out.println("");
    }
}
