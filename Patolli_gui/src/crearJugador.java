
import entidades.Juego;
import entidades.Jugador;


public class crearJugador extends javax.swing.JFrame {
		
	private static crearJugador singeltonCJ;
	private String color;
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
        btnMorado = new javax.swing.JButton();
        btnAmarillo = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
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

        btnMorado.setBackground(new java.awt.Color(0, 0, 0));
        btnMorado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha1.png"))); // NOI18N
        btnMorado.setContentAreaFilled(false);
        btnMorado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha1_2.png"))); // NOI18N
        btnMorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoradoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnAmarillo.setBackground(new java.awt.Color(0, 0, 0));
        btnAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha2.png"))); // NOI18N
        btnAmarillo.setContentAreaFilled(false);
        btnAmarillo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha2_2.png"))); // NOI18N
        btnAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmarilloActionPerformed(evt);
            }
        });
        getContentPane().add(btnAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        btnRojo.setBackground(new java.awt.Color(0, 0, 0));
        btnRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha3.png"))); // NOI18N
        btnRojo.setContentAreaFilled(false);
        btnRojo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha3_3.png"))); // NOI18N
        btnRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRojoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        btnVerde.setBackground(new java.awt.Color(0, 0, 0));
        btnVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha4.png"))); // NOI18N
        btnVerde.setContentAreaFilled(false);
        btnVerde.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorFicha4_4.png"))); // NOI18N
        btnVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdeActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 204));
        jLabel2.setText("Selecciona el color de tu ficha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_CrearPartida2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	/**
	 *Metodo que regresa de pantalla
	 * @param evt 
	 */
    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
	this.dispose();
	menu.getInstance().setVisible(true);
		
    }//GEN-LAST:event_btn_AtrasActionPerformed

	/**
	 * Metodo que establece todos los valores puestos de la interfaz de usuario
	 * @param evt 
	 */
    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed
        
		Jugador jugador  = new Jugador();
		jugador.setNombre(this.txtNombre.getText());
		jugador.setFondo(Juego.getInstance().getFondoFijo());
		jugador.setColor(color);
		
		Juego.getInstance().addJugador(jugador);
		
		ventanaTablero.getInstance().pintarTablero();
		
<<<<<<< HEAD
//		if (Juego.getInstance().getListaJugador().size()>contador) {
//			
//			if (Juego.getInstance().getListaJugador().get(1)!=null) {
//				ventanaTablero.getInstance().jLabel4.setText(Juego.getInstance().getListaJugador().get(1).getNombre());
//				contador++;
//			}
//			if (Juego.getInstance().getListaJugador().get(2)!=null) {
//				ventanaTablero.getInstance().jLabel4.setText(Juego.getInstance().getListaJugador().get(1).getNombre());
//			}
//			if (Juego.getInstance().getListaJugador().get(3)!=null) {
//				ventanaTablero.getInstance().jLabel4.setText(Juego.getInstance().getListaJugador().get(1).getNombre());
//			}
//		}
		
=======
		ventanaTablero.getInstance().lbJugador1.setText(Juego.getInstance().getListaJugador().get(0).getNombre());
		ventanaTablero.getInstance().lbColorJg1.setText(Juego.getInstance().getListaJugador().get(0).getColor());
		
		
		if (Juego.getInstance().getListaJugador().size()>1) {
			if (Juego.getInstance().getListaJugador().get(1)!=null) {
				ventanaTablero.getInstance().lbJugador2.setText(Juego.getInstance().getListaJugador().get(1).getNombre());
				ventanaTablero.getInstance().lbColorJg2.setText(Juego.getInstance().getListaJugador().get(1).getColor());
			}
		}
		if (Juego.getInstance().getListaJugador().size()>2) {
			if (Juego.getInstance().getListaJugador().get(2)!=null) {
				ventanaTablero.getInstance().lbJugador3.setText(Juego.getInstance().getListaJugador().get(2).getNombre());
				ventanaTablero.getInstance().lbColorJg3.setText(Juego.getInstance().getListaJugador().get(2).getColor());
			}
		}
		if (Juego.getInstance().getListaJugador().size()>3) {
			if (Juego.getInstance().getListaJugador().get(3)!=null) {
				ventanaTablero.getInstance().lbJugador4.setText(Juego.getInstance().getListaJugador().get(3).getNombre());
				ventanaTablero.getInstance().lbColorJg4.setText(Juego.getInstance().getListaJugador().get(3).getColor());
			}
		}
>>>>>>> interfaz
		ventanaTablero.getInstance().setVisible(true);
		
		this.txtNombre.setText("");
		this.dispose();
		
		if (this.color.equalsIgnoreCase("morado")) {
			this.btnMorado.setVisible(false);
			this.color="";
		}
		if (this.color.equalsIgnoreCase("amarillo")) {
			this.btnAmarillo.setVisible(false);
			this.color="";
		}
		if (this.color.equalsIgnoreCase("rojo")) {
			this.btnRojo.setVisible(false);
			this.color="";
		}
		if (this.color.equalsIgnoreCase("verde")) {
			this.btnVerde.setVisible(false);
			this.color="";
		}
    }//GEN-LAST:event_btn_ConfirmarActionPerformed
	/**
	 * Metodo que establece el color del jugador
	 * @param evt 
	 */
    private void btnMoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoradoActionPerformed
		this.color = "morado";
		this.btnMorado.setSelected(true);
		this.btnAmarillo.setSelected(false);
		this.btnRojo.setSelected(false);
		this.btnVerde.setSelected(false);
    }//GEN-LAST:event_btnMoradoActionPerformed
	/**
	 * Metodo que establece el color del jugador
	 * @param evt 
	 */
    private void btnAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmarilloActionPerformed
		this.color = "amarillo";
		this.btnMorado.setSelected(false);
		this.btnAmarillo.setSelected(true);
		this.btnRojo.setSelected(false);
		this.btnVerde.setSelected(false);
    }//GEN-LAST:event_btnAmarilloActionPerformed
	/**
	 * Metodo que establece el color del jugador
	 * @param evt 
	 */
    private void btnRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRojoActionPerformed
		this.color = "rojo";
		this.btnMorado.setSelected(false);
		this.btnAmarillo.setSelected(false);
		this.btnRojo.setSelected(true);
		this.btnVerde.setSelected(false);
    }//GEN-LAST:event_btnRojoActionPerformed
	/**
	 * Metodo que establece el color del jugador
	 * @param evt 
	 */
    private void btnVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdeActionPerformed
		this.color = "verde";
		this.btnMorado.setSelected(false);
		this.btnAmarillo.setSelected(false);
		this.btnRojo.setSelected(false);
		this.btnVerde.setSelected(true);
    }//GEN-LAST:event_btnVerdeActionPerformed
	/**
	 * Metodo que regresa una instacia de la clase
	 * @return 
	 */
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
    private javax.swing.JButton btnAmarillo;
    private javax.swing.JButton btnMorado;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnVerde;
    private javax.swing.JButton btn_Atras;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
