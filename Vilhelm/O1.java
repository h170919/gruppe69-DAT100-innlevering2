public class O1 {
    public static void main(String[] args) {
        System.out.println("Oppgave a):\n");
        skrivUt(new int[] {1,2,3,5});
        tilStreng(new int[] {42,67,89});
        System.out.println(summer(new int[] {5,10,20}));
        System.out.println(finnesTall(new int[] {52,2,3,4,6,99}, 99));
        posisjonTall(new int[] {99,2,7,2,4,6,5,9}, 2);
        reverser(new int[] {1,2,3,4,5});
        erSortert(new int[] {1,2,3,2,5});
        settSammen(new int[] {1,2,3}, new int[] {4,5,6});
    }

    public static void skrivUt(int[] tabell) {
        for(int i = 0; i < tabell.length; i++) {
            if(i == 0) {
                System.out.print("[");
            }
            System.out.print(tabell[i]);

            if(i < tabell.length - 1) {
                System.out.print(", ");
            }

            if(i == tabell.length - 1) {
                System.out.print("]\n");
            }

        }
    }

    public static String tilStreng (int[] tabell) {

        String formatertStreng = "";

        for(int i = 0; i < tabell.length; i++) {
            if(i == 0) {
                System.out.print("\n\nOppgave b):\n\nSkriv formatert tabell metode (tilStreng):");
                formatertStreng = formatertStreng + "\n[";
            }
            formatertStreng = formatertStreng + tabell[i];

            if(i < tabell.length - 1) {
                formatertStreng = formatertStreng + ", ";                
            }

            if(i == tabell.length - 1) {
                formatertStreng = formatertStreng + "]";
            }
        }
        System.out.println(formatertStreng);
        return formatertStreng;
    }

    public static int summer(int[] tabell) {
        System.out.println("\nOppgave c):\n\nTall i tabell summert vha. for-løkke: ");
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
        for(int tall : tabell) {
            
            total += tall;
        }
        return total;
    }

    public static boolean finnesTall(int[] tabell, int tall) {
        System.out.println("\nOppgave d):\n\nTall i tabell?");
        for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
    }

    public static int posisjonTall (int[] tabell, int tall) {
        System.out.println("\n\nOppgave e):\n\n");
        for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                System.out.println("Nummeret " + tall + " funnet tidligst på index[" + i + "]\n");
                return i;
            }
        }
        return -1; // har altså da brukt -1 for å vise at tallet ikke ble funnet
    }

    public static int[] reverser(int[] tabell) {
        System.out.println("Oppgave f):\n");
        System.out.println("Før reversering:");
        for(int num : tabell) {
            System.out.print(num);
        }

        int[] nyTabell = new int[tabell.length];
        int tabellPos = 0;

        for(int i = tabell.length -1; i >= 0; i--) {
            nyTabell[tabellPos] = tabell[i];
            tabellPos += 1;
        }

        System.out.println("\n\nEtter reversering:");
        for(int num : nyTabell) {
            System.out.print(num);
        }
        return(nyTabell); 
    }
    
    public static boolean erSortert(int[] tabell) {
        System.out.println("\n\nOppgave g):\n\n");
    
        for (int i = 0; i < tabell.length - 1; i++) {     
            if (tabell[i] >= tabell[i + 1]) {
                System.out.println("Tabellen er ikke sortert");
                return false;  
            }
        }
        System.out.println("Tabellen er sortert");
        return true;
    }

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

