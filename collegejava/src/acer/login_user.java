package acer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class login_user extends JFrame implements ActionListener{

    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1;


    public login_user() {

        setBackground(new Color(169, 169, 169));
        setBounds(600, 300, 400, 300);
        panel = new JPanel();
        panel.setBackground(new Color(176, 224, 230));
        setContentPane(panel);
        panel.setLayout(null);

        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(100, 69, 95, 24);
        panel.add(l1);

        JLabel l2 = new JLabel("Password : ");
        l2.setBounds(100, 104, 95, 24);
        panel.add(l2);

        textField = new JTextField();
        textField.setBounds(180, 73, 157, 20);
        panel.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(180, 108, 157, 20);
        panel.add(passwordField);

        JLabel l3 = new JLabel("");
        l3.setBounds(377, 79, 46, 34);
        panel.add(l3);

        JLabel l4 = new JLabel("");
        l4.setBounds(377, 124, 46, 34);
        panel.add(l3);

        b1 = new JButton("Login");
        b1.addActionListener(this);

        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(250, 250, 210));
        b1.setBounds(149, 161, 113, 39);
        panel.add(b1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(176, 224, 230));
        panel2.setBounds(24, 40, 434, 263);
        panel.add(panel2);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            Boolean status = false;
            try {
                cone con = new cone();
                String sql = "select * from account where username=? and password=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, textField.getText());
                st.setString(2, passwordField.getText());

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    this.setVisible(false);
                    new Loading().setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "Invalid Login...!.");

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new login_user().setVisible(true);
    }

}

