import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ViewContact extends JFrame{
    SortBySalary sortBySalary;
    SortByBday sortByBday;
    SortByName sortByName;

    private JPanel btnpanel;
    private JPanel homPanel;

    private JButton listBySalary;
    private JButton listByBday;
    private JButton listByName;
    ViewContact(){
        setTitle("View Contact");
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //-------------------Image Icon------------------------

        ImageIcon image = new ImageIcon("download (1).png");
        image.setDescription("IDK");
        setIconImage(image.getImage());

        btnpanel = new JPanel(new GridLayout(3,1,50,50));
        homPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        homPanel.setSize(500,500);

        listBySalary = new JButton("List By Salary");
        listBySalary.setFont(new Font("",1,20));
        listBySalary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              sortBySalary = new SortBySalary();
              sortBySalary.setVisible(true);
            }
        });


        listByBday = new JButton("List By Birthday");
        listByBday.setFont(new Font("",1,20));
        listByBday.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sortByBday = new SortByBday();
                sortByBday.setVisible(true);             
            }
        });

        listByName = new JButton("List By Name");
        listByName.setFont(new Font("",1,20));
        listByName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
              sortByName = new SortByName();
              sortByName.setVisible(true);             
            }
        });

        btnpanel.add(listByName);
        btnpanel.add(listByBday);
        btnpanel.add(listBySalary);

        homPanel.add(btnpanel);
        add(homPanel);

        
    }
}
