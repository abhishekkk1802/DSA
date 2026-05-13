class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> isPre = new HashSet<>();

        for(int i=0;i<n;i++){
            if(isPre.contains(nums[i]))return true;
            else isPre.add(nums[i]);
        }

        return false;
        
    }
}

Approach :- We can use a set to store the numbers that we have already seen. 
            If we see a number that is already in the set, we return true. 
            If we don't see any number that is already in the set, we return false.

Time Complexity :- O(n)
Space Complexity :- O(n)




