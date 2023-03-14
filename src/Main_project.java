import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main_project extends JFrame
{
    JFrame jf = new JFrame("Creat Account");
    JButton b1,b2;
    JLabel l1 , l2 , l3;
    ImageIcon img = new ImageIcon("11110.png");
    JLabel background ;


    Main_project()
    {
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(305,510);
        jf.setResizable(false);
        jf.getContentPane();
        jf.setLocationRelativeTo(null);

        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 305, 510);

        b1 = new JButton("Login");
        b1.setBounds(30,200,100,40);
        b1.setFont(new Font("Arial",Font.BOLD,18));
        b1.setForeground(Color.MAGENTA);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                jf.dispose();
                Login_Mysql lms = new Login_Mysql();
            }

            public void mouseEntered(MouseEvent e)
            {
                b1.setBackground(Color.RED);
            }

            public void mouseExited(MouseEvent e)
            {
               b1.setBackground(Color.LIGHT_GRAY);
            }
        });

        b2 = new JButton("Register");
        b2.setBounds(140,200,115,40);
        b2.setFont(new Font("Arial",Font.BOLD,18));
        b2.setForeground(Color.MAGENTA);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                jf.dispose();
                Registration_form rf = new Registration_form();
            }

            public void mouseEntered(MouseEvent e)
            {
                b2.setBackground(Color.RED);
            }

            public void mouseExited(MouseEvent e)
            {
                b2.setBackground(Color.LIGHT_GRAY);
            }
        });

        l1 = new JLabel("Creat Account");
        l1.setBounds(40,80,220,50);
        l1.setFont(new Font("Ariel",Font.BOLD,28));
        l1.setForeground(Color.BLUE);

        l2 = new JLabel("Alredy A User");
        l2.setBounds(40,160,200,30);
        l2.setFont(new Font("Ariel",Font.BOLD,12));
        l2.setForeground(Color.RED);

        l3 = new JLabel("New User");
        l3.setBounds(160,160,200,30);
        l3.setFont(new Font("Ariel",Font.BOLD,12));
        l3.setForeground(Color.RED);

        jf.add(new first_Moving());

        jf.add(l1);
        jf.add(b1);
        jf.add(b2);
        jf.add(l2);
        jf.add(l3);
        jf.add(background);
        jf.setVisible(true);

    }

    public static void main(String[] args)
    {
        Main_project mp = new Main_project();
    }
}

class main extends JFrame
{
    main()
    {
        getToolkit().beep();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmation Page");
        setSize(305, 220);

    }
}
