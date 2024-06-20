import java.util.*;
import java.util.prefs.BackingStoreException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.FlowView;
import javax.xml.stream.FactoryConfigurationError;

import java.awt.*;
import java.awt.event.*;
class HomePage extends JFrame{
    JLabel label;
    JLabel imgLabel;
    JLabel homePage;

    JPanel imgPanel;
    JPanel btnPanel;
    JPanel lblPanel;
    JPanel exitPanel;
    

    JButton deletebtn;
    JButton namebtn;
    JButton updatebtn;
    JButton viewbtn;
    JButton searchbtn;
    JButton exitbtn;

    
    JTextField txtfield;

    Border border;

    String count;

    AddContact addContact;
    DeleteContact delc;
    UpdateContact upc;
    ViewContact viewc;
    SearchContact srchc;

    ImageIcon image;



    HomePage(){
        setSize(800,500);
        setTitle("IFrend Contact Management System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        

       ImageIcon image = new ImageIcon("download (1).png");
       image.setDescription("IDK");
       setIconImage(image.getImage());

//----------------------------------------------Panels-----------------------------------------------------//
      exitPanel = new JPanel();
      exitPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
      
      btnPanel = new JPanel(new GridLayout(7,1,10,0));
      btnPanel.setBackground(Color.GREEN);

      imgPanel = new JPanel(new GridLayout(1,2));
      imgPanel.setBackground(Color.WHITE);

      lblPanel = new JPanel(new GridLayout(1,1));
      lblPanel.setBackground(Color.YELLOW);

      homePage = new JLabel("HOME PAGE");
      homePage.setFont(new Font("",1,50));
      homePage.setHorizontalAlignment(JLabel.CENTER);
      homePage.setBackground(Color.BLACK);
      
    
      imgLabel = new JLabel(new ImageIcon("ifriend.png"));
      //imgPanel.setLayout(new GridLayout(1,2));
      imgLabel.setFont(new Font("",1,50));
      imgLabel.setFont(new Font("", Font.BOLD, 50));
      imgLabel.setVerticalAlignment(JLabel.CENTER);
      imgPanel.add(imgLabel);
      
    //   imgLabel = new JLabel(new ImageIcon("ifriend.png"));
    //   //imgPanel.setLayout(new GridLayout(1,2));
    //   imgLabel.setFont(new Font("",1,50));
    //   imgLabel.setVerticalAlignment(JLabel.BOTTOM);
    //   imgPanel.add("Center", imgLabel);
      
    
//----------------------------------------------Buttons-----------------------------------------------------//
       
        namebtn = new JButton("ADD NEW CONTACTS");
        namebtn.setFont(new Font("",1,20));
        namebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addContact = new AddContact();
                addContact.setVisible(true);
            }
        });

        deletebtn = new JButton("DELETE CONTACTS");
        deletebtn.setFont(new Font("",1,20));
        btnPanel.add(deletebtn);
        deletebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DeleteContact delc = new DeleteContact();
                delc.setVisible(true);
            }
        });
       
        updatebtn = new JButton("UPDATE CONTACTS");
        updatebtn.setFont(new Font("",1,20));
        btnPanel.add(updatebtn);
        updatebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               UpdateContact upc = new UpdateContact();
               upc.setVisible(true);
            }
        });
       
        viewbtn = new JButton("VIEW CONTACTS");
        viewbtn.setFont(new Font("",1,20));
        btnPanel.add(viewbtn);
        viewbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               ViewContact viewc = new ViewContact();
               viewc.setVisible(true);
            }
        });
       
        searchbtn = new JButton("SEARCH CONTACTS");
        searchbtn.setFont(new Font("",1,20));
        btnPanel.add(searchbtn);
        searchbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               SearchContact srchc = new SearchContact();
               srchc.setVisible(true);
            }
        });

//----------------------------------------------Add-----------------------------------------------------//

        JPanel b1 = new JPanel();
        JPanel b2 = new JPanel();
        JPanel b3 = new JPanel();
        JPanel b4 = new JPanel();
        JPanel b5 = new JPanel();

        btnPanel.add(homePage);
        homePage.setBackground(Color.BLUE);

        b1.add(namebtn);
        b1.setBackground(Color.MAGENTA);

        b2.add(deletebtn);
        b2.setBackground(Color.MAGENTA);

        b3.add(updatebtn);
        b3.setBackground(Color.MAGENTA);

        b4.add(viewbtn);
        b4.setBackground(Color.MAGENTA);

        b5.add(searchbtn);
        b5.setBackground(Color.MAGENTA);

        b5.add(searchbtn);
        b5.setBackground(Color.MAGENTA);

        exitbtn = new JButton("EXIT");
        exitbtn.setFont(new Font("",1,20));
        exitbtn.setSize(20,20);
        exitbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               System.exit(0);
            }
        });

        exitPanel.add(exitbtn);
        exitPanel.setBackground(Color.WHITE);

        lblPanel.add(imgPanel);
        lblPanel.add(btnPanel);
        
        
        btnPanel.add(b1);
        btnPanel.add(b2);
        btnPanel.add(b3);
        btnPanel.add(b4);
        btnPanel.add(b5);
        btnPanel.add(exitPanel);
        add(lblPanel);
        
    }

}
class Demo{
    public static void main(String[] args) {
        HomePage gui = new HomePage();
        gui.setVisible(true);
    }
}
