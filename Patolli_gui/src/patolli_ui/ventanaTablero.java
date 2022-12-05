package patolli_ui;

import dibujado.tableroCanvas;
import entidades.Juego;
import entidades.Tablero;
import java.awt.Dimension;

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
	
		for (int i = 0; i < Juego.getInstance().getListaJugador().size(); i++) {
			System.out.println(Juego.getInstance().getListaJugador().get(i).getNombre());
		}
	}
   
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbMontoApuesta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbJugador1 = new javax.swing.JLabel();
        lbJugador2 = new javax.swing.JLabel();
        lbJugador3 = new javax.swing.JLabel();
        lbJugador4 = new javax.swing.JLabel();
        lbColorJg1 = new javax.swing.JLabel();
        lbColorJg2 = new javax.swing.JLabel();
        lbColorJg3 = new javax.swing.JLabel();
        lbColorJg4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        lbMontoApuesta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbMontoApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMontoApuesta.setText("0");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 153));
        jLabel2.setText("Monto por apuesta");

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_RegresarAMenu.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_RegresarAMenu2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_moverFicha.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_moverFicha2.png"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_sacarFicha.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_sacarFicha2.png"))); // NOI18N
        jButton3.setVerifyInputWhenFocusTarget(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_tirarCañas.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_tirarCañas2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbJugador1)
                        .addGap(802, 802, 802)
                        .addComponent(lbJugador3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lbColorJg1)
                        .addGap(970, 970, 970)
                        .addComponent(lbColorJg3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbJugador2)
                        .addGap(802, 802, 802)
                        .addComponent(lbJugador4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lbColorJg2)
                        .addGap(959, 959, 959)
                        .addComponent(lbColorJg4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3)
                        .addGap(6, 6, 6)
                        .addComponent(jButton2)
                        .addGap(6, 6, 6)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbMontoApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbColorJg2)
                    .addComponent(lbColorJg4))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbMontoApuesta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
	menu.getInstance().setVisible(true);
	this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
