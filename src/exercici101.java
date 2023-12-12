import java.util.Scanner;

public class exercici101 {
    //variables
    public static final int VALOR_MIN = 5;
    public static final int VALOR_MAX = 10;
    public static final int INTENTS_MAXIMS = 3;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int valorUsuari;
        int intents = 0;
        boolean valorNOk;

        do {
            System.out.print("Introdueix un valor enter entre " + VALOR_MIN + " i " + VALOR_MAX + ": ");
            valorUsuari = lector.nextInt();
            lector.nextLine();
            //posem que el valor serà correcte si el posem entre els paràmetres indicats.
            valorNOk = (valorUsuari < VALOR_MIN || valorUsuari > VALOR_MAX);

            if (valorNOk) {
                //si el valor surt fora de rang torna a preguntar.
                System.out.println("Valor fora de rang.");
                intents++;
            }

            //si pases 3 vegades sense posar un número dins del rang el programa finalitza
            if (intents >= INTENTS_MAXIMS) {
                System.out.println("Has superat el nombre d'intents. Finalitzant programa.");
                return;
            }

        } while (valorNOk);

        //si el valor està entre 5 i 10 s'imprimeix missatge
        System.out.println("Dada correcta. Has escrit " + valorUsuari);
    }
}
