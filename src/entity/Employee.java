/*
Employee class
 */
package entity;

import myCompany.Tools;
import javax.swing.JTable;


public class Employee implements MainData{
    private int EmpNo;
    private String EmpName;
    private byte Photo;
    private String Address;
    private double Salary;
    private String HiringDate;
    private String BirthDate;
    private int DepNo;      // From onther class
    private String DepName; // From onther class
    
    //No constructors?!

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getHiringDate() {
        return HiringDate;
    }

    public void setHiringDate(String HiringDate) {
        this.HiringDate = HiringDate;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public int getDepNo() {
        return DepNo;
    }

    public void setDepNo(int DepNo) {
        this.DepNo = DepNo;
    }

    
    @Override
    public void add() {
        String strInsert= "INSERT INTO employee VALUES ( " 
                + EmpNo + ", "
                + "'" + EmpName + "', " //space after coma
                + Photo  + ", "
                + "'" + Address + "', "
                + Salary + ", "
                + "'" + HiringDate + "', "
                + "'" + BirthDate + "', "
                + DepNo  + ", "
                + "'" + DepName + "')";
                          
        boolean isAdd= dp.Go.runNonQuery(strInsert);
        if (isAdd) 
            Tools.msgBox("The new Employee is add!");
        }
        
    
            

    @Override
    public void update() {
        String strUpdate= "UPDATE employee SET "
                + "EmpName='" + EmpName + "',"
                + "Photo=" + Photo
                 + "Address='" + Address + "',"
                 + "Salary=" + Salary + ","
                 + "HiringDate='" + HiringDate + "',"
                + "BirthDate='" + BirthDate + "',"
                + "DepNo=" + DepNo 
                + " WHERE EmpNo=" + EmpNo;
        boolean IsUpdate= dp.Go.runNonQuery(strUpdate);
        if (IsUpdate) {
            Tools.msgBox("This employee is updated!");
        }
    }

    @Override
    public void delete() {
        String strDelete= "DELETE FROM employee"
                            + " WHERE EmpNo=" + EmpNo;
        boolean isdeleted= dp.Go.runNonQuery(strDelete);
        if (isdeleted) {
            Tools.msgBox( "Employee no. " +EmpNo + " is deleted!");
        }
    }

    @Override
    public String getAutoNumber() {
        return dp.Go.getAutoNumber("employee", "EmpNo");
    }

    @Override
    public void getAllRows(JTable table) {
        dp.Go.fillToJTable("employee_view", table); //employee_data
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect= "SELECT * FROM employee "                
                + "WHERE EmpNo=" + EmpNo ;
        dp.Go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        dp.Go.fillToJTable(statement, jtable);
    }

    @Override
    public String getValueByName(String name) { //value == no.
        String strSelect= "SELECT EmpNo FROM employee WHERE "+
                "EmpName='" + name+ "'";
        String strVal= (String) dp.Go.getTableData(strSelect).items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect= "SELECT EmpName FROM employee WHERE "+
                "EmpNo='" + value + "'";
       String strName= dp.Go.getTableData(strSelect).items[0][0].toString();// ==(String)
        return strName;
    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String DepName) {
        this.DepName = DepName;
    }

    public byte getPhoto() {
        return Photo;
    }

    public void setPhoto(byte Photo) {
        this.Photo = Photo;
    }
    
    
}