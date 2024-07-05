// Time Complexity : O(log n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1.0;
        }

        double result = myPow(x, n/2);
        
        if(n%2 == 0){// n is even
            return result*result;
        }
        else{ // n is odd
            
            if(n>0){
                return result * result * x;
            }
            else{
                return result * result * 1/x;
            }
        }
    }
}