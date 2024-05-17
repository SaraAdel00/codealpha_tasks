import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class para extends JFrame implements ActionListener{
    private JTextArea text;
    private JButton btn;
    private JLabel counter;
    public para() {
        //title of the box
        super("Paragraph word counter");
        setLayout(new FlowLayout());

        //text box creation
        text = new JTextArea();
        text.setPreferredSize(new Dimension(500,200));
        add(text);

        //count button creation
        btn = new JButton("Count");
        add(btn);
        //action will happens after clicking the button
        btn.addActionListener(this);

        counter = new JLabel("words count: ");
        add(counter);

        //frame properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750,500);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        //get user's text
        String paragraph = text.getText();
        //split text into words
        String[] words = paragraph.split("\\s+");
        //count number of words
        int count = words.length;
        //add number of words to the counter
        counter.setText("words count: "+ count);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        para obj1 = new para();
    }
}