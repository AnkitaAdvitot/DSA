import java.util.*;

class BiggestMeatball {
    public static int findLastServedPerson(int N, int D, int[] meatballs) {
        // Queue to store {index, meatball weight}
        Queue<int[]> queue = new LinkedList<>();
        
        // Add each person to the queue with their 1-based index
        for (int i = 0; i < N; i++) {
            queue.add(new int[]{i + 1, meatballs[i]});  // Store (index, weight)
        }
        
        // Process the queue until only one person remains
        while (queue.size() > 1) {
            int[] person = queue.poll();  // Get first person
            int index = person[0];
            int weight = person[1];

            weight -= D;  // Reduce the meatball by D kg
            
            if (weight > 0) {
                queue.add(new int[]{index, weight});  // Add back to queue if meatball is still left
            }
        }
        
        // The last remaining person's index
        return queue.peek()[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // Number of people
        int D = sc.nextInt(); // Day's quantity
        
        int[] meatballs = new int[N];  // Meatball weights
        for (int i = 0; i < N; i++) {
            meatballs[i] = sc.nextInt();
        }
        
        // Get the last served person's index
        int result = findLastServedPerson(N, D, meatballs);
        System.out.println(result);
    }
}
