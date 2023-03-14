package STRING;

public class StringAssessment{
    public static void main(String[] args) {  
        // create the string
        String str = "Welcome to Java World";
        System.out.println("string is:"+str);
        
        // return the character at 5th position and display it
        char fifthChar = str.charAt(4);
        System.out.println(" character at position 5 is: " + fifthChar);
        
        // compare the string with "Welcome" lexicographically ignoring case differences and display the result
        boolean isEqual = str.regionMatches(true, 0, "Welcome", 0, 7);
        System.out.println(" strings are equal : " + isEqual);
        
        // concatenate "- Let us learn" to the string and display it
        String newStr = str.concat(" Let us learn");
        System.out.println(" concatenate string is: " + newStr);
        
        // return the position of the first occurrence of character 'a' and display it
        int firstAIndex = str.indexOf('a');
        System.out.println(" index of the first  of 'a' is: " + firstAIndex);
        
        // replace all occurrences of 'a' with 'e' and display it
        String replacedStr = str.replace('a', 'e');
        System.out.println(" string with replace characters is: " + replacedStr);
        
        // return the substring between positions 4 and 10 and display it
        String subStr = str.substring(4, 10);
        System.out.println(" substring b/w positions 4 and 10 is: " + subStr);
        
        //  lowercase 
        String lowerCaseStr = str.toLowerCase();
        System.out.println(" lowercase of the string is: " + lowerCaseStr);
    }
}