/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Client;

/**
 *
 * @author alvarorodriguezjimenez
 */
public class HomeClient extends javax.swing.JFrame {
        

    static String userName;
    /**
     * Creates new form HomeClient
     */
    public HomeClient(String userName) {
        this.userName=userName;
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

        jPanel1 = new javax.swing.JPanel();
        addrecipes = new javax.swing.JButton();
        searchrecipe = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        addmenu = new javax.swing.JButton();
        searchmenu = new javax.swing.JButton();
        mypublications = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addrecipes.setText("Añadir receta");
        addrecipes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrecipesActionPerformed(evt);
            }
        });

        searchrecipe.setText("Buscar receta");
        searchrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchrecipeActionPerformed(evt);
            }
        });

        profile.setText("Perfil");

        addmenu.setText("Añadir menu");
        addmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmenuActionPerformed(evt);
            }
        });

        searchmenu.setText("Buscar menu");

        mypublications.setText("Mis publicaciones");
        mypublications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mypublicationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profile))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(searchrecipe)
                                    .addComponent(addmenu, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addrecipes, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(searchmenu))
                            .addComponent(mypublications))
                        .addGap(198, 235, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile)
                .addGap(15, 15, 15)
                .addComponent(addrecipes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addmenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchmenu)
                .addGap(18, 18, 18)
                .addComponent(mypublications)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addrecipesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrecipesActionPerformed
        AddRecipe addRecipe = new AddRecipe(userName);
        addRecipe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addrecipesActionPerformed

    private void searchrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchrecipeActionPerformed
        try {
            SearchRecipe x  = new SearchRecipe(userName);
            x.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(HomeClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchrecipeActionPerformed

    private void addmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addmenuActionPerformed

    private void mypublicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mypublicationsActionPerformed
        MyPublications x  = new MyPublications(userName);
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mypublicationsActionPerformed

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
            java.util.logging.Logger.getLogger(HomeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeClient(userName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmenu;
    private javax.swing.JButton addrecipes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mypublications;
    private javax.swing.JButton profile;
    private javax.swing.JButton searchmenu;
    private javax.swing.JButton searchrecipe;
    // End of variables declaration//GEN-END:variables
}