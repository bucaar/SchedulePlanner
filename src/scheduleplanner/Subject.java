/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

/**
 *
 * @author Aaron
 */
public class Subject {
    private String name;
    private double[] startTime = {0,0,0,0,0};
    private double[] endTime = {0,0,0,0,0};
    
    public Subject(String name, double[] startTime, double[] endTime){
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public String getName(){
        return name;
    }
    
    public double getStartTime(int d){
        return startTime[d];
    }
    
    public double[] getStartTime(){
        return startTime;
    }
    
    public double getEndTime(int d){
        return endTime[d];
    }
    
    public double[] getEndTime(){
        return endTime;
    }
    
    public boolean equals(Object o){
        if (o instanceof Subject){
            Subject s = (Subject) o;
            if(s.getName().equals(name)){
                for(int i=0;i<5;i++){
                    if(Math.abs(s.getStartTime(i)-startTime[i])>.01) return false;
                    if(Math.abs(s.getEndTime(i)-endTime[i])>.01) return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public String toString(){
        String string = "";
        string += name;
        string += " [";
        if(getStartTime(0)>0) string += "M:("+timeToString(getStartTime(0))+"-"+timeToString(getEndTime(0))+")";
        if(getStartTime(1)>0) string += " T:("+timeToString(getStartTime(1))+"-"+timeToString(getEndTime(1))+")";
        if(getStartTime(2)>0) string += " W:("+timeToString(getStartTime(2))+"-"+timeToString(getEndTime(2))+")";
        if(getStartTime(3)>0) string += " Th:("+timeToString(getStartTime(3))+"-"+timeToString(getEndTime(3))+")";
        if(getStartTime(4)>0) string += " F:("+timeToString(getStartTime(4))+"-"+timeToString(getEndTime(4))+")";
        string += "]";
        return string;
    }
    
    public String saveFormat(){
        String string = "";
        string += name;
        string += "\t";
        string += getStartTime(0);
        string += " ";
        string += getStartTime(1);
        string += " ";
        string += getStartTime(2);
        string += " ";
        string += getStartTime(3);
        string += " ";
        string += getStartTime(4);
        string += "\t";
        string += getEndTime(0);
        string += " ";
        string += getEndTime(1);
        string += " ";
        string += getEndTime(2);
        string += " ";
        string += getEndTime(3);
        string += " ";
        string += getEndTime(4);
        string += "\r\n";
        return string;
    }
    
    private String timeToString(double time){
        String result = "";
        result += time>12?(int)time-12:(int)time;
        result += ":";
        int minutes = (int)Math.round((time % 1)*60);
        result += (minutes<10?(minutes==0?"00":"0"+minutes):minutes);
        return result;
    }
}
