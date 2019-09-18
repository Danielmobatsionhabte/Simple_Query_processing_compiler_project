
 //* To change this license header, choose License Headers in Project Properties.


import static com.sun.media.jfxmediaimpl.MediaUtils.error;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.io.IOException;
import static java.nio.file.Files.lines;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Identifier_check  extends JFrame{
 String error;   
public  Identifier_check(String line) throws IOException{
    Pattern pattern[]=new Pattern[10];
   Matcher Match[]=new Matcher[10];
  // pattern[0]=Pattern.compile("create+\\s+ database+\\s+[A-Za-zA-Z0-9]+;");
  pattern[0]=Pattern.compile("create +database +[a-zA-Z0-9]+;");
pattern[1]=Pattern.compile("create +table +[a-zA-Z]+[(]+[a-zA-z]+ [a-zA-z(0-9)]+, +[a-zA-z]+ [a-zA-z(0-9)]+[)]+;");
 pattern[2]=Pattern.compile("insert +into +[a-zA-Z]+ values+[(]+[a-zA-z0-9]+[,] +[']+[a-zA-z0-9]+[']+[)];");
 pattern[3]=Pattern.compile("select +[*] +from +[a-zA-Z]+;");
  pattern[4]=Pattern.compile("select +[a-zA-Z]+ from+ [a-zA-Z]+;");
  pattern[5]=Pattern.compile("select +[a-zA-Z]+,+[a-zA-Z]+ from+ [a-zA-Z]+;");
  pattern[6]=Pattern.compile("update +[a-zA-Z]+ set +[a-zA-Z]+[=]+[a-zA-Z0-9]+;");
  
  
// pattern[5]=Pattern.compile("update \\s+ [A-Za-zA-Z] \\s + set \\s+ [A-Za-zA-Z]=\\s+ '[A-Za-zA-Z]' ;");
// pattern[6]=Pattern.compile("update \\\\s+ [A-Za-zA-Z] \\\\s + set \\\\s+ [A-Za-zA-Z]=\\\\s+ '[A-Za-zA-Z]' \\\\s+ where \\\\s+ [A-Za-zA-Z] = '[A-Za-zA-Z0-9]'  ;");
//   pattern[7]=Pattern.compile("select\\\\s+ [A-Za-zA-Z] \\\\s+ from \\\\s+ [A-Za-zA-Z] \\\\s+ where \\\\s + [A-Za-zA-Z0-9];"); 
     // Pattern add=Pattern.compile("ADD\\s+[Ax]+[,]+[\\s-Bx]+;");
        //Pattern pt2=Pattern.compile("[A-Za-zA-Z0-9]=[0-9]+;");
       // Pattern patt = Pattern.compile("^[a-zA-Z]{0,30}$");
       // Matcher match = mov.matcher(line);
        //Matcher match2=mov2.matcher(line);
        //Matcher mathch3=add.matcher(line);
      // String lines[]=new String[10];
        //strinbulder
     
            for(int i=0;i<7;i++){
             Match[i]=pattern[i].matcher(line);
            }
            if(Match[0].matches()){
       //  PassToken obj = new PassToken(line);
         //pass.Token1(no_line);
         //obj.Token1(no_line);
        
         
         Main.jLabel_result.setVisible(true);
            }
                 
       // tonkizing_line_statement_to_word obj = new tonkizing_line_statement_to_word();
         //   obj.token(line);
            
           else if(Match[1].matches()){
               Main.jLabel_result.setText("Create Table Successfully");
               Main.jLabel_result.setVisible(true);
               
       
Main.jLabel_result.setForeground(new java.awt.Color(0, 102, 0));
Main.check.setForeground(new java.awt.Color(0, 102, 0));
                     Main.check.setText("Command complete Succussfully");  
                Main.check.setForeground(new java.awt.Color(0, 102, 0));
          //  table tb = new table();
       
               
           
               
// table.jTable1.setVisible(true);
//table.jTable1.setModel(new javax.swing.table.DefaultTableModel(
//    new Object [][] {
//        {null, null, null, null}
//    },
//    new String [] {
//        "[a-zA-z]"
//    }
//));
//        
//table.jTable1.setToolTipText("");


               
               
          }
        else if(Match[2].matches()){
                Main.jLabel_result.setText("Data inserted Successfully");
               Main.jLabel_result.setVisible(true);
              Main.jLabel_result.setForeground(new java.awt.Color(0, 102, 0));
Main.check.setForeground(new java.awt.Color(0, 102, 0));
                     Main.check.setText("Command complete Succussfully");  
                Main.check.setForeground(new java.awt.Color(0, 102, 0));
               
           
        }
        else if(Match[3].matches()){   
                Main.jLabel_result.setText("Query Executed Successfully");
               Main.jLabel_result.setVisible(true);
               Main.check.setText("Build Successfully...");
//              if(Match[3].matches()){
Main.jLabel_result.setForeground(new java.awt.Color(0, 102, 0));
Main.check.setForeground(new java.awt.Color(0, 102, 0));
                     Main.check.setText("Command complete Succussfully");  
                Main.check.setForeground(new java.awt.Color(0, 102, 0));
//             table tb = new table();
//             
//table.jTable1 = new javax.swing.JTable();
//
//table.jTable1.setModel(new javax.swing.table.DefaultTableModel(
//    new Object [][] {
//
//    },
//    new String [] {
//        "ID", "Name"
//    }
//));
//
//table.jTable1.setToolTipText("");
//
//
//               tb.setVisible(true);
//              }
////               
          }
        
          else if(Match[4].matches()){   
                Main.jLabel_result.setText(" Select Query Executed Successfully");
               Main.jLabel_result.setVisible(true);
               Main.check.setText("Build Successfully...");
//              if(Match[3].matches()){
Main.jLabel_result.setForeground(new java.awt.Color(0, 102, 0));
Main.check.setForeground(new java.awt.Color(0, 102, 0));
                     Main.check.setText("Command complete Succussfully");  
                Main.check.setForeground(new java.awt.Color(0, 102, 0));
          }
          else if(Match[5].matches()){   
                Main.jLabel_result.setText(" Select Query Executed Successfully");
               Main.jLabel_result.setVisible(true);
               Main.check.setText("Build Successfully...");
//              if(Match[3].matches()){
Main.jLabel_result.setForeground(new java.awt.Color(0, 102, 0));
Main.check.setForeground(new java.awt.Color(0, 102, 0));  
                Main.check.setForeground(new java.awt.Color(0, 102, 0));
          }
          else if(Match[6].matches()){ 
             Main.jLabel_result.setText(" update Query Executed Successfully");
               Main.jLabel_result.setVisible(true);
               Main.check.setText("Build Successfully...");
//              if(Match[3].matches()){
Main.jLabel_result.setForeground(new java.awt.Color(0, 102, 0));
Main.check.setForeground(new java.awt.Color(0, 102, 0));  
                Main.check.setForeground(new java.awt.Color(0, 102, 0));  
          }
//          else if(Match[7].matches()){    
//          }
//          else if(Match[8].matches()){   
//          }
            else{

Main.jLabel_result.setText("Unsuccessfully Completed");
  Main.check.setText("\nerror occured at statement------> "+line+"\n"+"at line number-------> ");
Main.jLabel_result.setForeground(Color.red);
Main.check.setForeground(Color.red);
                     Main.check.setText("Command doesnot complete Succussfully");  
                Main.check.setForeground(Color.red);

}
        


}


}

//}

