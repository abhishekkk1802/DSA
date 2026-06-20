class Solution {
    List<String> ans = new ArrayList<>();

    private void solve(int open,int close,int n, String curr){

        if(close == n){
            ans.add(curr);
            return;
        }

        if(open<n){
            solve(open+1,close,n,curr+'(');
        }
        if(close<open){
            solve(open,close+1,n,curr+')');
        }
    }
    public List<String> generateParenthesis(int n) {

        solve(0,0,n,"");

        return ans; 
    }
}

// time complexity = so total chr = open + close
// m = 2n and each has 2 twoices whether to take or not so its 2^m


// Approach: use Recurrsion as when the open parenthesis is taken then only we can close it.