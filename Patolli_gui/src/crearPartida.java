
import entidades.Juego;
import javax.xml.bind.ParseConversionEvent;

public class crearPartida extends javax.swing.JFrame {
	menu m;
	
	Juego juego;
	
	int casilla = 12;
	int jugadores= 2;
	int fondoApuesta = 10;
	int montoApuesta = 1;
	
	public crearPartida() {
		initComponents();
		this.lbValorCasilla.setText(String.valueOf(casilla));
		this.lbNumJugador.setText(String.valueOf(jugadores));
		this.lbValorFondo.setText(String.valueOf(fondoApuesta));
		this.lbMontoApuesta.setText(String.valueOf(montoApuesta));
		this.m=m;
		this.juego = new Juego();
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfirmar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lbFondoApuesta = new javax.swing.JLabel();
        btnMasCasillas = new javax.swing.JButton();
        btnMenosCasillas = new javax.swing.JButton();
        lbValorCasilla = new javax.swing.JLabel();
        lbValorFondo = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        lbNumJugador = new javax.swing.JLabel();
        lbMontoApuesta = new javax.swing.JLabel();
        btnMenosJugador = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        btnMasJugador = new javax.swing.JButton();
        btnMenosMontoApuesta = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        btnMasMontoApuesta = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        btnMenosFondoApuesta = new javax.swing.JButton();
        btnMasFondoApuesta = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_Confirmar.png"))); // NOI18N
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_Confirmar_2.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 170, 80));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_Atrass.png"))); // NOI18N
        btnAtras.setContentAreaFilled(false);
        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-atras--2.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 80));

        lbFondoApuesta.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lbFondoApuesta.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lbFondoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        btnMasCasillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton--mas.png"))); // NOI18N
        btnMasCasillas.setContentAreaFilled(false);
        btnMasCasillas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton--mas2.png"))); // NOI18N
        btnMasCasillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasCasillasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 90));

        btnMenosCasillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn--menos.png"))); // NOI18N
        btnMenosCasillas.setContentAreaFilled(false);
        btnMenosCasillas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn--menos2.png"))); // NOI18N
        btnMenosCasillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosCasillasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 80, 90));

        lbValorCasilla.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        lbValorCasilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbValorCasilla.setText("0");
        getContentPane().add(lbValorCasilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, 40));

        lbValorFondo.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        lbValorFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbValorFondo.setText("0");
        getContentPane().add(lbValorFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, 40));

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/text_Aspas.png"))); // NOI18N
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, 40));

        lbNumJugador.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        lbNumJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNumJugador.setText("0");
        getContentPane().add(lbNumJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 150, 40));

        lbMontoApuesta.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        lbMontoApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMontoApuesta.setText("0");
        getContentPane().add(lbMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 150, 40));

        btnMenosJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn--menos.png"))); // NOI18N
        btnMenosJugador.setContentAreaFilled(false);
        btnMenosJugador.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn--menos2.png"))); // NOI18N
        btnMenosJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 80, 90));

        label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/text_Aspas.png"))); // NOI18N
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 170, -1));

        btnMasJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton--mas.png"))); // NOI18N
        btnMasJugador.setContentAreaFilled(false);
        btnMasJugador.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton--mas2.png"))); // NOI18N
        btnMasJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 80, 90));

        btnMenosMontoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn--menos.png"))); // NOI18N
        btnMenosMontoApuesta.setContentAreaFilled(false);
        btnMenosMontoApuesta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn--menos2.png"))); // NOI18N
        btnMenosMontoApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosMontoApuestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 80, 90));

        label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/text_Aspas.png"))); // NOI18N
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 170, -1));

        btnMasMontoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton--mas.png"))); // NOI18N
        btnMasMontoApuesta.setContentAreaFilled(false);
        btnMasMontoApuesta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton--mas2.png"))); // NOI18N
        btnMasMontoApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasMontoApuestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 80, 90));

        label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/text_Aspas.png"))); // NOI18N
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, -1));

        btnMenosFondoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn--menos.png"))); // NOI18N
        btnMenosFondoApuesta.setContentAreaFilled(false);
        btnMenosFondoApuesta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn--menos2.png"))); // NOI18N
        btnMenosFondoApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosFondoApuestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosFondoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 80, 90));

        btnMasFondoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton--mas.png"))); // NOI18N
        btnMasFondoApuesta.setContentAreaFilled(false);
        btnMasFondoApuesta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton--mas2.png"))); // NOI18N
        btnMasFondoApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasFondoApuestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasFondoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 90));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_CrearPartida.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        jFormattedTextField1.setText("jFormattedTextField1");
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
	this.setVisible(false);
