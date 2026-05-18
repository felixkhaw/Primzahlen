import java.util.Arrays;

public class PrimzahlenTest {
    public static void main(String[] args) {

        int[] primzahlen = new int[]{2,3,5,7,11};
        int[] zahlen = Primzahlen.erstelleZahlen(11);
		boolean status = true;
        for(int j = 0; j < primzahlen.length-1; j++){
			int[] vielfachen = new int[]{primzahlen[j]*primzahlen[j]}; // Enthält zu beginnt das Qudrat der Primzahl auf der j gerade steht wenn man j in primzahl[j] einsetzt
			// Insgesamt 5 Durchläufe
			/* 
				Anforderung:
				Muss die Vielfachen von jeder Primzahl finden und eleminieren.
				Idee 1: die Vielfachen bis 1000 vorher in einem array speichern und dann einmal zahlen durchlaufen
			*/
			
        }
        System.out.println(Arrays.toString(zahlen));
    }
}
