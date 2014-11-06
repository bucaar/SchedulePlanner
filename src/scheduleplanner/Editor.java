/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
 
/**
 *
 * @author Aaron
 */
public class Editor extends JFrame{
    private JList list;
    private JButton delete;
    private JButton load;
    private JButton save;
    
    public Editor(){
        super("Options");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        int num = SchedulePlanner.getNumberOfClasses();
        final Subject[] subjects = new Subject[num];
        int i = 0;
        for(Subject s : SchedulePlanner.c1) if(s!=null) subjects[i++] = s;
        for(Subject s : SchedulePlanner.c2) if(s!=null) subjects[i++] = s;
        for(Subject s : SchedulePlanner.c3) if(s!=null) subjects[i++] = s;
        for(Subject s : SchedulePlanner.c4) if(s!=null) subjects[i++] = s;
        for(Subject s : SchedulePlanner.c5) if(s!=null) subjects[i++] = s;
        for(Subject s : SchedulePlanner.c6) if(s!=null) subjects[i++] = s;
        for(Subject s : SchedulePlanner.c7) if(s!=null) subjects[i++] = s;
        for(Subject s : SchedulePlanner.c8) if(s!=null) subjects[i++] = s;
        for(Subject s : SchedulePlanner.c9) if(s!=null) subjects[i++] = s;
        for(Subject s : SchedulePlanner.c10) if(s!=null) subjects[i++] = s;
        
        list = new JList(subjects);
        list.setVisibleRowCount(10);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        delete = new JButton("Delete Selected");
        load = new JButton("Load from file");
        save = new JButton("Save to file");
        
        add(new JScrollPane(list));
        add(delete);
        add(load);
        add(save);
        
        delete.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    for(int i : list.getSelectedIndices()) if(i!= -1) SchedulePlanner.dropClass(subjects[i]);
                    dispose();
                }
            }
        );
        
        load.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    try {
                        JFileChooser dialog = new JFileChooser();
                        int response = dialog.showOpenDialog(Editor.this);
                        File file = new File("");
                        if (response == JFileChooser.APPROVE_OPTION){
                            file = dialog.getSelectedFile();
                        }
                        BufferedReader input = new BufferedReader(new FileReader(file));
                        String[] names = Client.names;
                        SchedulePlanner.clearClasses();
                        while(input.ready()){
                            String current = input.readLine();
                            
                            String name = current.split("\t")[0];
                            String startTimes1 = current.split("\t")[1];
                            String endTimes1 = current.split("\t")[2];
                            
                            String[] startTimes2 = startTimes1.split(" ");
                            String[] endTimes2 = endTimes1.split(" ");
                            
                            double[] startTimes3 = new double[5];
                            double[] endTimes3 = new double[5];
                            
                            for(int i=0;i<5;i++){
                                startTimes3[i] = Double.parseDouble(startTimes2[i]);
                                endTimes3[i] = Double.parseDouble(endTimes2[i]);
                            }
                            
                            boolean added = false;
                            for(int i=0;i<names.length;i++){
                                if(names[i] != null && names[i].equals(name)){
                                    SchedulePlanner.addClass(i, name, startTimes3, endTimes3);
                                    added = true;
                                    break;
                                }
                            }
                            if(!added){
                                for(int i=0;i<names.length;i++){
                                    if(names[i] == null){
                                        names[i] = name;
                                        SchedulePlanner.addClass(i, name, startTimes3, endTimes3);
                                        added = true;
                                        break;
                                    }
                                }
                            }
                        }
                        input.close();
                        dispose();
                    } catch ( IOException ex ) {
                        ex.printStackTrace();
                    }
                }
            }
        );
        
        save.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    try {
                        JFileChooser dialog = new JFileChooser();
                        int response = dialog.showOpenDialog(Editor.this);
                        File file = new File("");
                        if (response == JFileChooser.APPROVE_OPTION){
                            file = dialog.getSelectedFile();
                        }
                        BufferedWriter output = new BufferedWriter(new FileWriter(file));
                        for(Subject s : subjects){
                            if(s != null) output.write(s.saveFormat());
                        }
                        output.close();
                        dispose();
                    } catch ( IOException ex ) {
                        ex.printStackTrace();
                    }
                }
            }
        );
    }
}

                    