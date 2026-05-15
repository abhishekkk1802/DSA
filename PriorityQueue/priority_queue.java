In Java, you can create a PriorityQueue of pairs in multiple ways.

Since Java does not have a built-in Pair class commonly used in DSA, people usually use:

1-int[]
2-Map.Entry
3-Custom class
4-Pair from JavaFX (rare in coding platforms)

1. Using int[] as Pair (Most Common in DSA)
   #### Min Heap based on first element
    Example:
    PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a, b) -> a[0] - b[0]
    );


    pq.offer(new int[]{2, 10});
    pq.offer(new int[]{1, 5});
    pq.offer(new int[]{3, 7});

    while (!pq.isEmpty()) {
        int[] p = pq.poll();
        System.out.println(p[0] + " " + p[1]);
    }

    output:
    1 5
    2 10
    3 7

  ####And for max Heap  just do b[0] - a[0] instead of a[0] - b[0]
    PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> b[0] - a[0]
    );



#### Compare based on second element
PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> a[1] - b[1]
);

Example:
import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        pq.offer(new int[]{1, 50});
        pq.offer(new int[]{2, 20});
        pq.offer(new int[]{3, 30});

        while (!pq.isEmpty()) {
            int[] p = pq.poll();
            System.out.println(p[0] + " " + p[1]);
        }
    }
}

output:
2 20
1 50
3 30


####. If First Equal then Compare Second
PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> {
        if (a[0] == b[0]) {
            return a[1] - b[1]; // if first equal then compare second int java we have to do but in c++ it automatically compare second in case first is equal
        }
        return a[0] - b[0]; // if first not equal then compare first
    }
);


/////////////////////////****************************************///////////////////////// */
Using Custom Pair Class (Cleaner way to store pair)
class Pair {
    int node;
    int dist;

    Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

PriorityQueue<Pair> pq = new PriorityQueue<>(
    (a, b) -> a.dist - b.dist
);

pq.offer(new Pair(1, 10));
pq.offer(new Pair(2, 5));

while (!pq.isEmpty()) {
    Pair p = pq.poll();
    System.out.println(p.node + " " + p.dist);
}

output:
1 10
2 5