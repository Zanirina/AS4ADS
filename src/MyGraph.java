import java.util.*;

public class MyGraph<V> extends WeightedGraph {
    public MyGraph(boolean directed){
        super(directed);
    }

    public void addEdge(V source, V dest){
        super.addEdge(source, dest,1.0);
    }



}
