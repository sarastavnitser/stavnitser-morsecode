import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeConverter {
    static Map<String, String> morse = new HashMap<>();
    static Map<String, String> revMorse = new HashMap<>();

    public MorseCodeConverter() {
        String[] morses = {"a .-", "b -...", "c -.-.", "d -..", "e .", "f ..-.", "g --.", "h ....", "i ..", "j .---", "k -.-",
                "l .-..", "m --", "n -.", "o ---", "p .--.", "q --.-", "r .-.", "s ...", "t -", "u ..-", "v ...-", "w .--", "x -..-",
                "y -.--", "z --..", "0 -----", "1 .----", "2 ..---", "3 ...--", "4 ....-", "5 .....", "6 -....", "7 --...", "8 ---..",
                "9 ----."};
        for (int i = 0; i < morses.length; i++) {
            String defSplit[] = morses[i].split(" ");
            morse.put(defSplit[0], defSplit[1]);
            revMorse.put(defSplit[1], defSplit[0]);
//            morse.put(" ", " ");
//            revMorse.put(" ", " ");
        }


    }


    String toMorse(String inp) {
        inp = inp.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char[] inpChar = inp.toCharArray();
        for (char letter : inpChar) {
            String translation = morse.get(String.valueOf(letter));
            if (translation != null) {
                sb.append(translation);
                sb.append(" ");
            } else {
                sb.delete(0, sb.length());
                sb.append("Not morse code compatible. \n" +
                          "Please enter only letters \nor numbers");
                break;
            }
        }
        return sb.toString().trim();
    }

    String toEnglish(String inp) {
        StringBuilder sb = new StringBuilder();
        String elements[] = inp.split(" ");
        for (int i = 0; i < elements.length; i++) {
            String translation = revMorse.get(String.valueOf(elements[i]));
            if (translation != null) {
                sb.append(translation);
            } else {
                sb.delete(0, sb.length());
                sb.append("Not morse code compatible. \n" +
                          "Please enter only morse \n" +
                          "code compatible letters \nseparated by spaces");
                break;
            }
        }
        return sb.toString();
    }
}