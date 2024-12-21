class MyHashMap {
    Map<Integer,Integer> hs;

    public MyHashMap() {
        hs=new HashMap<>();
    }
    
    public void put(int key, int value) {
        hs.put(key,value);
    }
    
    public int get(int key) {
        if(hs.get(key)==null)   return -1;
        return hs.get(key);
    }
    
    public void remove(int key) {
        hs.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */