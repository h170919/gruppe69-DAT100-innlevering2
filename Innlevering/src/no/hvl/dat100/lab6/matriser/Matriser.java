package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        for(int rad[] : matrise) {
            for(int tall : rad) {
                System.out.print(tall);
            }
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
        String formatertMatrise = "";
        for(int r = 0; r < matrise.length; r++) {
            for(int num = 0; num < matrise[r].length; num++) {
                formatertMatrise += matrise[r][num] + " ";
            }
            formatertMatrise += "\n";
        }
        return formatertMatrise;		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nyMatrise = new int[matrise.length][matrise[0].length];

        int radCounter = 0;
        int elementCounter = 0;
        
        for(int rad[] : matrise) {
            elementCounter = 0;
            for (int element : rad) {
                nyMatrise[radCounter][elementCounter] = element * tall;
                elementCounter += 1;
            }
            radCounter += 1;
        }

        for (int[] rad : nyMatrise) {
            for (int element : rad) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        return nyMatrise;  

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
        boolean lik = true;

        int radCounter = 0;
        int elementCounter = 0;
        
        for(int rad[] : a) {
            elementCounter = 0;
            for (int element : rad) {
                if(element != b[radCounter][elementCounter]) {
                    lik = false;
                }
                elementCounter += 1;
            }
            radCounter += 1;
        }
        return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
