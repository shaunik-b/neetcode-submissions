class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer> min;

    public MinStack() {
        stack = new ArrayList<>();
        min = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if(min.isEmpty() || val<=min.get(min.size()-1)){
            min.add(val);
        }
    }
    
    public void pop() {
        int toRemove = stack.remove(stack.size()-1);

        if(!min.isEmpty() && min.get(min.size()-1)==toRemove){
            min.remove(min.size()-1);
        }
        
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return min.get(min.size()-1);
    }
}
