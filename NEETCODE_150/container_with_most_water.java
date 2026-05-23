class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int ans =0;

        while(i<j){
            int area = Math.min(height[i],height[j])*(j-i);
            ans = Math.max(ans,area);

            if(height[i]>=height[j])j--;
            else i++;
        }

        return ans;
        
    }
}


Approach:- we can use two pointer at every step we calculate the area and update the maximum area, 
move the pointer which has the shorter height.

Time Complexity :- O(n)
Space Complexity :- O(1)








