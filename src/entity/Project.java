/*
Project Class
 */
package entity;

import MyLibraries.Tools;
import javax.swing.JTable;

public class Project implements MainData{
    private int Project_No;
    private String Project_Name;
    private String Location;
    private int Dep_No;
    private String Dep_Name;

    public int getProject_No() {
        return Project_No;
    }

    public void setProject_No(int Project_No) {
        this.Project_No = Project_No;
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String Project_Name) {
        this.Project_Name = Project_Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getDep_No() {
        return Dep_No;
    }

    public void setDep_No(int Dep_No) {
        this.Dep_No = Dep_No;
    }

    @Override
    public void add() {
        String strAdd= "INSERT INTO project VALUES("
                + Project_No + ","
                + "'" + Project_Name +"',"  //I wrote Project_Name between " "
                + "'" + Location + "',"
                + Dep_No + ","
//                +"'" + Dep_Name +"'" 
                + ")"
                ;
        boolean isAdded= dp.Go.runNonQuery(strAdd);
        if (isAdded) {
            Tools.msgBox("The project is added!");
        }
    } 
    

    @Override
    public void update() {
       String strUpdate= "UPDATE project SET "
               + "Project_Name='" +Project_Name +"',"
               + "Location='" + Location +"',"
               + "Dep_No=" + Dep_No +","
//               + "Dep_Name='"+ Dep_Name +"',"
               + "WHERE Project_No="  + Project_No;
                
               
       boolean isUbdated= dp.Go.runNonQuery(strUpdate);
        if (isUbdated) {
            Tools.msgBox("The project is ubdated!");
        }
    }

    @Override
    public void delete() {
        String strDelete= "DELETE FROM project WHERE Project_No=" + Project_No;// I FORGOT 'FROM'
        boolean isDeleted= dp.Go.runNonQuery(strDelete);
        if (isDeleted) {
            Tools.msgBox("The project is deleted!");
        }
    }

    @Override
    public String getAutoNumber() {
        return dp.Go.getAutoNumber("project", "Project_No");
    }

    @Override
    public void getAllRows(JTable jtable) {
        dp.Go.fillToJTable("project_view", jtable);
    }

    @Override
    public void getOneRow(JTable jtable) {
        String strSelect= "SELECT * FROM project WHERE Project_No="+ Project_No;
        dp.Go.fillToJTable(strSelect, jtable);
    }

    @Override
    public void getCustomRows(String statement, JTable jtable) {
        dp.Go.fillToJTable(statement, jtable);
    }

    @Override
    public String getValueByName(String name) {
       String strSelect= "SELECT Project_No FROM project WHERE Project_Name='" + name +"'";// I wrote + Project_Name instade of name
        String strval=(String) dp.Go.getTableData(strSelect).items[0][0];
        return strval;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect= "SELECT Project_Name FROM project_view WHERE Project_No="+ value;
        String strName= (String) dp.Go.getTableData(strSelect).items[0][0];
        return strName;
    }

    public String getDep_Name() {
        return Dep_Name;
    }

    public void setDep_Name(String Dep_Name) {
        this.Dep_Name = Dep_Name;
    }
    
    
}
