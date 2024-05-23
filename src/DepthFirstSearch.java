

public class DepthFirstSearch<V> extends Search<V> {
    public DepthFirstSearch(MyGraph<V> graph, V source) {
        super(source);
        dfs(graph, source);
    }

    private void dfs(MyGraph<V> graph, V source) {
        marked.add(source);

        for (Object v : graph.getVertex(source).getAdjacentVerticesData()) {
            if (!marked.contains(v)) {
                edgeTo.put((V) v, source);
                dfs(graph, (V) v);
            }
        }
    }
}

