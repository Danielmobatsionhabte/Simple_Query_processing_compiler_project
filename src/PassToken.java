
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class PassToken {

    private final String line;

    private String SaveFile="";
    private  final static String create="create";
    public final static String database="database";
    public final static String dbname="[a-zA-Z]";
    public final static String table="table";
    public final static String integer="int";
    public final static String variable="[a-zA-Z]";
    public final static String varchar="varchar";
    private String Number;
   private String readline;
    private String lines;
    private int ForCalc;
    PassToken(String line) {
this.line=line;

    }

    

    void Token1(int no_line) throws IOException{
        try{
        FileReader fr=new FileReader("bin.txt");
        BufferedReader br=new BufferedReader(fr);
   while((readline=br.readLine())!=null){
      lines=lines+readline+"\n";
     // JOptionPane.showMessageDialog(null, lines,"lines",1);
   }}catch(Exception ex){}
        String[] split = line.split("\\s");
        for(String Split1:split){
            String[] split1 = Split1.split(",");
            for(String Split2:split1){
                String[] split2 = Split2.split(";");
                for(String split3:split2){
              //      JOptionPane.showMessageDialog(null, split3);
                if(split3.equalsIgnoreCase("create"))
                {
                SaveFile=SaveFile+" "+create;
                }
                if(split3.equalsIgnoreCase("database")){
                 SaveFile=SaveFile+" "+database;
                 
                }
                if(split3.equalsIgnoreCase("[a-zA-Z]")){
                 SaveFile=SaveFile+" "+dbname;
                }
                if(split3.equalsIgnoreCase("table")){
                 SaveFile=SaveFile+" "+table;     
                }
                if(split3.equalsIgnoreCase("int")){
                  SaveFile=SaveFile+" "+integer;   
                }
                try{
                 Number=Integer.toBinaryString(Integer.parseInt(split3));
                 SaveFile=SaveFile+" "+Number;
                 //ForCalc=Integer.parseInt(split3);
               // JOptionPane.showMessageDialog(null, ForCalc);
                }catch(NumberFormatException ex){
          
              //      JOptionPane.showMessageDialog(null, split3);

                }
                
            }
        }
    }
                 FileWriter fw=new FileWriter("bin.txt");
                 BufferedWriter brd=new BufferedWriter(fw);
                 brd.write(lines+"\n"+SaveFile);
                brd.close();
   // JOptionPane.showMessageDialog(null, SaveFile,"all",1);
}}
