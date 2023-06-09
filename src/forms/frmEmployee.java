/*
 Employee Form
 */
package forms;

import myCompany.Tools;
import entity.Department;
import entity.Employee;
import entity.Employee_phones;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hishamls
 */

public class frmEmployee extends javax.swing.JFrame {
    Employee emp= new Employee();
    Department dep = new Department();
    Employee_phones phone= new Employee_phones();
    /**
     * Creates new form frmEmployee
     */
    public frmEmployee() {
        initComponents();
    }
    public static byte[] imgByt;
     String img_path;

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSearch = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new controls.JMyTextBox(30);
        txtEmpNo = new controls.JMyTextBox(15);
        txtEmpName = new controls.JMyTextBox(15);
        txtAddress = new controls.JMyTextBox(15);
        txtSalary = new controls.JMyTextBox(15);
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnAdd = new controls.JMyButton();
        btnUpdate = new controls.JMyButton();
        btnDelete = new controls.JMyButton();
        btnSearch = new controls.JMyButton();
        btnBack = new controls.JMyButton();
        btnClear = new controls.JMyButton();
        rbEmpNo = new javax.swing.JRadioButton();
        rbEmpName = new javax.swing.JRadioButton();
        rbAddress = new javax.swing.JRadioButton();
        rbSalary = new javax.swing.JRadioButton();
        rbHiringDate = new javax.swing.JRadioButton();
        rbBirthDate = new javax.swing.JRadioButton();
        rbDep = new javax.swing.JRadioButton();
        dtHiring = new com.toedter.calendar.JDateChooser();
        dtBirth = new com.toedter.calendar.JDateChooser();
        btnAddDep = new controls.JMyButton();
        btnFind = new controls.JMyButton();
        btngtAllRows = new controls.JMyButton();
        myCombDep = new controls.JMyCombo();
        rbPhone = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpPhone = new javax.swing.JTable();
        btnAddPhone = new controls.JMyButton();
        btnRemove = new controls.JMyButton();
        txtPhone = new controls.JMyTextBox(15);
        jLabel9 = new javax.swing.JLabel();
        lbl_photo2 = new javax.swing.JLabel();
        btnPrint = new controls.JMyButton();
        btnPhoto = new controls.JMyButton();
        txtPhotoPath = new controls.JMyTextBox(30);
        lbl_Photo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 9, -1, -1));

        jLabel2.setText("EmpNo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, -1, -1));

        jLabel3.setText("EmpName");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, -1, -1));

        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 129, -1, -1));

        jLabel5.setText("Salary");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 162, -1, -1));

        jLabel6.setText("HiringDate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 199, -1, -1));

        jLabel7.setText("BirthDate");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, -1, -1));
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 153, 341, -1));
        getContentPane().add(txtEmpNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 67, 393, -1));
        getContentPane().add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 98, 393, 25));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 129, 393, -1));
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 158, 393, -1));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpNo", "EmpName", "Address", "Salary", "HiringDate", "BirthDate", "DepNo", "DepName", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 234, 644, 114));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 324, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 324, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 324, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 144, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, -1, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 324, -1, -1));

        rbEmpNo.setSelected(true);
        rbEmpNo.setText("EmpNo");
        getContentPane().add(rbEmpNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 67, -1, -1));

        rbEmpName.setText("EmpName");
        getContentPane().add(rbEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 67, -1, -1));

        rbAddress.setText("Address");
        getContentPane().add(rbAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 67, -1, -1));

        rbSalary.setText("Salary");
        rbSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSalaryActionPerformed(evt);
            }
        });
        getContentPane().add(rbSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 67, -1, -1));

        rbHiringDate.setText("HiringDate");
        getContentPane().add(rbHiringDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 101, -1, -1));

        rbBirthDate.setText("BirthDate");
        getContentPane().add(rbBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 101, -1, -1));

        rbDep.setText("Department");
        getContentPane().add(rbDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 101, -1, -1));

        dtHiring.setDateFormatString("yyyy-mm-dd");
        getContentPane().add(dtHiring, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 199, 186, -1));

        dtBirth.setDateFormatString("yyyy-mm-dd");
        getContentPane().add(dtBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 234, 178, -1));

        btnAddDep.setText("+");
        btnAddDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDepActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 275, -1, -1));

        btnFind.setText("Find a row");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 373, -1, -1));

        btngtAllRows.setText("Get all rows");
        btngtAllRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngtAllRowsActionPerformed(evt);
            }
        });
        getContentPane().add(btngtAllRows, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 373, -1, -1));
        getContentPane().add(myCombDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 278, 172, -1));

        rbPhone.setText("Phone");
        getContentPane().add(rbPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(959, 101, -1, -1));

        tblEmpPhone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpPhone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEmpPhone);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 422, 287, 78));

        btnAddPhone.setText("Add Phone");
        btnAddPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 469, -1, -1));

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 469, -1, -1));
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 428, 148, -1));

        jLabel9.setText("Phone");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 432, -1, -1));

        lbl_photo2.setText("Photo will appear here");
        getContentPane().add(lbl_photo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 414, 333, 162));

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 366, -1, -1));

        btnPhoto.setText("Photo");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 369, -1, -1));
        getContentPane().add(txtPhotoPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 378, 341, -1));

        lbl_Photo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbl_Photo.setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().add(lbl_Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1017, 243, 234, 153));

        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/MegaTron.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1296, 585));

        setSize(new java.awt.Dimension(1302, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        emp.setEmpNo(2);
//        emp.setEmpName("Ahmed");
//        emp.setAddress("Cairo");
//        emp.setSalary(3000);
//        emp.setHiringDate("2020-5-3");
//        emp.setBirthDate("2000-8-9");
//        emp.setDepNo(5);
        
        // add emp_details
        setValues(); 
        
        emp.add(); 
        
        // add emp_phones
        phone.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        for (int i = 0; i < tblEmpPhone.getRowCount(); i++) {
            phone.setPhoneNo((String) tblEmpPhone.getValueAt(i, 0));
            phone.add();
            }
        
        clearData();
        
        emp.getAllRows(tblEmployee);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
//        emp.setEmpNo(1);
//        emp.setEmpName("Ahmed");
//        emp.setAddress("Alex");
//        emp.setSalary(5000);
//        emp.setHiringDate("2020-5-3");
//        emp.setBirthDate("2000-8-9");
//        emp.setDepNo(5);
        setValues();
        
        emp.update();
        
        phone.setEmpNo(Integer.parseInt(txtEmpNo.getText())); // set comes before updating
        // delete emp_phones
//        phone.delete();
        phone.deleteByEmp();
          // add emp_phones ////
//        phone.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        for (int i = 0; i < tblEmpPhone.getRowCount(); i++) {
            phone.setPhoneNo((String) tblEmpPhone.getValueAt(i, 0));
            phone.add();
            }
        
        clearData();
        
        emp.getAllRows(tblEmployee);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Tools.ConfirmMessege("Are you sure delete?");
        setValues();
        
        emp.delete();
        
        phone.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        phone.deleteByEmp();
        
        clearData();
        
        emp.getAllRows(tblEmployee);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        Tools.openForm(new frmMain());
    }//GEN-LAST:event_btnBackActionPerformed

    private void rbSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSalaryActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       bgSearch.add(rbEmpNo);
       bgSearch.add(rbEmpName);
       bgSearch.add(rbAddress);
       bgSearch.add(rbSalary);
       bgSearch.add(rbHiringDate);
       bgSearch.add(rbBirthDate);
       bgSearch.add(rbDep);
       bgSearch.add(rbPhone);
       
       Tools.setReport(tblEmployee);
       
       emp.getAllRows(tblEmployee);
       
        clearData();
        
        dp.Go.fillCombo("department", "depName", myCombDep);
       
    }//GEN-LAST:event_formWindowOpened

    private void btnAddDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDepActionPerformed
        // First get values of varaibles
        int depNo = Integer.parseInt(dep.getAutoNumber());
        String depName = (String)Tools.inputBox("Enter department name:");
        String depLocation = (String)Tools.inputBox("Enter department location:");
        //Second SET values of variables
        dep.setDepName(depName);
        dep.setDepNo(depNo);
        dep.setLocation(depLocation);
        //Third ADD
        dep.add();
        //Fourth ADJUST compobox
        dp.Go.fillCombo("department", "depName", myCombDep);
        
    }//GEN-LAST:event_btnAddDepActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String empNo= (String) Tools.inputBox("Enter The employee nomber:");
        
        emp.setEmpNo(Integer.parseInt(empNo));
        emp.getOneRow(tblEmployee);
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btngtAllRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngtAllRowsActionPerformed
        emp.getAllRows(tblEmployee);
    }//GEN-LAST:event_btngtAllRowsActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        try {
           int row = tblEmployee.getSelectedRow();
           txtEmpNo.setText(tblEmployee.getValueAt(row, 0).toString());
           txtEmpName.setText(tblEmployee.getValueAt(row, 1).toString());
           txtAddress.setText(tblEmployee.getValueAt(row, 2).toString());
           txtSalary.setText(tblEmployee.getValueAt(row, 3).toString());
           
           SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd");
            Date hdDate = sdf.parse(tblEmployee.getValueAt(row, 4).toString());
            Date bdDate = sdf.parse(tblEmployee.getValueAt(row, 5).toString());
            dtHiring.setDate(hdDate);
            dtBirth.setDate(bdDate);
            
            //depNo (row,6)
            myCombDep.setSelectedItem(tblEmployee.getValueAt(row, 7));
