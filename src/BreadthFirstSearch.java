import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<V> extends Search<V> {
    public BreadthFirstSearch(MyGraph<V> graph, V source) {
        super(source);

        bfs(graph, source);
    }//Changed

    private void bfs(MyGraph<V> graph, V source) {
        marked.add(source);
        Queue<V> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            V v = queue.poll();

            for (Vertex<V> vertex : graph.getVertex(v).getAdjacentVertices().keySet()) {
                if (!marked.contains(vertex.getData())) {
                    marked.add(vertex.getData());
                    edgeTo.put(vertex.getData(), v);
                    queue.add(vertex.getData());
                }
            }
        }
    }
}

