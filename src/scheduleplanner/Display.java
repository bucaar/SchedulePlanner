/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scheduleplanner;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
/**
 *
 * @author aaron.l.buchholz
 */
public class Display extends JPanel {
    Schedule schedule;
    
    public Display(Schedule schedule){
        this.schedule = schedule;
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int padding = 14;
        int dayWidth = (getWidth()-padding)/5;
        int dayHeight = (getHeight()-padding);
        int startTime = 7;
        int endTime = 21;
        int scale = dayHeight/(endTime-startTime);
        g.setColor(Color.BLACK);
        g.drawRect(padding, padding, dayWidth*5, scale * (endTime-startTime));
        for(int i=0;i<endTime-startTime;i++){
            g.drawLine(padding, padding+i*scale, padding+5*dayWidth, padding+i*scale);
            g.drawString(""+((i+startTime-1)%12+1), 0, padding+i*scale+5);
        }
        
        for(int s=0;s<schedule.getSize();s++){
            for(int d=0;d<5;d++){
                double thisStartTime = schedule.getSubject(s).getStartTime(d);
                double thisEndTime = schedule.getSubject(s).getEndTime(d);
                if(thisStartTime > 0 || thisEndTime > thisStartTime){
                    int x = padding+d*dayWidth;
                    int y = (int)(padding+(thisStartTime-startTime)*scale);
                    int dy = (int)((thisEndTime-thisStartTime)*scale);
                    g.setColor(Color.GRAY);
                    g.fillRect(x, y, dayWidth, dy);
                    g.setColor(Color.BLACK);
                    g.drawRect(x, y, dayWidth, dy);
                    g.setColor(Color.BLACK);
                    g.drawString(schedule.getSubject(s).getName(), x, y+10);
                }
            }
        }
    }
}
