package Formularios;



import Entidades.Presentacion;
import controladores.PresentacionJpaController;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APRENDIZ
 */
public class frmpresentaciones extends javax.swing.JDialog {
PresentacionJpaController pc = new PresentacionJpaController();
    /**
     * Creates new form frmpresentaciones
     */
    public frmpresentaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bgbuscar2 = new javax.swing.JPanel();
        btnbuscar2 = new javax.swing.JLabel();
        bgagregar2 = new javax.swing.JPanel();
        btnagregar2 = new javax.swing.JLabel();
        bgeliminar2 = new javax.swing.JPanel();
        btneliminar2 = new javax.swing.JLabel();
        bgguardar2 = new javax.swing.JPanel();
        btnguardar2 = new javax.swing.JLabel();
        bgeditar2 = new javax.swing.JPanel();
        btneditar2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 165, 156));
        jLabel2.setText("Nombre de Presentacion:");

        bgbuscar2.setBackground(new java.awt.Color(2, 165, 156));

        btnbuscar2.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnbuscar2.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnbuscar2.setText("Buscar");
        btnbuscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbuscar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbuscar2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgbuscar2Layout = new javax.swing.GroupLayout(bgbuscar2);
        bgbuscar2.setLayout(bgbuscar2Layout);
        bgbuscar2Layout.setHorizontalGroup(
            bgbuscar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnbuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        bgbuscar2Layout.setVerticalGroup(
            bgbuscar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnbuscar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        bgagregar2.setBackground(new java.awt.Color(2, 165, 156));

        btnagregar2.setBackground(new java.awt.Color(255, 255, 255));
        btnagregar2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnagregar2.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnagregar2.setText("Agregar");
        btnagregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagregar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnagregar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnagregar2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgagregar2Layout = new javax.swing.GroupLayout(bgagregar2);
        bgagregar2.setLayout(bgagregar2Layout);
        bgagregar2Layout.setHorizontalGroup(
            bgagregar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgagregar2Layout.createSequentialGroup()
                .addComponent(btnagregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgagregar2Layout.setVerticalGroup(
            bgagregar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnagregar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bgeliminar2.setBackground(new java.awt.Color(2, 165, 156));

        btneliminar2.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btneliminar2.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btneliminar2.setText("Eliminar");
        btneliminar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneliminar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneliminar2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgeliminar2Layout = new javax.swing.GroupLayout(bgeliminar2);
        bgeliminar2.setLayout(bgeliminar2Layout);
        bgeliminar2Layout.setHorizontalGroup(
            bgeliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btneliminar2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );
        bgeliminar2Layout.setVerticalGroup(
            bgeliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btneliminar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bgguardar2.setBackground(new java.awt.Color(2, 165, 156));

        btnguardar2.setBackground(new java.awt.Color(255, 255, 255));
        btnguardar2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnguardar2.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnguardar2.setText("Guardar");
        btnguardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnguardar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnguardar2MouseExited(evt);
            }
        });
        btnguardar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnguardar2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout bgguardar2Layout = new javax.swing.GroupLayout(bgguardar2);
        bgguardar2.setLayout(bgguardar2Layout);
        bgguardar2Layout.setHorizontalGroup(
            bgguardar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnguardar2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        bgguardar2Layout.setVerticalGroup(
            bgguardar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnguardar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        bgeditar2.setBackground(new java.awt.Color(2, 165, 156));

        btneditar2.setBackground(new java.awt.Color(255, 255, 255));
        btneditar2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btneditar2.setForeground(new java.awt.Color(255, 255, 255));
        btneditar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btneditar2.setText("Editar");
        btneditar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditar2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgeditar2Layout = new javax.swing.GroupLayout(bgeditar2);
        bgeditar2.setLayout(bgeditar2Layout);
        bgeditar2Layout.setHorizontalGroup(
            bgeditar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btneditar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        bgeditar2Layout.setVerticalGroup(
            bgeditar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btneditar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabla2.setBackground(new java.awt.Color(2, 165, 156));
        tabla2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabla2);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 165, 156));
        jLabel3.setText("Codigo:");

        codigo.setBackground(new java.awt.Color(255, 255, 255));
        codigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        codigo.setForeground(new java.awt.Color(0, 0, 0));
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bgagregar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bgeliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bgeditar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bgguardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bgbuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(bgbuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bgguardar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgeliminar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgagregar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgeditar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -1, 530, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        String nombreColumnas [] = {"Codigo","Nombre"};
        modelo.setColumnIdentifiers(nombreColumnas);
        
        List lista = pc.findPresentacionEntities();
        
        for (int i = 0; i < lista.size(); i++) {
            Presentacion p = (Presentacion) lista.get(i);
            Object fila[]={p.getCodigo(),p.getNombre()};
            modelo.addRow(fila);
        }
        
        tabla2.setModel(modelo);
    }
    private void btnbuscar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscar2MouseEntered
        // TODO add your handling code here:
        bgbuscar2.setBackground(new Color(2,191,182));
    }//GEN-LAST:event_btnbuscar2MouseEntered

    private void btnbuscar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscar2MouseExited
        // TODO add your handling code here:
         bgbuscar2.setBackground(new Color(2,165,156));
    }//GEN-LAST:event_btnbuscar2MouseExited

    private void btnagregar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregar2MouseEntered
        // TODO add your handling code here:
        bgagregar2.setBackground(new Color(2,191,182));
    }//GEN-LAST:event_btnagregar2MouseEntered

    private void btnagregar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregar2MouseExited
        // TODO add your handling code here:
        bgagregar2.setBackground(new Color(2,165,156));
    }//GEN-LAST:event_btnagregar2MouseExited

    private void btneliminar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminar2MouseEntered
        // TODO add your handling code here:
        bgeliminar2.setBackground(new Color(2,191,182));
    }//GEN-LAST:event_btneliminar2MouseEntered

    private void btneliminar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminar2MouseExited
        // TODO add your handling code here:
        bgeliminar2.setBackground(new Color(2,165,156));
    }//GEN-LAST:event_btneliminar2MouseExited

    private void btneditar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditar2MouseEntered
        // TODO add your handling code here:
        bgeditar2.setBackground(new Color(2,191,182));
    }//GEN-LAST:event_btneditar2MouseEntered

    private void btneditar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditar2MouseExited
        // TODO add your handling code here:
        bgeditar2.setBackground(new Color(2,165,156));
    }//GEN-LAST:event_btneditar2MouseExited

    private void btnguardar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardar2MouseEntered
        // TODO add your handling code here:
        bgguardar2.setBackground(new Color(2,191,182));
    }//GEN-LAST:event_btnguardar2MouseEntered

    private void btnguardar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardar2MouseExited
        // TODO add your handling code here:
        bgguardar2.setBackground(new Color(2,165,156));
    }//GEN-LAST:event_btnguardar2MouseExited

    private void btnagregar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregar2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo=(DefaultTableModel) tabla2.getModel();

        Object[] fila = {Integer.parseInt(codigo.getText()),nombre.getText()};
        modelo.addRow(fila);
        
        codigo.setText("");
        nombre.setText("");
    }//GEN-LAST:event_btnagregar2MouseClicked

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_codigoActionPerformed

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_codigoKeyTyped

    private void btneliminar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminar2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
        modelo.removeRow(tabla2.getSelectedRow());
    }//GEN-LAST:event_btneliminar2MouseClicked

    private void btnguardar2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardar2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardar2KeyPressed

    private void btnguardar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardar2MouseClicked
        // TODO add your handling code here:
        int codigo = Integer.parseInt(this.codigo.getText());
        String nombre = this.nombre.getText();
        Presentacion medicamento = new Presentacion(codigo,nombre);
        PresentacionJpaController p = new PresentacionJpaController();
        
        try {
            p.create(medicamento);
            JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
            limpiar();
            cargarTabla();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se presento un error al guardar");
        }
    }//GEN-LAST:event_btnguardar2MouseClicked

    public void limpiar(){
        codigo.setText("");
        nombre.setText("");
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
            java.util.logging.Logger.getLogger(frmpresentaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpresentaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpresentaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpresentaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmpresentaciones dialog = new frmpresentaciones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgagregar2;
    private javax.swing.JPanel bgbuscar2;
    private javax.swing.JPanel bgeditar2;
    private javax.swing.JPanel bgeliminar2;
    private javax.swing.JPanel bgguardar2;
    private javax.swing.JLabel btnagregar2;
    private javax.swing.JLabel btnbuscar2;
    private javax.swing.JLabel btneditar2;
    private javax.swing.JLabel btneliminar2;
    private javax.swing.JLabel btnguardar2;
    private javax.swing.JTextField codigo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
