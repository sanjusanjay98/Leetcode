class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) 
            pq.add((long) num);
        
        int count = 0;
        while(!pq.isEmpty() && pq.peek() < k) {
            long first = pq.remove();
            long second = pq.remove();
            pq.add((long) (first * 2 + second));
            count++;
        }
        return count;
    }
}