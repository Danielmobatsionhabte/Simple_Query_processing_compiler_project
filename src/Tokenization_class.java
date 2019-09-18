
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.isDigit;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class Tokenization_class {
   
    String word;
     private  final static String create="create";
    public final static String database="database";
    public final static String dbname="[a-zA-Z]";
    public final static String table="table";
    public final static String integer="int";
    public final static String variable="[a-zA-Z]";
    public final static String varchar="varchar";
     String txt="";
     int check;

    Tokenization_class(String line) throws IOException{
             String Line ="";
          int counter=1;
 int sizes;
 String number = null;
 char ch;boolean z = false;
      //FileWriter fws=new FileWriter("ann.txt");
          //BufferedWriter bws = new BufferedWriter(fws);
               //bws.write(" ");
    //bws.close();
        String sts [] =line.split("\\s");
       for(String lines:sts){
      String stc[]=lines.split("(");  
     for ( String coma:stc){

       String stcolon[]=coma.split(";");
        for ( String colon:stcolon){
            //if(colon.equals("create database ")){
             //JOptionPane.showMessageDialog(null,"you entered create");  
            }
           // JOptionPane.showMessageDialog(null,colon);
      //sizes=colon.length();//length of size
//                    for(int m=0;m<sizes;m++){
//                    ch=colon.charAt(m);
//                        z=isDigit(ch);
//                    if(z==true){
//                   number=Integer.toHexString(Integer.parseInt(colon));
//                   JOptionPane.showMessageDialog(null, number);
//                   FileReader fr=new FileReader("ann.txt");
//   BufferedReader br=new BufferedReader(fr);
//   String read;
//   while((read=br.readLine())!=null){
// Line=Line+read+"\n";
//   }  br.close();
//                    FileWriter fw=new FileWriter("ann.txt");
//          BufferedWriter bw = new BufferedWriter(fw);
//               bw.write(Line+number);
//    bw.close();
//
//                        break;  }
//                     }  
//        }}
//
//  JFrame n=new JFrame();
//         n.setVisible(true);
//         JTextArea ta= new JTextArea();
//         ta.setForeground(Color.BLACK);
//         ta.setText(Line);
//         ta.setColumns(10);
//         ta.setRows(20);
//         n.add(ta);
//         //n.setSize(300,300);
//         n.setBounds(270, 590, 825, 140);
//         n.setTitle("Output");}}}}}
           //JOptionPane.showMessageDialog(null,colon," tokenization", 1);
           /*
           switch (colon) {
               case "Mov":
                   FileWriter fw=new  FileWriter("mov.txt");
                   BufferedWriter bw=new BufferedWriter(fw);
                   bw.write(Mov);
         
                   bw.close();
                   break;
               case "Ax":
                   FileWriter fwrax=new  FileWriter("regax.txt");
                   BufferedWriter bwrax=new BufferedWriter(fwrax);
                   bwrax.write(Ax);
                   bwrax.close();
                   break;
               case "Bx":
                   FileWriter fwrbx=new  FileWriter("regbx.txt");
                   BufferedWriter bwrbx=new BufferedWriter(fwrbx);
                   bwrbx.write(Bx);
                   bwrbx.close();
                   break;
               case "ADD":
                   FileWriter fwadd=new  FileWriter("add.txt");
                   BufferedWriter bwadd=new BufferedWriter(fwadd);
                   bwadd.write(ADD);
                   bwadd.close();
                   break;
               default:
                   try{
       String opco=Integer.toBinaryString(Integer.parseInt(colon));
     FileWriter fwopco=new  FileWriter("opco.txt");
                   BufferedWriter bwopco=new BufferedWriter(fwopco);
                   bwopco.write(opco);
                   bwopco.close();
                   
                   }catch(Exception Ex){
                       
                       }
                   break;
           */
    
  
        }}}}