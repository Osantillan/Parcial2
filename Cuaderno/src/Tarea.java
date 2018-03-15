
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * 
 * @author oscar
 */
public class Tarea extends javax.swing.JFrame
{
    public Tarea()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDecision = new javax.swing.ButtonGroup();
        regresarBtn = new javax.swing.JButton();
        lbFecha = new javax.swing.JLabel();
        lbFinal = new javax.swing.JLabel();
        txtFinal = new javax.swing.JTextField();
        lbTiempo = new javax.swing.JLabel();
        lbInterrupciones = new javax.swing.JLabel();
        txtInterrupciones = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lbActividad = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        lbComentarios = new javax.swing.JLabel();
        txtComentarios = new javax.swing.JTextField();
        lbInicio = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        insertarBtn = new javax.swing.JButton();
        optCompleta = new javax.swing.JRadioButton();
        optIncompleta = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 180, 0, 0));

        regresarBtn.setText("Regresar");
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });

        lbFecha.setText("Fecha");

        lbFinal.setText("Hora final");

        lbTiempo.setText("Tiempo(min)");

        lbInterrupciones.setText("Interrupciones(min)");

        lbActividad.setText("Actividad");

        lbComentarios.setText("Comentarios");

        lbInicio.setText("Hora inicio");

        insertarBtn.setText("Guardar");
        insertarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBtnActionPerformed(evt);
            }
        });

        grupoDecision.add(optCompleta);
        optCompleta.setText("Completa");

        grupoDecision.add(optIncompleta);
        optIncompleta.setText("Incompleta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTiempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbInterrupciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInterrupciones, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(optCompleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optIncompleta))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbFecha)
                                .addComponent(lbActividad))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbInicio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbFinal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbComentarios)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(insertarBtn)
                                .addComponent(txtComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresarBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbActividad)
                    .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFecha)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbInicio)
                        .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbFinal)
                        .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTiempo)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtInterrupciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbInterrupciones)
                        .addComponent(optCompleta)
                        .addComponent(optIncompleta)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbComentarios)
                    .addComponent(txtComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertarBtn)
                .addGap(18, 18, 18)
                .addComponent(regresarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void insertarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBtnActionPerformed
        Conectar c = new Conectar();
        Connection cc = c.conexion();
        
        try
        {
            PreparedStatement pst = cc.prepareStatement
            (
                "insert into reporte(actividad,fecha,h_inicio,h_final,tiempo,interrupciones,comentarios,completado) values(?,?,?,?,?,?,?,?)"
            );
            pst.setString(1,txtActividad.getText());
            pst.setString(2,txtFecha.getText());
            pst.setString(3,txtInicio.getText());
            pst.setString(4,txtFinal.getText());
            pst.setString(5,txtTiempo.getText());
            pst.setString(6,txtInterrupciones.getText());
            pst.setString(7,txtComentarios.getText());
            String mensaje=null;
            if (optCompleta.isSelected())
            {
                mensaje="S";
            }
            else if (optIncompleta.isSelected())
            {
                mensaje="N";
            }
            pst.setString(8,mensaje);
            
            int a = pst.executeUpdate();
            if (a>0)
            {
                JOptionPane.showMessageDialog(null, "registro exitoso");
                txtActividad.setText("");
                txtFecha.setText("");
                txtInicio.setText("");
                txtFinal.setText("");
                txtTiempo.setText("");
                txtInterrupciones.setText("");
                txtComentarios.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al agregar");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: " + e);
        }
    }//GEN-LAST:event_insertarBtnActionPerformed
    
    
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater
        (new Runnable()
            {
                public void run()
                {
                    new Tarea().setVisible(true);
                }
            }
        );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoDecision;
    private javax.swing.JButton insertarBtn;
    private javax.swing.JLabel lbActividad;
    private javax.swing.JLabel lbComentarios;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbFinal;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbInterrupciones;
    private javax.swing.JLabel lbTiempo;
    private javax.swing.JRadioButton optCompleta;
    private javax.swing.JRadioButton optIncompleta;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtComentarios;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtInterrupciones;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
