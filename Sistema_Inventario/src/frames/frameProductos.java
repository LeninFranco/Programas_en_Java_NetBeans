package frames;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.*;
import models.TextPrompt;

public class frameProductos extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel(){
	@Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
	};
    
    public frameProductos() {
	initComponents();
	setLocationRelativeTo(null);
	Table.setModel(model);
	model.addColumn("Codigo");
	model.addColumn("Producto");
	Table.getColumnModel().getColumn(0).setPreferredWidth(100);
	Table.getColumnModel().getColumn(1).setPreferredWidth(438);
	Table.getTableHeader().setResizingAllowed(false);
	TextPrompt textCodigo = new TextPrompt("Codigo", txtCodigo);
	TextPrompt textProducto = new TextPrompt("Producto", txtNombre);
	fillTable("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrar Productos");
        setResizable(false);

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        btnAdd.setText("Añadir Producto");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int opc = JOptionPane.showConfirmDialog(null,"¿Está seguro de salir?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
	if(opc == 0){
	    this.dispose();
	    frameMenu fm = new frameMenu();
	    fm.setVisible(true);
	}
    }                                        

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
       if(!"".equals(txtCodigo.getText()) && !"".equals(txtNombre.getText())){
	   Producto p = ProductoDB.findOne(txtCodigo.getText());
	   if(p == null){
	       p = new Producto(txtCodigo.getText(),txtNombre.getText());
	       ProductoDB.create(p);
	       JOptionPane.showMessageDialog(null,"Producto guardado correctamente","GUARDADO",JOptionPane.INFORMATION_MESSAGE);
	   }
	   else{
	       JOptionPane.showMessageDialog(null,"Ya existe un producto con esa Codigo","ERROR",JOptionPane.ERROR_MESSAGE);
	   }
       }
       else{
	   JOptionPane.showMessageDialog(null,"Favor de llenar los campos","ERROR",JOptionPane.ERROR_MESSAGE);
       }
       fillTable("");
       txtCodigo.setText("");
       txtNombre.setText("");
    }                                      

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {                                      
        fillTable(txtCodigo.getText());
    }                                     

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int fila = Table.getSelectedRow();
	if(fila != -1){
	    String codigo = Table.getValueAt(fila, 0).toString();
	    ProductoDB.delete(codigo);
	    JOptionPane.showMessageDialog(null,"Producto eliminado correctamente","ELIMINADO",JOptionPane.INFORMATION_MESSAGE);
	}
	else{
	    JOptionPane.showMessageDialog(null,"Seleccione una producto a eliminar","ERROR",JOptionPane.ERROR_MESSAGE);
	}
	fillTable("");
    }                                           

    
    private void fillTable(String codigo){
	voidTable();
	Producto p = ProductoDB.findOne(codigo);
	if(p != null){
	    Object[] fila = new Object[2];
	    fila[0] = p.getCodigoP();
	    fila[1] = p.getNombre();
	    model.addRow(fila);
	}
	else{
	    List<Producto> productos = ProductoDB.findAll();
	    for(Producto producto : productos){
		Object[] fila = new Object[2];
		fila[0] = producto.getCodigoP();
		fila[1] = producto.getNombre();
		model.addRow(fila);
	    }
	}
    }
    
    private void voidTable(){
	for (int i = model.getRowCount() -1 ; i >= 0 ; i--) {
            model.removeRow(i);
        }
    }
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JTable Table;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration                   
}
