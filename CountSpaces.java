/*
establishes a method that counts and returns the number of spaces within an enterred string
*/

public class CountSpaces
{
    public static void main(String[] args)
    {
        //declare those gnarly strings
        String quote = "I always wanted to be somebody, but now I realize I should have been more specific.";
        String quote2 = "1 2 3 4 5 6 7 8 9 10 "; //has 10 spaces so easy to test

        System.out.println("The amount of white spaces in the quote is: " + calculateSpaces(quote));
    }

    //method for counting white space within a string
    public static int calculateSpaces(String inString)
    {
        //sets the string to a stringbuilder and trims to length
        StringBuilder inStringBuilder = new StringBuilder(inString);
        inStringBuilder.trimToSize();
        //System.out.println(inStringBuilder);
 
        //checks if each index is whitespace and incraments whitespaceCount if it is
        int whitespaceCount = 0;
        for(int i=0; i < inStringBuilder.length(); ++i){
            Character indexChar = new Character(inStringBuilder.charAt(i));
            if(Character.isWhitespace(indexChar)){
                ++whitespaceCount;
            }
        }

        //System.out.println("The whitespace count in the string is " + whitespaceCount);
        return whitespaceCount;
    }
}
