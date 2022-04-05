import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest {
    @Test
    void toMorse(){
        //given
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();

        //when
        String helloInMorse = morseCodeConverter.toMorse("hello");

        //then
        assertEquals(helloInMorse, ".... . .-.. .-.. ---");
    }

    @Test
    void toEnglish(){
        //given
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();

        //when
        String helloInEnglish = morseCodeConverter.toEnglish(".... . .-.. .-.. ---");

        //then
        assertEquals(helloInEnglish, "hello");
    }


}