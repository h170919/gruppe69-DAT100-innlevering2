package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		String utskriftTabell = "";
		
        for(int i = 0; i < tabell.length; i++) {
            if(i == 0) {
                utskriftTabell += ("[");
            }
            utskriftTabell +=(tabell[i]);

            if(i < tabell.length - 1) {
            	utskriftTabell += (", ");
            }

            if(i == tabell.length - 1) {
            	utskriftTabell +=("]\n");
            }

        }
		System.out.println(utskriftTabell);
	}

	// b)
	public static String tilStreng(int[] tabell) {
        String formatertStreng = "";

        for(int i = 0; i < tabell.length; i++) {
            if(i == 0) {
                formatertStreng = formatertStreng + "[";
            }
            formatertStreng = formatertStreng + tabell[i];

            if(i < tabell.length - 1) {
                formatertStreng = formatertStreng + ",";                
            }

            if(i == tabell.length - 1) {
                formatertStreng = formatertStreng + "]";
            }
        }
        System.out.println(formatertStreng);
        return formatertStreng;	
	}

	// c)
	public static int summer(int[] tabell) {
		System.out.println("\nTall i tabell summert vha. for-løkke");
        int total = 0;
        for(int i = 0; i < tabell.length; i++) {
            total += tabell[i];
        }
        System.out.println(total);
        total = 0;
        System.out.println("\nTall i tabell summert vha. while-løkke:");
        int i = 0;
        while(i < tabell.length) {
        	total += tabell[i];
            i++;
        }
        System.out.println(total); 
        System.out.println("\nTall i tabell summert vha. utvided for-løkke:");
        total = 0;
        for(int num : tabell) {
        	total += num;
        }
        System.out.println(total);
        return total;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                System.out.println("Nummeret " + tall + " funnet tidligst på index[" + i + "]\n");
                return i;
            }
        }
        return -1; // har altså da brukt -1 for å vise at tallet ikke ble funnet
	}

	// f)
	public static int[] reverser(int[] tabell) {
        for(int num : tabell) {
            System.out.print(num);
        }

        int[] nyTabell = new int[tabell.length];
        int tabellPos = 0;

        for(int i = tabell.length -1; i >= 0; i--) {
            nyTabell[tabellPos] = tabell[i];
            tabellPos += 1;
        }

        for(int num : nyTabell) {
            System.out.print(num);
        }
        return(nyTabell); 

	}

	// g)
	public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {     
            if (tabell[i] >= tabell[i + 1]) {
                return false;  
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int [] sammensattTabell = new int[tabell1.length + tabell2.length];
        int sammensattTabellIndex = 0;
        for(int i = 0; i < tabell1.length; i ++) {
            sammensattTabell[i] = tabell1[i];
            sammensattTabellIndex += 1;
        }

        for(int i = 0; i < tabell2.length; i ++) {
            sammensattTabell[sammensattTabellIndex] = tabell2[i];
            sammensattTabellIndex += 1;
        }
        for(int num : sammensattTabell) {
            System.out.print(num);
        }

        String formatedTabell = "";
        System.out.println("\n\nOppgave h):\n\nTabell 1:");
        skrivUt(tabell1);
        System.out.println("\nTabell 2:");
        skrivUt(tabell2);
        System.out.println("\nSammenslått:");
        formatedTabell += "[";
        for(int num : sammensattTabell) {
            formatedTabell += (num + ", ");
        }
        formatedTabell = formatedTabell.substring(0, formatedTabell.length() - 2) + "]"; // Fjerner siste ", " fra enden av strengen
        System.out.println(formatedTabell);
        return sammensattTabell;
	}
}
