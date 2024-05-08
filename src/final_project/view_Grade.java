/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package final_project;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jimuel
 */
public class view_Grade extends javax.swing.JFrame {

    /**
     * Creates new form view_Grade
     */
    public view_Grade() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        framePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        menuHeader = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();
        updateGrade = new javax.swing.JButton();
        report = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        updateGradeLabel = new javax.swing.JLabel();
        reportPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        sortGradeButton = new javax.swing.JButton();
        sortNameButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Grading System");

        framePanel.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel.setBackground(new java.awt.Color(224, 100, 100));

        header.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("STUDENT GRADING SYSTEM");
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(header)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(224, 100, 100));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        menuHeader.setBackground(new java.awt.Color(234, 208, 172));

        headerLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Main Menu");

        javax.swing.GroupLayout menuHeaderLayout = new javax.swing.GroupLayout(menuHeader);
        menuHeader.setLayout(menuHeaderLayout);
        menuHeaderLayout.setHorizontalGroup(
            menuHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuHeaderLayout.setVerticalGroup(
            menuHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuHeaderLayout.createSequentialGroup()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        home.setBackground(new java.awt.Color(224, 100, 100));
        home.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home.setText("Home");
        home.setBorder(null);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        addStudent.setBackground(new java.awt.Color(224, 100, 100));
        addStudent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addStudent.setText("Add Student");
        addStudent.setToolTipText("");
        addStudent.setBorder(null);
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        updateGrade.setBackground(new java.awt.Color(224, 100, 100));
        updateGrade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        updateGrade.setText("Update Grade");
        updateGrade.setToolTipText("");
        updateGrade.setBorder(null);
        updateGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateGradeActionPerformed(evt);
            }
        });

        report.setBackground(new java.awt.Color(224, 100, 100));
        report.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        report.setText("View Grades");
        report.setToolTipText("");
        report.setBorder(null);
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(224, 100, 100));
        logout.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logout.setText("Logout");
        logout.setToolTipText("");
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
            .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(menuHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateGrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(report)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(251, 195, 185));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        updateGradeLabel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        updateGradeLabel.setText("---------- VIEW GRADE ----------");

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student Name", "Grade", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportPane.setViewportView(reportTable);
        if (reportTable.getColumnModel().getColumnCount() > 0) {
            reportTable.getColumnModel().getColumn(0).setResizable(false);
            reportTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            reportTable.getColumnModel().getColumn(1).setResizable(false);
            reportTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            reportTable.getColumnModel().getColumn(2).setResizable(false);
            reportTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        sortGradeButton.setText("Sort by grade (Highest to Lowest)");
        sortGradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortGradeButtonActionPerformed(evt);
            }
        });

        sortNameButton.setText("Sort by name (A to Z)");
        sortNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortNameButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortGradeButton)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addComponent(sortNameButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(printButton))
                        .addComponent(updateGradeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(reportPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(updateGradeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportPane, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortGradeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortNameButton)
                    .addComponent(printButton))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout framePanelLayout = new javax.swing.GroupLayout(framePanel);
        framePanel.setLayout(framePanelLayout);
        framePanelLayout.setHorizontalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(framePanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        framePanelLayout.setVerticalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con = null;
    PreparedStatement psm = null;
    ResultSet rs = null;
    Statement sm = null;
    
    private int myID;
    private String myEmail;
    private static DefaultTableModel model;
    
    public view_Grade(int teacherID, String email){
        
        initComponents();
        myID = teacherID;
        myEmail = email;
        
        retrieveData();
    }
    
    public void retrieveData(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradedb", "root", "");

            // Query to retrieve name and grade for all students with the logged in teacherID
            String retrieve = "SELECT name, grade FROM student WHERE teacherID = " + myID;
            PreparedStatement statement = con.prepareStatement(retrieve);
            ResultSet resultSet = statement.executeQuery();

            // ArrayList to store student information
            ArrayList<Student> studentList = new ArrayList<>();

            // Iterate through the result set
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int grade = resultSet.getInt("grade");
                String status = (grade >= 75) ? "Passed" : "Failed"; // Determine pass/fail status

                // Create Student object and add it to the ArrayList
                studentList.add(new Student(name, grade, status));
            }

            // Close the resources
            resultSet.close();
            statement.close();
            con.close();

            // Create a DefaultTableModel with columns: Name, Grade, Status
            model = new DefaultTableModel(new Object[]{"Student Name", "Grade", "Status"}, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Make all cells non-editable
                    return false;
                }
            };

            // Populate the model with student information
            for (Student student : studentList) {
                model.addRow(new Object[]{student.getName(), student.getGrade(), student.getStatus()});
            }

            // Set the table model for reportTable
            reportTable.setModel(model);
            
            // Set column widths
            reportTable.getColumnModel().getColumn(0).setPreferredWidth(180); // Name column width
            reportTable.getColumnModel().getColumn(1).setPreferredWidth(15); // Grade column width
            reportTable.getColumnModel().getColumn(2).setPreferredWidth(40); // Status column width
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    // Student class to store name, grade, and status
    class Student {
        private final String name;
        private final int grade;
        private final String status;

        public Student(String name, int grade, String status) {
            this.name = name;
            this.grade = grade;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }

        public String getStatus() {
            return status;
        }
    }
    
    private void print(){
        
        MessageFormat header = new MessageFormat("Student Report");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        
        try{
            
            reportTable.print(JTable.PrintMode.NORMAL, header, footer);
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(this, e);
        }

    }
    
    
    // SORTING METHODS
    
    // Sort by grade (highest to lowest)
    private void sortTableByGradeDescending() {
        ArrayList<Student> studentList = new ArrayList<>();
        int rowCount = model.getRowCount();

        // Read student data from the table model
        for (int i = 0; i < rowCount; i++) {
            String name = (String) model.getValueAt(i, 0);
            int grade = (int) model.getValueAt(i, 1);
            String status = (String) model.getValueAt(i, 2);
            studentList.add(new Student(name, grade, status));
        }

        // Perform QuickSort algorithm to sort studentList by grade (highest to lowest)
        quickSortByGradeDescending(studentList, 0, studentList.size() - 1);

        // Clear the table model
        model.setRowCount(0);

        // Populate the model with sorted student information
        for (Student student : studentList) {
            model.addRow(new Object[]{student.getName(), student.getGrade(), student.getStatus()});
        }
    }

    private static void quickSortByGradeDescending(ArrayList<Student> studentList, int low, int high) {
        if (low < high) {
            // Median-of-three pivot selection
            int mid = low + (high - low) / 2;
            int pivotIndex = medianOfThree(studentList, low, mid, high);
            // Swap pivot element with the last element to perform partitioning
            Student temp = studentList.get(pivotIndex);
            studentList.set(pivotIndex, studentList.get(high));
            studentList.set(high, temp);

            pivotIndex = partitionByGrade(studentList, low, high);
            quickSortByGradeDescending(studentList, low, pivotIndex - 1);
            quickSortByGradeDescending(studentList, pivotIndex + 1, high);
        }
    }

    private static int partitionByGrade(ArrayList<Student> studentList, int low, int high) {
        int pivot = studentList.get(high).getGrade();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (studentList.get(j).getGrade() > pivot) {
                i++;
                Student temp = studentList.get(i);
                studentList.set(i, studentList.get(j));
                studentList.set(j, temp);
            }
        }

        Student temp = studentList.get(i + 1);
        studentList.set(i + 1, studentList.get(high));
        studentList.set(high, temp);

        return i + 1;
    }
    
    private static int medianOfThree(ArrayList<Student> studentList, int low, int mid, int high) {
        int a = studentList.get(low).getGrade();
        int b = studentList.get(mid).getGrade();
        int c = studentList.get(high).getGrade();
        if ((a - b) * (c - a) >= 0) return low;
        else if ((b - a) * (c - b) >= 0) return mid;
        else return high;
    }
    
    // Sort by name (A to Z)
    private void sortTableByNameAscending() {
        ArrayList<Student> studentList = new ArrayList<>();
        int rowCount = model.getRowCount();

        // Read student data from the table model
        for (int i = 0; i < rowCount; i++) {
            String name = (String) model.getValueAt(i, 0);
            int grade = (int) model.getValueAt(i, 1);
            String status = (String) model.getValueAt(i, 2);
            studentList.add(new Student(name, grade, status));
        }

        // Perform QuickSort algorithm to sort studentList by name (A to Z)
        quickSortByNameAscending(studentList, 0, studentList.size() - 1);

        // Clear the table model
        model.setRowCount(0);

        // Populate the model with sorted student information
        for (Student student : studentList) {
            model.addRow(new Object[]{student.getName(), student.getGrade(), student.getStatus()});
        }
    }

    private static void quickSortByNameAscending(ArrayList<Student> studentList, int low, int high) {
        if (low < high) {
            // Median-of-three pivot selection
            int mid = low + (high - low) / 2;
            int pivotIndex = medianOfThree(studentList, low, mid, high);
            // Swap pivot element with the last element to perform partitioning
            Student temp = studentList.get(pivotIndex);
            studentList.set(pivotIndex, studentList.get(high));
            studentList.set(high, temp);
            
            pivotIndex = partitionByName(studentList, low, high);
            quickSortByNameAscending(studentList, low, pivotIndex - 1);
            quickSortByNameAscending(studentList, pivotIndex + 1, high);
        }
    }

    private static int partitionByName(ArrayList<Student> studentList, int low, int high) {
        String pivot = studentList.get(high).getName();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (studentList.get(j).getName().compareToIgnoreCase(pivot) < 0) {
                i++;
                Student temp = studentList.get(i);
                studentList.set(i, studentList.get(j));
                studentList.set(j, temp);
            }
        }

        Student temp = studentList.get(i + 1);
        studentList.set(i + 1, studentList.get(high));
        studentList.set(high, temp);

        return i + 1;
    }
    
    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_headerMouseClicked

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed

        String retrieve = "SELECT * FROM account where email ='"+ myEmail +"' ";
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradedb","root","");
            sm = con.createStatement();
            rs = sm.executeQuery(retrieve);

            if(rs.next()){

                new main_Menu(rs.getInt(1), rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6)).setVisible(true);
                this.dispose();
            }

        }

        catch(Exception e){

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_homeActionPerformed

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed

        String retrieve = "SELECT * FROM account where email ='"+ myEmail +"' ";
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradedb","root","");
            sm = con.createStatement();
            rs = sm.executeQuery(retrieve);

            if(rs.next()){

                new add_Student(rs.getInt(1), rs.getString(2)).setVisible(true);
                this.dispose();
            }

        }

        catch(Exception e){

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_addStudentActionPerformed

    private void updateGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateGradeActionPerformed

        String retrieve = "SELECT * FROM account where email ='"+ myEmail +"' ";
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradedb","root","");
            sm = con.createStatement();
            rs = sm.executeQuery(retrieve);

            if(rs.next()){

                new update_Grade(rs.getInt(1), rs.getString(2)).setVisible(true);
                this.dispose();
            }

        }

        catch(Exception e){

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_updateGradeActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        
        String retrieve = "SELECT * FROM account where email ='"+ myEmail +"' ";
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradedb","root","");
            sm = con.createStatement();
            rs = sm.executeQuery(retrieve);

            if(rs.next()){

                new view_Grade(rs.getInt(1), rs.getString(2)).setVisible(true);
                this.dispose();
            }

        }

        catch(Exception e){

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_reportActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        int response = JOptionPane.showConfirmDialog(this, "Do you really want to logout?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(response==JOptionPane.YES_OPTION){
            new front_Page().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void sortGradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortGradeButtonActionPerformed
        sortTableByGradeDescending();
    }//GEN-LAST:event_sortGradeButtonActionPerformed

    private void sortNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortNameButtonActionPerformed
        sortTableByNameAscending();
    }//GEN-LAST:event_sortNameButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        print();
    }//GEN-LAST:event_printButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(view_Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_Grade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JPanel framePanel;
    private javax.swing.JLabel header;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton home;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuHeader;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton printButton;
    private javax.swing.JButton report;
    private javax.swing.JScrollPane reportPane;
    private javax.swing.JTable reportTable;
    private javax.swing.JButton sortGradeButton;
    private javax.swing.JButton sortNameButton;
    private javax.swing.JButton updateGrade;
    private javax.swing.JLabel updateGradeLabel;
    // End of variables declaration//GEN-END:variables
}
