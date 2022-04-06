import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MorseCodeFrame extends JFrame {
    private final MorseCodePresenter presenter;

    private JTextField toEnglishInput;
    private JTextField toMorseInput;
    private JLabel toMorseLabel;
    private JLabel toEnglishLabel;
    private JButton toEnglishButton;
    private JButton toMorseButton;
    private JPanel verticalPanelLeft;
    private JPanel verticalPanelRight;


    public MorseCodeFrame(){
        setTitle("Morse Code");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();

        verticalPanelLeft = new JPanel();
        verticalPanelLeft.setLayout(new BoxLayout(verticalPanelLeft, BoxLayout.Y_AXIS));
        add(verticalPanelLeft);

        verticalPanelRight = new JPanel();
        verticalPanelRight.setLayout(new BoxLayout(verticalPanelRight, BoxLayout.Y_AXIS));
        add(verticalPanelRight);

        toEnglishInput = new JTextField();
        toEnglishInput.setPreferredSize(new Dimension(120, 60));
        verticalPanelLeft.add(toEnglishInput);

        toMorseInput = new JTextField();
        toMorseInput.setPreferredSize(new Dimension(120, 60));
        verticalPanelRight.add(toMorseInput);

        toEnglishButton = new JButton("TO ENGLISH");
        toEnglishButton.addActionListener(this::onToEnglishClicked);
        verticalPanelLeft.add(toEnglishButton);

        toMorseButton = new JButton("TO MORSE");
        toMorseButton.addActionListener(this::onToMorseClicked);
        verticalPanelRight.add(toMorseButton);

        toEnglishLabel = new JLabel(" ");
        toEnglishLabel.setPreferredSize(new Dimension(120, 60));
        verticalPanelLeft.add(toEnglishLabel);


    }

    private void onToMorseClicked(ActionEvent event) {

    }

    private void onToEnglishClicked(ActionEvent event){

    }

    public void setToEnglishLabel(String english){
        toEnglishLabel.setText(english);
    }

    public void setToMorseLabel(String morse){
        toMorseLabel.setText(morse);
    }
}
