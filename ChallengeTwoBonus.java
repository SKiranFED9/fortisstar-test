import java.util.ArrayList;
class ChallengeTwoBonus 
{ 
    public int[] getOptimal(int input[], int totalBreaks) { 
    { 
        int i,index = -1; 
        for(i = 0; i < totalBreaks; i++) 
        { 
            if(input[i] == i) 
                index = i; 
        } 
        
        /* If no fixed point present  
           then return -1 */
        return index; 
    } 
    //main function 
    public static void main(String args[]) 
    { 
        int input[] = {1, 1}; 
        
        int totalBreaks = input.length; 
        System.out.println(totalBreaks);
        System.out.println("Output " 
                     + linearSearch(input, totalBreaks)); 
    } 
} 