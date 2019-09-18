
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Compiler {
   
    /*
    [0-9]+ { return INTEGER_LITERAL; }
[a-zA-Z][a-zA-Z0-9]* { return IDENTIFIER; }
*/
    public final static String Mov="1000";
    public final static String ADD="1001";
    public final static String SUB="1002";
    public final static String DIV="1003";
    public final static String MULT="1004";
    public final static String Ax="1006";
    public final static String Bx="1007";
public Compiler(String line){
       ArrayList<String> table=new ArrayList<>();
     table.add("START");
     table.add("MOV");
     table.add("ADD");
     table.add("SUB");
     table.add("DIV");
     table.add("END");
     table.add("MULT");
     table.add("Ax");
     table.add("Bx");
//JOptionPane.showMessageDialog(null,table, "table", 1);
           String all="";
        String sts [] =line.split("\\s");
       for(String lines:sts){
      String stc[]=lines.split(",");
     for ( String coma:stc){
       String stcolon[]=coma.split(";");
    for ( String colon:stcolon){
        
}
     }
       }}}   


