/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vipetablelogic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Arrays;
import javax.swing.JPanel;


/**
 *
 * @author johnson_849323
 */


public class GridPanel extends JPanel{
    
    int[] sectors = new int[600];
    
    public GridPanel() {
        //initSectors();
    }
    
    private void initSectors() {
        //Add values to sector
       for (int i = 0; i < 20; i++) {
           sectors[i] = 3;
       }
       
       for (int i = 30; i < 65; i++) {
           sectors[i] = 2;
       }
      
       
       for (int i = 85; i < 592; i++) {
           sectors[i] = 6;
       }
    }
    
    private Color getColor(int in) {
        Color color = Color.red;
        int id = in % 6;
        
        
        switch (id) {
            case 0 : color = (in==0) ? Color.white : Color.orange; break;
            case 1 : 
                color = Color.red;
                break;
            case 2 : 
                color = Color.green;
                break;
            case 3 : color = Color.blue; break;
            case 4 : color = Color.yellow; break;
            case 5 : color = Color.magenta; break;
            case 6 : color = Color.orange; break;
            default: color = Color.white;
        }
        
        return color;
    }
    
    public void updateGrid(int[] sects) {
        this.sectors = sects;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //initSectors();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setColor(Color.white);
        int index = 0;
        String out;
        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < 30; i++) {
                
                graphics.setColor(getColor(sectors[(j * 30) + i]));
                graphics.fillRect(i * 20, j * 20, 20, 20);
                graphics.setColor(Color.black);
                if (sectors[index] == 0) {
                    out = "";
                }
                else {
                    out = "" + sectors[index];
                }
                graphics.drawString(out, i * 20 + 7, j * 20 + 15);
                System.out.println(index);
                index++;
            }

        }
        
        int line = 0;
        

        
        graphics.setColor(Color.black);
        
        for (int i = 0; i < 30; i++) {
            
            graphics.drawLine(i * 20, 0, i * 20, 400);
        }
        
        for (int i = 0; i < 20; i++) {
            graphics.drawLine(0, i * 20, 600, i * 20);
        }
        
        
    }
}
