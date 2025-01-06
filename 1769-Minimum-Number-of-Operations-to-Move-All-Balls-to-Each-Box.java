class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] operation = new int[n];

        for (int i = 0; i < n; i++) {
            int moves = 0;
            for (int j = 0; j < n; j++) {
                if(i != j){
                    if (boxes.charAt(j) - '0' != 0){
                        moves += Math.abs(i - j);
                    }
                }
            }
            operation[i] = moves;
        }
        return operation;
    }
}