/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package patricio;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author miiky
 */
public class Screen extends javax.swing.JFrame {

    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        int x = 0;
        int y = 0;
        int xs = 3;
        int ys = 3;
        
        Color pink = new Color(246, 164, 166);
        Color bpink = new Color(242, 95, 69);
        Color magenta = new Color(170, 137, 189);
        Color bmagenta = new Color(96, 105, 176);
        Color green = new Color(210, 220, 34);
        
        g2.setStroke(new BasicStroke(2));
        
        
        g.setColor(pink);
        
        int[] lax = {4*xs+x, 10*xs+x, 26*xs+x, 41*xs+x, 58*xs+x, 40*xs+x, 30*xs+x, 20*xs+x, 10*xs+x, 5*xs+x};
        int[] lay = {90*ys+y, 99*ys+y, 116*ys+y, 130*ys+y, 106*ys+y, 97*ys+y, 91*ys+y, 85*ys+y, 80*ys+y, 82*ys+y};
        g.fillPolygon(lax, lay, 10);
        g.setColor(bpink);
        g.drawPolygon(lax, lay, 10);
        
        int[] llx = {45*xs+x, 48*xs+x, 51*xs+x, 56*xs+x, 64*xs+x, 68*xs+x};
        int[] lly = {195*ys+y, 218*ys+y, 221*ys+y, 220*ys+y, 213*ys+y, 203*ys+y};
        int[] rlx = {93*xs+x, 93*xs+x, 95*xs+x, 99*xs+x, 106*xs+x, 110*xs+x, 115*xs+x};
        int[] rly = {201*ys+y, 208*ys+y, 218*ys+y, 223*ys+y, 224*ys+y, 215*ys+y, 198*ys+y};
        g.setColor(pink);
        g.fillPolygon(llx, lly, 6);
        g.fillPolygon(rlx, rly, 7);
        g.setColor(bpink);
        g.drawPolygon(llx, lly, 6);
        g.drawPolygon(rlx, rly, 7);
        
        g.setColor(pink);
        // poligono de 37 lados   
        int[] bx = {40*xs+x, 52*xs+x, 63*xs+x, 74*xs+x, 87*xs+x, 102*xs+x, 113*xs+x, 125*xs+x, 136*xs+x, 135*xs+x, 132*xs+x, 118*xs+x, 116*xs+x, 113*xs+x, 111*xs+x, 110*xs+x, 109*xs+x, 110*xs+x, 112*xs+x, 117*xs+x, 120*xs+x, 118*xs+x, 110*xs+x, 105*xs+x, 92*xs+x, 85*xs+x, 76*xs+x, 70*xs+x, 63*xs+x, 57*xs+x, 53*xs+x, 47*xs+x, 44*xs+x, 41*xs+x, 40*xs+x, 39*xs+x, 38*xs+x};
        int[] by = {152*ys+y, 155*ys+y, 157*ys+y, 159*ys+y, 160*ys+y, 160*ys+y, 159*ys+y, 157*ys+y, 155*ys+y,146*ys+y, 137*ys+y, 108*ys+y, 104*ys+y, 93*ys+y, 80*ys+y, 70*ys+y, 60*ys+y, 52*ys+y, 43*ys+y, 37*ys+y, 33*ys+y, 31*ys+y, 30*ys+y, 32*ys+y, 42*ys+y, 49*ys+y, 67*ys+y, 85*ys+y, 97*ys+y, 105*ys+y, 113*ys+y, 120*ys+y, 126*ys+y, 130*ys+y, 136*ys+y, 141*ys+y, 145*ys+y};
        g.fillPolygon(bx, by, 37);
        g.setColor(bpink);
        g.drawPolygon(bx, by, 37);
        g.setColor(pink);
        int[] rax = {114*xs+x, 117*xs+x, 129*xs+x, 141*xs+x, 153*xs+x, 160*xs+x, 165*xs+x, 167*xs+x, 170*xs+x, 167*xs+x, 162*xs+x, 150*xs+x, 140*xs+x, 132*xs+x, 125*xs+x};
        int[] ray = {112*ys+y, 108*ys+y, 99*ys+y, 90*ys+y, 83*ys+y, 79*ys+y, 77*ys+y, 78*ys+y, 80*ys+y, 85*ys+y, 95*ys+y, 113*ys+y, 127*ys+y, 136*ys+y, 143*ys+y};
        g.fillPolygon(rax, ray, 15);
        g.setColor(bpink);
        g.drawPolygon(rax, ray, 15);
        g.setColor(pink);
        int[] ralx = {114*xs+x, 125*xs+x};
        int[] raly = {112*ys+y, 143*ys+y};
        g.drawPolygon(ralx, raly, 2);
        
