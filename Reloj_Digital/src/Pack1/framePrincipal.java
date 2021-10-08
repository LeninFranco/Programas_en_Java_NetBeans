/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import java.util.*;
import java.text.SimpleDateFormat;

public class framePrincipal extends javax.swing.JFrame implements Runnable{
    
    private String hora,min,seg;
    private Thread hilo;
    
    public framePrincipal() {
	initComponents();
	lbDate.setText(fecha());
	hilo = new Thread(this);
	hilo.start();
    }

    private String fecha(){
	Date fecha = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
	return formato.format(fecha);
    }
    
    private void hora(){
	Calendar calendario = new GregorianCalendar();
	Date horaActual = new Date();
	calendario.setTime(horaActual);
	hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? ""+calendario.get(Calendar.HOUR_OF_DAY): "0"+calendario.get(Calendar.HOUR_OF_DAY);
	min = calendario.get(Calendar.MINUTE) > 9 ? ""+calendario.get(Calendar.MINUTE): "0"+calendario.get(Calendar.MINUTE);
	seg = calendario.get(Calendar.SECOND) > 9 ? ""+calendario.get(Calendar.SECOND): "0"+calendario.get(Calendar.SECOND);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbDate = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reloj Digital");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lbDate.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbDate.setForeground(new java.awt.Color(66, 201, 32));
        lbDate.setText("DD/MM/YYYY");

        lbHora.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbHora.setForeground(new java.awt.Color(66, 201, 32));
        lbHora.setText("HORA");

        lbTime.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbTime.setForeground(new java.awt.Color(66, 201, 32));
        lbTime.setText("00:00:00");

        lbFecha.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(66, 201, 32));
        lbFecha.setText("FECHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbFecha)
                        .addGap(167, 167, 167)
                        .addComponent(lbHora))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbDate)
                        .addGap(122, 122, 122)
                        .addComponent(lbTime)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(lbHora))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate)
                    .addComponent(lbTime))
                .addContainerGap(21, Short.MAX_VALUE))
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
	    java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new framePrincipal().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
	Thread current = Thread.currentThread();
	while(current == hilo){
	    hora();
	    lbTime.setText(hora+":"+min+":"+seg);
	}
    }
}
