package patolli_ui;

import dibujado.tableroCanvas;
import elements.blackboard;
import elements.controlBlackboard;
import entidades.Juego;
import entidades.Tablero;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class ventanaTablero extends javax.swing.JFrame {
	private tableroCanvas tbCanvas;
	private static ventanaTablero singletonTablero;
        
	Tablero tablero = new Tablero();
	
        public static ventanaTablero getInstance(){
            if(singletonTablero == null)
                singletonTablero = new ventanaTablero();
            
            return singletonTablero;
           
        }
        
	public ventanaTablero() {
		initComponents();
	}

	
	/**
	 * Metodo que inicializa el tablero estableciando medidas y generando las casillas
	 */
	public void inicializar() {
		
		this.lbMontoApuesta.setText(Juego.getInstance().getApuesta()+"");
		
		tbCanvas = new tableroCanvas(tablero.getCasillas(),Juego.getInstance().getNumCasillasAspa(), this.getWidth());
		tablero.setCasillas(tbCanvas.generarCasillas());
		
		Juego.getInstance().setTablero(tablero);
		
		tbCanvas.setSize(600, 500);
		Dimension dim = super.getToolkit().getScreenSize();
                System.out.println(dim.getWidth()+""+ dim.getHeight());
		tbCanvas.setLocation((int)dim.getWidth()/5, (int) dim.getHeight()/9);
		this.add(tbCanvas);
	} 
	/**
	 * Metodo que dibuja el tablero
	 */
	public void pintarTablero() {
		tbCanvas.setCasillas(Juego.getInstance().getTablero().getCasillas());
		this.repaint();
	
//		for (int i = 0; i < Juego.getInstance().getListaJugador().size(); i++) {
//			System.out.println(Juego.getInstance().getListaJugador().get(i).getNombre());
//		}
	}
   
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbMontoApuesta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegresas = new javax.swing.JButton();
        btnMoverFicha = new javax.swing.JButton();
        btnSacarFicha = new javax.swing.JButton();
        btnTirarCania = new javax.swing.JButton();
        lbJugador1 = new javax.swing.JLabel();
        lbJugador2 = new javax.swing.JLabel();
        lbJugador3 = new javax.swing.JLabel();
        lbJugador4 = new javax.swing.JLabel();
        lbColorJg1 = new javax.swing.JLabel();
        lbColorJg2 = new javax.swing.JLabel();
        lbColorJg3 = new javax.swing.JLabel();
        lbColorJg4 = new javax.swing.JLabel();
        btnEmepzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        lbMontoApuesta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbMontoApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMontoApuesta.setText("0");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 153));
        jLabel2.setText("Monto por apuesta");

        btnRegresas.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_RegresarAMenu.png"))); // NOI18N
        btnRegresas.setContentAreaFilled(false);
        btnRegresas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_RegresarAMenu2.png"))); // NOI18N
        btnRegresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresasActionPerformed(evt);
            }
        });

        btnMoverFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_moverFicha.png"))); // NOI18N
        btnMoverFicha.setContentAreaFilled(false);
        btnMoverFicha.setEnabled(false);
        btnMoverFicha.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_moverFicha2.png"))); // NOI18N
        btnMoverFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverFichaActionPerformed(evt);
            }
        });

        btnSacarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_sacarFicha.png"))); // NOI18N
        btnSacarFicha.setContentAreaFilled(false);
        btnSacarFicha.setEnabled(false);
        btnSacarFicha.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_sacarFicha2.png"))); // NOI18N
        btnSacarFicha.setVerifyInputWhenFocusTarget(false);
        btnSacarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarFichaActionPerformed(evt);
            }
        });

        btnTirarCania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_tirarCañas.png"))); // NOI18N
        btnTirarCania.setContentAreaFilled(false);
        btnTirarCania.setEnabled(false);
        btnTirarCania.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_tirarCañas2.png"))); // NOI18N
        btnTirarCania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarCaniaActionPerformed(evt);
            }
        });

        lbJugador1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbJugador1.setForeground(new java.awt.Color(204, 0, 153));
        lbJugador1.setText("Esperando jugador");

        lbJugador2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbJugador2.setForeground(new java.awt.Color(204, 0, 153));
        lbJugador2.setText("Esperando jugador");

        lbJugador3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbJugador3.setForeground(new java.awt.Color(204, 0, 153));
        lbJugador3.setText("Esperando jugador");

        lbJugador4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbJugador4.setForeground(new java.awt.Color(204, 0, 153));
        lbJugador4.setText("Esperando jugador");

        lbColorJg1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbColorJg1.setForeground(new java.awt.Color(204, 0, 153));
        lbColorJg1.setText("Color");

        lbColorJg2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbColorJg2.setForeground(new java.awt.Color(204, 0, 153));
        lbColorJg2.setText("Color");

        lbColorJg3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbColorJg3.setForeground(new java.awt.Color(204, 0, 153));
        lbColorJg3.setText("Color");

        lbColorJg4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbColorJg4.setForeground(new java.awt.Color(204, 0, 204));
        lbColorJg4.setText("Color");

        btnEmepzar.setText("Empezar");
        btnEmepzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmepzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(btnRegresas)
                        .addGap(12, 12, 12)
                        .addComponent(btnSacarFicha)
                        .addGap(6, 6, 6)
                        .addComponent(btnMoverFicha)
                        .addGap(6, 6, 6)
                        .addComponent(btnTirarCania)
                        .addGap(54, 54, 54)
                        .addComponent(btnEmepzar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbMontoApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbJugador1)
                            .addComponent(lbColorJg1))
                        .addGap(802, 802, 802)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbColorJg3)
                            .addComponent(lbJugador3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbJugador2)
                            .addComponent(lbColorJg2))
                        .addGap(802, 802, 802)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbColorJg4)
                            .addComponent(lbJugador4))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJugador1)
                    .addComponent(lbJugador3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbColorJg1)
                    .addComponent(lbColorJg3))
                .addGap(340, 340, 340)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJugador2)
                    .addComponent(lbJugador4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbColorJg2)
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbMontoApuesta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresas)
                            .addComponent(btnSacarFicha)
                            .addComponent(btnMoverFicha)
                            .addComponent(btnTirarCania)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbColorJg4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmepzar)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresasActionPerformed
        // TODO add your handling code here:
	menu.getInstance().setVisible(true);
	this.dispose();
    }//GEN-LAST:event_btnRegresasActionPerformed

    private void btnTirarCaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarCaniaActionPerformed
        controlBlackboard.getInstance().getFuente("tirarCania", null);
        if (blackboard.juego.getValorUltTiro()>0) {
            this.btnMoverFicha.setEnabled(true);
            this.btnSacarFicha.setEnabled(true);
            this.btnTirarCania.setEnabled(false);
        }else{
            controlBlackboard.getInstance().getFuente("cambiarTurno", null);
        }
    }//GEN-LAST:event_btnTirarCaniaActionPerformed

    private void btnMoverFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverFichaActionPerformed
        if (blackboard.juego.getValorUltTiro() > 0) {
            controlBlackboard.getInstance().getFuente("moverFicha", null);
            this.btnTirarCania.setEnabled(true);
        }
    }//GEN-LAST:event_btnMoverFichaActionPerformed

    private void btnEmepzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmepzarActionPerformed
        if (blackboard.juego.getListaJugador().size()> 1) {
            controlBlackboard.getInstance().getFuente("empezarJuego", null);
            if (blackboard.juego.getpIniciada()) {
                this.btnTirarCania.setEnabled(true);
                this.btnEmepzar.setEnabled(false);
                this.btnEmepzar.setVisible(false);
                this.btnRegresas.setEnabled(false);
                this.btnRegresas.setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Jugadores insuficientes");
        }
    }//GEN-LAST:event_btnEmepzarActionPerformed

    private void btnSacarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarFichaActionPerformed
        if (blackboard.juego.getValorUltTiro() > 0) {
            controlBlackboard.getInstance().getFuente("sacarFicha", null);
            this.btnTirarCania.setEnabled(true);
        } 
    }//GEN-LAST:event_btnSacarFichaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmepzar;
    private javax.swing.JButton btnMoverFicha;
    private javax.swing.JButton btnRegresas;
    private javax.swing.JButton btnSacarFicha;
    private javax.swing.JButton btnTirarCania;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lbColorJg1;
    public javax.swing.JLabel lbColorJg2;
    public javax.swing.JLabel lbColorJg3;
    public javax.swing.JLabel lbColorJg4;
    public javax.swing.JLabel lbJugador1;
    public javax.swing.JLabel lbJugador2;
    public javax.swing.JLabel lbJugador3;
    public javax.swing.JLabel lbJugador4;
    private javax.swing.JLabel lbMontoApuesta;
    // End of variables declaration//GEN-END:variables
 }
