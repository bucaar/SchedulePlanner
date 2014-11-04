/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class Schedule {
    
    private ArrayList<Subject> subjects;
    
    public Schedule(ArrayList<Subject> subjects){
        this.subjects = subjects;
    }
    
    public boolean isConflicting(){
        for(int a = 0; a<subjects.size();a++){
            for(int b = 0; b<subjects.size();b++){
                for(int d = 0; d < 5; d++){
                    if (a==b) break;
                    Subject s1 = (Subject) subjects.get(a);
                    Subject s2 = (Subject) subjects.get(b);
                    if(s1.getStartTime(d)>=s2.getStartTime(d)&&s1.getStartTime(d)<s2.getEndTime(d)) return true;
                }
            }
        }
        return false;
    }
    
    public Subject getSubject(int s){
        return (Subject) subjects.get(s);
    }
    
    public int getNumber(){
        return subjects.size();
    }
}
