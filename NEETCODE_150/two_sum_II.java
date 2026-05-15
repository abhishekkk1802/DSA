class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0,j= numbers.length-1;

        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum==target)return new int[]{i+1,j+1};
            else if(sum>target)j--;
            else i++;
        }

        return new int[]{}; 
    }
}

Approach :- We can use two pointers to solve this problem. We can start with the first and last element of the array and move the pointers towards the center.
            If the sum of the two elements is greater than the target, we move the right pointer to the left.
            If the sum of the two elements is less than the target, we move the left pointer to the right.
            If the sum of the two elements is equal to the target, we return the indices of the two elements.

Time Complexity :- O(n)
Space Complexity :- O(1)


