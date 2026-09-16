package Vistas;

import Entidades.Producto;
import java.awt.Component;
import java.util.TreeSet;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
    public static TreeSet<Producto> productos = new TreeSet<>();
    
    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuGestor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuConsultaCategoria = new javax.swing.JMenuItem();
        MenuConsultaPrecio = new javax.swing.JMenuItem();
        MenuConsultaNombre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        MenuGestor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuGestor.setText("Gestion de Productos");
        MenuGestor.addActionListener(this::MenuGestorActionPerformed);
        jMenu1.add(MenuGestor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        MenuConsultaCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuConsultaCategoria.setText("Por Categoria");
        MenuConsultaCategoria.addActionListener(this::MenuConsultaCategoriaActionPerformed);
        jMenu2.add(MenuConsultaCategoria);

        MenuConsultaPrecio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuConsultaPrecio.setText("Por Precio");
        MenuConsultaPrecio.addActionListener(this::MenuConsultaPrecioActionPerformed);
        jMenu2.add(MenuConsultaPrecio);

        MenuConsultaNombre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuConsultaNombre.setText("Por Nombre");
        MenuConsultaNombre.addActionListener(this::MenuConsultaNombreActionPerformed);
        jMenu2.add(MenuConsultaNombre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGestorActionPerformed
        GestorProductos gp = new GestorProductos();
        
        jDesktopPane1.add(gp);
        gp.setVisible(true);
        gp.toFront();

    }//GEN-LAST:event_MenuGestorActionPerformed

    private void MenuConsultaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaCategoriaActionPerformed
        
        ConsultaPorCategoriaIF cc = new ConsultaPorCategoriaIF();
        jDesktopPane1.add(cc);
        cc.setVisible(true);
        
    }//GEN-LAST:event_MenuConsultaCategoriaActionPerformed

    private void MenuConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaNombreActionPerformed
        
        ConsultaPorNombreIF cn = new ConsultaPorNombreIF();
        
        jDesktopPane1.add(cn);
        cn.setVisible(true);
        

    }//GEN-LAST:event_MenuConsultaNombreActionPerformed

    private void MenuConsultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaPrecioActionPerformed
        ConsultaPorPrecioIF cp = new ConsultaPorPrecioIF();
       
        jDesktopPane1.add(cp); 
        cp.setVisible(true);
        
    }//GEN-LAST:event_MenuConsultaPrecioActionPerformed
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuConsultaCategoria;
    private javax.swing.JMenuItem MenuConsultaNombre;
    private javax.swing.JMenuItem MenuConsultaPrecio;
    private javax.swing.JMenuItem MenuGestor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    public static boolean camposVacios(JPanel panel) {
        
        for (Component c : panel.getComponents()) {
            
            if (c instanceof JTextField) {
                
                JTextField tf = (JTextField) c;
                
                if (tf.getText().trim().isEmpty()) {
                    return false;
                }
                
            }
            
        }
        
        return true;
    }
    
}
