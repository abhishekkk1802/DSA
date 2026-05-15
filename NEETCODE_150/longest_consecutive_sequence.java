class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        Set<Integer> s = new HashSet<>();

        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }

        
        int mxLen=0;

        for(int num:s){
            int ans = 1;
            int curr = num;
            if(!s.contains(curr+1)){
                curr--;
                while(s.contains(curr)){
                    ans ++;
                    curr--;
                }
            }
            mxLen= Math.max(mxLen,ans);
        }

        return mxLen;
    }
}


Approach :- We can use a set to store the numbers that we have already seen. 
            Then we can iterate through the set and check if the current number is the start of a consecutive sequence.
            If it is, we can increment the length of the consecutive sequence.
            Finally, we can return the maximum length of the consecutive sequence.

Time Complexity :- O(n)
Space Complexity :- O(n)



