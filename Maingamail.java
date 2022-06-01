import java.util.*;

public class Maingamail
{
public static void main(String[] args) {
   
    Scanner sc=new Scanner(System.in);
   
    System.out.println("No of mail ");  
    int n=sc.nextInt();
   
    String[] string = new String [n+1];
   
    boolean a,b,c,d;
   
    int g, h, r, y;
  g=0;
  h=0;
  r=0;
  y=0;
  System.out.println("Please the mails");
    for (int i = 0; i < string.length; i++)  
    {  
    string[i] = sc.nextLine();  
    }  



System.out.println("\nYou have entered: ");  
    for(String str: string)  
    {  
    System.out.println(str);  
    }  
   
   
   
    for(String str: string)  
    {  
        a=str.contains("gmail");
       
       
        b=str.contains("hotmail");
         
       

        c=str.contains("yahoo");
         
       
       
        d=str.contains("rediffmail");
         
         
         if(a){
         g++;
       
        }
        if(b){
           
            h++;
        }
       
        if(c){
            y++;
        }
        if(d){
            r++;
        }
       
       
    }
   
   
    System.out.println("gmail="+g);
        System.out.println("hotmail="+h);
            System.out.println("yahoo="+y);
                System.out.println("rediffmail="+r);
               
               

}
}