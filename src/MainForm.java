import javax.swing.*;

public class MainForm {
    private JTextField txtNome;
    private JButton btnValidar;
    private JLabel txtResultado;
    private JPanel mainPanel;

    public static void main(String[] args) {
        //Cria minha tela (tv)
        JFrame frame = new JFrame("Minha primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha tv no tamanho do meu painel
        frame.pack();
        //frame.setSize(500, 500);
        //Ligar a TV
        frame.setVisible(true);
    }
}
