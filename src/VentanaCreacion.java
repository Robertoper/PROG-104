import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCreacion {
    private JPanel pnlBase;
    private JTextField txtNombre;
    private JLabel iblNombre;
    private JLabel iblDni;
    private JTextField txtDni;
    private JLabel iblCurso;
    private JLabel iblNivel;
    private JComboBox cmbAsignaturas;
    private JButton btnAñadir;
    private JButton btnCancelar;
    private JComboBox cmbNivel;
    private JLabel iblAsignaturas;
    private JComboBox cmbCurso;


    public VentanaCreacion() {
        btnAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre =txtNombre.getText();
                String dni=txtDni.getText();
                int curso=cmbCurso.getSelectedIndex();
                String nivel=cmbNivel.getName();
                String[] asignaturas= (String[]) cmbAsignaturas.getSelectedObjects();


            }
        });
    }

}
