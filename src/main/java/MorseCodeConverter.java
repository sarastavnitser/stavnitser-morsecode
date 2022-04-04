import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeConverter
{
    static Map<String, String> morse = new HashMap<>();

    public static void main(String[] args)
    {
        morse.put("a", ".-");
        morse.put("b", "-...");
        morse.put("c", "-.-.");
        morse.put("d", "-..");
        morse.put("e", ".");
        morse.put("f", "..-.");
        morse.put("g", "--.");
        morse.put("h", "....");
        morse.put("i", "..");
        morse.put("j", ".---");
        morse.put("k", "-.-");
        morse.put("l", ".-..");
        morse.put("m", "--");
        morse.put("n", "-.");
        morse.put("o", "---");
        morse.put("p", ".--.");
        morse.put("q", "--.-");
        morse.put("r", ".-.");
        morse.put("s", "...");
        morse.put("t", "-");
        morse.put("u", "..-");
        morse.put("v", "...-");
        morse.put("w", ".--");
        morse.put("x", "-..-");
        morse.put("y", "-.--");
        morse.put("z", "--..");
        morse.put("0", "-----");
        morse.put("1", ".----");
        morse.put("2", "..---");
        morse.put("3", "...--");
        morse.put("4", "....-");
        morse.put("5", ".....");
        morse.put("6", "-....");
        morse.put("7", "--...");
        morse.put("8", "---..");
        morse.put("9", "----.");

        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        System.out.print(isMoresPalindrome(inp) ? "YES" : "NO");
    }

    private static boolean isMoresPalindrome(String inp)
    {
        String translation = translate(inp);
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = translation.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (translation.charAt(i) != translation.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    private static String translate(String inp)
    {
        inp = inp.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char[] inpChar = inp.toCharArray();
        for (char letter : inpChar)
        {
            if (morse.get(letter+"") != null)
            {
                sb.append(morse.get(letter + ""));
            }
        }
//        System.out.println(sb);
        return sb.toString();
    }
}