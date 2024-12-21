class Solution {
    public int calPoints(String[] operations) {
        int ele;
        Stack<Integer> sc=new Stack<>();
        for(String i:operations){
            if(i.equals("C"))  sc.pop();
            else if(i.equals("D")){
                ele=sc.peek()*2;
                sc.push(ele);
            }
            else if(i.equals("+")){
                ele=sc.get(sc.size()-2)+sc.get(sc.size()-1);
                sc.push(ele);
            }
            else{
                sc.push(Integer.parseInt(i));
            }
        }
        int sum=0;
        for(int i:sc){
            sum+=i;
        }
        return sum;
    }
}