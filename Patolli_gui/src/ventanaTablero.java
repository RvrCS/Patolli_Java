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
		this.lbFondoApuestaJg1.setText(Juego.getInstance().getFondoFijo()+"");
		this.lbFondoApuestaJg2.setText(Juego.getInstance().getFondoFijo()+"");
		this.lbFondoApuestaJg3.setText(Juego.getInstance().getFondoFijo()+"");
		this.lbFondoApuestaJg4.setText(Juego.getInstance().getFondoFijo()+"");
		
		tbCanvas = new tableroCanvas(tablero.getCasillas(),Juego.getInstance().getNumCasillasAspa(), this.getWidth());
		tablero.setCasillas(tbCanvas.generarCasillas());
		
		Juego.getInstance().setTablero(tablero);
		
		tbCanvas.setSize(500, 400);
		Dimension dim=super.getToolkit().getScreenSize();
		tbCanvas.setLocation((int)dim.getWidth()/5, (int) dim.getHeight()/6);
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
        fondoApuestaJugador1 = new javax.swing.JLabel();
        lbFondoApuestaJg1 = new javax.swing.JLabel();
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
        fondoApuestaJugador2 = new javax.swing.JLabel();
        lbFondoApuestaJg2 = new javax.swing.JLabel();
        lbColorJg2 = new javax.swing.JLabel();
        fondoApuestaJugador3 = new javax.swing.JLabel();
        lbFondoApuestaJg3 = new javax.swing.JLabel();
        lbColorJg3 = new javax.swing.JLabel();
        fondoApuestaJugador4 = new javax.swing.JLabel();
        lbFondoApuestaJg4 = new javax.swing.JLabel();
        lbColorJg4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        fondoApuestaJugador1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fondoApuestaJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoDeApuesta.png"))); // NOI18N

        lbFondoApuestaJg1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbFondoApuestaJg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFondoApuestaJg1.setText("0");

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

        fondoApuestaJugador2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fondoApuestaJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoDeApuesta.png"))); // NOI18N

        lbFondoApuestaJg2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbFondoApuestaJg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFondoApuestaJg2.setText("0");

        lbColorJg2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbColorJg2.setForeground(new java.awt.Color(204, 0, 153));
        lbColorJg2.setText("Color");

        fondoApuestaJugador3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fondoApuestaJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoDeApuesta.png"))); // NOI18N

        lbFondoApuestaJg3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbFondoApuestaJg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFondoApuestaJg3.setText("0");

        lbColorJg3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbColorJg3.setForeground(new java.awt.Color(204, 0, 153));
        lbColorJg3.setText("Color");

        fondoApuestaJugador4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fondoApuestaJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoDeApuesta.png"))); // NOI18N

        lbFondoApuestaJg4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbFondoApuestaJg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFondoApuestaJg4.setText("0");

        lbColorJg4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbColorJg4.setForeground(new java.awt.Color(204, 0, 204));
        lbColorJg4.setText("Color");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 890, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(357, 357, 357))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbMontoApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGap(286, 286, 286)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fondoApuestaJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbFondoApuestaJg4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbJugador4))
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lbColorJg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbColorJg3)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lbColorJg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbColorJg4)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbJugador2)
                        .addGap(103, 1536, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(fondoApuestaJugador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fondoApuestaJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFondoApuestaJg1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fondoApuestaJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbFondoApuestaJg2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbFondoApuestaJg3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbJugador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbJugador3)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJugador3)
                    .addComponent(lbJugador1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbColorJg1)
                    .addComponent(lbColorJg3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fondoApuestaJugador1)
                            .addComponent(fondoApuestaJugador3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFondoApuestaJg1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(lbFondoApuestaJg3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 699, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJugador2)
                    .addComponent(lbJugador4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbColorJg4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbColorJg2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fondoApuestaJugador4)
                        .addGap(2, 2, 2)
                        .addComponent(lbFondoApuestaJg4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fondoApuestaJugador2)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFondoApuestaJg2)
                            .addComponent(lbMontoApuesta))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
	menu.getInstance().setVisible(true);
	this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fondoApuestaJugador1;
    private javax.swing.JLabel fondoApuestaJugador2;
    private javax.swing.JLabel fondoApuestaJugador3;
    private javax.swing.JLabel fondoApuestaJugador4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lbColorJg1;
    public javax.swing.JLabel lbColorJg2;
    public javax.swing.JLabel lbColorJg3;
    public javax.swing.JLabel lbColorJg4;
    public javax.swing.JLabel lbFondoApuestaJg1;
    public javax.swing.JLabel lbFondoApuestaJg2;
    public javax.swing.JLabel lbFondoApuestaJg3;
    public javax.swing.JLabel lbFondoApuestaJg4;
    public javax.swing.JLabel lbJugador1;
    public javax.swing.JLabel lbJugador2;
    public javax.swing.JLabel lbJugador3;
    public javax.swing.JLabel lbJugador4;
    private javax.swing.JLabel lbMontoApuesta;
    // End of variables declaration//GEN-END:variables
 }
