class Solution {
    public int findCircleNum(int[][] edges) {
        int count = 0, v = edges.length;
        int[] visited = new int[v + 1];

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (edges[i][j] == 1 && i != j) {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }

        for (int i = 0; i < v; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(i, visited, list);
            }
        }
        return count;
    }

    public void dfs(int node, int[] visited, List<List<Integer>> list) {
        visited[node] = 1;
        for (int edges : list.get(node)) {
            if (visited[edges] == 0) {
                dfs(edges, visited, list);
            }
        }
    }
}