/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algbresenham;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
/**
 *
 * @author Marcio
 */
public class AlgBreseham extends JFrame {

    public AlgBreseham() {
        this.setTitle("Algoritmo de Linhas - Bresenham");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        AlgBres(g,50,50,250,250);
        g.setColor(Color.blue);
        AlgBres(g,50,50,250,50);
        g.setColor(Color.green);
        AlgBres(g,50,50,50,250);
        g.setColor(Color.gray);
        AlgBres(g,50,50,250,150);
        g.setColor(Color.yellow);
        AlgBres(g,50,50,150,250);
    }
    private void AlgBres(Graphics g, int xi, int yi, int xf, int yf){
        int x=xi, y=yi, dy=yf-yi, dx=xf-xi, dec=0;
        
        if(dy <= dx){
            
            while(true){
            putPixel(g,x,y);
            if(x==xf)break;
            x++;
            dec += dy;
            if(dec >= dx){y++; dec -= dx;}
            }
        }else{
            while(true){
            putPixel(g,x,y);
            if(y==yf)break;
            y++;
            dec += dx;
            if(dec >= dy){x++; dec -= dy;}
            
            }
        }
    }
    public void putPixel(Graphics g, int x, int y){
        g.drawLine(x, y, x, y);
    }

  
}