        g.setColor(green);
        int[] lsx = {45*xs+x, 45*xs+x, 41*xs+x, 50*xs+x, 61*xs+x, 69*xs+x, 72*xs+x, 73*xs+x};
        int[] rsx = {180*ys+y, 187*ys+y, 197*ys+y, 201*ys+y, 204*ys+y, 203*ys+y, 196*ys+y, 190*ys+y};
        g.fillPolygon(lsx, rsx, 8);
        g.setColor(Color.BLACK);
        g.drawPolygon(lsx, rsx, 8);
        
        g.setColor(green);
        int[] bbx = {40*xs+x, 52*xs+x, 63*xs+x, 74*xs+x, 87*xs+x, 102*xs+x, 113*xs+x, 125*xs+x, 136*xs+x, 136*xs+x, 134*xs+x, 132*xs+x, 129*xs+x, 126*xs+x, 120*xs+x, 120*xs+x, 113*xs+x, 105*xs+x, 98*xs+x, 86*xs+x, 87*xs+x, 72*xs+x, 63*xs+x, 55*xs+x, 47*xs+x, 42*xs+x, 39*xs+x, 37*xs+x, 39*xs+x};
        int[] bby = {152*ys+y, 155*ys+y, 157*ys+y, 159*ys+y, 160*ys+y, 160*ys+y, 159*ys+y, 157*ys+y, 155*ys+y, 159*ys+y, 167*ys+y, 174*ys+y, 182*ys+y, 187*ys+y, 192*ys+y, 201*ys+y, 203*ys+y, 205*ys+y, 206*ys+y, 204*ys+y, 198*ys+y, 196*ys+y, 194*ys+y, 190*ys+y, 185*ys+y, 178*ys+y, 173*ys+y, 165*ys+y, 155*ys+y};
        g.fillPolygon(bbx, bby, 29);
        
        
        g.setColor(magenta);
        int[] lfx = {80*xs+x, 70*xs+x, 66*xs+x, 47*xs+x, 46*xs+x, 48*xs+x, 53*xs+x, 55*xs+x, 52*xs+x, 57*xs+x, 64*xs+x, 63*xs+x, 65*xs+x, 66*xs+x, 70*xs+x, 76*xs+x };
        int[] lfy = {164*ys+y, 163*ys+y, 162*ys+y, 158*ys+y, 165*ys+y, 170*ys+y, 165*ys+y, 166*ys+y, 173*ys+y, 176*ys+y, 175*ys+y, 169*ys+y, 168*ys+y, 172*ys+y, 174*ys+y, 172*ys+y};
        g.fillPolygon(lfx, lfy, 16);
        g.setColor(bmagenta);
        g.drawPolygon(lfx, lfy, 16);
        
        g.setColor(magenta);
        int[] rfx = {129*xs+x, 126*xs+x, 120*xs+x, 120*xs+x, 113*xs+x, 105*xs+x, 98*xs+x, 99*xs+x, 103*xs+x, 105*xs+x, 111*xs+x, 113*xs+x, 110*xs+x, 108*xs+x, 115*xs+x, 123*xs+x};
        int[] rfy = {182*ys+y, 187*ys+y, 192*ys+y, 201*ys+y, 203*ys+y, 205*ys+y, 206*ys+y, 198*ys+y, 191*ys+y, 193*ys+y, 194*ys+y, 192*ys+y, 189*ys+y, 185*ys+y, 182*ys+y, 181*ys+y};
        g.fillPolygon(rfx, rfy, 16);
        g.setColor(bmagenta);
        g.drawPolygon(rfx, rfy, 16);
        
        g.setColor(Color.BLACK);
        g.drawPolygon(bbx, bby, 29);
        int[] cx = {40*xs+x, 52*xs+x, 63*xs+x, 74*xs+x, 87*xs+x, 102*xs+x, 113*xs+x, 125*xs+x, 136*xs+x, 136*xs+x, 125*xs+x, 113*xs+x, 102*xs+x, 87*xs+x, 80*xs+x, 70*xs+x, 66*xs+x, 47*xs+x, 39*xs+x};
        int[] cy = {152*ys+y, 155*ys+y, 157*ys+y, 159*ys+y, 160*ys+y, 160*ys+y, 159*ys+y, 157*ys+y, 155*ys+y, 159*ys+y, 161*ys+y, 163*ys+y, 164*ys+y, 164*ys+y, 164*ys+y, 163*ys+y, 162*ys+y, 158*ys+y, 155*ys+y};
        g.drawPolygon(cx, cy, 19);
        
