class ChallengeOne 
{ 
    // Function to find the count of words in a CamelCase sequence 
    public static int countWords(String inputstr) 
    { 
        int count = 1; 

        for (int i = 1; i < inputstr.length() - 1; i++) { 
            if (inputstr.charAt(i)>=65&&inputstr.charAt(i)<=90) 
                count++; 
        } 

        return count; 
    } 

    public static void main(String args[]) 
    { 
        String inputstr = "thisContainsFourWords"; 

        System.out.print( countWords(inputstr)); 

    } 
}


