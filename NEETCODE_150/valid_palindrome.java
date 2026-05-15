class Solution {
    public boolean isPalindrome(String s) {

        int n = s.length();

        int i=0,j=n-1;

        while(i<j){

            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }

            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))return false;
            i++;
            j--;
        }

        return true;
    }
}

Approach :- We can use two pointers to check if the string is a palindrome.

Time Complexity :- O(n)
Space Complexity :- O(1)


