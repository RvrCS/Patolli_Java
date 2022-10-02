
import javax.swing.ImageIcon;

public class menu extends javax.swing.JFrame {
	
	public menu() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearPartida = new javax.swing.JButton();
        btnUnirsePartida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearPartida.setBackground(new java.awt.Color(0, 0, 0));
        btnCrearPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_crearpartida1.png"))); // NOI18N
        btnCrearPartida.setContentAreaFilled(false);
        btnCrearPartida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_crearpartida2.png"))); // NOI18N
        btnCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, 80));

        btnUnirsePartida.setBackground(new java.awt.Color(0, 0, 0));
        btnUnirsePartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_unirsepartida1.png"))); // NOI18N
        btnUnirsePartida.setContentAreaFilled(false);
        btnUnirsePartida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_unirsepartida2.png"))); // NOI18N
        btnUnirsePartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirsePartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnUnirsePartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 170, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_menu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearPartidaActionPerformed

    private void btnUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirsePartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUnirsePartidaActionPerformed

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
			java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new menu().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPartida;
    private javax.swing.JButton btnUnirsePartida;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
