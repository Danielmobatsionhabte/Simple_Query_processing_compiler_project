
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dani
 */
public class sample {
    
    public static void main(String [] args){
        ArrayList<String> line = new ArrayList<>();
        line.add("create");
        line.add("database ' '");
        line.add("table ' '");
         line.add("(");
        line.add("' ' int");
          line.add("' ' varchar '( ' ')'");
          line.add("')'");
            line.add(";");
              line.add("insert");
                line.add("update");
                  line.add("drop");
                    line.add("delete");
                      line.add("alter");
                        line.add("select");
                          line.add("from");
                            line.add("'*'");
                              line.add("into");
                              line.add("on");
                              line.add("Foreignkeyreference");
                              
            
     
        for(String linebyline:line)
        {
            JOptionPane.showMessageDialog(null, linebyline);
        }
    }
}
