import java.util.Scanner;

public class strings {
    
    public static void main(String[] args) {
        
        String random = "Party hori Hai";
        String random2 = new String("Party ho gyi");

        System.out.println(random);

        // System.out.println(random.length());

        // 1. charAt() - returns the character at given index
        // System.out.println(random.charAt(5));
        // System.out.println(random.charAt(11));




        // 2. indexOf() - return index of given character
        // System.out.println(random.indexOf("H"));
        // System.out.println(random.indexOf("h"));




        // 3. equals() - compares two string values
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name :");
        // String user_input = sc.nextLine();

        // String username = "ironman";

        //incorrect way of comparing strings
        // if(user_input == username){
        //     System.out.println("Username is correct");
        // }else{
        //     System.out.println("Username is incorrect");
        // }

        //correct way of comparing strings
        // if(user_input.equals(username)){
        //     System.out.println("Username is correct");
        // }else{
        //     System.out.println("Username is incorrect");
        // }





        // 4. startsWith() - returns whether a string contains a string sub-string at the start
        // String name = "Miss Ada Wong";

        // if(name.startsWith("Mr. ")){
        //     System.out.println("Welcome Gentlemen");
        // }else if(name.startsWith("Mrs.") || name.startsWith("Miss")){
        //     System.out.println("Welcome Lady");
        // }


        // 5. endsWith() - returns whether a string contains a string sub-string at the end


        //6. contains() - returns whether a string contains a string sub-string
        String name2 = "Harry Potter";

        // if(name2.contains("Pot")){
        //     System.out.println("it contains");
        // }else{
        //     System.out.println("It does not");
        // }


        // 7. toLowerCase() - changes the string case to lower
        // 8. toUpperCase() - changes the string case to upper

        // System.out.println(name2.toUpperCase());




        // 9. replaceFirst() - replaces the first match
        // 10. replaceAll() - replace all the matched characters

        // name2 = name2.replaceAll("r" , "p");
        // System.out.println(name2);

        // name2 = name2.replaceFirst("r" , "p");
        // System.out.println(name2);








        // 11. toCharArray() - converts string to character array
        // char[] mychars= random.toCharArray();
        // System.out.println(mychars);



        
    }
}
