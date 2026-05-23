class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[128];

        int n = s.length();
        int ans = 0;
        int j =0;
        int i;
        for(i=0;i<n;i++){
            if(freq[s.charAt(i)-' ']!=0){
                ans = Math.max(i-j,ans);
                while(j<i && freq[s.charAt(i)-' ']!=0){
                    freq[s.charAt(j)-' ']--;
                    j++;
                }

            }
            freq[s.charAt(i)-' ']++;
        }
        ans = Math.max(i-j,ans);

        return ans;
        
    }
}

Approach :- Use a sliding window with two pointers i (right) and j (left).
            Track character counts in a fixed int[128] array (index = char - ' '), not a HashMap.
            Expand i: if s[i] is already in the window, record ans = max(i - j, ans) and shrink from j
            until that character leaves the window, then add s[i] to the window.
            After the loop, update ans once more for the final window [j, i).

Time Complexity :- O(n)
Space Complexity :- O(1)