package bean;

import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null||nums.length ==0){
            return;
        }
        int length = nums.length;
        if( length % k ==0){
            int loop = length / k;
        }

        switchArray(nums,0,k,k,nums[0]);



    }

    private void switchArray(int[] nums,int size,int end,int k,int temp){
        if(size == nums.length){
            return;
        }

        end = end % nums.length;

        int other = nums[end];
        nums[end] = temp;


        end+=k;


        size ++ ;
        switchArray(nums,size,end,k,other);
    }
}
public class Dc {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] ints = {-1, -103, 3, 99};
        solution.rotate(ints,2);
        System.out.println(Arrays.toString(ints));
    }
}
