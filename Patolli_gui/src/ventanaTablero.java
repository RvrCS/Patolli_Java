import dibujado.tableroCanvas;
import entidades.Tablero;
import java.awt.Dimension;
import javax.swing.JFrame;

public class ventanaTablero extends javax.swing.JFrame {
	private tableroCanvas tbCanvas;
	private int numCasillasAspa = 10;
	
	Tablero tablero = new Tablero();
	
	public ventanaTablero() {
		initComponents();
		this.inicializar();
	}
	
	protected void adaptarPantalla(){
		Dimension dim=super.getToolkit().getScreenSize();
		this.setSize(dim);
	}
	
	private void extenderPantalla() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	private void inicializar() {
//		adaptarPantalla();
//		extenderPantalla();
		
		tbCanvas = new tableroCanvas(tablero.getCasillas(), this.numCasillasAspa, 1000);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
 }
