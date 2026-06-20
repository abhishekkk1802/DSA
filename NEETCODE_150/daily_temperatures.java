class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;

        int[] ans = new int[n];

        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() ){
                int ele = temperatures[s.peek()];
                if(ele<=temperatures[i])s.pop();
                else break;
            }

            if(s.size()==0)ans[i]=0;
            else ans[i] = s.peek()-i;
            s.push(i);
        }

        return ans;
        
    }
}

Time Complexity :- O(n)
Space Complexity :- O(n)

Approach :- We can use a stack to store the indices of the temperatures that are greater than the current temperature.
            We can iterate through the temperatures array from right to left.
            If the current temperature is greater than the temperature at the index stored in the stack, we pop the index from the stack.
            If the current temperature is less than the temperature at the index stored in the stack, we store the difference between the current index and the index stored in the stack in the answer array.
            We push the current index into the stack.
            Finally, we return the answer array.