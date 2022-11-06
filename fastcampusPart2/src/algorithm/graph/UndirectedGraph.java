package algorithm.graph;
//방향성이 없는 그래프 만들기
public class UndirectedGraph{
    private int count; //노드의 갯수
    private int[][] vertexMatrix;


    public UndirectedGraph(int count){
        this.count = count;
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight){
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight;
    }

    public int[][] getMatrix(){
        return vertexMatrix;
    }
}

