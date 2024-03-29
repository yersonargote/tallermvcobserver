
package co.unicauca.clientes.vista;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.Observable;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano Es el primer primer observador.
 *
 */
public class GUIBusquedaClientes extends javax.swing.JFrame implements java.util.Observer {

    private String profesion;

    /**
     * Constructor
     *
     * @param h horizontal position
     * @param v vertical position
     */
    public GUIBusquedaClientes(int h, int v) {
        //observers = new ArrayList();
        initComponents();
        setSize(500, 180);
        setLocation(h, v);
        setVisible(true);
        profesion = cboProfesion.getSelectedItem().toString();
        fijarMensaje();
    }

    private void fijarMensaje() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("<html>" + "Este ejercicio implementa el patrón <strong>MVC</strong> mediante el patrón observer<br>"
                + "Hay 4 vistas (observadores) y un observado (modelo ClientesDB).<br>"
                + "Cuando el modelo  cambia de estado, notifica a todos sus observadores<br>"
                + "para que actualicen su interfaz de usuario" + "</html>");
        lblMensaje.setText(sb.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboProfesion = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pnlNorte = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Búsqueda de Clientes");
        getContentPane().setLayout(new java.awt.BorderLayout());

        pnlCentro.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        pnlCentro.setLayout(new java.awt.GridLayout(2, 2));

        jLabel1.setText("Profesión:");
        pnlCentro.add(jLabel1);

        cboProfesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abogado(a)", "Comerciante", "Ingeniero(a)", "Medico(a)" }));
        cboProfesion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProfesionItemStateChanged(evt);
            }
        });
        pnlCentro.add(cboProfesion);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlCentro.add(btnBuscar);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlCentro.add(btnCerrar);

        getContentPane().add(pnlCentro, java.awt.BorderLayout.CENTER);

        pnlNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlNorte.setName(""); // NOI18N

        lblMensaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMensaje.setText("JLabel1\n");
        pnlNorte.add(lblMensaje);

        getContentPane().add(pnlNorte, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        profesion = cboProfesion.getSelectedItem().toString();
        // GUIBusquedaClientesController procesa el evento actionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cboProfesionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProfesionItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            //Do any operations you need to do when an item is selected.
            profesion = cboProfesion.getSelectedItem().toString();
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            //Do any operations you need to do when an item is de-selected.
            //Do any operations you need to do when an item is selected.
        }
    }//GEN-LAST:event_cboProfesionItemStateChanged
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIBusquedaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBusquedaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBusquedaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBusquedaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIBusquedaClientes(100, 100).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cboProfesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlNorte;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable obs, Object obj) {
        // System.out.println("Desde GUI 1");
        // System.out.println(((ClientesDB) obs).getClientesPorProfesion());
    }

    public void addController(ActionListener controller) {
        btnBuscar.addActionListener(controller);	//need instance of controller before can add it as a listener 
    }

}
