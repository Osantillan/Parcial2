
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author oscar
 */
public class ResumenSemanal extends javax.swing.JFrame
{
    /**
     * Creates new form ResumenSemanal
     */
    public ResumenSemanal()
    {
        initComponents();
        mostrarDatos("");
    }
    
    public void mostrarDatos(String valor)
    {
        Conectar c = new Conectar();
        Connection cc = c.conexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("actividad");
        modelo.addColumn("fecha");
        modelo.addColumn("hora de inicio");
        modelo.addColumn("hora final");
        modelo.addColumn("tiempo(min)");
        modelo.addColumn("interrupciones(min)");
        modelo.addColumn("comentarios");
        modelo.addColumn("completada");
        
        tabla.setModel(modelo);
        String sql = "";
        if (valor.equals(""))
        {
            sql = "select * from reporte";
        }
        
        String datos[] = new String[9];
        
        try
        {
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next())
            {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "error: "+ ex);
        }
    }
    
    public void mostrarDatosFecha(String valor1,String valor2)
    {
        Conectar c = new Conectar();
        Connection cc = c.conexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("actividad");
        modelo.addColumn("fecha");
        modelo.addColumn("hora de inicio");
        modelo.addColumn("hora final");
        modelo.addColumn("tiempo(min)");
        modelo.addColumn("interrupciones(min)");
        modelo.addColumn("comentarios");
        modelo.addColumn("completada");
        
        tabla.setModel(modelo);
        
        String sql = "select * from reporte where fecha between '"+valor1+"' and '"+valor2+"'";
        
        
        String datos[] = new String[9];
        
        try
        {
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next())
            {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "error: "+ ex);
        }
        llamarLabels(valor1, valor2);
    }
    
    public void llamarLabels(String valor1,String valor2)
    {
        Conectar c = new Conectar();
        Connection cc = c.conexion();
        
        String sql1 = "select sum(tiempo) from reporte where fecha between '"+valor1+"' and '"+valor2+"'";
        String sql2 = "select sum(interrupciones) from reporte where fecha between '"+valor1+"' and '"+valor2+"'";
        try
        {
            PreparedStatement totalTiempo = cc.prepareStatement(sql1);
            ResultSet Tiempo = totalTiempo.executeQuery();
            
            PreparedStatement totalInterrupciones = cc.prepareStatement(sql2);
            ResultSet Interrupciones = totalInterrupciones.executeQuery();
            
            while (Tiempo.next())
            {
                lbTiempo.setText(Tiempo.getString(1));
            }
            while (Interrupciones.next())
            {
                lbInterrupciones.setText(Interrupciones.getString(1));
            }
        }
        catch (Exception e)
        {
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        popup_modificar = new javax.swing.JMenuItem();
        decision = new javax.swing.ButtonGroup();
        regresarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbTiempo = new javax.swing.JLabel();
        lbInterrupciones = new javax.swing.JLabel();

        popup_modificar.setText("Modificar");
        popup.add(popup_modificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(290, 130, 180, 180));

        regresarBtn.setText("Regresar");
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel2.setText("Fecha");

        jLabel3.setText("De");

        jLabel4.setText("Hasta");

        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha");

        jLabel1.setText("Tiempo total en minutos");

        jLabel6.setText("Interrupciones totales en minutos");

        lbTiempo.setText("jLabel7");

        lbInterrupciones.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regresarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)
                                .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTiempo)
                    .addComponent(lbInterrupciones))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(buscarBtn)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTiempo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbInterrupciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(regresarBtn))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        mostrarDatosFecha(txtFechaInicio.getText(),txtFechaFinal.getText());
        
    }//GEN-LAST:event_buscarBtnActionPerformed
                                        

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
            java.util.logging.Logger.getLogger(ResumenSemanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResumenSemanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResumenSemanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResumenSemanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResumenSemanal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.ButtonGroup decision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbInterrupciones;
    private javax.swing.JLabel lbTiempo;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JMenuItem popup_modificar;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
