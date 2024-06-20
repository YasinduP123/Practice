import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddContact extends JFrame {

    int x;

    JButton addbtn;
    JButton gobackbtn;
    JButton canclebtn;

    JLabel namelbl;
    JLabel contactlbl;
    JLabel bdaylbl;
    JLabel salarylbl;
    JLabel companylbl;

    JTextField nametxt;
    JTextField contacttxt;
    JTextField bdaytxt;
    JTextField salarytxt;
    JTextField companytxt;

    JPanel homepanel;
    JPanel lblpanel;
    JPanel textfpanel;
    JPanel btnpanel;
    JPanel canclepPanel;

    AddContact() {
        setTitle("Add new contact");
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //-------------------Image Icon------------------------

        ImageIcon image = new ImageIcon("download (1).png");
        image.setDescription("IDK");
        setIconImage(image.getImage());

        //----------------------panel-----------------------------

        homepanel = new JPanel(new GridLayout(2,2));
        lblpanel = new JPanel(new GridLayout(5,1,10,10));
        textfpanel = new JPanel(new GridLayout(5,1,10,10));
        btnpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        canclepPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //btnpanel.setAlignmentX(CENTER_ALIGNMENT);

        //--------------------Button-------------------------------
    
        addbtn = new JButton("Add");
        addbtn.setFont(new Font("",1,20));
        addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddList add = new AddList();
                JOptionPane.showMessageDialog(null, "Contact added successfully");
            }
        });;
 
        gobackbtn = new JButton("Go Back");
        gobackbtn.setFont(new Font("",1,20));

        canclebtn = new JButton("Cancel");
        canclebtn.setFont(new Font("",1,20));
        canclepPanel.add(canclebtn);


        //---------------------Lable------------------------------

        namelbl = new JLabel("Name");
        namelbl.setFont(new Font("", Font.BOLD, 20));

        contactlbl = new JLabel("Contact No");
        contactlbl.setFont(new Font("", Font.BOLD, 20));

        bdaylbl = new JLabel("Birthday");
        bdaylbl.setFont(new Font("", Font.BOLD, 20));

        salarylbl = new JLabel("Salary");
        salarylbl.setFont(new Font("", Font.BOLD, 20));

        companylbl = new JLabel("Company");
        companylbl.setFont(new Font("", Font.BOLD, 20));

        //-------------------Text Field---------------------------

        nametxt = new JTextField();
        nametxt.setFont(new Font("", Font.PLAIN, 20));

        contacttxt = new JTextField();
        contacttxt.setFont(new Font("", Font.PLAIN, 20));

        bdaytxt = new JTextField();
        bdaytxt.setFont(new Font("", Font.PLAIN, 20));

        salarytxt = new JTextField();
        salarytxt.setFont(new Font("", Font.PLAIN, 25));

        companytxt = new JTextField();
        companytxt.setFont(new Font("", Font.PLAIN, 25));

        //-------------------add textfield--------------------------

        textfpanel.add(nametxt);
        textfpanel.add(contacttxt);
        textfpanel.add(bdaytxt);
        textfpanel.add(salarytxt);
        textfpanel.add(companytxt);


        //--------------------add lblpanel--------------------------

        lblpanel.add(namelbl);
        lblpanel.add(bdaylbl);
        lblpanel.add(contactlbl);
        lblpanel.add(companylbl);
        lblpanel.add(salarylbl);

        //-------------------add btnpanel---------------------------

        btnpanel.add(addbtn);
        btnpanel.add(gobackbtn);
        //textfpanel.add(canclebtn);

        //---------------------add homepanel--------------------------

        homepanel.add(lblpanel);
        homepanel.add(textfpanel);
        homepanel.add(btnpanel);
        homepanel.add(canclepPanel);

        
        //---------------------add homepanel to frame--------------------
        add(homepanel);

        //setVisible(true);
    }
}
