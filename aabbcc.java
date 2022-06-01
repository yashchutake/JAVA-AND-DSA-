import java.util.*;
public class aabbcc
{
	public static void main(String[] args) {
    // int [] arr={2,13,4,2,1,3};
	//	int [] arr=new int[]{-1,-37,-1256,1,7,8,49,54,-256,0,-125,19,27,36,3554};
    String a="AABBCCSDDD";
    char [] search={'A','B','C','S','D'};
   // int count=0;
    int i,j=0;
    for( i=0;i<search.length;i++){
        int count=0;
         for(j=0;j<a.length();j++){
          if(a.charAt(j) == search[i]){
             count ++;
          }
          // System.out.print(search[j]+""+count);
         }
         
         if(i<j){
          System.out.print(search[i]+""+count);
         }
         
         }
   //  	if(i<j){
   //  	 System.out.print(search[i]+""+count);
   //  	}
// System.out.print(search+" "+count);
		    	    
		}
}