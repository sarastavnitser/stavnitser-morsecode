public class MorseCodePresenter {
    private MorseCodeFrame view;
    private MorseCodeConverter model;


    public MorseCodePresenter(MorseCodeFrame view, MorseCodeConverter model){
        this.view = view;
        this.model = model;
    }

    public void toMorse(String english){
        view.setToMorseLabel(model.toMorse(english));
    }

    public void toEnglish(String morse){
        view.setToEnglishLabel(model.toEnglish(morse));
    }
}
