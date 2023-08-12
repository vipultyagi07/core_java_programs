package String;
import java.util.Scanner;
public class String_methods {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a String");
        String str=s.nextLine();
        int n=str.length();
        System.out.printf("The length of the array is %d\n",n);
        char[] c=new char[5];
        c[0]='a';
        int a=12;
        str=str+a;
        str=str+c[0];
        str=str+':';
        System.out.println(str);
        



        //Method 1 : string length
        /*int x=str.length();
        System.out.printf("\nlenght of the string=%d\n",x);*/
        
        // Method 2 : To lower case

        //System.out.println(str.toLowerCase());

        // Method 3 : To Upper case

       /*  String Upper =str.toUpperCase();
        System.out.println(Upper);*/

        // Method 4: To trim the string(remove leading or trailing space)
        /*String trimm=str.trim();
        System.out.println("trimmed string is : ");
        System.out.print(trimm);
        System.out.println();*/

        // Method 5 : Printing substring after a given Index
    
       /* System.out.println("Enter the index for printing the string");
       int n = s.nextInt();
        System.out.print("substring string is : ");
        System.out.print(str.substring(n));
        System.out.println();*/

        // Method 6 : Printing substring after a given Index of start and end
    
           /*System.out.println("Enter the Start index and end index after pressing enter for printing the string");
           int t = s.nextInt();
           int u=s.nextInt();
           System.out.print("substring string is : ");
           System.out.print(str.substring(t,u));
           System.out.println();*/
                
        // Method 7 : Printing string after replacing the character/substring in whole string
        
           /* System.out.println("Enter the character you want to replace and enter the new character ");
            String f = s.next();
            String y = s.next();
            System.out.print("substring string is : ");
            System.out.print(str.replace(f,y));
            System.out.println();*/
        
        // Method 8 : To check whether the string starts from enterd string, this function will return boolean value(either true or false)
        
       /* System.out.println("Enter the character/string you want to check at start");
        String k = s.next();
        System.out.print(str.startsWith(k));
        System.out.println();*/

        // Method 9 : To check whether the string ends from enterd string, this function will return boolean value(either true or false)
        
        /*System.out.println("Enter the character/string you want to check at end");
        String j = s.next();
        System.out.print(str.endsWith(j));
        System.out.println();*/

        // Method 10 : To return the character at a entered index
        
        /*System.out.println("Enter the index of string");
        int e = s.nextInt();
        System.out.print("The returned chracter is :");
        System.out.print(str.charAt(e));
        System.out.println();*/

        // Method 11 : To return the index of a entered string(it returns the first address of the entered string)
        
       /* System.out.println("Enter the string");
        String E = s.next();
        System.out.print("The starting address is :");
        System.out.print(str.indexOf(E));
        System.out.println();*/

        // Method 12 : To return the index of a entered string after a given index(it returns the first address of the entered string) 
        
        /*System.out.println("enter the start index for searching");
        int P =s.nextInt();
        System.out.println("Enter the string");
        String En = s.next();
        
        System.out.print("The starting address is :");
        System.out.print(str.indexOf(En,P));
        System.out.println();*/

        // Method 13 : To return the end index of a entered string(it returns the first address of the last entered string)
        
        /*System.out.println("Enter the string");
        String yo = s.next();
        System.out.print("The starting address is last string :");
        System.out.print(str.lastIndexOf(yo));
        System.out.println();*/

        // Method 14 : To return the index of a entered string after a given index(it returns the first address of the last entered string) 
        
        /*System.out.println("enter the start index for searching");
        int i =s.nextInt();
        System.out.println("Enter the string");
        String Y = s.next();
        
        System.out.print("The starting address is :");
        System.out.print(str.indexOf(Y,i));
        System.out.println();*/

        // Method 15 :  To check the equality of the strings(but case sensitive)
        
       /* System.out.println("Enter the string for comparison");
        String search = s.next();
        System.out.print("The string is present :");
        System.out.print(str.equals(search));
        System.out.println();*/
        
        //Method 16 :  To check the equality of the strings(but  not case sensitive)
       /* System.out.println("Enter the string for comparison");
        String Search = s.next();
        System.out.print("The string is present :");
        System.out.print(str.equalsIgnoreCase(Search));
        System.out.println();*/

        //  method 17 : To compare the strings lexicographically, it actually returns the +ve value when "str=z" is 
        //  lexicographically greater than "search=a" and vice-versa. the return value is integer and it is the ASCII
        //   difference of first character, if they are same then diff of subsequent next character.

        /*System.out.println("Enter the string for comparison");
        String Search1 = s.next();
        System.out.print("The string is present :");
        System.out.print(str.compareTo(Search1));
        System.out.println();*/
        
        //   Method 18 : in this method we can copy the content of string in a character array  

       /* char[] c=new char[20];

           c=str.toCharArray();
           for(int i=0;i<n;i++)
           {
               System.out.print(c[i]);
           }*/


        // Strings are Immutable and cannot be changed
        System.out.println();   
        System.out.println(str);

           

           


//  a b c d e f g h i j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z 
//  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
            
    }
    
}
