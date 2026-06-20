class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int ans =0;
        int mxFreq =0;
        int j =0;

        for(int i=0;i<s.length();i++){
            int cnt = ++freq[s.charAt(i)-'A'];
            mxFreq = Math.max(mxFreq,cnt);
            while((i-j+1-mxFreq)>k){
                freq[s.charAt(j)-'A']--;
                j++;
            }
            
            ans = Math.max(ans,i-j+1);
        }

        return ans;
        
    }
}

// AABABBA

Approach :- we can use a sliding window to solve this problem. We can use a frequency array to store the frequency of each character in the window.
            We can use a maximum frequency variable to store the maximum frequency of any character in the window.
            We can use a left pointer to store the left pointer of the window.
            We can use a right pointer to store the right pointer of the window.
            We can use a while loop to shrink the window until the frequency of the most frequent character in the window is less than or equal to the maximum frequency variable.
            We can update the maximum frequency variable to the maximum frequency of any character in the window.
            We can return the length of the longest substring after the loop ends.

Time Complexity :- O(n)
Space Complexity :- O(1)