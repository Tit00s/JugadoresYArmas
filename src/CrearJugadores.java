import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CrearJugadores extends JFrame implements ActionListener {
    private JLabel PoderLabel;
    private JTextField poderTextField;
    private JTextField tipoTextField;
    private JTextField armasTextField;
    private JButton Crear;
    private JPanel Panel1;

    CrearJugadores(){
        this.add(Panel1);
        this.setSize(200,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Crear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Crear){
            try {
                Main.Crear(Integer.parseInt(poderTextField.getText()),tipoTextField.getText(),armasTextField.getText());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
