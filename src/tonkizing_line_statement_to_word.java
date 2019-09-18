/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dani
 */
class tonkizing_line_statement_to_word {

  
    String lines;
    String word;
      tonkizing_line_statement_to_word(String sline) {
      lines = sline;
    }

    tonkizing_line_statement_to_word() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public String token(String line){
          String []words = line.split("\\s");
          for(String swords:words)
          {
              System.out.println(swords);
               String create ="create";
          String database="database";
          String dbname ="[a-zA-Z]";
          }
          
          
          return word;
      }
      public void line(){
         
      }
    public static void main(String [] args){
       
             
    }
}
