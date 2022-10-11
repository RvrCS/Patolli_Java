import dibujado.tableroCanvas;
import entidades.Juego;
import entidades.Tablero;
import java.awt.Dimension;

public class ventanaTablero extends javax.swing.JFrame {
	private tableroCanvas tbCanvas;
//	private int numCasillasAspa = 12;
//	private Juego juego;
	private static ventanaTablero singletonTablero;
	
	Tablero tablero = new Tablero();
	
        public static ventanaTablero getInstance(){
            if(singletonTablero == null)
                singletonTablero = new ventanaTablero();
            
            return singletonTablero;
           
        }
        
	public ventanaTablero() {
		initComponents();
//		this.inicializar();
	}

	
	
	protected void inicializar() {
		
		this.lbFondoApuesta.setText(Juego.getInstance().getFondoFijo()+"");
		this.lbMontoApuesta.setText(Juego.getInstance().getApuesta()+"");
		
		tbCanvas = new tableroCanvas(tablero.getCasillas(),Juego.getInstance().getNumCasillasAspa(), this.getWidth());
		tablero.setCasillas(tbCanvas.generarCasillas());
		
		Juego.getInstance().setTablero(tablero);
		
		tbCanvas.setSize(500, 400);
		Dimension dim=super.getToolkit().getScreenSize();
		tbCanvas.setLocation((int)dim.getWidth()/5, (int) dim.getHeight()/6);
		this.add(tbCanvas);
//		pintarTablero();
	} 

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

        jLabel1 = new javax.swing.JLabel();
        lbFondoApuesta = new javax.swing.JLabel();
        lbMontoApuesta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Fondo de apuesta");

        lbFondoApuesta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbFondoApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFondoApuesta.setText("0");

        lbMontoApuesta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbMontoApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMontoApuesta.setText("0");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Monto por apuesta");

        jButton1.setText("Regresar a menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mover ficha");

        jButton3.setText("Sacar ficha");

        jButton4.setText("Tirar cañas");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(508, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(334, 334, 334))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFondoApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbMontoApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFondoApuesta)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMontoApuesta)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(21, 21, 21))
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbFondoApuesta;
    private javax.swing.JLabel lbMontoApuesta;
    // End of variables declaration//GEN-END:variables
 }
