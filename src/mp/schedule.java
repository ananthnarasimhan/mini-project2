/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class schedule extends javax.swing.JFrame {

    /**
     * Creates new form schedule
     */
    public schedule() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("schedule");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(132, 132, 132))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
                String Query="SELECT DISTINCT area FROM senior_citizen";
                System.out.println("ausfxv");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                System.out.println("ausfxv");
               // Connection con;
                Connection conn;
                conn = DriverManager.getConnection("jdbc:mysql://localhost/mp?" +"user=root&password=9422349317");
                System.out.println("ausfxv");
                Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(Query);
        while (rs.next()) {
                    String sname=rs.getString("area");
                    System.out.println(sname);
                }
        conn.close();
            } 
            catch (Exception e)
            {   
                String S;
                System.out.println("ausfxv1234");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       try {
           
                String Query="SELECT DISTINCT v_id FROM schedule";
                
                System.out.println("ausfxv");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                System.out.println("ausfxv");
               // Connection con;
                Connection conn;
                conn = DriverManager.getConnection("jdbc:mysql://localhost/mp?" +"user=root&password=9422349317");
                System.out.println("ausfxv");
                Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(Query);
         String l_vol = null;
        while (rs.next()) {
                    l_vol=rs.getString("v_id");
                    
                }
        System.out.println(l_vol);
        String vol =null;
        String Query2="DELETE FROM vol_list WHERE v_id="+l_vol+";";
        System.out.println(Query2);
        Statement stat=conn.createStatement();
        stat.executeUpdate(Query2);
        System.out.println("ausfxv");
      /*  while (rss.next()) {
            vol=rss.getString("v_id");
            System.out.println(vol);
        }*/
        conn.close();
            } 
            catch (Exception e)
            {   
                String S;
                System.out.println("ausfxv1234");
            }
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
            java.util.logging.Logger.getLogger(schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
