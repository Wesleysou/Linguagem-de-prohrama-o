package sptech.projeto.encapsulamento1;

public class TelaAluno extends javax.swing.JFrame {

    /**
     * Creates new form TelaAluno
     */
    public TelaAluno() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAluno1 = new javax.swing.JLabel();
        btnVerificarAluno = new javax.swing.JButton();
        lblVariavelAluno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));

        lblAluno1.setBackground(new java.awt.Color(153, 0, 0));
        lblAluno1.setFont(new java.awt.Font("Z003", 1, 36)); // NOI18N
        lblAluno1.setForeground(new java.awt.Color(255, 51, 51));
        lblAluno1.setText("Aluno 1");

        btnVerificarAluno.setBackground(new java.awt.Color(255, 0, 0));
        btnVerificarAluno.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 48)); // NOI18N
        btnVerificarAluno.setForeground(new java.awt.Color(255, 255, 0));
        btnVerificarAluno.setText("clique aqui");
        btnVerificarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarAlunoActionPerformed(evt);
            }
        });

        lblVariavelAluno.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        lblVariavelAluno.setForeground(new java.awt.Color(255, 255, 0));
        lblVariavelAluno.setText("---");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Laksaman", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Clique aqui");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Bitstream Charter", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("clique aqui");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("P052", 1, 48)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("clique aqui");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(lblVariavelAluno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton2)
                        .addGap(50, 50, 50)
                        .addComponent(btnVerificarAluno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(lblAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addGap(87, 87, 87)
                        .addComponent(lblAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(btnVerificarAluno))
                .addGap(7, 7, 7)
                .addComponent(lblVariavelAluno)
                .addGap(186, 186, 186))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarAlunoActionPerformed
        // TODO add your handling code here:
        lblVariavelAluno.setText("cavalo");
    }//GEN-LAST:event_btnVerificarAlunoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificarAluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblAluno1;
    private javax.swing.JLabel lblVariavelAluno;
    // End of variables declaration//GEN-END:variables
}
