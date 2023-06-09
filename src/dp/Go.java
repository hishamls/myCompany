/*
 SQL DATA BASE CONNECTION
 */
package dp;

import myCompany.Tools;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Go {
   private static  String user = "root";
   private static String url = "";
   private static  String DBName = "myCompany";
   private static Connection conn = null;
   
   private static void setURL(){
       url = "jdbc:mysql://localhost:3306/"+ DBName;//+ "?useUnicode= true&characterEncoding=UTF-8"; //   local or any host 
              
   }
   
   private static void setConnection(){
       setURL();
       try {
           conn = DriverManager.getConnection(url, user, "");
           System.out.println("Connection to SQL has been established.");
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       
       } //finally {  Makes errors
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
   
   }
     
   public static boolean chekUserPass(String user, String pass){
       try {
           setConnection();
           Statement stmt = conn.createStatement();
           String strCheck = "SELECT * FROM users WHERE " + "UserName='" + user +
                   "' and "+ "Pass='"+ pass +"'" ;
           stmt.executeQuery(strCheck);
           while (stmt.getResultSet().next()) {
               conn.close();
                return true;               
           }
           conn.close();
           
       } catch (SQLException ex) {
           Tools.msgBox(ex.getMessage());
           
           
       }
       return false;
   
   }
   
   public static boolean runNonQuery(String SQLStatement){ // Only insert(Add) , update, delete
       try {
           setConnection();
           Statement stmt = conn.createStatement();
           stmt.execute(SQLStatement);
           conn.close();
           return true;
       } catch (SQLException ex) {
           Tools.msgBox(ex.getMessage());
           return false;
       }
       
        
   }
   
   public static String getAutoNumber(String tableName, String columnName){
       try {
           setConnection();
           Statement stmt = conn.createStatement();
           String strAuto = "SELECT MAX("+ columnName + ")+1 AS autoNum " + "FROM " + tableName;
           stmt.executeQuery(strAuto);
           String num = "";
           while (stmt.getResultSet().next()) { // next() for stop on first result
               // = while there is a result after last record; = rows not ends ==
               // (true).
               num= stmt.getResultSet().getString("autoNum");// for namming the column
              }
            conn.close();
            
            if (num == null || "".equals(num)) {
               return "1"; //why? I wrot in strAuto "+1"
            }
            else return num;
          
       } catch (SQLException e) {
           Tools.msgBox(e.getMessage());
           return "0";
       }
   
   
   }
   
    public static Table getTableData(String statement) {
//        Tools t = new Tools();
        try {
            setConnection();
            Statement stmt = conn.createStatement();
            
            ResultSet rs;
            rs= stmt.executeQuery(statement);
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            Table table = new Table(c);// onther method
            while (rs.next()) {                
                Object[] row = new Object[c];
                for (int i = 0; i < c; i++) {
                    row[i]= rs.getString(i + 1);// errors almost comes from AUTOCOMLETE
                }
                table.addRow(row);
            }
            conn.close();
            return table;   //return in case true
        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
            return new Table(0); // return an empty table
        }                       //return in case catch false                       //return in case catch false
    }
    
    public static void fillCombo(String tableName, String ColumnName,JComboBox combo){
        try {
            setConnection();
            Statement stmt= conn.createStatement();
            ResultSet rs;
            String strSelect = "SELECT "+ ColumnName +" FROM "+ tableName;
            rs = stmt.executeQuery(strSelect);
            rs.last();
            int c = rs.getRow();
            rs.beforeFirst();
            String[] values = new String[c];
            int i =0;
            while (rs.next()) {
                          
                values[i] = rs.getString(1); // First colmn number = 1
                i++;
                
            }
            conn.close();
            combo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
        }
    
    }
    
    public static void fillToJTable(String tableNameOrSelctStatement,JTable jtable) {
        try {
            setConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs;
            String SPart = tableNameOrSelctStatement.substring(0, 7).toUpperCase();//NOT include cell 7
            String strSelect;
            if ("SELECT ".equals(SPart)) { //If select statement
               strSelect = tableNameOrSelctStatement; 
            } else {        // If table name
                strSelect = "SELECT * FROM "+ tableNameOrSelctStatement;
            }
            rs = stmt.executeQuery(strSelect);
            ResultSetMetaData rsmd = rs.getMetaData();// To handle with tables
            int c = rsmd.getColumnCount();
            DefaultTableModel model = (DefaultTableModel)jtable.getModel();
            Vector row = new Vector();
            model.setRowCount(0);
            while (rs.next()) {                
                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
                    row.add(rs.getString(i));
                    
                }
                model.addRow(row);
            }
            if (jtable.getColumnCount() != c) {
                Tools.msgBox("JTable column count not equal to query column count\n"
                        + " JTable column count is: "+ jtable.getColumnCount()+ "\n "
                                + "Query column count is "+ c);
                
            } 
            conn.close();
        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
        }
    }
    
      public static boolean isEmpty(String... text){  // May calss has 2 or more var.
        for (String string : text) {
            if (string.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    //Overload same name method diff parameters
     public static boolean isEmpty(int... num){  // overloaded
         for (int i : num) {
             if (i > 0) {
              return true;
             }
 
         }
           return false;
            }
     public static boolean isDigit(String... text){
         for (String string : text) {
             if (! string.matches("[0-9]+")) { 
                return false;
             }
         }
         return true;
     }
       public static boolean isText(String... text){
         for (String string : text) {
             if (! string.matches("[a-z]")) { 
                return false;
             }
         }
         return true;
     }
}