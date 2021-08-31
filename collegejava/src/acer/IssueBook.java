package acer;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class IssueBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    JDateChooser dateChooser;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    private JButton b1,b2,b3,b4;

    public static void main(String[] args) {
        new IssueBook().setVisible(true);

    }

    public IssueBook() {
        setBounds(300, 200, 800, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Book_id");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setForeground(new Color(47, 79, 79));
        l1.setBounds(47, 63, 100, 23);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(47, 79, 79));
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(47, 97, 100, 23);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Author");
        l3.setForeground(new Color(47, 79, 79));
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(47, 131, 100, 23);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Edition");
        l4.setForeground(new Color(47, 79, 79));
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(47, 165, 100, 23);
        contentPane.add(l4);


        t1 = new JTextField();
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t1.setBounds(126, 66, 86, 20);
        contentPane.add(t1);

        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b1.setBounds(234, 59, 100, 30);

        contentPane.add(b1);

        t2 = new JTextField();
        t2.setEditable(false);
        t2.setForeground(new Color(47, 79, 79));
        t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t2.setBounds(126, 100, 208, 20);
        contentPane.add(t2);
        t2.setColumns(10);

        t3 = new JTextField();
        t3.setEditable(false);
        t3.setForeground(new Color(47, 79, 79));
        t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t3.setColumns(10);
        t3.setBounds(126, 131, 208, 20);
        contentPane.add(t3);

        t4 = new JTextField();
        t4.setEditable(false);
        t4.setForeground(new Color(47, 79, 79));
        t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t4.setColumns(10);
        t4.setBounds(126, 168, 208, 20);
        contentPane.add(t4);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
        panel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.setBounds(10, 38, 345, 188);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);

        JLabel l5 = new JLabel("Student_id");
        l5.setForeground(new Color(47, 79, 79));
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(384, 63, 100, 23);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Name");
        l6.setForeground(new Color(47, 79, 79));
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(384, 97, 100, 23);
        contentPane.add(l6);

        JLabel l7 = new JLabel("Branch");
        l7.setForeground(new Color(47, 79, 79));
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(384, 131, 100, 23);
        contentPane.add(l7);

        JLabel l8 = new JLabel("Sem");
        l8.setForeground(new Color(47, 79, 79));
        l8.setFont(new Font("Tahoma", Font.BOLD, 14));
        l8.setBounds(384, 168, 100, 23);
        contentPane.add(l8);

        t5 = new JTextField();
        t5.setForeground(new Color(47, 79, 79));
        t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t5.setColumns(10);
        t5.setBounds(508, 66, 86, 20);
        contentPane.add(t5);

        b2 = new JButton("Search");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b2.setBounds(604, 59, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        t6 = new JTextField();
        t6.setForeground(new Color(47, 79, 79));
        t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t6.setEditable(false);
        t6.setColumns(10);
        t6.setBounds(508, 100, 208, 20);
        contentPane.add(t6);

        t7 = new JTextField();
        t7.setForeground(new Color(47, 79, 79));
        t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t7.setEditable(false);
        t7.setColumns(10);
        t7.setBounds(508, 131, 208, 20);
        contentPane.add(t7);

        t8 = new JTextField();
        t8.setForeground(new Color(47, 79, 79));
        t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t8.setEditable(false);
        t8.setColumns(10);
        t8.setBounds(508, 168, 208, 20);
        contentPane.add(t8);


        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(new LineBorder(new Color(70, 130, 180), 2, true), "Student-Details",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
        panel_1.setForeground(new Color(0, 100, 0));
        panel_1.setBounds(360, 38, 378, 188);
        panel_1.setBackground(Color.WHITE);
        contentPane.add(panel_1);

        JLabel l15 = new JLabel(" Date of Issue :");
        l15.setForeground(new Color(105, 105, 105));
        l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l15.setBounds(20, 240, 118, 26);
        contentPane.add(l15);

        dateChooser = new JDateChooser();
//        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 237, 200, 29);
        contentPane.add(dateChooser);

        b3 = new JButton("Issue");
        b3.addActionListener(this);
        b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b3.setBounds(47, 277, 118, 33);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

        b4 = new JButton("Back");
        b4.addActionListener(this);
        b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b4.setBounds(199, 277, 100, 33);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            cone con = new cone();
            if(ae.getSource() == b1){
                String sql = "select * from book where book_id = ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, t1.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("author"));
                    t4.setText(rs.getString("edition"));

                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == b2){
                String sql = "select * from student where student_id = ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, t5.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    t6.setText(rs.getString("name"));
                    t7.setText(rs.getString("branch"));
                    t8.setText(rs.getString("semester"));

                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == b3){
                try{
                    String sql = "insert into issueBook(book_id, student_id, bname, sname, branch, dateOfIssue) values(?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, t1.getText());
                    st.setString(2, t5.getText());
                    st.setString(3, t2.getText());
                    st.setString(4, t6.getText());
                    st.setString(5, t7.getText());
//                    st.setString(6, t12.getText());
                    st.setString(6, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                    int i = st.executeUpdate();
                    if (i > 0)
                        JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
                    else
                        JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
                new Home().setVisible(true);

            }

            con.c.close();
        }catch(Exception e){

        }
    }
}
