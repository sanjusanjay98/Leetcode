class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int arr[] = new int[n];
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs1.add(A[i]);
            hs2.add(B[i]);
            int count = 0;
            for (int num : hs1) {
                if (hs2.contains(num))
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}