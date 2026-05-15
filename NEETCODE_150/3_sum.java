class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;


        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            if(i>0 && nums[i-1]==nums[i])continue;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j-1]==nums[j])j++;
                    while(k>j && nums[k+1]==nums[k])k--;
                }
                else if(sum>0)k--;
                else j++;
            }
        }

        return ans;
        
    }
}


Approach :- we can use three pointers to solve this problem. We can sort the array 
run the loop for the first pointer and then use two pointers to find the two numbers that sum to the target.
skip the duplicates.
if the sum is equal to the target we add the three numbers to the list and return the list.
if the sum is greater than the target we move the right pointer to the left.
if the sum is less than the target we move the left pointer to the right.

Time Complexity :- O(n^2)
Space Complexity :- O(1)





