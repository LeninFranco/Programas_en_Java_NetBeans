package frames;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.*;
import models.TextPrompt;

public class frameEntradas extends javax.swing.JFrame {
    
    private DefaultTableModel model = new DefaultTableModel(){
	@Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
	};
    
    public frameEntradas() {
	initComponents();
	setLocationRelativeTo(null);
	Table.setModel(model);
	model.addColumn("Codigo");
	model.addColumn("Fecha");
	model.addColumn("Unidades");
	model.addColumn("Codigo Producto");
	model.addColumn("Producto");
	Table.getColumnModel().getColumn(0).setPreferredWidth(100);
	Table.getColumnModel().getColumn(1).setPreferredWidth(100);
	Table.getColumnModel().getColumn(2).setPreferredWidth(100);
	Table.getColumnModel().getColumn(3).setPreferredWidth(118);
	Table.getColumnModel().getColumn(4).setPreferredWidth(290);
	Table.getTableHeader().setResizingAllowed(false);
	TextPrompt textCodigo = new TextPrompt("Codigo", txtCodigo);
	TextPrompt textProducto = new TextPrompt("Producto", txtProducto);
	TextPrompt textCantidad = new TextPrompt("Cantidad", txtCantidad);
	fullTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Entradas");
        setResizable(false);

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        txtProducto.setEditable(false);

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table);

        btnAdd.setText("Añadir Entrada");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
	if(c < '0' || c > '9'){
	    evt.consume();
	}
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        Producto p = ProductoDB.findOne(txtCodigo.getText());
	if(p != null){
	    txtProducto.setText(p.getNombre());
	}
	else{
	    txtProducto.setText("");
	}
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(!emptyEntry()){
	    String codigo = String.valueOf(model.getRowCount() + 1);
	    Integer unidades = Integer.parseInt(txtCantidad.getText());
	    String codigoP = txtCodigo.getText();
	    EntradaDB.create(new Entrada(codigo,unidades,codigoP));
	    Producto p = ProductoDB.findOne(codigoP);
	    p.comprar(unidades);
	    ProductoDB.update(p);
	    JOptionPane.showMessageDialog(null,"Compra realizada correctamente","GUARDADO",JOptionPane.INFORMATION_MESSAGE);
	}
	else{
	    JOptionPane.showMessageDialog(null,"Favor de llenar los campos","ERROR",JOptionPane.ERROR_MESSAGE);
	}
	voidTable();
	fullTable();
	txtCodigo.setText("");
	txtProducto.setText("");
	txtCantidad.setText("");
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void fullTable(){
	List<Entrada> entradas = EntradaDB.findAll();
	for(Entrada e : entradas){
	    Object[] fila = new Object[5];
	    fila[0] = e.getCodigo();
	    fila[1] = e.getFecha();
	    fila[2] = e.getUnidades();
	    fila[3] = e.getCodigoP();
	    String producto = ProductoDB.findOne(e.getCodigoP()).getNombre();
	    fila[4] = producto;
	    model.addRow(fila);
	}
    }
    
    private void voidTable(){
	for (int i = model.getRowCount() -1 ; i >= 0 ; i--) {
            model.removeRow(i);
        }
    }
    
    private boolean emptyEntry(){
	return "".equals(txtCodigo.getText()) || "".equals(txtProducto.getText()) || "".equals(txtCantidad.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
