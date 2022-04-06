import javax.swing.*;
import javax.swing.border.LineBorder;
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

        presenter = new MorseCodePresenter(this, morseCodeConverter);

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

        toEnglishLabel = new JLabel(("                          "));
        toEnglishLabel.setPreferredSize(new Dimension(130, 30));
        toEnglishLabel.setBorder(new LineBorder(Color.black));
        verticalPanelLeft.add(toEnglishLabel);

        toMorseLabel = new JLabel(("                          "));
        toMorseLabel.setPreferredSize(new Dimension(130, 30));
        toMorseLabel.setBorder(new LineBorder(Color.black));
        verticalPanelRight.add(toMorseLabel);

    }

    private void onToMorseClicked(ActionEvent event) {
        String word = toMorseInput.getText();
        presenter.toMorse(word);
    }

    private void onToEnglishClicked(ActionEvent event){
        String word = toEnglishInput.getText();
        presenter.toEnglish(word);
    }

    public void setToEnglishLabel(String english){
        toEnglishLabel.setText(english);
    }

    public void setToMorseLabel(String morse){
        toMorseLabel.setText(morse);
    }

    public static void main(String[] args) {
        JFrame frame = new MorseCodeFrame();
        frame.setVisible(true);
    }
}
