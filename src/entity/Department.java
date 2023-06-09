/*
Department
 */
package entity;




import myCompany.Tools;
//import myCompany.Table;
import javax.swing.JTable;


public class Department implements MainData{
    private int depNo;
    private String depName;
    private String location;

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void add() {
      String strInsert = "INSERT INTO department VALUES "
              + "(" + depNo +","+
                 "'"+ depName +"',"+
                "'"+ location+ "')";
      boolean isAdd= dp.Go.runNonQuery(strInsert);
      if(isAdd){
          Tools.msgBox("new department data is added successfully!");
      }
    }

    @Override
    public void update() {
        String strUbdate= "UPDATE department SET "
                + "depName='" + depName + "',"
                + "location='" + location + "'"// "'" is nesseccery to avoid aknown field error
                + " WHERE depNo= " + depNo;
        boolean isUbdated= dp.Go.runNonQuery(strUbdate);
        if (isUbdated) {
            Tools.msgBox("Department is updated successfully!");
        }
              
    }

    @Override
    public void delete() {
        String strDelete= "DELETE FROM department"
                + " WHERE depNo= " + depNo; //notice the indetce space
        boolean isDeleted= dp.Go.runNonQuery(strDelete);
        if (isDeleted){
            Tools.msgBox("Deleted  successfully!");
        }
    }

    @Override
    public String getAutoNumber() {
       return dp.Go.getAutoNumber("department", "depNo");
    }

    @Override
    public void getAllRows(JTable jtable) {
        dp.Go.fillToJTable("department", jtable);
    }

    @Override
    public void getOneRow(JTable jtable) {
        String strSelect = "SELECT * FROM department "+ "WHERE depNo= " + depNo;
        dp.Go.fillToJTable(strSelect, jtable);
    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        dp.Go.fillToJTable(statement, jtable);
    }

    @Override 
    public String getValueByName(String name) { // must be string method
        String strSelect = "SELECT depNo FROM department " + "WHERE depName='"+ name+ "'";
        String strVal = (String)dp.Go.getTableData(strSelect).items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {// must be string method
        String strSelcet = "SELECT depName FROM department "+ "WHERE depNo='"+ value+ "'";
        String strVal = (String)dp.Go.getTableData(strSelcet).items[0][0];
        return strVal;
       
    }




    
}