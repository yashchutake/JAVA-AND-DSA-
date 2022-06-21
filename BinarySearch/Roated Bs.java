class Solution {
    public int search(int[] nums, int target) {
        int pivote=findpivote(nums);
        //if nnot found pivote then array not roted so bs
        if(pivote==-1){
            //just do normal bs
            return Bs(nums,target,0,nums.length-1);
        }
        //if pivote is found then we get two sorted arrays 
        if(nums[pivote]==target){
            return pivote;
        }
        //else possible cases find ans using pivote element 
        if(target >= nums[0]){
            return Bs(nums,target,0,pivote-1);
        }
        
         return Bs(nums,target,pivote,nums.length-1);
        
    }
    
    int Bs(int[] arr, int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;// effective for large no for INT
            // int mid=(start+end)/2;
            // System.out.println(mid);
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // ans found
                return mid;
            }
            // return -1;
        }
        return -1;
    }
    
    int findpivote(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
        int mid= start+(end-start)/2;
        //4 cases
        if(mid <end && arr[mid]>arr[mid+1]){
            return mid;
        }
        
        if(mid > start && arr[mid]<arr[mid-1]){
            return mid-1;
        }
            
        if( arr[mid] <= arr[start]){
            end= mid-1;

        }
            
        else{ 
           start=mid+1;
         }
        
        }

        
         return -1;
    }
            
    
}
