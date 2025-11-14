import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Bankomat extends javax.swing.JFrame {

    /*
        0 - podaj karte
    */
    int stage = 0;
    String[] Cards = new String[255];
    String[] Pins = new String[255];
    int[] Money = new int[255];
    String card, pin;
    int money;
    int index;
    
    String stage_insertcard = "               Podaj numer karty:\n\n            ____-____-____-____";
            
    
    public Bankomat() {
        initComponents();
        int i_cards = 0, i_pins = 0, i_money = 0;
        String data;
        
        File Cards_File = new File("card.txt");
        File Pins_File = new File("pin.txt");
        File Money_File = new File("money.txt");

        try (Scanner Reader = new Scanner(Cards_File)) {
            while (Reader.hasNextLine()) {
                data = Reader.nextLine();
                Cards[i_cards] = data;
                i_cards++;
            }
        } catch (FileNotFoundException e) {
            
        }
        
        try (Scanner Reader = new Scanner(Pins_File)) {
            while (Reader.hasNextLine()) {
                data = Reader.nextLine();
                Pins[i_pins] = data;
                i_pins++;
            }
        } catch (FileNotFoundException e) {
            
        }
        
        try (Scanner Reader = new Scanner(Money_File)) {
            while (Reader.hasNextLine()) {
                data = Reader.nextLine();
                Money[i_money] = Integer.parseInt(data);
                i_money++;
            }
        } catch (FileNotFoundException e) {
            
        }
        
        Stg(stage_insertcard);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOpt1 = new javax.swing.JButton();
        btnOpt2 = new javax.swing.JButton();
        btnOpt3 = new javax.swing.JButton();
        btnOpt4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Screen = new javax.swing.JTextArea();
        btnOpt5 = new javax.swing.JButton();
        btnOpt6 = new javax.swing.JButton();
        btnOpt7 = new javax.swing.JButton();
        btnOpt8 = new javax.swing.JButton();
        btnType1 = new javax.swing.JButton();
        btnType2 = new javax.swing.JButton();
        btnType3 = new javax.swing.JButton();
        btnType4 = new javax.swing.JButton();
        btnType5 = new javax.swing.JButton();
        btnType6 = new javax.swing.JButton();
        btnType7 = new javax.swing.JButton();
        btnType8 = new javax.swing.JButton();
        btnType9 = new javax.swing.JButton();
        btnType0 = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Screen.setColumns(20);
        Screen.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Screen.setRows(5);
        jScrollPane1.setViewportView(Screen);

        btnType1.setText("1");
        btnType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType1ActionPerformed(evt);
            }
        });

        btnType2.setText("2");
        btnType2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType2ActionPerformed(evt);
            }
        });

        btnType3.setText("3");
        btnType3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType3ActionPerformed(evt);
            }
        });

        btnType4.setText("4");
        btnType4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType4ActionPerformed(evt);
            }
        });

        btnType5.setText("5");
        btnType5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType5ActionPerformed(evt);
            }
        });

        btnType6.setText("6");
        btnType6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType6ActionPerformed(evt);
            }
        });

        btnType7.setText("7");
        btnType7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType7ActionPerformed(evt);
            }
        });

        btnType8.setText("8");
        btnType8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType8ActionPerformed(evt);
            }
        });

        btnType9.setText("9");
        btnType9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType9ActionPerformed(evt);
            }
        });

        btnType0.setText("0");
        btnType0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnType0ActionPerformed(evt);
            }
        });

        btnConfirm.setText("✓");

        btnCancel.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpt4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpt5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpt6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpt7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpt8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnType4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnType1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnType7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnType8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnType9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnType0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnType5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnType6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnType2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnType3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOpt5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpt6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpt7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOpt8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpt4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnType7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnType8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnType9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnType4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnType5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnType6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnType1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnType2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnType3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnType0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType1ActionPerformed
        Type("1");
    }//GEN-LAST:event_btnType1ActionPerformed

    private void btnType2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType2ActionPerformed
        Type("2");
    }//GEN-LAST:event_btnType2ActionPerformed

    private void btnType3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType3ActionPerformed
        Type("3");
    }//GEN-LAST:event_btnType3ActionPerformed

    private void btnType4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType4ActionPerformed
        Type("4");
    }//GEN-LAST:event_btnType4ActionPerformed

    private void btnType5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType5ActionPerformed
        Type("5");
    }//GEN-LAST:event_btnType5ActionPerformed

    private void btnType6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType6ActionPerformed
        Type("6");
    }//GEN-LAST:event_btnType6ActionPerformed

    private void btnType7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType7ActionPerformed
        Type("7");
    }//GEN-LAST:event_btnType7ActionPerformed

    private void btnType8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType8ActionPerformed
        Type("8");
    }//GEN-LAST:event_btnType8ActionPerformed

    private void btnType9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType9ActionPerformed
        Type("9");
    }//GEN-LAST:event_btnType9ActionPerformed

    private void btnType0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnType0ActionPerformed
        Type("0");
    }//GEN-LAST:event_btnType0ActionPerformed

    public void Type(String a){
        if (stage == 0){
            
        }
    }
    
    public void Stg(String stage){
        Screen.setText(stage);
    }
    
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Bankomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bankomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bankomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bankomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bankomat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Screen;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnOpt1;
    private javax.swing.JButton btnOpt2;
    private javax.swing.JButton btnOpt3;
    private javax.swing.JButton btnOpt4;
    private javax.swing.JButton btnOpt5;
    private javax.swing.JButton btnOpt6;
    private javax.swing.JButton btnOpt7;
    private javax.swing.JButton btnOpt8;
    private javax.swing.JButton btnType0;
    private javax.swing.JButton btnType1;
    private javax.swing.JButton btnType2;
    private javax.swing.JButton btnType3;
    private javax.swing.JButton btnType4;
    private javax.swing.JButton btnType5;
    private javax.swing.JButton btnType6;
    private javax.swing.JButton btnType7;
    private javax.swing.JButton btnType8;
    private javax.swing.JButton btnType9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
