import java.util.Scanner;

public class exercici102 {
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

            if (intents >= INTENTS_MAXIMS) {
                //si pases 3 vegades sense posar un número dins del rang el programa finalitza
                System.out.println("Has superat el nombre d'intents. Finalitzant programa.");
                return;
            }

        } while (valorNOk);

        System.out.println("Dada correcta. Has escrit " + valorUsuari);

        System.out.print("Números senars fins a " + valorUsuari + ": ");
        //calcul senars
        int suma = 0;
        for (int i = 1; i <= valorUsuari; i += 2) {
            System.out.print(i + " ");
            suma += i;
        }
        //si el valor està entre 5 i 10 s'imprimeix missatge
        System.out.println("\nSuma dels senars fins a " + valorUsuari + " és: " + suma);
    }
}
