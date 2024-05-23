import java.util.Map;
import java.util.Set;

public class DijkstraSearch<V> extends Search<V> {
    private Set<V> unsettledNodes;
    private Map<V, Double> distances;
    private WeightedGraph<V> graph;

    public DijkstraSearch(WeightedGraph<V> graph, V source) {
        super(source);
        for (V v : graph.getVertices()) {
            distances.put(v, Double.POSITIVE_INFINITY);
        }
        distances.put(source, 0.0);
        dijkstra(graph);
    }

    public void dijkstra(WeightedGraph<V> graph) {
        while (true) {
            V vertex = null;
            double minDist = Double.POSITIVE_INFINITY;

            for(V v: distances.keySet())
        }


    }

    private double getDistance(V node, V target) {
        for (Edge<V> edge : graph.getEdges(node)) {
            if (edge.getDest().equals(target))
                return edge.getWeight();
        }

        throw new RuntimeException("Not found!");
    }

    private V getVertexWithMinimumWeight(Set<V> vertices) {
        V minimum = null;
        for (V V : vertices) {
            if (minimum == null) {
                minimum = V;

                continue;
            }

            if (getShortestDistance(V) < getShortestDistance(minimum))
                minimum = V;
        }

        return minimum;
    }

    private double getShortestDistance(V destination) {
        Double d = distances.get(destination);

        return (d == null ? Double.MAX_VALUE : d);
    }
}


