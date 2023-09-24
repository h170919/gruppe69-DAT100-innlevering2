public class O1b {
    public static void main(String[] args) {
        int[][] matrise1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] matrise2 = {
            {1,2,3},
            {4,5,6},
            {7,8,7}
        };

        System.out.println("Oppgave a):\n");
        skrivUtv1(matrise1);
        System.out.println("\nOppgave b):\n");
        System.out.println(tilStreng(matrise1));
        System.out.println("\nOppgave c):\n");
        skaler(10, matrise1);
        System.out.println("\nOppgave d):\n");
        System.out.println("Er matrisene like? " + erLik(matrise1, matrise2));
    }

    public static void skrivUtv1(int[][] matrise) {
        for(int rad[] : matrise) {
            for(int tall : rad) {
                System.out.print(tall);
            }
        }
    }

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
        return matrise;  
    }

    public static boolean erLik(int[][] mat1, int[][] mat2) {
        boolean lik = true;

        int radCounter = 0;
        int elementCounter = 0;
        
        for(int rad[] : mat1) {
            elementCounter = 0;
            for (int element : rad) {
                if(element != mat2[radCounter][elementCounter]) {
                    lik = false;
                }
                elementCounter += 1;
            }
            radCounter += 1;
        }
        return lik;
    }
}

