package Frames;

import Class.*;

import javax.swing.JOptionPane;

public class frameUsuario extends javax.swing.JFrame {

    private final Cuenta cuenta;
    
    public frameUsuario(Cuenta cuenta) {
	this.cuenta = cuenta;
	initComponents();
	Update();
	setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbTitular = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        lbCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Banco UwU");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbTitular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTitular.setText("Titular: ");

        lbSaldo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbSaldo.setText("Saldo Actual: $");

        lbCuenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbCuenta.setText("Numero de cuenta: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSaldo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDepositar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRetirar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addComponent(lbCuenta)
                    .addComponent(lbTitular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitular)
                .addGap(18, 18, 18)
                .addComponent(lbCuenta)
                .addGap(18, 18, 18)
                .addComponent(lbSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositar)
                    .addComponent(btnRetirar)
                    .addComponent(btnEnviar)
                    .addComponent(btnSalir)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Update(){
	lbTitular.setText("Titular: " + cuenta.getTitular());
	lbCuenta.setText("Numero de cuenta: " + String.valueOf(cuenta.getNumCuenta()));
	lbSaldo.setText("Saldo Actual: $" + String.valueOf(cuenta.getSaldo()));
    }
    
    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        String entrada = JOptionPane.showInputDialog(null,"Ingrese la cantidad a depositar","Deposito",JOptionPane.PLAIN_MESSAGE);
	try {
	    float saldo = Float.parseFloat(entrada);
	    cuenta.Depositar(saldo);
	    Update();
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null,"Ocurrio un error en la operacion","ERROR",JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        String entrada = JOptionPane.showInputDialog(null,"Ingrese la cantidad a retirar","Retiro",JOptionPane.PLAIN_MESSAGE);
	try {
	    float saldo = Float.parseFloat(entrada);
	    if(saldo < cuenta.getSaldo()){
		cuenta.Retirar(saldo);
		Update();
	    }
	    else{
		JOptionPane.showMessageDialog(null,"No hay saldo suficiente para retirar","ERROR",JOptionPane.ERROR_MESSAGE);
	    }
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null,"Ocurrio un error en la operacion","ERROR",JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String entrada1 = JOptionPane.showInputDialog(null,"Ingrese el numero de cuenta de destino","Enviar Dinero",JOptionPane.PLAIN_MESSAGE);
	try {
	    Integer key = Integer.parseInt(entrada1);
	    if(Banco.getDataSource().containsKey(key)){
		String entrada2 = JOptionPane.showInputDialog(null,"Ingrese la cantidad a enviar","Enviar Dinero",JOptionPane.PLAIN_MESSAGE);
		try {
		    Float cantidad = Float.parseFloat(entrada2);
		    if(cantidad < cuenta.getSaldo()){
			Banco.getDataSource().get(key).Depositar(cantidad);
			cuenta.Retirar(cantidad);
			Update();
		    }
		    else{
			JOptionPane.showMessageDialog(null,"No hay saldo suficiente para el envio","ERROR",JOptionPane.ERROR_MESSAGE);
		    }
		} catch (Exception e) {
		    JOptionPane.showMessageDialog(null,"Ocurrio un error en la operacion","ERROR",JOptionPane.ERROR_MESSAGE);
		}
	    }
	    else{
		JOptionPane.showMessageDialog(null,"No existe el numero de cuenta ingresado","ERROR",JOptionPane.ERROR_MESSAGE);
	    }
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null,"Ocurrio un error en la operacion","ERROR",JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opc = JOptionPane.showConfirmDialog(null,"¿Está seguro de cerrar su sesion?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
	if(opc == 0){
	    Banco.getDataSource().put(cuenta.getNumCuenta(),cuenta);
	    this.dispose();
	    frameSesion fS = new frameSesion();
	    fS.setVisible(true);
	}
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCuenta;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbTitular;
    // End of variables declaration//GEN-END:variables
}