class ProductOfNumbers {
    private List<Integer> li;
    private int pro;

    public ProductOfNumbers() {
        li = new ArrayList<>();
        pro = 1;
    }

    public void add(int num) {
        if (num == 0) {
            li.clear();
            pro = 1;
        } else {
            pro = pro * num;
            li.add(pro);
        }
    }

    public int getProduct(int k) {
        if (li.size() < k)
            return 0;
        if (li.size() == k)
            return li.get(li.size() - 1);
        int product = li.get(li.size() - k - 1);
        if (product == 0)
            return 0;
        return li.get(li.size() - 1) / product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */