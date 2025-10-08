import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueHeap {
    // Min Heap Priority Queue
    static class MinHeapPriorityQueue {
        private PriorityQueue<Integer> minHeap;

        public MinHeapPriorityQueue() {
            minHeap = new PriorityQueue<>();
        }

        public void insert(int val) {
            minHeap.add(val);
        }

        public int peek() {
            return minHeap.peek();
        }

        public int remove() {
            return minHeap.poll();
        }

        public boolean isEmpty() {
            return minHeap.isEmpty();
        }
    }

    // Max Heap Priority Queue
    static class MaxHeapPriorityQueue {
        private PriorityQueue<Integer> maxHeap;

        public MaxHeapPriorityQueue() {
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        }

        public void insert(int val) {
            maxHeap.add(val);
        }

        public int peek() {
            return maxHeap.peek();
        }

        public int remove() {
            return maxHeap.poll();
        }

        public boolean isEmpty() {
            return maxHeap.isEmpty();
        }
    }

    public static void main(String[] args) {
        MinHeapPriorityQueue minPQ = new MinHeapPriorityQueue();
        MaxHeapPriorityQueue maxPQ = new MaxHeapPriorityQueue();
        int[] values = {5, 1, 9, 3, 7};
        for (int v : values) {
            minPQ.insert(v);
            maxPQ.insert(v);
        }
        System.out.print("Min Heap order: ");
        while (!minPQ.isEmpty()) {
            System.out.print(minPQ.remove() + " ");
        }
        System.out.println();
        System.out.print("Max Heap order: ");
        while (!maxPQ.isEmpty()) {
            System.out.print(maxPQ.remove() + " ");
        }
        System.out.println();
    }
}
