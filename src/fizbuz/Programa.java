package fizbuz;

public class Programa {

    public static void main(String[] args) {
        
        System.out.println ("Inciando FIZ BUZ");

        FizBuz fb = new FizBuz();

        for (int i = 0; i <= 20; i++) {
            System.out.println(i+" retornou " + fb.analisa(i));
        }

    }

}
