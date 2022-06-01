import java.util.*;
public class Main
{
	public static void main(String[] args) {
    // int [] arr={2,13,4,2,1,3};
		int [] arr=new int[]{-1,-37,-1256,1,7,8,49,54,-256,0,-125,19,27,36,3554};
				    	      
		for(int i=0;i<arr.length;i++){
		    
		    	for(int j=i+1;j<arr.length;j++){
                   int temp=0;
		    	    if(arr[i]>arr[j]){
		    	        temp=arr[i];
		    	        arr[i]=arr[j];
		    	        arr[j]=temp;
		    	    }
		    	
		    	}
		    	    System.out.print(arr[i]+" ");
		    	    
		}
	}
}