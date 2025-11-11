 


import java.util.*;

public class GraphArrayMatrix {

    private int vertices;
    private int[][] graph;

    // ===== Constructor =====
    public GraphArrayMatrix(int v) {
        vertices = v;
        graph = new int[v][v];
    }

    // ===== Add Edge (directed) =====
    void addEdge(int src, int dest) {
        graph[src][dest] = 1;  // directed edge
    }

    // ===== Remove Edge (directed) =====
    void removeEdge(int src, int dest) {
        // remove directed edge from src to dest
        graph[src][dest] = 0;
    }

    // ===== Create the Graph =====
    void create() {
        addEdge(0, 1);
        addEdge(0, 2);

        addEdge(1, 0);
        addEdge(1, 3);

        addEdge(2, 0);
        addEdge(2, 4);

        addEdge(3, 1);
        addEdge(3, 4);
        addEdge(3, 5);

        addEdge(4, 2);
        addEdge(4, 3);
        addEdge(4, 5);

        addEdge(5, 3);
        addEdge(5, 4);
        addEdge(5, 6);
    }

    // ===== Print Adjacency Matrix =====
    void printMatrix() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < vertices; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    // ===== BFS Traversal =====
    void bfs() {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        System.out.print("\nBFS Traversal: ");
        while (!q.isEmpty()) {
            int node = q.remove();
            if (!visited[node]) {
                System.out.print(node + " ");
                visited[node] = true;

                for (int i = 0; i < vertices; i++) {
                    if (graph[node][i] == 1)
                        q.add(i);
                }
            }
        }
        System.out.println();
    }

    // ===== DFS Traversal =====
    void dfs(int node, boolean[] visited) {
        System.out.print(node + " ");
        visited[node] = true;

        for (int i = 0; i < vertices; i++) {
            if (graph[node][i] == 1 && !visited[i]) {0
                dfs(i, visited);
            }
        }
    }

    // ===== Path Finding using DFS =====
    boolean pathExists(int src, int dest, boolean[] visited, Stack<Integer> path) {
        visited[src] = true;
        path.push(src);

        if (src == dest) return true;

        for (int i = 0; i < vertices; i++) {
            if (graph[src][i] == 1 && !visited[i]) {
                if (pathExists(i, dest, visited, path))
                    return true;
            }
        }
        path.pop();
        return false;
    }

    // ===== Cycle Detection (Directed Graph) =====
    boolean hasCycle() {
        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (cycleUtil(i, visited, recStack))
                return true;
        }
        return false;
    }

    boolean cycleUtil(int v, boolean[] visited, boolean[] recStack) {
        if (recStack[v]) return true;
        if (visited[v]) return false;

        visited[v] = true;
        recStack[v] = true;

        for (int i = 0; i < vertices; i++) {
            if (graph[v][i] == 1 && cycleUtil(i, visited, recStack))
                return true;
        }

        recStack[v] = false;
        return false;
    }

    // ===== Topological Sort (Kahn’s Algorithm) =====
    void topologicalSort() {
        int[] inDegree = new int[vertices];

        // Compute in-degrees
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (graph[i][j] == 1)
                    inDegree[j]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertices; i++) {
            if (inDegree[i] == 0)
                queue.offer(i);
        }

        int count = 0;
        List<Integer> order = new ArrayList<>();

        while (!queue.isEmpty()) {
            int v = queue.poll();
            order.add(v);

            for (int i = 0; i < vertices; i++) {
                if (graph[v][i] == 1) {
                    inDegree[i]--;
                    if (inDegree[i] == 0)
                        queue.offer(i);
                }
            }
            count++;
        }

        if (count != vertices) {
            System.out.println("Cycle detected! Topological sort not possible.");
        } else {
            System.out.print("Topological Order: ");
            for (int node : order)
                System.out.print(node + " ");
            System.out.println();
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {
        GraphArrayMatrix g = new GraphArrayMatrix(7);
        g.create();
        g.printMatrix();

        // BFS
        g.bfs();

        // DFS
        boolean[] vis = new boolean[7];
        System.out.print("DFS Traversal: ");
        g.dfs(0, vis);
        System.out.println();

        // Path finding
        System.out.println("\nPath Finding:");
        boolean[] visited = new boolean[7];
        Stack<Integer> path = new Stack<>();
        if (g.pathExists(0, 5, visited, path)) {
            System.out.print("Path from 0 to 5: ");
            for (int node : path) System.out.print(node + " ");
            System.out.println();
        } else {
            System.out.println("No path found between 0 and 5.");
        }

        // Cycle detection
        System.out.println("\nCycle Detection:");
        if (g.hasCycle())
            System.out.println("Cycle exists in the graph.");
        else
            System.out.println("No cycle found.");

        // Topological sort
        System.out.println("\nTopological Sort:");
        g.topologicalSort();
    }
}