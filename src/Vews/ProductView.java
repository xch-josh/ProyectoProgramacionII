package Vews;

import Controllers.ProductController;
import Models.ProductModels.ProductViewModel;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductView extends javax.swing.JFrame {
	List<ProductViewModel> lst;
	
	public ProductView() {
		initComponents();
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				PrincipalForm principalForm = new PrincipalForm();
				principalForm.setVisible(true);
			}
		});
		
		
		
		this.setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SetImageLabel(labelImage, "src/images/Logo Electrika2.png");
		ShowData();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        labelImage = new javax.swing.JLabel();
        btnReport = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNameOrCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProducts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-trash-can-15-24.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setName("btnDelete"); // NOI18N
        btnDelete.setPreferredSize(new Dimension(125,40));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 204, 0));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addWrite24.png"))); // NOI18N
        btnAdd.setText("Agregar"); // NOI18N
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setName("btnDelete"); // NOI18N
        btnAdd.setPreferredSize(new Dimension(125,40));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-pencil-14-24.png"))); // NOI18N
        jButton6.setText("Editar");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setName("btnDelete"); // NOI18N
        jButton6.setPreferredSize(new Dimension(125,40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        labelImage.setText("jLabel2");

        btnReport.setBackground(new java.awt.Color(51, 51, 51));
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-clipboard-13-24.png"))); // NOI18N
        btnReport.setText("Reporte"); // NOI18N
        btnReport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReport.setName("btnDelete"); // NOI18N
        btnReport.setPreferredSize(new Dimension(125,40));
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnOut.setBackground(new java.awt.Color(51, 51, 51));
        btnOut.setForeground(new java.awt.Color(255, 255, 255));
        btnOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-arrow-20-24.png"))); // NOI18N
        btnOut.setText("Salida"); // NOI18N
        btnOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOut.setName("btnDelete"); // NOI18N
        btnOut.setPreferredSize(new Dimension(125,40));
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOut, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre/Codigo:");

        txtNameOrCode.setBackground(new java.awt.Color(255, 255, 255));
        txtNameOrCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNameOrCode.setName("txtName"); // NOI18N
        txtNameOrCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameOrCodeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameOrCode, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameOrCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Precio unitario", "Cantidad", "Fecha vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tProducts.setName("tProducts"); // NOI18N
        tProducts.setRowHeight(35);
        tProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tProducts);
        if (tProducts.getColumnModel().getColumnCount() > 0) {
            tProducts.getColumnModel().getColumn(0).setPreferredWidth(100);
            tProducts.getColumnModel().getColumn(1).setPreferredWidth(300);
        }
        tProducts.getAccessibleContext().setAccessibleName("tProducts");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameOrCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameOrCodeKeyTyped

		txtNameOrCode.addKeyListener(new KeyAdapter(){
			@Override
			public void keyReleased(KeyEvent ke) {
				FilterProduct();
			}
			
		});
    }//GEN-LAST:event_txtNameOrCodeKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
		if (tProducts.getSelectedRow() >= 0){
			int option = JOptionPane.showConfirmDialog(null, "Desea eliminar el producto seleccionado?");
			
			if (option == 0){
				ProductController product = new ProductController();
				product.Delete(tProducts.getModel().getValueAt(tProducts.getSelectedRow(), 0).toString());
				ShowData();
			}
		}
		
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
		AddProductView add = new AddProductView();
		add.productView = this;
		add.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		if (tProducts.getSelectedRow() >= 0){
			try {
				ProductViewModel model = new ProductViewModel();
				Object getDate = tProducts.getModel().getValueAt(tProducts.getSelectedRow(), 4);
				
				model.SetCodigo(tProducts.getModel().getValueAt(tProducts.getSelectedRow(), 0).toString());
				model.SetNombre(tProducts.getModel().getValueAt(tProducts.getSelectedRow(), 1).toString());
				model.SetPrecio(Double.valueOf(tProducts.getModel().getValueAt(tProducts.getSelectedRow(), 2).toString()));
				model.SetCantidad(Integer.valueOf(tProducts.getModel().getValueAt(tProducts.getSelectedRow(), 3).toString()));

				if (getDate != null){
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					model.SetFechaV(dateFormat.parse(getDate.toString()));
				}


				EditProducView edit = new EditProducView(model);
				edit.productView = this;
				edit.setVisible(true);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
		if (tProducts.getModel().getRowCount() > 0){
			ProductController product = new ProductController();
			String reportRoot = "src/Reports/InventoryReport.jasper";
			File myReport = new File(reportRoot);
			
			if (myReport.exists())
				product.ExportToPDF(reportRoot, "D:/ReportesPDF/miReporte.pdf");
			else 
				System.out.println("No existe el reporte");
		}
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
	if (tProducts.getSelectedRow() >= 0){
		SubtractProduct subtractProduct = new SubtractProduct(tProducts.getModel().getValueAt(tProducts.getSelectedRow(), 0).toString());
		subtractProduct.productView = this;
		subtractProduct.lblProduct.setText(tProducts.getModel().getValueAt(tProducts.getSelectedRow(), 1).toString());
		subtractProduct.setVisible(true);
	}
    }//GEN-LAST:event_btnOutActionPerformed
	
	

	public void ShowData(){
		ProductController product = new ProductController();
		
		lst = product.GetData();
		
		FilterProduct();
	}
	
	private void FilterProduct(){
		List<ProductViewModel> newLst = new ArrayList<ProductViewModel>();
		DefaultTableModel tableModel = (DefaultTableModel) tProducts.getModel();
		
		newLst = lst.stream().filter(x -> x.GetCodigo().toUpperCase().contains(txtNameOrCode.getText().toUpperCase()) || x.GetNombre().toUpperCase().contains(txtNameOrCode.getText().toUpperCase())).collect(Collectors.toList());
		tableModel.setRowCount(0);
		
		if (!newLst.isEmpty()){	
			for (ProductViewModel row  : newLst){
				tableModel.addRow(new Object[] {row.GetCodigo(), row.GetNombre(), row.GetPrecio(), row.Getcantidad(), row.GetFechaV()});
			}
			tProducts.setModel(tableModel);
		}
	}
	
	private void SetImageLabel(JLabel nameLabel, String root){
		ImageIcon image = new ImageIcon(root);
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(nameLabel.getWidth(), nameLabel.getHeight(), Image.SCALE_DEFAULT));
		
		nameLabel.setIcon(icon);
		this.repaint();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImage;
    private javax.swing.JTable tProducts;
    private javax.swing.JTextField txtNameOrCode;
    // End of variables declaration//GEN-END:variables
}