//	ventana.setNumCasillasAspa(Integer.parseInt(this.lbValorCasilla.getText()));
	this.juego.setNumCasillasAspa(Integer.parseInt(this.lbValorCasilla.getText()));
	this.juego.setFondoFijo(Integer.parseInt(this.lbValorFondo.getText()));
	this.juego.setApuesta(Integer.parseInt(this.lbMontoApuesta.getText()));
	
        
	ventanaTablero.getInstance().inicializar(this.juego);
	ventanaTablero.getInstance().setVisible(true);
	
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
	m.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMasCasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasCasillasActionPerformed
	casillasAspasMax();
    }//GEN-LAST:event_btnMasCasillasActionPerformed

    private void btnMenosCasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosCasillasActionPerformed
	casillasAspasMin();
    }//GEN-LAST:event_btnMenosCasillasActionPerformed

    private void btnMasJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasJugadorActionPerformed
	numJugadoresMax();
    }//GEN-LAST:event_btnMasJugadorActionPerformed

    private void btnMenosJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosJugadorActionPerformed
	numJugadoresMin();
    }//GEN-LAST:event_btnMenosJugadorActionPerformed

    private void btnMasFondoApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasFondoApuestaActionPerformed
	fondoApuestaMax();
    }//GEN-LAST:event_btnMasFondoApuestaActionPerformed

    private void btnMenosFondoApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosFondoApuestaActionPerformed
	fondoApuestaMIN();
    }//GEN-LAST:event_btnMenosFondoApuestaActionPerformed

    private void btnMasMontoApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasMontoApuestaActionPerformed
	montoApuestaMax();
    }//GEN-LAST:event_btnMasMontoApuestaActionPerformed

    private void btnMenosMontoApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosMontoApuestaActionPerformed
	montoApuestaMin();
    }//GEN-LAST:event_btnMenosMontoApuestaActionPerformed

private void casillasAspasMax(){
	int CASILLASMAX = 14;
	if (this.casilla <CASILLASMAX) {
		casilla += 2;
		this.lbValorCasilla.setText(String.valueOf(casilla));
	}	
}

public void casillasAspasMin(){
	int CASILLASMIN = 10;
	if (this.casilla >CASILLASMIN) {
		casilla -= 2;
		this.lbValorCasilla.setText(String.valueOf(casilla));
	}
}

public void numJugadoresMax(){
	int JUGADORESMAX=4;
	if (this.jugadores <JUGADORESMAX) {
		jugadores += 1;
		this.lbNumJugador.setText(String.valueOf(jugadores));
	}
}

public void numJugadoresMin(){
	int JUGADORESMIN=2;
	if (this.jugadores >JUGADORESMIN) {
		jugadores -= 1;
		this.lbNumJugador.setText(String.valueOf(jugadores));
	}
}

public void fondoApuestaMax(){
	fondoApuesta+=1;
	this.lbValorFondo.setText(String.valueOf(fondoApuesta));
}
public void fondoApuestaMIN(){
	if (fondoApuesta>1) {
		fondoApuesta-=1;
		this.lbValorFondo.setText(String.valueOf(fondoApuesta));
	}
}

public void montoApuestaMax(){
	montoApuesta += 1;
	this.lbMontoApuesta.setText(String.valueOf(montoApuesta));
}

public void montoApuestaMin(){
	if (montoApuesta > 1) {
		montoApuesta -= 1;
		this.lbMontoApuesta.setText(String.valueOf(montoApuesta));
	}
}
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnMasCasillas;
    private javax.swing.JButton btnMasFondoApuesta;
    private javax.swing.JButton btnMasJugador;
    private javax.swing.JButton btnMasMontoApuesta;
    private javax.swing.JButton btnMenosCasillas;
    private javax.swing.JButton btnMenosFondoApuesta;
    private javax.swing.JButton btnMenosJugador;
    private javax.swing.JButton btnMenosMontoApuesta;
    private javax.swing.JLabel fondo;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel lbFondoApuesta;
    private javax.swing.JLabel lbMontoApuesta;
    private javax.swing.JLabel lbNumJugador;
    private javax.swing.JLabel lbValorCasilla;
    private javax.swing.JLabel lbValorFondo;
    // End of variables declaration//GEN-END:variables
}
