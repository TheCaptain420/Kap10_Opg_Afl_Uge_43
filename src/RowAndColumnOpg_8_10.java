
public class RowAndColumnOpg_8_10 {
    public static void main(String[] args) {
        //Laver en 4x4 Array kaldet matrix
        int[][] matrix = new int[4][4];
        int largestRow=0;
        int hvilkenRow=0;
        int largestCol=0;
        int hvilkenCol=0;





        //Indsætter værdier og fortæller hvilken er størst
        for (int i = 0; i < matrix.length; i++) {
            int rowCount=0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                rowCount += matrix[i][j];// Her tilføjer den værdien af array pladsen til rowcount. Virker da der på pladsen enten er 0 eller 1,
                // så når man tilføjer et array spot vil den enten + med 1 eller 0.

                if (rowCount>largestRow){
                    largestRow=rowCount;
                    hvilkenRow= i;
                }

            }
        }

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


        //Printer den
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }



        System.out.println("Most row: "+largestRow);
        System.out.println("Most col: "+largestCol);


    }
}
