// import java.util.*;
class Solution {

  public static int[] buildArray(int[] nums) {
      // nums={2,3,4,5,6}
      int size=nums.length;
      int [] a=new int[size];
      for(int i=0;i<size;i++){
          int prd=(nums[nums[i]]);
          a[i]=prd;
      }
      return a;
  }

  // public static void main(String[] args) {
  //   // int [] arr ={1,2,3,4,5};
  //   // buildArray(arr);
  // }

}
// import java.util.*;
// class Solution {
//     public int[] buildArray(int[] nums) {
//       final int n = nums.length;
  
//       for (int i = 0; i < n; ++i)
//         nums[i] += n * (nums[nums[i]] % n);
  
//       for (int i = 0; i < n; ++i)
//         nums[i] /= n;
  
//       return nums;
//     }
//   }