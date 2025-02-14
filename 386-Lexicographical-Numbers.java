class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            li.add(i);
        }
        
        Collections.sort(li, (a, b) -> String.valueOf(a).compareTo(String.valueOf(b)));

        return li;
    }
}