//            .setSelectedItem(tblEmployee.getValueAt(row, 6).toString());

          phone.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
          phone.getAllRows(tblEmpPhone);
//            tblEmpPhone.setValueAt(bdDate, 0, tblEmployee.getSelectedRow());
           
           
            btnAdd.setEnabled(false);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
            
        } catch (Exception e) {
            Tools.msgBox(e.getMessage());
        }

        
    }//GEN-LAST:event_tblEmployeeMouseClicked
    
    private String getMyLike(){
    return "LIKE '%" + txtSearch.getText()+"%'";
    }
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String strSearch= "SELECT * FROM employee_view WHERE ";
        if(rbEmpNo.isSelected())
             strSearch += " EmpNo " + getMyLike();
             else if(rbEmpName.isSelected())
            strSearch += " EmpName " + getMyLike();
        else if(rbAddress.isSelected())
            strSearch += " Address " + getMyLike();
        else if(rbSalary.isSelected())
            strSearch += " Salary " + getMyLike();
        else if(rbHiringDate.isSelected())
            strSearch += " HiringDate " + getMyLike();
        else if(rbBirthDate.isSelected())
            strSearch += " BirthDate " + getMyLike();
        else if (rbDep.isSelected()){                                           
            strSearch += " DepNo " + getMyLike() +
                    " OR DepName " + getMyLike();
            
        } else {                                   // last else without if
            String strEmpNo= phone.getValueByName(txtSearch.getText());
            strSearch+= " EmpNo like'%" + strEmpNo+ "%'"; //no space after like
        }
         emp.getCustomRows(strSearch, tblEmployee);
    }//GEN-LAST:event_btnSearchActionPerformed
    
    private void btnAddPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhoneActionPerformed
            DefaultTableModel model = (DefaultTableModel) tblEmpPhone.getModel();
            model.addRow(new Object[]{txtPhone.getText()});
            txtPhone.setText("");
            txtPhone.requestFocus();
     
    }//GEN-LAST:event_btnAddPhoneActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
          DefaultTableModel model = (DefaultTableModel) tblEmpPhone.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
       Tools.printReport(tblEmployee, "Employee");
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
//        JFileChooser fileChooser= new JFileChooser();
//        fileChooser.showOpenDialog(null);
//        File file = fileChooser.getSelectedFile();
//        String Img_path= file.getAbsolutePath();
//        txtPhotoPath.setText(Img_path);
//        try {
//            File file2= new File(Img_path);
//            FileInputStream FIS= new FileInputStream(file2);
//            ByteArrayOutputStream BAOS= new ByteArrayOutputStream();
//            byte[] lenFile= new byte[1024];
//            for (int i; (i= FIS.read(lenFile))!= -1;  ) {
//                BAOS.write(lenFile, 0, i);
//            }
//            imgByt= BAOS.toByteArray();
//        } catch (Exception e) {
//          Tools.msgBox(e.getMessage());  
//        }
//    ANTHOR WAY:
         //create a file chooser
        JFileChooser fshoz= new JFileChooser();
        fshoz.setCurrentDirectory(new File(System.getProperty("user.home")));
        // detrimen only image file extintions
        FileNameExtensionFilter fltr= new FileNameExtensionFilter("*.images", "jpg", "jpeg", "png", "gif");
        fshoz.addChoosableFileFilter(fltr);
        // if the user select file & get the path
        int fileState= fshoz.showSaveDialog(null);
        if (fileState == JFileChooser.APPROVE_OPTION)        {
            File selectedFile= fshoz.getSelectedFile();
            String path= selectedFile.getAbsolutePath();
            img_path = path;
         //DISPLAY THE IMAGE IN THE JLABLE
//         lbl_foto2.setIcon(new ImageIcon(path));
        lbl_photo2.setIcon(resizePic(path));
         //IF THE USER SELECT CANCEL   
            if (fileState == JFileChooser.CANCEL_OPTION) {
                lbl_photo2.setText("No image selected!");
            }
    }
    }//GEN-LAST:event_btnPhotoActionPerformed
       
                                 
    
    private void clearData() {
        Tools.clearTxt(this);
        txtEmpNo.setText(emp.getAutoNumber());
        txtEmpName.requestFocus();
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }
    
    private void setValues(){
        emp.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
        emp.setEmpName(txtEmpName.getText());
        
        String imgByt= txtPhotoPath.getText();
        ImageIcon icon= new ImageIcon(imgByt);
        lbl_Photo.setIcon(icon);
        
        emp.setAddress(txtAddress.getText());
        emp.setSalary(Double.parseDouble(txtSalary.getText())); // column 4
        // no  name of depNo
        
        SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
        String HDate = String.valueOf(f.format(dtHiring.getDate()));
        String BDate = String.valueOf(f.format(dtBirth.getDate()));
        
        emp.setHiringDate(HDate);
        emp.setBirthDate(BDate);
        
//        String dName = combDep.getSelectedItem().toString();
        String dName = myCombDep.getSelectedItem().toString();
        emp.setDepName(dName);
        
        String dNo = dep.getValueByName(dName);
        emp.setDepNo(Integer.parseInt(dNo));
        
    
    }


 //////////////////////Main Method/////////////////////
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmployee().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSearch;
    private controls.JMyButton btnAdd;
    private controls.JMyButton btnAddDep;
    private controls.JMyButton btnAddPhone;
    private controls.JMyButton btnBack;
    private controls.JMyButton btnClear;
    private controls.JMyButton btnDelete;
    private controls.JMyButton btnFind;
    private controls.JMyButton btnPhoto;
    private controls.JMyButton btnPrint;
    private controls.JMyButton btnRemove;
    private controls.JMyButton btnSearch;
    private controls.JMyButton btnUpdate;
    private controls.JMyButton btngtAllRows;
    private com.toedter.calendar.JDateChooser dtBirth;
    private com.toedter.calendar.JDateChooser dtHiring;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Photo;
    private javax.swing.JLabel lbl_photo2;
    private controls.JMyCombo myCombDep;
    private javax.swing.JRadioButton rbAddress;
    private javax.swing.JRadioButton rbBirthDate;
    private javax.swing.JRadioButton rbDep;
    private javax.swing.JRadioButton rbEmpName;
    private javax.swing.JRadioButton rbEmpNo;
    private javax.swing.JRadioButton rbHiringDate;
    private javax.swing.JRadioButton rbPhone;
    private javax.swing.JRadioButton rbSalary;
    private javax.swing.JTable tblEmpPhone;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpNo;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPhotoPath;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private Icon resizePic(String imgPath) {
         ImageIcon icn= new ImageIcon(imgPath);
        Image img= icn.getImage().getScaledInstance(lbl_photo2.getWidth(), lbl_photo2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newIcn= new ImageIcon(img);
        return newIcn;
    }
}
