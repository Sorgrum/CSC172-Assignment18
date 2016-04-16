/**
 * Created by mgheiler on 4/16/2016.
 */
public class Main {
    public static void main(String[] args) {
        Graph g1 = new Graph(7, true);
        g1.insert(new Edge(0, 3));
        g1.insert(new Edge(0, 1));
        g1.insert(new Edge(1, 3));
        g1.insert(new Edge(1, 4));
        g1.insert(new Edge(2, 0));
        g1.insert(new Edge(3, 4));
        g1.insert(new Edge(3, 5));
        g1.insert(new Edge(3, 6));
        g1.insert(new Edge(4, 6));
        g1.insert(new Edge(6, 5));
        g1.show();

        System.out.println();

        Graph g2 = new Graph(5, false);
        g2.insert(new Edge(0, 1));
        g2.insert(new Edge(0, 3));
        g2.insert(new Edge(0, 4));
        g2.insert(new Edge(1, 3));
        g2.insert(new Edge(1, 2));
        g2.insert(new Edge(2, 1));
        g2.insert(new Edge(2, 3));
        g2.insert(new Edge(2, 4));
        g2.insert(new Edge(3, 0));
        g2.insert(new Edge(3, 1));
        g2.insert(new Edge(3, 2));
        g2.insert(new Edge(4, 0));
        g2.insert(new Edge(4, 2));
        g2.show();
    }
}
