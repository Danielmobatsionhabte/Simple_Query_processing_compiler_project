///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Dani
// */
//    import java.util.ArrayList;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//
//public class equivalent {
//   
// 
//        public static void main(String [] args ){
//        Pattern pt=Pattern.compile("create\\s+ database\\s+[A-Za-zA-Z0-9]+;");
// Pattern pt1=Pattern.compile("create\\s+ table\\s+[A-Za-zA-Z]\\s+[([A-Za-zA-Z]\\s+int\\s+[,]\\s+[A-Za-zA-Z]\\s+varchar([0-9])\\s+[)]+;");
// Pattern pt2=Pattern.compile("insert\\s+ into\\s+[A-Za-zA-Z]\\s+values+[('[A-Za-zA-Z0-9]');");
//         Pattern pt3=Pattern.compile("select\\s+ * \\s+ from \\s+ [A-Za-zA-Z];");
//         Pattern pt4 = Pattern.compile("select\\s+ * \\s+ from \\s+ [A-Za-zA-Z] \\s+ where \\s + [A-Za-zA-Z0-9];");
//        Pattern pt5 = Pattern.compile("update \\s+ [A-Za-zA-Z] \\s + set \\s+ [A-Za-zA-Z]=\\s+ '[A-Za-zA-Z]' ;");
//        Pattern pt6 = Pattern.compile("update \\s+ [A-Za-zA-Z] \\s + set \\s+ [A-Za-zA-Z]=\\s+ '[A-Za-zA-Z]' \\s+ where \\s+ [A-Za-zA-Z] = '[A-Za-zA-Z0-9]'  ;");
//        Pattern pt7 = Pattern.compile("select\\s+ [A-Za-zA-Z] \\s+ from \\s+ [A-Za-zA-Z] \\s+ where \\s + [A-Za-zA-Z0-9];");
////             Pattern pt6 = Pattern.compile("[A-Za-zA-Z0-9]='[a-zA-Za-zA-Z0-9]'"); 
//             
//       
//        ArrayList <String> line=new ArrayList <>();
//            line.add(0,"create database check;");
//            line.add(1,"create table chekk(id int ,name varchar(50));");
//            line.add(3,"insert into chekk values(110,'daniel');");
//            line.add(4,"select * from checkk;");
//            line.add(5,"update checkk set name = 'duressa' where  id = '110';");
//          for(String lineof:line)
//          {
//            Matcher m = pt.matcher(lineof);
//            Matcher m2 = pt2.matcher(lineof);
//            Matcher m3 = pt3.matcher(lineof);
//            Matcher m4 = pt4.matcher(lineof);
//              Matcher m5 = pt5.matcher(lineof);
//                Matcher m6 = pt6.matcher(lineof);
//                  Matcher m7 = pt7.matcher(lineof);
//            if(m.find())
//            {
//                System.out.println("LDA create database check;");
//              System.out.println("FIVE WORD 5");
//              System.out.println("ALPHA RESW 2");
//              System.out.println("STA ALPHA"); 
//               
//          }
//            if(m2.find())
//            {
//               // System.out.println(lineof);
//                  System.out.println("LDA create database check;");
//              System.out.println("FIVE WORD 5");
//              System.out.println("ALPHA RESW 2");
//              System.out.println("STA ALPHA"); 
//                
//                
//                
//                
//                System.out.println("STA ALPHA");
//                
//                  
//          }
//            if(!m.find()|!m2.find())
//            {
//                System.out.println("Error "+lineof);
//            }
//            if(m3.find()){
//                  System.out.println("LDA CHARZ");
//              System.out.println("CHARZ Byte 'z'");
//              System.out.println("ALPHA RESB 1");
//            }
//            if(m4.find()){
//                   System.out.println(lineof);
//                  System.out.println("STA ALPHA");
//            }
//            if(!m3.find()|!m4.find()){
//                 System.out.println("Error "+lineof);
//            }
//          }
//          
//            
//    }
//}
//
//    