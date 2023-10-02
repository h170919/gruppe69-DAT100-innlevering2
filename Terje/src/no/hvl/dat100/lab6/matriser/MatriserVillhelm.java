package no.hvl.dat100.lab6.matriser;

public class MatriserVillhelm {
	
	public static void main(String[] args) {

		int[][] matrise = { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 } };
		int[][] matrise2 = { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 } };

		skrivUt(matrise);

		// ----------------------------------
		int[] a0 = { 1, 2, 3 };
		int[] a1 = { 4, 5, 6 };
		int[] a2 = { 7, 8, 9 };

		int[][] a = new int[3][];

		a[0] = a0;
		a[1] = a1;
		a[2] = a2;

		int[] b0 = { 10, 11, 12 };
		int[] b1 = { 13, 14, 15 };
		int[] b2 = { 16, 17, 18 };

		int[][] b = new int[3][];

		b[0] = b0;
		b[1] = b1;
		b[2] = b2;

		System.out.print("\nlinje a: ");
		skrivUt(a);
		System.out.print("\nlinje b: ");
		skrivUt(b);

		System.out.print("\nstreng A :\n");
		System.out.print(tilStreng(a));
		System.out.print("\nstreng B :\n");
		System.out.println(tilStreng(b));

		int[][] skalerta = skaler(2, a);
		skrivUt(skalerta);

		System.out.println(erLik(a, b));
		System.out.println(erLik(matrise, matrise2));

		skrivUt(speile(a));
		// skrivUt(multipliser(a, b));

	}


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
        int[][] speiletMatrise = new int[matrise.length][matrise[0].length];
        for(int i = 0; i < matrise[0].length; i ++) {
            for(int j = 0; j < matrise[i].length; j++) {
                speiletMatrise[i][j] = matrise[j][i];
            }
        }
        return speiletMatrise;
    }

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
