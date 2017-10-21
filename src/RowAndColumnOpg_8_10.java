
public class RowAndColumnOpg_8_10 {
    public static void main(String[] args) {
        //Laver en 4x4 Array kaldet matrix
        int[][] matrix = new int[4][4];
        //Laver 2 variabler for Row og column, en der tæller hvor mange der er(largest...), og en der fortæller hvilken det er(hvilken...).
        int largestRow=0;
        int hvilkenRow=0;
        int largestCol=0;
        int hvilkenCol=0;





        /*Indsætter værdier og fortæller hvilken row der er størst*/
        for (int i = 0; i < matrix.length; i++) { //En løkke der tæller opad for matrix[x][]
            int rowCount=0;//En variable der tillader programmet at gemme værdien for den med flest 1.
            for (int j = 0; j < matrix[i].length; j++) {//En løkke der tæller opad for matrix[][x]
                matrix[i][j] = (int)(Math.random() * 2); //Indsætter tilfældig værdig mellem 0 og 1, i den index den er nået til.
                rowCount += matrix[i][j];// Her tilføjer den værdien af array pladsen til rowcount. Virker da der på pladsen enten er 0 eller 1,
                // så når man tilføjer et array spot vil den enten + med 1 eller 0.

                // Hvis nuværende "row count" er større end den tidligere største, ændre den værdien
                if (rowCount>largestRow){
                    largestRow=rowCount;
                    hvilkenRow= i;//Fortæller hvilken row det er.
                }

            }
        }

        //Her finder den bare ud af hvilken column der har flest 1'ere, istedet for hvilken row.
        for (int k = 0; k < matrix[0].length; k++) {
            int columnCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                columnCount += matrix[i][k];
            }
            if (columnCount > largestCol) {
                largestCol = columnCount;
                hvilkenCol = k;
            }

        }


        //Printer den (matrix array)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }



        System.out.println("Row with most 1s: "+(hvilkenRow+1));
        System.out.println("Col with most 1s: "+(hvilkenCol+1));


    }
}
