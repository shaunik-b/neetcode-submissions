class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ans = 0;
        int val1;
        int val2;

        for(String s:tokens){
            switch (s) {
                case "+": {

                    val2=stack.pop();
                    val1=stack.pop();

                    ans = val1 + val2;
                    stack.push(ans);
                    break;

                 }

                 case "-": {
                    val2=stack.pop();
                    val1=stack.pop();

                    ans = val1 - val2;
                    stack.push(ans);
                    break;
                 }

                 case "*": {
                    val2=stack.pop();
                    val1=stack.pop();

                    ans = val1 * val2;
                    stack.push(ans);
                    break;

                 }

                 case "/": {
                    val2=stack.pop();
                    val1=stack.pop();

                    ans = val1/val2;
                    stack.push(ans);
                    break;

                 }

                 

                default: {
                    stack.push(Integer.parseInt(s));
                    break;
                }
            }
        }
        return stack.pop();
    }
}
