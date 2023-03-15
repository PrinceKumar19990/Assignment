package STRING;

import java.util.StringTokenizer;


public class StringAssessment2
{

    public static void main(String[] args) {  
   // create the string
   String str = "Welcome to Java World";
    System.out.println("string is:"+str);
        
        // return the character 
        char fifthChar = str.charAt(4);
    System.out.println(" character at position 5 is: " + fifthChar);     
//        
//        // concatenate "Let us learn" 
        String newStr = str.concat(" Let us learn");
        System.out.println(" concatenate string is: " + newStr);
        
    // return the position of the first of character 'a' .
    int firstAIndex = str.indexOf('a');
    System.out.println(" index of the first  of 'a' is: " + firstAIndex);
    
        // replace all character of 'a' with 'e' .
        String replacedStr = str.replace('a', 'e');
        System.out.println(" string with replace characters is: " + replacedStr);
        
    // return the substring between positions 4 and 10 .
    String subStr = str.substring(4, 10);
    System.out.println(" substring b/w positions 4 and 10 is: " + subStr);
    
   // return the lowercase of the string.
   String lowerCaseStr = str.toLowerCase();
   System.out.println(" lowercase of the string is: " + lowerCaseStr);       
    
        StringBuffer a = new StringBuffer("This is StringBuffer");
        a.append(" This is a sample program");
        System.out.println(a);
        
        a.insert(21, "Object ");
        System.out.println(a);

        a.reverse();
        System.out.println(a);

        a.replace(14,19 ,"Builder");
        System.out.println(a);
        
        
        String t= "C:\\\\IBM\\\\DB2\\\\PROGRAM\\\\DB2COPY1.EXE";
        StringTokenizer st = new StringTokenizer( t,"\\");
        String drive = st.nextToken();
        StringBuilder folders = new StringBuilder();
        while (st.hasMoreTokens()) {
            folders.append(st.nextToken());
            if (st.hasMoreTokens()) {
                folders.append(" || ");
            }
        }
        String file = folders.substring(folders.lastIndexOf(" || ") + 4);
        folders.delete(folders.lastIndexOf(" || "), folders.length());

        // Display the output in the required format
        System.out.println("Drive: " + drive);
        System.out.println("Folders: " + folders);
        System.out.println("File: " + file);
        
        }
        
        
    }



