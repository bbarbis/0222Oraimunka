package pkg0222oraimunka;


public class Main {

    
    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();
        String kimenet = "Az első 10 szám összege: " + osszeg + "\n";
        kiir(kimenet);
        
        int szam1 = 7, szam2 = 4;
        osszeg = osszead(szam1, szam2);
        String s = String.format("%d + %d = %d\n", szam1, szam2, osszeg);
        kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
        
    }

    private static void elso10SzamOsszege() {
        int osszeg = 0;
        for(int i=0; i<10; i++){
            osszeg += i;
        }
        return;
    }

    private static void osszead(int a, int b) {
        return a+b;
    }

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
    
}
