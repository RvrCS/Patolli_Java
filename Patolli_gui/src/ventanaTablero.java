

import DibujoTablero.tableroCanvas;
import entidades.Tablero;
import javax.swing.JFrame;

public class ventanaTablero extends javax.swing.JFrame {
	private tableroCanvas tbCanvas;
	private int numCasillasAspa = 14;
	Tablero tablero = new Tablero();
	
	public ventanaTablero() {
		initComponents();
		this.inicializar();
	}
	
	protected void adaptarPantalla(){
		int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), this.getWidth(),this.getHeight() );
	}
	
	private void extenderPantalla() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	private void inicializar() {
		//adaptarPantalla();
		//extenderPantalla();
		
		tbCanvas = new tableroCanvas(tablero.getCasillas(), this.numCasillasAspa, this.getSize().width);
		tablero.setCasillas(tbCanvas.generarCasillas());
		tbCanvas.setSize(this.getWidth(), this.numCasillasAspa * 50 + (50 * 5));
		tbCanvas.setLocation(325, 100);
		
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
 }
