
 
public class three{
    
    
    // Binary Project
    public static void main(String[] args){
        int num = 42;
        int result = num;
        int r=0;
        String ans = "";
        
        while(result != 0){
            
            r = result%2;
            if(r == 1){
                ans+="1";
                
                
            }
            else{
                ans+="0";
            }
            
            result = result / 2;
            
            
        }
        if(result%2 == 1){
            ans+="1";
        }
        
        
        StringBuilder str = new StringBuilder(ans);
        
        System.out.println(str.reverse());
        
        
        
        
        
    }

   
}