        g.setColor(bpink);
        g.drawArc(65*xs+x, 141*ys+y, 15*xs+x, 15*ys+y, 170, 190);
        g.drawArc(69*xs+x, 147*ys+y, 5*xs+x, 5*ys+y, 180, 180);
        
        g.setColor(Color.WHITE);
        g.fillOval(69*xs+x, 67*ys+y, 20*xs+x, 25*ys+y);
        g.setColor(Color.BLACK);
        g.drawOval(69*xs+x, 67*ys+y, 20*xs+x, 25*ys+y);
        g.setColor(Color.WHITE);
        g.fillOval(83*xs+x, 67*ys+y, 20*xs+x, 25*ys+y);
        g.setColor(Color.BLACK);
        g.drawOval(83*xs+x, 67*ys+y, 20*xs+x, 25*ys+y);
        g.fillOval(77*xs+x, 76*ys+y, 4*xs+x, 6*ys+y);
        g.fillOval(89*xs+x, 76*ys+y, 4*xs+x, 6*ys+y);
        
        g.setColor(new Color(103, 44, 49));
        int[] mx = {75*xs+x, 74*xs+x, 71*xs+x, 69*xs+x, 71*xs+x, 75*xs+x, 81*xs+x, 90*xs+x, 96*xs+x, 100*xs+x, 103*xs+x, 103*xs+x, 97*xs+x, 91*xs+x, 83*xs+x};
        int[] my = {100*ys+y, 105*ys+y, 112*ys+y, 116*ys+y, 117*ys+y, 118*ys+y, 119*ys+y, 118*ys+y, 112*ys+y, 105*ys+y, 100*ys+y, 97*ys+y, 99*ys+y, 100*ys+y, 101*ys+y};
        g.fillPolygon(mx, my, 15);
        
        g.setColor(pink);
        int[] tx = {71*xs+x, 75*xs+x, 81*xs+x, 90*xs+x, 96*xs+x, 95*xs+x, 90*xs+x, 87*xs+x, 84*xs+x, 80*xs+x, 76*xs+x};
        int[] ty = {117*ys+y, 118*ys+y, 119*ys+y, 118*ys+y, 112*ys+y, 109*ys+y, 109*ys+y, 110*ys+y, 108*ys+y, 109*ys+y, 113*ys+y};
        g.fillPolygon(tx, ty, 10);
        g.setColor(Color.black);
        g.drawPolygon(tx, ty, 10);
        g.setColor(Color.black);
        g.drawPolygon(mx, my, 15);
        int[] mlsx = {75*xs+x, 71*xs+x};
        int[] mlsy = {100*ys+y, 99*ys+y};
        g.drawPolygon(mlsx, mlsy, 2);
        int[] mlix = {69*xs+x, 66*xs+x};
        int[] mliy = {116*ys+y, 114*ys+y};
        g.drawPolygon(mlix, mliy, 2);
        int[] msx = {100*xs+x, 103*xs+x, 106*xs+x, 103*xs+x};
        int[] msy = {96*ys+y, 97*ys+y, 100*ys+y, 97*ys+y};
        g.drawPolygon(msx, msy, 4);
        int[] tlx = {87*xs+x, 83*xs+x};
        int[] tly = {110*ys+y, 113*ys+y};
        g.drawPolygon(tlx, tly, 2);
        
        g.setColor(bpink);
        g.drawOval(28*xs+x, 94*ys+y, 2*xs+x, 2*ys+y);
        g.drawOval(104*xs+x, 42*ys+y, 2*xs+x, 2*ys+y);
        g.drawOval(51*xs+x, 133*ys+y, 2*xs+x, 2*ys+y);
        g.drawOval(72*xs+x, 122*ys+y, 2*xs+x, 2*ys+y);
        g.drawOval(90*xs+x, 140*ys+y, 2*xs+x, 2*ys+y);
        g.drawOval(146*xs+x, 110*ys+y, 2*xs+x, 2*ys+y);
        
        int[] hlx = {112*xs+x, 107*xs+x};
        int[] hly = {43*ys+y, 47*ys+y};
        g.drawPolygon(hlx, hly, 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
