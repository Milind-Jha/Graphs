public class PrintSpiralArray {
    public static void spiralPrint(int matrix[][]) {

        if(matrix.length==0){
            return;
        }
        int rowbegin = 0;
        int rowend = matrix.length-1;
        int columnbegin = 0;
        int columnend = matrix[0].length-1;
        while (rowbegin<=rowend&&columnbegin<=columnend){
            for (int i=columnbegin;i<=columnend;i++){
                System.out.print(matrix[rowbegin][i]+" ");
            }
            rowbegin++;

            for(int i=rowbegin;i<=rowend;i++){
                System.out.print(matrix[i][columnend]+" ");
            }
            columnend--;

            if(rowbegin<=rowend){
                for(int i=columnend;i>=columnbegin;i--){
                    System.out.print(matrix[rowend][i]+" ");
                }
            }
            rowend--;
            if(columnbegin<=columnend){
                for (int i=rowend;i>=rowbegin;i--){
                    System.out.print(matrix[i][columnbegin]+" ");
                }
            }
            columnbegin++;
        }
    }
}
