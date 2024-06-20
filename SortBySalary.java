import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SortBySalary extends JFrame  {
    SortBySalary(){
        setTitle("List By Salary");
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //-------------------Image Icon------------------------

        ImageIcon image = new ImageIcon("download (1).png");
        image.setDescription("IDK");
        setIconImage(image.getImage());
    }
}
