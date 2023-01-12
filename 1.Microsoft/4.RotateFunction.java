//You are given an integer array nums of length n.
// Assume arrk to be an array obtained by rotating nums by k positions clock-wise. 
//We define the rotation function F on nums as follow:
// F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1].
// Return the maximum value of F(0), F(1), ..., F(n-1).
public class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int F = 0;
        int S = 0;
        for(int i = 0; i < nums.length; i++){
            F = F + (nums[i] * i);
            S = S + nums[i];
        }

        int max = F; // this is F0
        int n = nums.length;
        for(int i = n - 1; i >= 1 ; i--){
            F = F + S - n * nums[i];
            max = Math.max(max , F);
        }
      return max;
    }
} 