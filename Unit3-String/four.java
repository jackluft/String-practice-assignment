import java.util.Scanner;

public class four{
    
    
    // pig Latin project
    
    public static void main(String[] args){
        // done
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter type in a word: ");
        String str = "hello my name is jack ";
        
        
        String [] parts  = str.split(" ");
        System.out.println(parts.length);
        String ans = "";
        
        
        for(int i = 0; i< parts.length; i++){
            
            if(parts[i].length() > 2){
                str = parts[i];
                String f = str.substring(0,1);
                ans+= str.substring(1)+f+"ay";
                ans+=" ";
                
                
                
            }else{
            ans+=parts[i];
            ans+=" ";
        }
            
        }
        System.out.print("Ans: "+ans);
        
        
        
        
        
        
    }

}
