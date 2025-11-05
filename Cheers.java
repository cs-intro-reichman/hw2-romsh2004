
public class Cheers {
        public static void main(String[] args)
        {
	String userInput = args[0];
        int length = userInput.length();
        for (int i = 0 ; i < length; i++)
        {
                String currentChar = String.valueOf(userInput.charAt(i));
                if (currentChar.equals("A") || currentChar.equals("E") || currentChar.equals("F") || currentChar.equals("H") || currentChar.equals("I") || currentChar.equals("L") || currentChar.equals("M") || currentChar.equals("N") || currentChar.equals("O") || currentChar.equals("R") || currentChar.equals("S") || currentChar.equals("X") ||currentChar.equals("a") || currentChar.equals("e") || currentChar.equals("f") || currentChar.equals("h") || currentChar.equals("i") || currentChar.equals("l") || currentChar.equals("m") || currentChar.equals("n") || currentChar.equals("o") || currentChar.equals("r") || currentChar.equals("s") || currentChar.equals("x"))
                {
                        System.out.println("Give me an " + currentChar + ": " + currentChar + "!");
                }
                else
                {
                        System.out.println("Give me a " + currentChar + ": " + currentChar + "!");
                }
        }
        System.out.println("What does that spell?");
        for (int j = 0; j < Integer.parseInt(args[1]); j++)
        {
                System.out.println(userInput + "!!!");
        }
        }
}
