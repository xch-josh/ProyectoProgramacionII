package Vews;

public class PrincipalForm extends javax.swing.JFrame {
    public PrincipalForm() {
        initComponents();
		this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAdmUsers = new javax.swing.JButton();
        btnAdmProducts = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENU");

        btnAdmUsers.setBackground(new java.awt.Color(102, 102, 102));
        btnAdmUsers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdmUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin-con-ruedas-dentadas (2).png"))); // NOI18N
        btnAdmUsers.setText("Administrar usuarios");
        btnAdmUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmUsersActionPerformed(evt);
            }
        });

        btnAdmProducts.setBackground(new java.awt.Color(102, 102, 102));
        btnAdmProducts.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdmProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caja.png"))); // NOI18N
        btnAdmProducts.setText("Administrar productos");
        btnAdmProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmProductsActionPerformed(evt);
            }
        });

        btnHistory.setBackground(new java.awt.Color(102, 102, 102));
        btnHistory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/historyW64.png"))); // NOI18N
        btnHistory.setText("Historial de salidas y entradas");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdmProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdmUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAdmProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdmUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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

    private void btnAdmProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmProductsActionPerformed
	ProductView productView = new ProductView();
	productView.setVisible(true);
	this.dispose();
    }//GEN-LAST:event_btnAdmProductsActionPerformed

    private void btnAdmUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmUsersActionPerformed
	UsersView usersView = new UsersView();
	usersView.setVisible(true);
	this.dispose();
    }//GEN-LAST:event_btnAdmUsersActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
       InputsAndOutputsHistory history = new InputsAndOutputsHistory();
	history.setVisible(true);
	this.dispose();
    }//GEN-LAST:event_btnHistoryActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmProducts;
    private javax.swing.JButton btnAdmUsers;
    private javax.swing.JButton btnHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
