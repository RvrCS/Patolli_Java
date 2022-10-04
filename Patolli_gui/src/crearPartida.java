
import javax.xml.bind.ParseConversionEvent;

public class crearPartida extends javax.swing.JFrame {
	menu m;
	ventanaTablero ventana;
	public crearPartida(menu m) {
		initComponents();
		this.m=m;
		ventana = new ventanaTablero();
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfirmar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lbCasilla = new javax.swing.JLabel();
        lbFondoApuesta = new javax.swing.JLabel();
        lblNumeroJugador = new javax.swing.JLabel();
        lbMontoApuesta = new javax.swing.JLabel();
        btnMasCasillas = new javax.swing.JButton();
        btnMenosCasillas = new javax.swing.JButton();
        lbNumeroCasillas = new javax.swing.JLabel();
        btnMenosJugador = new javax.swing.JButton();
        lbNumeroJugador = new javax.swing.JLabel();
        btnMasJugador = new javax.swing.JButton();
        btnMenosMontoApuesta = new javax.swing.JButton();
        lbNumeroMontoApuesta = new javax.swing.JLabel();
        btnMasMontoApuesta = new javax.swing.JButton();
        lbNumeroFondoApuesta = new javax.swing.JLabel();
        btnMenosFondoApuesta = new javax.swing.JButton();
        btnMasFondoApuesta = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_confirmar1.png"))); // NOI18N
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_confirmar2.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 80));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_atras1.png"))); // NOI18N
        btnAtras.setContentAreaFilled(false);
        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_atras2.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 170, 80));

        lbCasilla.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lbCasilla.setForeground(new java.awt.Color(255, 255, 0));
        lbCasilla.setText("0");
        getContentPane().add(lbCasilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        lbFondoApuesta.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lbFondoApuesta.setForeground(new java.awt.Color(255, 255, 0));
        lbFondoApuesta.setText("0");
        getContentPane().add(lbFondoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        lblNumeroJugador.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblNumeroJugador.setForeground(new java.awt.Color(255, 255, 0));
        lblNumeroJugador.setText("0");
        getContentPane().add(lblNumeroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        lbMontoApuesta.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lbMontoApuesta.setForeground(new java.awt.Color(255, 255, 0));
        lbMontoApuesta.setText("0");
        getContentPane().add(lbMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        btnMasCasillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_mas1.png"))); // NOI18N
        btnMasCasillas.setContentAreaFilled(false);
        btnMasCasillas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_mas2.png"))); // NOI18N
        btnMasCasillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasCasillasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 80, 90));

        btnMenosCasillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_menos1.png"))); // NOI18N
        btnMenosCasillas.setContentAreaFilled(false);
        btnMenosCasillas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_menos2.png"))); // NOI18N
        getContentPane().add(btnMenosCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 80, 90));

        lbNumeroCasillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/texto_dato.png"))); // NOI18N
        getContentPane().add(lbNumeroCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, -1));

        btnMenosJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_menos1.png"))); // NOI18N
        btnMenosJugador.setContentAreaFilled(false);
        btnMenosJugador.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_menos2.png"))); // NOI18N
        getContentPane().add(btnMenosJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 80, 90));

        lbNumeroJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/texto_dato.png"))); // NOI18N
        getContentPane().add(lbNumeroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 170, -1));

        btnMasJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_mas1.png"))); // NOI18N
        btnMasJugador.setContentAreaFilled(false);
        btnMasJugador.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_mas2.png"))); // NOI18N
        getContentPane().add(btnMasJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 80, 90));

        btnMenosMontoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_menos1.png"))); // NOI18N
        btnMenosMontoApuesta.setContentAreaFilled(false);
        btnMenosMontoApuesta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_menos2.png"))); // NOI18N
        getContentPane().add(btnMenosMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 80, 90));

        lbNumeroMontoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/texto_dato.png"))); // NOI18N
        getContentPane().add(lbNumeroMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 170, -1));

        btnMasMontoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_mas1.png"))); // NOI18N
        btnMasMontoApuesta.setContentAreaFilled(false);
        btnMasMontoApuesta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_mas2.png"))); // NOI18N
        getContentPane().add(btnMasMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 80, 90));

        lbNumeroFondoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/texto_dato.png"))); // NOI18N
        getContentPane().add(lbNumeroFondoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 170, -1));

        btnMenosFondoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_menos1.png"))); // NOI18N
        btnMenosFondoApuesta.setContentAreaFilled(false);
        btnMenosFondoApuesta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_menos2.png"))); // NOI18N
        getContentPane().add(btnMenosFondoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 80, 90));

        btnMasFondoApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_mas1.png"))); // NOI18N
        btnMasFondoApuesta.setContentAreaFilled(false);
        btnMasFondoApuesta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_mas2.png"))); // NOI18N
        getContentPane().add(btnMasFondoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 80, 90));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_crear_partida.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
		ventana.setVisible(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
		m.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMasCasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasCasillasActionPerformed
		
    }//GEN-LAST:event_btnMasCasillasActionPerformed


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
    private javax.swing.JLabel lbCasilla;
    private javax.swing.JLabel lbFondoApuesta;
    private javax.swing.JLabel lbMontoApuesta;
    private javax.swing.JLabel lbNumeroCasillas;
    private javax.swing.JLabel lbNumeroFondoApuesta;
    private javax.swing.JLabel lbNumeroJugador;
    private javax.swing.JLabel lbNumeroMontoApuesta;
    private javax.swing.JLabel lblNumeroJugador;
    // End of variables declaration//GEN-END:variables
}
