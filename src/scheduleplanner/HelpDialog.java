/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Aaron
 */

public class HelpDialog extends JFrame{
    private JTextArea textArea;
    
    public HelpDialog(){
        super("Help");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        textArea = new JTextArea(13, 40);
        textArea.setText(text);
        add(new JScrollPane(textArea));
    }
    
    private String text = "Schedule Planner Help:\n\n"
            + "Adding a class:\n"
            + "After retriving all of the sections available for your classes, you are \n"
            + "able to use either the Custom or General tab to import them into the \n"
            + "program. The scheme used for nameing classes isn't particularly important,\n"
            + "The only thing that matters is each section offered for the same class \n"
            + "is named in the program with an identical name. Note that you may only\n"
            + "have up to 10 classes entered. Any additional ones will not display.\n\n"
            
            + "Using the Custom Tab:\n"
            + "This tab is designed for classes that may have different times offered\n"
            + "for different days in one week. For example, if a class's lab is on \n"
            + "MWF from 12:00-12:50 but its recitation is TTh from 1:30-2:20, you would\n"
            + "use the Custom tab. After loading in all of the start and end times for \n"
            + "each day and giving the class a name, Clicking on the Add Class button \n"
            + "will store that class in the program's database.\n\n"
            
            + "Using the General Tab:\n"
            + "This tab is designed for classes that have the same times offered for \n"
            + "different days of the week. After loading in the start and end times \n"
            + "for that class and giving the class a name, clicking on the Add Class \n"
            + "button will store that class in the program's database.\n\n"
            
            + "Removing a class:\n"
            + "Clicking on the Options button will display a window designed to show\n"
            + "all of the classes that have already been loaded into the database.\n"
            + "If no classes are present in the list, you must first either add a class\n"
            + "or load classes from a flie. If classes are present in the list, you can\n"
            + "select which class(es) you want to delete, and then by pressing the \n"
            + "Delete Selected button, those classes will be removed from the database.\n\n"
            
            + "Saving to File:\n"
            + "Clicking on the Options button will display a window that will allow you to\n"
            + "save all of the classes that you've loaded into the program to a file somewhere\n"
            + "on your computer. This program does not auto-save, so by closing the program\n"
            + "you risk losing all of the work that you have done. After loading in all of \n"
            + "your classes and verifying they are present in the list, clicking on the \n"
            + "Save to file button will bring up a dialog so you can choose a location and \n"
            + "a name for your file to be saved.\n\n"
            
            + "Loading from File:\n"
            + "Clicking on the Options button will display a window that will aloow you to\n"
            + "load all of the classes that you've previously saved.  Clicking on the Load\n"
            + "from file button will bring up a dialog so you can locate and choose the file\n"
            + "that you have previously saved.\n\n"
            
            + "Displaying the Schedules:\n"
            + "After either inputting all of the classes into the database or loading them\n"
            + "from an existing file, clicking on the Display Schedules button will open\n"
            + "as many windows as there are possible schedules for all of the sections \n"
            + "for each class in the database.  Making any modifications to classes after\n"
            + "the Schedules are displayed will not update changes, and will require you\n"
            + "to press the Display Schedules button again.  Pressing the button will\n"
            + "close any existing Schedule windows and open a new set of them.\n\n"
            
            + "Displaying the Help Menu:\n"
            + "Yup. Nailed it!";
}

                    