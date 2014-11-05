/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JApplet;
import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class SchedulePlanner {
    private static int numberOfClasses = 0;
    
    static ArrayList<Subject> c1 = new ArrayList<>();
    static ArrayList<Subject> c2 = new ArrayList<>();
    static ArrayList<Subject> c3 = new ArrayList<>();
    static ArrayList<Subject> c4 = new ArrayList<>();
    static ArrayList<Subject> c5 = new ArrayList<>();
    static ArrayList<Subject> c6 = new ArrayList<>();
    static ArrayList<Subject> c7 = new ArrayList<>();
    static ArrayList<Subject> c8 = new ArrayList<>();
    static ArrayList<Subject> c9 = new ArrayList<>();
    static ArrayList<Subject> c10 = new ArrayList<>();
    
    static ArrayList<JFrame> applets = new ArrayList<>();
    
    public static void start(boolean repaint) {
        for(int a=0;a<c1.size();a++)for(int b=0;b<c2.size();b++)
        for(int c=0;c<c3.size();c++)for(int d=0;d<c4.size();d++)
        for(int e=0;e<c5.size();e++)for(int f=0;f<c6.size();f++)
        for(int g=0;g<c7.size();g++)for(int h=0;h<c8.size();h++)
        for(int i=0;i<c9.size();i++)for(int j=0;j<c10.size();j++){
            Subject s1 = c1.get(a);
            Subject s2 = c2.get(b);
            Subject s3 = c3.get(c);
            Subject s4 = c4.get(d);
            Subject s5 = c5.get(e);
            Subject s6 = c6.get(f);
            Subject s7 = c7.get(g);
            Subject s8 = c8.get(h);
            Subject s9 = c9.get(i);
            Subject s10 = c10.get(j);
            ArrayList<Subject> subjects = new ArrayList();
            if(s1 != null) subjects.add(s1);
            if(s2 != null) subjects.add(s2);
            if(s3 != null) subjects.add(s3);
            if(s4 != null) subjects.add(s4);
            if(s5 != null) subjects.add(s5);
            if(s6 != null) subjects.add(s6);
            if(s7 != null) subjects.add(s7);
            if(s8 != null) subjects.add(s8);
            if(s9 != null) subjects.add(s9);
            if(s10 != null) subjects.add(s10);
            Schedule schedule = new Schedule(subjects);
            if(!schedule.isConflicting()){
                startApplet(schedule, repaint);
            }
        }
    }
    
    public static void addClass(int classNumber, String name, double[] startTimes, double[] endTimes){
        numberOfClasses++;
        ridNulls();
        if(classNumber == 0) c1.add(new Subject(name, startTimes, endTimes));
        else if(classNumber == 1) c2.add(new Subject(name, startTimes, endTimes));
        else if(classNumber == 2) c3.add(new Subject(name, startTimes, endTimes));
        else if(classNumber == 3) c4.add(new Subject(name, startTimes, endTimes));
        else if(classNumber == 4) c5.add(new Subject(name, startTimes, endTimes));
        else if(classNumber == 5) c6.add(new Subject(name, startTimes, endTimes));
        else if(classNumber == 6) c7.add(new Subject(name, startTimes, endTimes));
        else if(classNumber == 7) c8.add(new Subject(name, startTimes, endTimes));
        else if(classNumber == 8) c9.add(new Subject(name, startTimes, endTimes));
        else if(classNumber == 9) c10.add(new Subject(name, startTimes, endTimes));
    }
    
    public static void dropClass(Subject s){
        if(c1.remove(s))numberOfClasses--;
        if(c2.remove(s))numberOfClasses--;
        if(c3.remove(s))numberOfClasses--;
        if(c4.remove(s))numberOfClasses--;
        if(c5.remove(s))numberOfClasses--;
        if(c6.remove(s))numberOfClasses--;
        if(c7.remove(s))numberOfClasses--;
        if(c8.remove(s))numberOfClasses--;
        if(c9.remove(s))numberOfClasses--;
        if(c10.remove(s))numberOfClasses--;
    }
    
    public static int getNumberOfClasses(){
        return numberOfClasses;
    }
    
    public static void clearClasses(){
        numberOfClasses = 0;
        c1 = new ArrayList<>();
        c2 = new ArrayList<>();
        c3 = new ArrayList<>();
        c4 = new ArrayList<>();
        c5 = new ArrayList<>();
        c6 = new ArrayList<>();
        c7 = new ArrayList<>();
        c8 = new ArrayList<>();
        c9 = new ArrayList<>();
        c10 = new ArrayList<>();
    }
    
    public static void fillEmpties(){
        if(c1.isEmpty())c1.add(null);
        if(c2.isEmpty())c2.add(null);
        if(c3.isEmpty())c3.add(null);
        if(c4.isEmpty())c4.add(null);
        if(c5.isEmpty())c5.add(null);
        if(c6.isEmpty())c6.add(null);
        if(c7.isEmpty())c7.add(null);
        if(c8.isEmpty())c8.add(null);
        if(c9.isEmpty())c9.add(null);
        if(c10.isEmpty())c10.add(null);
    }
    
    public static void ridNulls(){
        if(!c1.isEmpty()) if(c1.get(0) == null) c1 = new ArrayList<>();
        if(!c2.isEmpty()) if(c2.get(0) == null) c2 = new ArrayList<>();
        if(!c3.isEmpty()) if(c3.get(0) == null) c3 = new ArrayList<>();
        if(!c4.isEmpty()) if(c4.get(0) == null) c4 = new ArrayList<>();
        if(!c5.isEmpty()) if(c5.get(0) == null) c5 = new ArrayList<>();
        if(!c6.isEmpty()) if(c6.get(0) == null) c6 = new ArrayList<>();
        if(!c7.isEmpty()) if(c7.get(0) == null) c7 = new ArrayList<>();
        if(!c8.isEmpty()) if(c8.get(0) == null) c8 = new ArrayList<>();
        if(!c9.isEmpty()) if(c9.get(0) == null) c9 = new ArrayList<>();
        if(!c10.isEmpty()) if(c10.get(0) == null) c10 = new ArrayList<>();
    }
    
    public static void closeVisulaizers(){
        for(int i=0;i<applets.size();i++){
            JFrame f = applets.get(i);
            f.dispose();
        }
    }
    
    public static void startApplet(Schedule s, boolean repaint)
    {
        final JApplet applet = new Visualizer(s, repaint); 


        JFrame frame = new JFrame(); 
        frame.setSize(800, 400);
        applets.add(frame);

        frame.getContentPane().add(applet);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                applet.stop();
                applet.destroy();
            }
        });

        applet.start();
        frame.setVisible(true);
    }
    
}
