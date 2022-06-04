/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	int [] arr={2,4,5,6,7,8,9,12,15,26,29,678,898};
	int target= 15;
	//int ans=Bs(int[] arr,int target);
	System.out.println(ans(arr,target));
	    
	    
	    
	}
	
	static int ans(int[] arr,int target){
	    //first find the SecurityManager
	    //intialize the size with box 2
	    int start =0;
	    int end=1;
	    
	    //condition for target to lie in the range
	    while(target> arr[end]){
	        int temp=end+1;
	        end=end+(end-start + 1) * 2;
	        start = temp;
	    }
	    return Bs(arr,target,start,end);
	}
	
	
	static int Bs(int[] arr, int target,int start,int end) {
        
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
    
    
}
