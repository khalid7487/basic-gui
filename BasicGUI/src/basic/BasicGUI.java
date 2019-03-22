package basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KHALID
 */
public class BasicGUI extends javax.swing.JFrame {
    
    String fn, add, country, gend;
    String degree = "";
    String gap = " ";
    JFileChooser fc;
    File dir;
    DefaultTableModel model;
    File file = null;
    
    public BasicGUI() {
        initComponents();
        model = new DefaultTableModel();
        tblstudent.setModel(model);
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("County");
        model.addColumn("Degree");
        model.addColumn("Gender");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        cmbCountry = new javax.swing.JComboBox<>();
        rdmale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        panelDegree = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtareastudent = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btntarea = new javax.swing.JButton();
        btntbl = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information");
        setPreferredSize(new java.awt.Dimension(580, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal info"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name:");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));

        jLabel2.setText("Address:");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jLabel3.setText("Country:");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jLabel4.setText("Gender:");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        jLabel5.setText("Degree:");
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        txtname.setPreferredSize(new java.awt.Dimension(12, 20));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, 150, 28));

        txtaddress.setPreferredSize(new java.awt.Dimension(12, 20));
        jPanel1.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, 28));

        cmbCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Country", "Bangladesh", "India", "China", "Japan" }));
        jPanel1.add(cmbCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 160, 20));

        gender.add(rdmale);
        rdmale.setText("Male");
        jPanel1.add(rdmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 69, -1));

        gender.add(rdFemale);
        rdFemale.setText("Female");
        jPanel1.add(rdFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 74, -1));

        jCheckBox1.setText("SSC");

        jCheckBox2.setText("HSC");

        jCheckBox3.setText("BSC");

        jCheckBox4.setText("MSC");

        javax.swing.GroupLayout panelDegreeLayout = new javax.swing.GroupLayout(panelDegree);
        panelDegree.setLayout(panelDegreeLayout);
        panelDegreeLayout.setHorizontalGroup(
            panelDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDegreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panelDegreeLayout.setVerticalGroup(
            panelDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDegreeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelDegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 260, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 520, 210));

        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Country", "Degree", "Gender"
            }
        ));
        jScrollPane2.setViewportView(tblstudent);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 520, 110));

        txtareastudent.setColumns(20);
        txtareastudent.setRows(5);
        jScrollPane3.setViewportView(txtareastudent);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 520, 90));

        jLabel6.setText("Student List:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, 20));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnsave.setText("save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btntarea.setText("Display in TArea");
        btntarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntareaActionPerformed(evt);
            }
        });

        btntbl.setText("Display in Table");
        btntbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntblActionPerformed(evt);
            }
        });

        btnclear.setText("clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntarea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btntarea)
                    .addComponent(btntbl)
                    .addComponent(btnclear)
                    .addComponent(btnexit))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 510, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        //save
        getAllRecord();
        if (txtname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "please Enter Name");
            txtname.requestFocus();
        } else {
            if (txtaddress.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "please Enter Address.");
                txtaddress.requestFocus();
            } else {
                if (cmbCountry.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Please Select country");
                    cmbCountry.requestFocus();
                } else {
                    fc = new JFileChooser(dir);
                    //add file filter
                    FileNameExtensionFilter filter;
                    filter = new FileNameExtensionFilter("*.txt", new String[]{"txt"});
                    fc.addChoosableFileFilter(filter);
                    int option = fc.showSaveDialog(this);
                    if (option == JFileChooser.APPROVE_OPTION) {
                        dir = fc.getCurrentDirectory();
                        model.addRow(new Object[]{fn, add, country, degree, gend});
                        file = fc.getSelectedFile();
                        try {
                            writeAll();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        degree = "";
                    }
                }
            }
            
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btntareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntareaActionPerformed
        dispTarea();
    }//GEN-LAST:event_btntareaActionPerformed

    private void btntblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntblActionPerformed
        dispTable();
    }//GEN-LAST:event_btntblActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed
    private void getAllRecord() {
        fn = txtname.getText();
        add = txtaddress.getText();
        country = cmbCountry.getSelectedItem().toString();
        if (rdmale.isSelected()) {
            gend = "Male";
        } else {
            gend = "Female";
        }
        //checkboxs
        for (int i = 0; i < panelDegree.getComponentCount(); i++) {
            JCheckBox checkBox = (JCheckBox) panelDegree.getComponent(i);
            if (checkBox.isSelected()) {
                degree += checkBox.getText();
                degree += gap;
            }
        }
    }
    
    private void writeAll() throws IOException {
        BufferedWriter buf = null;
        try {
            buf = new BufferedWriter(new FileWriter(file + getExtention(), true));
            buf.write(fn + "," + add + "," + country + "," + degree + "," + gend);
            buf.newLine();
            JOptionPane.showMessageDialog(rootPane, "Data saved");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (buf != null) {
                buf.close();
            }
        }
    }
    
    private String getExtention() {
        String ext = "";
        String extension = fc.getFileFilter().getDescription();
        if (extension.equals("*.txt")) {
            ext = ".txt";
        }
        return ext;
    }
    
    private void dispTarea() {
        FileInputStream fobj = null;
        fc = new JFileChooser(dir);
        FileNameExtensionFilter filter;
        filter = new FileNameExtensionFilter("*.txt", new String[]{"txt"});
        fc.addChoosableFileFilter(filter);
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            dir = fc.getCurrentDirectory();
            try {
                String str = "";
                fobj = new FileInputStream(file);
                int len = (int) file.length();
                for (int i = 0; i < len; i++) {
                    char str2 = 0;
                    try {
                        str2 = (char) fobj.read();
                        if (str2 == ',') {
                            str2 = '\t';
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    str = str + str2;
                }
                txtareastudent.setText(str);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fobj != null) {
                        fobj.close();
                    }
                } catch (Exception e) {
                }
                
            }
            
        }
        
    }
    
    private void dispTable() {
        InputStream is = null;
        fc = new JFileChooser(dir);
        FileNameExtensionFilter filter;
        filter = new FileNameExtensionFilter("*.txt", new String[]{"txt"});
        fc.addChoosableFileFilter(filter);
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            dir = fc.getCurrentDirectory();
            try {
                File f = file;
                is = new FileInputStream(f);
                Scanner scan = new Scanner(is);
                String[] arr;
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    if (line.indexOf(",") > 1) {
                        arr = line.split(",");
                    } else {
                        arr = line.split("\n");
                    }
                    Object[] data = new Object[arr.length];
                    for (int i = 0; i < data.length; i++) {
                        data[i] = arr[i];
                        
                    }
                    model.addRow(data);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    private void clear() {
        txtname.setText("");
        txtaddress.setText("");
        cmbCountry.setSelectedIndex(0);
        degree = "";
        gender.clearSelection();
        for (int i = 0; i < panelDegree.getComponentCount(); i++) {
            JCheckBox checkbox = (JCheckBox) panelDegree.getComponent(i);
            if (checkbox.isSelected()) {
                checkbox.setSelected(false);
            }
            
        }
        if(tblstudent.getRowCount()>0){
            for (int i = tblstudent.getRowCount()-1; i >-1; i--) {
                model.removeRow(i);
                
            }
        }
        txtareastudent.setText("");
    }

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
            java.util.logging.Logger.getLogger(BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btntarea;
    private javax.swing.JButton btntbl;
    private javax.swing.JComboBox<String> cmbCountry;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelDegree;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdmale;
    private javax.swing.JTable tblstudent;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextArea txtareastudent;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
