import java.util.Scanner;

public class exercici104 {
    //variables
    public static final int VALOR_MIN = 5;
    public static final int VALOR_MAX = 10;
    public static final int INTENTS_MAXIMS = 3;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            int valorUsuari;
            int intents = 0;
            boolean valorNOk;

            do {
                System.out.print("Introdueix un valor enter entre " + VALOR_MIN + " i " + VALOR_MAX + " (-1 per sortir): ");
                valorUsuari = lector.nextInt();
                lector.nextLine();

                if (valorUsuari == -1) {
                    //Posem l'opció -1 per a sortir del programa i finalitzar-lo
                    System.out.println("Has sortit del programa.");
                    return;
                }
                //posem que el valor serà correcte si el posem entre els paràmetres indicats.
                valorNOk = (valorUsuari < VALOR_MIN || valorUsuari > VALOR_MAX);

                if (valorNOk) {
                    //si el valor surt fora de rang torna a preguntar.
                    System.out.println("Valor fora de rang.");
                    intents++;
                }

                if (intents >= INTENTS_MAXIMS) {
                    //si pases 3 vegades sense posar un número dins del rang el programa finalitza
                    System.out.println("Has superat el nombre d'intents. Acabant programa.");
                    return;
                }

            } while (valorNOk); //repetim acció

            if (valorUsuari != -1) {
                System.out.println("Dada correcta. Has escrit " + valorUsuari);

                if (valorUsuari >= VALOR_MIN) {
                    System.out.print("Números senars fins a " + valorUsuari + ": ");
                    //calcul senars
                    int suma = 0;
                    for (int j = 1; j <= valorUsuari; j += 2) {
                        System.out.print(j + " ");
                        suma += j;
                    }
                    //si el valor està entre 5 i 10 s'imprimeix missatge
                    System.out.println("\nSuma dels senars fins a " + valorUsuari + " és: " + suma);
                }
            }
        }
    }
}
