class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int req = target-nums[i];
            if(mp.containsKey(req)){
                return new int[]{mp.get(req),i};
            }
            mp.put(nums[i],i);
        }

        return new int[]{};
    }
}

Approach :- We can use a hashmap to store the numbers that we have already seen. 
            If we see a number that is already in the map, we return the index of the number and the index of the current number.
            If we don't see any number that is already in the map, we add the current number and its index to the map.

Time Complexity :- O(n)
Space Complexity :- O(n)




