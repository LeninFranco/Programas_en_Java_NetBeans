package frames;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.*;
import models.TextPrompt;

public class frameInventario extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel(){
	@Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
	};
    
    public frameInventario() {
	initComponents();
	setLocationRelativeTo(null);
	Table.setModel(model);
	model.addColumn("Codigo");
	model.addColumn("Producto");
	model.addColumn("Entrada");
	model.addColumn("Salida");
	model.addColumn("Cantidad");
	Table.getColumnModel().getColumn(0).setPreferredWidth(100);
	Table.getColumnModel().getColumn(1).setPreferredWidth(388);
	Table.getColumnModel().getColumn(2).setPreferredWidth(100);
	Table.getColumnModel().getColumn(3).setPreferredWidth(100);
	Table.getColumnModel().getColumn(4).setPreferredWidth(100);
	Table.getTableHeader().setResizingAllowed(false);
	TextPrompt textCodigo = new TextPrompt("Codigo del Producto", txtCodigo);
	fillTable("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inventario");
        setResizable(false);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opc = JOptionPane.showConfirmDialog(null,"¿Está seguro de salir?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
	if(opc == 0){
	    this.dispose();
	    frameMenu fm = new frameMenu();
	    fm.setVisible(true);
	}
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        fillTable(txtCodigo.getText());
    }//GEN-LAST:event_txtCodigoKeyReleased
    
    private void fillTable(String codigo){
	voidTable();
	Producto p = ProductoDB.findOne(codigo);
	if(p != null){
	    Object[] fila = new Object[5];
	    fila[0] = p.getCodigoP();
	    fila[1] = p.getNombre();
	    fila[2] = p.getEntrada();
	    fila[3] = p.getSalida();
	    fila[4] = p.getCantidad();
	    model.addRow(fila);
	}
	else{
	    List<Producto> productos = ProductoDB.findAll();
	    for(Producto producto : productos){
		Object[] fila = new Object[5];
		fila[0] = producto.getCodigoP();
		fila[1] = producto.getNombre();
		fila[2] = producto.getEntrada();
		fila[3] = producto.getSalida();
		fila[4] = producto.getCantidad();
		model.addRow(fila);
	    }
	}
    }
    
    private void voidTable(){
	for (int i = model.getRowCount() -1 ; i >= 0 ; i--) {
            model.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
