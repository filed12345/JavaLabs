package lab10;

import java.util.Collections;
import java.util.PriorityQueue;

public class lab16_21 {
    public static void main(String[] args) {
        PriorityQueue<Double> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        pQueue.offer(3.2);
        pQueue.offer(9.8);
        pQueue.offer(5.4);
        System.out.print("Polling from queue: ");
        while (pQueue.size() > 0){
            System.out.printf("%.1f ",pQueue.peek() ); // view top element
            pQueue.poll();
         }
    }
}
