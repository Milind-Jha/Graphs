import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreadthFirstTraversal {
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
        breadthfirsttraversal(adjecencyMatrix);
    }

    public static void breadthfirsttraversal(int[][] adjecencyMatrix) {

        boolean[] visited = new boolean[adjecencyMatrix.length];
        Queue<Integer> pendingvertices = new LinkedList<>();
        pendingvertices.add(0);
        visited[0]=true;

        while (!pendingvertices.isEmpty()){
            int currentVertex = pendingvertices.remove();
            System.out.print(currentVertex+" ");
            for (int i=0;i< adjecencyMatrix.length;i++){
                if(adjecencyMatrix[currentVertex][i]==1 && visited[i]==false){
                    pendingvertices.add(i);
                    visited[i]=true;
                }
            }
        }

    }

}
