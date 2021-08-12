import java.util.Scanner;

public class DepthFirstTraversal {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of vertices : ");
        int vertices = scan.nextInt();
        System.out.println("Enter the number of edges : ");
        int edges = scan.nextInt();

        int [][] adjecencyMatrix = new int[vertices][vertices];
        System.out.println("Enter the connected vertices : \n");
        for (int i=0;i<edges;i++){
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            adjecencyMatrix[v1][v2]=1;
            adjecencyMatrix[v2][v1]=1;
        }
//        System.out.println("Adjency matrix is : ");
//        for (int i=0;i<vertices;i++){
//            for(int j=0;j<vertices;j++){
//                System.out.print(adjecencyMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        depthfirsttraversal(adjecencyMatrix);

    }
    private static void depthfirsttraversal(int[][] adjecencyMatrix) {
        boolean [] visited = new boolean[adjecencyMatrix.length];//by default value is false
        depthfirsttraversal(adjecencyMatrix, 0, visited); //starting from zero
    }
    private static void depthfirsttraversal(int[][] adjecencyMatrix ,int currentvertex, boolean[] visited) {
        System.out.print(currentvertex+" ");
        visited[currentvertex] = true;
        for (int i=0; i< adjecencyMatrix.length;i++){
            if(adjecencyMatrix[currentvertex][i]==1&&visited[i]==false){
                depthfirsttraversal(adjecencyMatrix, i, visited);
            }
        }
    }


}
