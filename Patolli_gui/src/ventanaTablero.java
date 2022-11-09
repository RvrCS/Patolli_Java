import dibujado.tableroCanvas;
import entidades.Juego;
import entidades.Tablero;
import java.awt.Dimension;
import javax.swing.JFrame;

public class ventanaTablero extends javax.swing.JFrame {
	private tableroCanvas tbCanvas;
//	private int numCasillasAspa = 12;
	private Juego juego;
	
	
	Tablero tablero = new Tablero();
	
	public ventanaTablero() {
		initComponents();
//		this.inicializar();
	}
//
//	public int getNumCasillasAspa() {
//		return numCasillasAspa;
//	}
//
//	public void setNumCasillasAspa(int numCasillasAspa) {
//		this.numCasillasAspa = numCasillasAspa;
//	}
	
	protected void adaptarPantalla(){
		Dimension dim=super.getToolkit().getScreenSize();
		this.setSize(dim);
	}
	
	private void extenderPantalla() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	protected void inicializar(Juego juego) {
//		adaptarPantalla();
//		extenderPantalla();
		this.juego = new Juego();
		
		this.juego.setApuesta(juego.getApuesta());
		this.juego.setFondoFijo(juego.getFondoFijo());
		this.juego.setNumCasillasAspa(juego.getNumCasillasAspa());
		
		this.lbFondoApuesta.setText(this.juego.getFondoFijo()+"");
		this.lbMontoApuesta.setText(this.juego.getApuesta()+"");
		
		tbCanvas = new tableroCanvas(tablero.getCasillas(), this.juego.getNumCasillasAspa(), this.getWidth());
		tablero.setCasillas(tbCanvas.generarCasillas());
		
		tbCanvas.setSize(500, 400);
		Dimension dim=super.getToolkit().getScreenSize();
		tbCanvas.setLocation((int)dim.getWidth()/5, (int) dim.getHeight()/6);
		
		this.add(tbCanvas);
		pintarTablero();
	} 

	private void pintarTablero() {
		tbCanvas.setCasillas(tablero.getCasillas());
		this.repaint();
	}
   
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbFondoApuesta = new javax.swing.JLabel();
        lbMontoApuesta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("Fondo de apuesta");

        lbFondoApuesta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbFondoApuesta.setForeground(new java.awt.Color(255, 0, 204));
        lbFondoApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFondoApuesta.setText("0");

        lbMontoApuesta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbMontoApuesta.setForeground(new java.awt.Color(204, 0, 204));
        lbMontoApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMontoApuesta.setText("0");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("Monto por apuesta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFondoApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMontoApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1024, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFondoApuesta)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMontoApuesta)
                .addContainerGap(552, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbFondoApuesta;
    private javax.swing.JLabel lbMontoApuesta;
    // End of variables declaration//GEN-END:variables
 }
