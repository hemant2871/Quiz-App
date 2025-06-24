import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("score.png"));
        Image i2  = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);


        JLabel  heading = new JLabel("ThankYou " + name + " for Playing Simple Minds");
        heading.setBounds(45, 30,700,30);
        heading.setFont(new Font("Tahoms",Font.PLAIN,24));
        add(heading);

        JLabel  lblscore = new JLabel("Your Score is  " + score);
        lblscore.setBounds(350, 200,300,30);
        lblscore.setFont(new Font("Tahoms",Font.PLAIN,24));
        add(lblscore);

        JButton submit = new JButton("play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);



        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
       setVisible(false);
       new login();
    }
    public static void main(String[] args){
        new Score("User",0);
    }
}
