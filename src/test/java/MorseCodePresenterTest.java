import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.*;

class MorseCodePresenterTest {
    private MorseCodeFrame view = Mockito.mock(MorseCodeFrame.class);
    private MorseCodeConverter model = Mockito.mock(MorseCodeConverter.class);
    private MorseCodePresenter presenter = new MorseCodePresenter(view, model);
    private String morse = ".... . .-.. .-.. ---";
    private String english = "hello";

    @Test
    public void toMorse() {
        //given
        doReturn(morse).when(model).toMorse(english);

        //when
        presenter.toMorse(english);

        //then
        verify(model).toMorse(english);
        verify(view).setToMorseLabel(morse);
    }

    @Test
    void toEnglish() {
        //given
        doReturn(english).when(model).toEnglish(morse);

        //when
        presenter.toEnglish(morse);

        //then
        verify(model).toEnglish(morse);
        verify(view).setToEnglishLabel(english);
    }
}