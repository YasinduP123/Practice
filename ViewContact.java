import java.awt.*;
import javax.swing.*;

public class ViewContact extends JFrame{
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

        btnpanel = new JPanel(new GridLayout(3,1,50,50));
        homPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        homPanel.setSize(500,500);

        listBySalary = new JButton("List By Salary");
        listBySalary.setFont(new Font("",1,20));

        listByBday = new JButton("List By Birthday");
        listByBday.setFont(new Font("",1,20));

        listByName = new JButton("List By Name");
        listByName.setFont(new Font("",1,20));

        btnpanel.add(listByName);
        btnpanel.add(listByBday);
        btnpanel.add(listBySalary);

        homPanel.add(btnpanel);
        add(homPanel);

        
    }
}
