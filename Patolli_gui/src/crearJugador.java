
import entidades.Juego;
import entidades.Jugador;


public class crearJugador extends javax.swing.JFrame {
    
	private static crearJugador singeltonCJ;
	
        crearPartida cP = new crearPartida();
	public crearJugador() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Atras = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btn_Confirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Atras.setBackground(new java.awt.Color(0, 0, 0));
        btn_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_Atrass.png"))); // NOI18N
        btn_Atras.setContentAreaFilled(false);
        btn_Atras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-atras--2.png"))); // NOI18N
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 0, 153));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 170, 30));

        btn_Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_Confirmar.png"))); // NOI18N
        btn_Confirmar.setContentAreaFilled(false);
        btn_Confirmar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_Confirmar_2.png"))); // NOI18N
        btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha1.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha2.png"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.setContentAreaFilled(false);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha3.png"))); // NOI18N
        jButton4.setText("jButton4");
        jButton4.setContentAreaFilled(false);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha4.png"))); // NOI18N
        jButton5.setText("jButton5");
        jButton5.setContentAreaFilled(false);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 204));
        jLabel2.setText("Selecciona el color de tu ficha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_CrearPartida2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed
        // TODO add your handling code here:
		int contador= 0;
		
		Jugador jugador  = new Jugador();
		jugador.setNombre(this.txtNombre.getText());
		jugador.setFondo(Juego.getInstance().getFondoFijo());
		
		Juego.getInstance().addJugador(jugador);
		
		ventanaTablero.getInstance().pintarTablero();
		ventanaTablero.getInstance().jLabel3.setText(Juego.getInstance().getListaJugador().get(0).getNombre());

		
		if (Juego.getInstance().getListaJugador().size()>contador) {
			
			if (Juego.getInstance().getListaJugador().get(1)!=null) {
				ventanaTablero.getInstance().jLabel4.setText(Juego.getInstance().getListaJugador().get(1).getNombre());
				contador++;
			}
			if (Juego.getInstance().getListaJugador().get(2)!=null) {
				ventanaTablero.getInstance().jLabel4.setText(Juego.getInstance().getListaJugador().get(1).getNombre());
			}
			if (Juego.getInstance().getListaJugador().get(3)!=null) {
				ventanaTablero.getInstance().jLabel4.setText(Juego.getInstance().getListaJugador().get(1).getNombre());
			}
		}
		
		ventanaTablero.getInstance().setVisible(true);
		
		this.txtNombre.setText("");
		this.dispose();
    }//GEN-LAST:event_btn_ConfirmarActionPerformed

	public static crearJugador getInstance(){
		if (singeltonCJ == null) {
			singeltonCJ = new crearJugador();
		}
		return singeltonCJ;
	}
	
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
			java.util.logging.Logger.getLogger(crearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(crearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(crearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(crearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new crearJugador().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atras;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
