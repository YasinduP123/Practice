import javax.swing.ImageIcon;
import javax.swing.JFrame;

class DeleteContact extends JFrame{
    DeleteContact(){
        setTitle("Delete Contact");
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        
        //-------------------Image Icon------------------------

        ImageIcon image = new ImageIcon("download (1).png");
        image.setDescription("IDK");
        setIconImage(image.getImage());
        
    }
}