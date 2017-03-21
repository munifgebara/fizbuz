package fizbuz;

public class FizBuz {

    public String analisa(int n) {
        // se o n for divisível por 2 return "FIZ";
        if (n == 0) {
            return "NADA";
        }
        else if ((n % 2 == 0) && (n % 3 == 0)) {
            return "FIZBUZ";
        }
        else if (n % 2 == 0) {
            return "FIZ";
        }
        else if (n % 3 == 0) {
            return "BUZ";
        }
        else return "NADA";
    }

}
