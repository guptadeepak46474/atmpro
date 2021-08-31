package acer;


import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JButton b1,b2,b3,b4,b5,b6;

    public static void main(String[] args) {
        new Home().setVisible(true);
    }

    public Home() {

        setBounds(400, 150, 600, 400);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JMenuBar menuBar = new JMenuBar();
//        menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
        menuBar.setBackground(new Color(56,163,165));
        menuBar.setBounds(0, 10, 1000, 35);
        contentPane.add(menuBar);

        JMenu mnExit = new JMenu("Exit");
        mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));


        JMenuItem mntmLogout = new JMenuItem("Logout");
        mntmLogout.setBackground(new Color(211, 211, 211));
        mntmLogout.setForeground(new Color(105, 105, 105));
        mntmLogout.addActionListener(this);
        mnExit.add(mntmLogout);

        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.setForeground(new Color(105, 105, 105));
        mntmExit.setBackground(new Color(211, 211, 211));
        mntmExit.addActionListener(this);
        mnExit.add(mntmExit);


        JMenu mnRecord = new JMenu("Record");
        mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));


        JMenuItem bookdetails = new JMenuItem("Book Details");
        bookdetails.addActionListener(this);
        bookdetails.setBackground(new Color(211, 211, 211));
        bookdetails.setForeground(Color.DARK_GRAY);
        mnRecord.add(bookdetails);

        JMenuItem studentdetails = new JMenuItem("Student Details");
        studentdetails.setBackground(new Color(211, 211, 211));
        studentdetails.setForeground(Color.DARK_GRAY);
        studentdetails.addActionListener(this);
        mnRecord.add(studentdetails);

        menuBar.add(mnRecord);
        menuBar.add(mnExit);


        JLabel l1 = new JLabel("Library Management System");
        l1.setForeground(new Color(56, 163, 165));
        l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
        l1.setBounds(108, 30, 701, 80);
        contentPane.add(l1);


        b1 = new JButton("Add Books");
        b1.addActionListener(this);
        b1.setBackground(new Color(127, 124, 130));
        b1.setForeground(Color.WHITE);
        b1.setBounds(20, 120, 159, 44);
        contentPane.add(b1);

        b2 = new JButton("Statistics");
        b2.addActionListener(this);
        b2.setBackground(new Color(127, 124, 130));
        b2.setForeground(Color.WHITE);
        b2.setBounds(220, 120, 139, 44);
        contentPane.add(b2);

        b3 = new JButton("Add Student");
        b3.addActionListener(this);
        b3.setBackground(new Color(127, 124, 130));
        b3.setForeground(Color.WHITE);
        b3.setBounds(400, 120, 167, 44);
        contentPane.add(b3);


        b4 = new JButton("Issue Book");
        b4.addActionListener(this);
        b4.setBackground(new Color(127, 124, 130));
        b4.setForeground(Color.WHITE);
        b4.setBounds(20, 220, 143, 41);
        contentPane.add(b4);

        b5 = new JButton("Return Book");
        b5.addActionListener(this);
        b5.setBackground(new Color(127, 124, 130));
        b5.setForeground(Color.WHITE);
        b5.setBounds(200, 220, 159, 41);
        contentPane.add(b5);

        b6 = new JButton("About Us");
        b6.addActionListener(this);
        b6.setBackground(new Color(127, 124, 130));
        b6.setForeground(Color.WHITE);
        b6.setBounds(400, 220, 159, 41);
        contentPane.add(b6);


        getContentPane().setBackground(Color.WHITE);
        contentPane.setBackground(new Color(243, 241, 245));
    }


    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Logout")){
            setVisible(false);
            new login_user().setVisible(true);
        }else if(msg.equals("Exit")){
            System.exit(ABORT);

        }else if(msg.equals("Read Me")){

        }else if(msg.equals("About Us")){
            setVisible(false);
//            new aboutUs().setVisible(true);

        }else if(msg.equals("Book Details")){
            setVisible(false);
            new BookDetails().setVisible(true);
        }else if(msg.equals("Student Details")){
            setVisible(false);
            new StudentDetails().setVisible(true);

        }

        if(ae.getSource() == b1){
            this.setVisible(false);
            new AddBook().setVisible(true);
        }
        if(ae.getSource() == b2){
            this.setVisible(false);
            new Statistics().setVisible(true);
        }
        if(ae.getSource() == b3){
            this.setVisible(false);
            new AddStudent().setVisible(true);
        }
        if(ae.getSource() == b4){
            this.setVisible(false);
            new IssueBook().setVisible(true);
        }
        if(ae.getSource() == b5){
            this.setVisible(false);
            new ReturnBook().setVisible(true);

        }
        if(ae.getSource() == b6){
            this.setVisible(false);
//            new aboutUs().setVisible(true);

        }

    }
}
