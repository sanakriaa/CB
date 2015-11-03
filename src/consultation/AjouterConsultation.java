
package consultation;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AjouterConsultation extends javax.swing.JFrame {

   Connect cn=new Connect();
   Statement stm;
    public AjouterConsultation() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ListePat = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        numdos = new javax.swing.JTextField();
        taille = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Resultat = new javax.swing.JComboBox();
        tension = new javax.swing.JTextField();
        temp = new javax.swing.JTextField();
        poid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        com = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnAjout = new javax.swing.JButton();
        BtnAnnuler = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nom et Prenom du patient");

        ListePat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListePatActionPerformed(evt);
            }
        });

        jLabel2.setText("Numéro Dossier");

        taille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tailleActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultat");

        Resultat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maladie acquise de l'oeil", "Maladie acquise des yeux", "maladie a gorge", "maladie a corps" }));

        tension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tensionActionPerformed(evt);
            }
        });

        temp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempActionPerformed(evt);
            }
        });

        poid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poidActionPerformed(evt);
            }
        });

        jLabel5.setText("Poids");

        jLabel6.setText("Taille");

        jLabel7.setText("Tension");

        jLabel8.setText("Temperature");

        com.setColumns(20);
        com.setRows(5);
        jScrollPane1.setViewportView(com);

        jLabel9.setText("Commentaire");

        btnAjout.setText("Ajouter Consultaion");
        btnAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutActionPerformed(evt);
            }
        });

        BtnAnnuler.setText("Annuler Consultation");
        BtnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnnulerActionPerformed(evt);
            }
        });

        jLabel3.setText("Date Consultation");

        jLabel10.setText("Date Prochain RDV");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numdos)
                            .addComponent(ListePat, 0, 173, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Resultat, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(157, 157, 157)))
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temp))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(25, 25, 25)
                            .addComponent(tension, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(poid, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(taille)))))
                .addGap(47, 47, 47)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAjout)
                    .addComponent(BtnAnnuler))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Resultat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ListePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAjout)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAnnuler)
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(poid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(taille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListePatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListePatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListePatActionPerformed

    private void tailleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tailleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tailleActionPerformed

    private void tensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tensionActionPerformed

    private void tempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempActionPerformed

    private void poidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poidActionPerformed

    private void btnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutActionPerformed
      String nd=numdos.getText();
      String pd=poid.getText();
      String tl=taille.getText();
      String tem=temp.getText();
      String ten=tension.getText();
      String comm=com.getText();
      String d1=datecons.getDate();
      String d2=dateRDV.getDate();
              
      String reqconcat = "select nom,prenom  from Patient ";
       try
        {
        stm=cn.obtenirconnection().createStatement();
        stm.executeUpdate(reqconcat);
        }
        catch(SQLException e)
        { System.out.print(e);}
      
       
      String req= "INSERT into consultation (nomPatient,prenomPatient , NumeroDossier ,Poid,Temperature,Tension,Taille,DateConsultation,DateProchainRDV,Commentaire)VALUES ('"+nd+"','"+pd+"' ,'"+tem+"'  ,'"+ten+"'  ,'"+tl+"'  ,'"+d1+"'  ,'"+d2+"')";
      
      try
      {
          stm=cn.obtenirconnection().createStatement();
          stm.executeUpdate(req);
          JOptionPane.showMessageDialog(null,"req reussie");
          
      }catch(SQLException e)
      {
          JOptionPane.showMessageDialog(null,"consultation exsite déjà");
          System.out.println(e);
          
      }
    
      
      
    }//GEN-LAST:event_btnAjoutActionPerformed

    private void BtnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnnulerActionPerformed
       numdos.setText("");
       poid.setText("");
       taille.setText("");
       temp.setText("");
       tension.setText("");
       com.setText("");
   
         
    }//GEN-LAST:event_BtnAnnulerActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterConsultation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnnuler;
    private javax.swing.JComboBox ListePat;
    private javax.swing.JComboBox Resultat;
    private javax.swing.JButton btnAjout;
    private javax.swing.JTextArea com;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numdos;
    private javax.swing.JTextField poid;
    private javax.swing.JTextField taille;
    private javax.swing.JTextField temp;
    private javax.swing.JTextField tension;
    // End of variables declaration//GEN-END:variables
}
