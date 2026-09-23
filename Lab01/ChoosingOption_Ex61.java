import javax.swing.JOptionPane;
public class ChoosingOption_Ex61 {
    public static void main(){
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change the first class ticket");
        JOptionPane.showMessageDialog(null,
                "You have chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
