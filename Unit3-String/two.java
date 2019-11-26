

public class two
{
   // palindrome
   public static void main(String[] args){
       String input = "aibohp*ho...bia".toLowerCase();
       
       String re ="";
       String ans = "";
       
       for(int i = 0; i < input.length(); i++){
           if(input.charAt(i) != '.' && input.charAt(i) != ',' && input.charAt(i) != '*'){
               ans+= input.charAt(i);
               
               
               
               
            }
           
        }
        
    
    System.out.println("------"+ans+"-----");
       
       for(int i = ans.length()-1; i >= 0; i--){
           re += ans.charAt(i);
           
           
           
        }
        
       if(ans.equals(re)){
           System.out.println("True");
           
           
           
        }
        else{
            
         System.out.println("False");   
        }
       
       
       
       
    }
}
