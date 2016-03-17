
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kshitij
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
class registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public registration() {
        initComponents();
        Properties prop = new Properties();
	InputStream input = null;
        String IP="";

	try {

		input = new FileInputStream("config.properties");

		// load a properties file
		prop.load(input);

		// get the property value and print it out
		IP=prop.getProperty("ServerIP");
		username=prop.getProperty("dbuser");
		password=prop.getProperty("dbpassword");

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
        url="jdbc:mysql://"+IP+":3306/project";
        //username="root";
        //password="kshitij421";
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        PNAME = new javax.swing.JTextField();
        PDOB = new javax.swing.JTextField();
        PBG = new javax.swing.JTextField();
        PHT = new javax.swing.JTextField();
        PWT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PAdd = new javax.swing.JTextArea();
        PContact = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        SearchByNameTable = new javax.swing.JTable();
        SearchbyNameEdit = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ARPatientId = new javax.swing.JTextField();
        ARDate = new javax.swing.JFormattedTextField();
        ARTime = new javax.swing.JFormattedTextField();
        RegisterAppointment = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        ARDiagnosis = new javax.swing.JTextField();
        TimeCombo = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TodaysAppTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        Todays_appnt_date = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        View_appint_date = new javax.swing.JFormattedTextField();
        View_appint_button = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Viewapptable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AvailablebedTable = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        AssignBedPidEdit = new javax.swing.JTextField();
        AssignBedidEdit = new javax.swing.JTextField();
        AssignBedButton = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        AssignbedAvailableTable = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        AssignBedChargedTable = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        CancelBedPidEdit = new javax.swing.JTextField();
        CancelBedButton = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        EditBedTable = new javax.swing.JTable();
        AddBedButton = new javax.swing.JButton();
        RemoveBedButton = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        EditRoomTable = new javax.swing.JTable();
        AddRoomButton = new javax.swing.JButton();
        RemoveRoomButton = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PDetailEdit = new javax.swing.JTextField();
        View_patientdetail_button = new javax.swing.JButton();
        Patient_detail_panel = new javax.swing.JPanel();
        PDetailAppTab = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        PDetailNameEdit = new javax.swing.JTextField();
        PDetailDobEdit = new javax.swing.JTextField();
        PDetailBGEdit = new javax.swing.JTextField();
        PDetailWtEdit = new javax.swing.JTextField();
        PDetailHtEdit = new javax.swing.JTextField();
        PDetailPinEdit = new javax.swing.JTextField();
        PDetailCityEdit = new javax.swing.JTextField();
        PDetailContactEdit = new javax.swing.JTextField();
        PDetailEmailEdit = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        PDetailAddEdit = new javax.swing.JTextArea();
        jPanel38 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        PAllAppTable = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AdmitedInfoTable = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PBillPidEdit = new javax.swing.JTextField();
        PBillAdEdit = new javax.swing.JTextField();
        GenerateBillButton = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        NameCheck = new javax.swing.JCheckBox();
        DOBcheck = new javax.swing.JCheckBox();
        BGcheck = new javax.swing.JCheckBox();
        Wtcheck = new javax.swing.JCheckBox();
        Htcheck = new javax.swing.JCheckBox();
        Addresscheck = new javax.swing.JCheckBox();
        Pincodecheck = new javax.swing.JCheckBox();
        citycheck = new javax.swing.JCheckBox();
        contactcheck = new javax.swing.JCheckBox();
        Emailcheck = new javax.swing.JCheckBox();
        jPanel34 = new javax.swing.JPanel();
        namecheckedit = new javax.swing.JTextField();
        dobcheckedit = new javax.swing.JTextField();
        bgcheckedit = new javax.swing.JTextField();
        wtcheckedit = new javax.swing.JTextField();
        Htcheckedit = new javax.swing.JTextField();
        PincodecheckEdit = new javax.swing.JTextField();
        citycheckedit = new javax.swing.JTextField();
        ContactcheckEdit = new javax.swing.JTextField();
        EmailcheckEdit = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        Addrescheckedit = new javax.swing.JTextArea();
        PDetailEditButton = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel30 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        ServerIPEdit = new javax.swing.JTextField();
        DBUserNameEdit = new javax.swing.JTextField();
        DBpasswordEdit = new javax.swing.JTextField();
        OKButton = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sahyadri Hospital");
        setName("Sahyadri Hospital"); // NOI18N

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel6.setText("Address");

        jLabel4.setText("Height");

        jLabel5.setText("Weight");

        jLabel7.setText("Contact No.");

        jLabel3.setText("BG");

        jLabel1.setText("Name");

        jLabel2.setText("DOB");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDOBActionPerformed(evt);
            }
        });

        PBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBGActionPerformed(evt);
            }
        });

        PAdd.setColumns(20);
        PAdd.setRows(5);
        jScrollPane1.setViewportView(PAdd);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(PNAME, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PDOB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PBG, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PHT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PWT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PContact))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PBG, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PHT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PWT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Register.setText("Register");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cantarell", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(96, 50, 50));
        jLabel8.setText("                                          Register For New Patient");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(709, 709, 709)
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(601, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Registration", jPanel7);

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SearchByNameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(SearchByNameTable);

        SearchbyNameEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchbyNameEditKeyReleased(evt);
            }
        });

        jLabel22.setText("Enter Name");

        jLabel23.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(145, 11, 19));
        jLabel23.setText("Enter patient Name to  Search ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchbyNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchbyNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel12.setText("Patient Id:");

        jLabel13.setText("Date:");

        jLabel14.setText("Time:");

        ARPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARPatientIdActionPerformed(evt);
            }
        });

        ARDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARDateActionPerformed(evt);
            }
        });

        RegisterAppointment.setText("Register Appointment");
        RegisterAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterAppointmentMouseClicked(evt);
            }
        });
        RegisterAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterAppointmentActionPerformed(evt);
            }
        });

        jLabel25.setText("Diagnosis:");

        ARDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARDiagnosisActionPerformed(evt);
            }
        });

        TimeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));

        jLabel21.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(147, 10, 15));
        jLabel21.setText("Register New Appointment");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap(336, Short.MAX_VALUE)
                        .addComponent(RegisterAppointment))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ARPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ARDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ARDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(ARTime, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ARPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ARDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ARTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ARDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RegisterAppointment)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 342, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("New  Registration", jPanel6);

        Object[] columnname= {
            "PID", "PName","Date", "TIME", "Diagnosis"
        };
        javax.swing.table.DefaultTableModel model=new DefaultTableModel(columnname,0);
        TodaysAppTable.setModel(model);
        jScrollPane2.setViewportView(TodaysAppTable);

        jLabel11.setText("Today's Date:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(Todays_appnt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Todays_appnt_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Today's Appointment", jPanel4);

        jLabel9.setText("                          Enter Date to  view Appointment details:");

        jLabel10.setText("Date:");

        View_appint_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        View_appint_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_appint_dateActionPerformed(evt);
            }
        });

        View_appint_button.setText("View Appintment");
        View_appint_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_appint_buttonMouseClicked(evt);
            }
        });
        View_appint_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_appint_buttonActionPerformed(evt);
            }
        });

        Object[] columnname2= {
            "PID", "PName","Date", "TIME", "Diagnosis"
        };
        javax.swing.table.DefaultTableModel model2=new DefaultTableModel(columnname2,0);
        Viewapptable.setModel(model2);
        jScrollPane3.setViewportView(Viewapptable);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(View_appint_date, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(View_appint_button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(353, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(View_appint_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(View_appint_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        View_appint_date.getAccessibleContext().setAccessibleName("");
        jPanel10.setVisible(false);

        jTabbedPane2.addTab("View Appointment", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1229, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Appointment", jPanel2);

        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jLabel24.setText("Enter Ward Type:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<none>", "General", "Special", "ICU" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AvailablebedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(AvailablebedTable);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jPanel25.setVisible(false);

        jTabbedPane4.addTab("Available Bed", jPanel14);

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel29.setText("PID");

        jLabel30.setText("Bed ID");

        AssignBedPidEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignBedPidEditActionPerformed(evt);
            }
        });

        AssignBedidEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignBedidEditActionPerformed(evt);
            }
        });

        AssignBedButton.setText("Assign Bed");
        AssignBedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssignBedButtonMouseClicked(evt);
            }
        });
        AssignBedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignBedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AssignBedPidEdit)
                    .addComponent(AssignBedidEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addComponent(AssignBedButton)
                .addGap(60, 60, 60))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssignBedPidEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssignBedidEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(AssignBedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setText("Available Bed");

        AssignbedAvailableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(AssignbedAvailableTable);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel28.setText("Charges for each bed");

        AssignBedChargedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(AssignBedChargedTable);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setText("PID");

        CancelBedButton.setText("Cancel bed");
        CancelBedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelBedButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CancelBedPidEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelBedButton)
                .addGap(74, 74, 74))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelBedPidEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CancelBedButton)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Assign Bed", jPanel20);

        jLabel31.setText("Bed");

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EditBedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(EditBedTable);

        AddBedButton.setText("+");
        AddBedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBedButtonMouseClicked(evt);
            }
        });
        AddBedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBedButtonActionPerformed(evt);
            }
        });

        RemoveBedButton.setText("-");
        RemoveBedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveBedButtonMouseClicked(evt);
            }
        });
        RemoveBedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(633, Short.MAX_VALUE)
                .addComponent(AddBedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveBedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBedButton)
                    .addComponent(RemoveBedButton)))
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel29Layout.createSequentialGroup()
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 32, Short.MAX_VALUE)))
        );

        jLabel35.setForeground(java.awt.SystemColor.activeCaption);
        jLabel35.setText("refresh");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(111, 111, 111))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel35)
                .addGap(1, 1, 1)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jLabel33.setText("Room Type");

        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EditRoomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(EditRoomTable);

        AddRoomButton.setText("+");
        AddRoomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddRoomButtonMouseClicked(evt);
            }
        });
        AddRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoomButtonActionPerformed(evt);
            }
        });

        RemoveRoomButton.setText("-");
        RemoveRoomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveRoomButtonMouseClicked(evt);
            }
        });
        RemoveRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveRoomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(633, Short.MAX_VALUE)
                .addComponent(AddRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddRoomButton)
                    .addComponent(RemoveRoomButton)))
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel32Layout.createSequentialGroup()
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 32, Short.MAX_VALUE)))
        );

        jLabel34.setForeground(java.awt.SystemColor.activeCaption);
        jLabel34.setText("refresh");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(116, 116, 116))
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(6, 6, 6)))
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel36Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(416, Short.MAX_VALUE)))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel36Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(440, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Edit Bed Info", jPanel36);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane1.addTab("Ward Info", jPanel3);

        jLabel15.setText("Enter patient registration Id to vie Details");

        jLabel16.setText("Patient Registration id:");

        PDetailEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDetailEditActionPerformed(evt);
            }
        });

        View_patientdetail_button.setText("View Details");
        View_patientdetail_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_patientdetail_buttonMouseClicked(evt);
            }
        });
        View_patientdetail_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_patientdetail_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(PDetailEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(View_patientdetail_button, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PDetailEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(View_patientdetail_button, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Patient_detail_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Patient_detail_panel.setVisible(false);

        PDetailAppTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        PDetailAppTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PDetailAppTabMouseClicked(evt);
            }
        });

        PDetailNameEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDetailNameEditActionPerformed(evt);
            }
        });

        PDetailAddEdit.setColumns(20);
        PDetailAddEdit.setRows(3);
        jScrollPane12.setViewportView(PDetailAddEdit);

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PDetailDobEdit)
                    .addComponent(PDetailNameEdit)
                    .addComponent(PDetailBGEdit)
                    .addComponent(PDetailCityEdit)
                    .addComponent(PDetailContactEdit)
                    .addComponent(PDetailEmailEdit)
                    .addComponent(jScrollPane12)
                    .addComponent(PDetailPinEdit)
                    .addComponent(PDetailHtEdit)
                    .addComponent(PDetailWtEdit))
                .addGap(0, 223, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(PDetailNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDetailDobEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDetailBGEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDetailWtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDetailHtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDetailPinEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDetailCityEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDetailContactEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDetailEmailEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel39.setText("Name");

        jLabel40.setText("DOB");

        jLabel41.setText("BloodGroup");

        jLabel42.setText("Weight");

        jLabel43.setText("Height");

        jLabel44.setText("Address");

        jLabel45.setText("Pincode");

        jLabel46.setText("City");

        jLabel47.setText("Contact No.");

        jLabel17.setText("E-mail");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        PDetailAppTab.addTab("personal Info.", jPanel15);

        PAllAppTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(PAllAppTable);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        PDetailAppTab.addTab("Appointments", jPanel16);

        AdmitedInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(AdmitedInfoTable);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(497, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        PDetailAppTab.addTab("Admited Info", jPanel18);

        jLabel18.setText("Pid");

        jLabel19.setText("Treatment Date/Admited Date");

        PBillAdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBillAdEditActionPerformed(evt);
            }
        });

        GenerateBillButton.setText("Generate Bill");
        GenerateBillButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerateBillButtonMouseClicked(evt);
            }
        });
        GenerateBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateBillButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GenerateBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(150, 150, 150)
                            .addComponent(PBillPidEdit))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(PBillAdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PBillPidEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PBillAdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(GenerateBillButton)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        PDetailAppTab.addTab("Bill", jPanel17);

        jLabel26.setText("Tick Fields You want to edit:");

        NameCheck.setText("Name");
        NameCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameCheckActionPerformed(evt);
            }
        });

        DOBcheck.setText("DOB");
        DOBcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBcheckActionPerformed(evt);
            }
        });

        BGcheck.setText("BG");

        Wtcheck.setText("Wt");

        Htcheck.setText("Ht");

        Addresscheck.setText("Address:");

        Pincodecheck.setText("Pincode:");

        citycheck.setText("City:");

        contactcheck.setText("Contact No.");

        Emailcheck.setText("Email:");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactcheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pincodecheck, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Addresscheck, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Emailcheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Wtcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Htcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BGcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(NameCheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                        .addComponent(DOBcheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                                    .addComponent(citycheck, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(NameCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DOBcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BGcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Wtcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Htcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addresscheck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pincodecheck, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(citycheck, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Emailcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        namecheckedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namecheckeditActionPerformed(evt);
            }
        });

        Addrescheckedit.setColumns(20);
        Addrescheckedit.setRows(3);
        jScrollPane10.setViewportView(Addrescheckedit);

        PDetailEditButton.setText("Edit");
        PDetailEditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PDetailEditButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dobcheckedit)
                    .addComponent(namecheckedit)
                    .addComponent(bgcheckedit)
                    .addComponent(citycheckedit)
                    .addComponent(ContactcheckEdit)
                    .addComponent(EmailcheckEdit)
                    .addComponent(jScrollPane10)
                    .addComponent(PincodecheckEdit)
                    .addComponent(Htcheckedit)
                    .addComponent(wtcheckedit))
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PDetailEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(namecheckedit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dobcheckedit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgcheckedit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wtcheckedit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Htcheckedit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PincodecheckEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(citycheckedit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContactcheckEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailcheckEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PDetailEditButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(607, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        PDetailAppTab.addTab("Edit Patient Details", jPanel35);

        javax.swing.GroupLayout Patient_detail_panelLayout = new javax.swing.GroupLayout(Patient_detail_panel);
        Patient_detail_panel.setLayout(Patient_detail_panelLayout);
        Patient_detail_panelLayout.setHorizontalGroup(
            Patient_detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Patient_detail_panelLayout.createSequentialGroup()
                .addComponent(PDetailAppTab)
                .addContainerGap())
        );
        Patient_detail_panelLayout.setVerticalGroup(
            Patient_detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Patient_detail_panelLayout.createSequentialGroup()
                .addComponent(PDetailAppTab, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Patient_detail_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Patient_detail_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Patient Details", jPanel1);

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel36.setText("Server IP");

        jLabel37.setText("DB UserName");

        jLabel38.setText("DB Password");

        ServerIPEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerIPEditActionPerformed(evt);
            }
        });

        DBUserNameEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBUserNameEditActionPerformed(evt);
            }
        });

        OKButton.setText("OK");
        OKButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ServerIPEdit)
                            .addComponent(DBpasswordEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(DBUserNameEdit)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(729, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServerIPEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DBUserNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DBpasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(OKButton)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Edit Server Info", jPanel30);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1088, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Change Login Id", jPanel27);

        jTabbedPane1.addTab("Setings", jTabbedPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        

    @Override
    public void setTitle(String title) {
        super.setTitle("Sahyadri Hospital"); //To change body of generated methods, choose Tools | Templates.
    }

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterActionPerformed

    private void PBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBGActionPerformed
 
    private void PDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PDOBActionPerformed

    private void View_appint_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_appint_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_appint_dateActionPerformed

    private void View_appint_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_appint_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_appint_buttonActionPerformed

    private void RegisterAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterAppointmentActionPerformed

    private void ARDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ARDateActionPerformed

    private void ARPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ARPatientIdActionPerformed

    private void PDetailEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDetailEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PDetailEditActionPerformed

    private void View_patientdetail_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_patientdetail_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_patientdetail_buttonActionPerformed

    private void View_patientdetail_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_patientdetail_buttonMouseClicked
        
        Patient_detail_panel.setVisible(true);        // TODO add your handling code here:
        try
        {
            String pid=PDetailEdit.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from patient where pid='"+pid+"';");
            while(rs.next())
            {
                PDetailNameEdit.setText(rs.getString(2));
                PDetailDobEdit.setText(rs.getString(3));
                PDetailBGEdit.setText(rs.getString(4));
                PDetailContactEdit.setText(rs.getString(5));
                PDetailAddEdit.setText(rs.getString(6));
                PDetailHtEdit.setText(rs.getString(7));
                PDetailWtEdit.setText(rs.getString(8));
                PDetailPinEdit.setText(rs.getString(9));
                PDetailCityEdit.setText(rs.getString(10));
                PDetailEmailEdit.setText(rs.getString(11));
            }
            Object[]column={"Sr.No.","BedNo","Admited Date","Discharge date"};
            Object[]row=new Object[4];
            DefaultTableModel model=new DefaultTableModel(column,0);
            rs=st.executeQuery("select * from admited where Pid='"+pid+"';");
            int i=1;
            while(rs.next())
            {
                row[0]=i++;
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[3]=rs.getString(4);
                model.addRow(row);
            }
            AdmitedInfoTable.setModel(model);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_View_patientdetail_buttonMouseClicked

    private void View_appint_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_appint_buttonMouseClicked
                jPanel10.setVisible(true); 
            
            // TODO add your handling code here:
        try
        {
            Viewapptable.setBackground(jPanel10.getBackground());
            Object[] row=new Object[5];
            Object[] columnname2= {"PID", "PName","Date", "TIME", "Diagnosis"};
            javax.swing.table.DefaultTableModel model2=new DefaultTableModel(columnname2,0);
            String date=View_appint_date.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select a.Pid,p.name,ADate,ATime,Diagnosis from appointment a left join patient p on p.pid=a.Pid where a.ADate ='"+date+"';");
            while(rs.next())
            {
                row[0]=rs.getString("Pid");
                row[1]=rs.getString("name");
                row[2]=rs.getString("ADate");
                row[3]=rs.getString("ATime");
                row[4]=rs.getString("Diagnosis");
                model2.addRow(row);
            }
            Viewapptable.setModel(model2);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_View_appint_buttonMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

        jPanel25.setVisible(true); // TODO add your handling code here:
        Object[] row=new Object[5];
        Object[] column={"Sr.No","Bed Id","Room Id","Type"};
        javax.swing.table.DefaultTableModel model=new DefaultTableModel(column,0);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            String Query="select b.Bedid,r.Roomid,r.Type from bed b left join room r on r.Roomid=b.Roomid where b.Bedid not in (select A.Bedid from admited as A where DDate is NULL )";
            if(evt.getItem()=="General")
            {
                Query+="and  r.Type='"+evt.getItem()+"';";
                ResultSet rs=st.executeQuery(Query);
                int i=1;
                while(rs.next())
                {
                    row[0]=i++;
                    row[1]=rs.getString("Bedid");
                    row[2]=rs.getString("Roomid");
                    row[3]=rs.getString("Type");
                    model.addRow(row);
                }
               
            }
            else if(evt.getItem()=="Special")
            {
                Query+="and r.Type='"+evt.getItem()+"';";
                ResultSet rs=st.executeQuery(Query);
                int i=1;
                while(rs.next())
                {
                    row[0]=i++;
                    row[1]=rs.getString("Bedid");
                    row[2]=rs.getString("Roomid");
                    row[3]=rs.getString("Type");
                    model.addRow(row);
                }
                
            }
            else if(evt.getItem()=="ICU")
            {
                Query+="and and r.Type='"+evt.getItem()+"';";
                ResultSet rs=st.executeQuery(Query);
                int i=1;
                while(rs.next())
                {
                    row[0]=i++;
                    row[1]=rs.getString("Bedid");
                    row[2]=rs.getString("Roomid");
                    row[3]=rs.getString("Type");
                    model.addRow(row);
                }
               
            }
             con.close();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        AvailablebedTable.setModel(model);

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
         // TODO add your handling code here:
        
            String Pname=PNAME.getText();
            String Pdob=PDOB.getText();
            String Pbg=PBG.getText();
            String Padd=PAdd.getText();
            String Pphno=PContact.getText();
            String pht=PHT.getText();
            String pwt=PWT.getText();
            String Pid="";
            Pid+=Pname.charAt(0);
            Pid+=Pname.charAt(Pname.length()-1);
            String[] dob = new String[3];
            dob=Pdob.split("/");
            Pid+=dob[0];
            Pid+=dob[2];
            Pid+=Pphno.charAt(8);
            Pid+=Pphno.charAt(9);
            try
            {
            Statement stmt;
            Connection con;
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username,password); 

            stmt = con.createStatement();
            stmt.executeUpdate("Insert into patient values("+"'"+Pid+"','"+Pname+"','"+Pdob+"','"+Pbg+"','"+Pphno+"','"+Padd+"','"+pht+"','"+pwt+"',NULL,NULL,NULL);");
            con.close();
            JOptionPane.showMessageDialog(this, "Patient Register Successfully. with PID: "+Pid,"InfoMessage", JOptionPane.INFORMATION_MESSAGE);
            PNAME.setText("");
            PAdd.setText("");
            PBG.setText("");
            PHT.setText("");
            PWT.setText("");
            PContact.setText("");
            PDOB.setText("");
            }
            catch(Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(this,"DataBase Error","InfoMessage", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
    }//GEN-LAST:event_RegisterMouseClicked

    private void RegisterAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterAppointmentMouseClicked
        // TODO add your handling code here:
        try
        {
            DateFormat dd= new SimpleDateFormat("HH:mm:ss");
            java.util.Date date=new java.util.Date();
            String Time=new String(dd.format(date));
            int[] CurrentTime1=new int[3];
            int[] Atime1=new int[2];
            
            DateFormat dd1=new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date date1=new java.util.Date();
            String Date=new String(dd1.format(date1));
            int[]CurrentDate=new int[3];
            int[] ADate1=new int[3];
            
            String Pid=ARPatientId.getText();
            String ADate=ARDate.getText();
            String ATime=ARTime.getText();
            
            Thread timechecker=new Thread(){
                public void run()
                {
                    String[] Time2=new String[3];
                    String[] Atime2=new String[2];
                    Time2=Time.split(":");
                    CurrentTime1[0]=Integer.parseInt(Time2[0]);
                    CurrentTime1[1]=Integer.parseInt(Time2[1]);
                    CurrentTime1[2]=Integer.parseInt(Time2[2]);
                    //System.out.println(Time);
                    
                    if(TimeCombo.getSelectedItem()=="PM")
                    {
                        Atime2=ATime.split(":");
                        Atime1[0]=Integer.parseInt(Atime2[0])+12;
                        Atime1[1]=Integer.parseInt(Atime2[1]);
               
                    }
                    //System.out.println("Timechecker Thread Completed");
                }
            };
            Thread datechecker=new Thread(){
                public void run(){
                    String[] Date2=new String[3];
                    String[] ADate2=new String[3];
                    Date2=Date.split("/");
                    CurrentDate[0]=Integer.parseInt(Date2[0]);
                    CurrentDate[1]=Integer.parseInt(Date2[1]);
                    CurrentDate[2]=Integer.parseInt(Date2[2]);
                    //System.out.println(Date);
                    
                    ADate2=ADate.split("/");
                    ADate1[0]=Integer.parseInt(ADate2[0]);
                    ADate1[1]=Integer.parseInt(ADate2[1]);
                    ADate1[2]=Integer.parseInt(ADate2[2]);
                    //System.out.println("DateChecker Thread Completed");
                }
            };
            timechecker.start();
            datechecker.start();
            timechecker.join();
            datechecker.join();
            String Diagnosis=ARDiagnosis.getText();
            if((ADate1[0]<=CurrentDate[0]&&(ADate1[1]<=CurrentDate[1]&&(ADate1[2]<=CurrentDate[2])))&&!(ADate1[2]==CurrentDate[2] && ADate1[1]==CurrentDate[1] && ADate1[0]==CurrentDate[0]))
            {
                //System.out.println("prev Date app avoid");
                JOptionPane.showMessageDialog(this,"Please Enter Valid Appointment Information","InfoMessage", JOptionPane.INFORMATION_MESSAGE);
                return; 
            }
            else if(ADate1[2]==CurrentDate[2] && ADate1[1]==CurrentDate[1] && ADate1[0]==CurrentDate[0])
            {
                //System.out.println("Todays Date Checker");
                //System.out.println(Atime1[0]+":"+Atime1[1]);
                if((Atime1[0]<=CurrentTime1[0]) && (Atime1[0]<CurrentTime1[0] || Atime1[1]<CurrentTime1[1]))
                {
                    //System.out.println("Back Time Checker Block");
                    JOptionPane.showMessageDialog(this,"Please Enter Valid Appointment Information","InfoMessage", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                else
                {
                    //System.out.println("In Timechecker block");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection(url,username,password);
                    Statement st=con.createStatement();
                    st.executeUpdate("insert into appointment values('"+Pid+"','"+ADate+"','"+ATime+"','"+Diagnosis+"');");
            
                    JOptionPane.showMessageDialog(this,"Appointment register successfully","InfoMessage", JOptionPane.INFORMATION_MESSAGE);
                    con.close();
                }
            }
            else
            {
                //System.out.println("inelse block");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(url,username,password);
                Statement st=con.createStatement();
                st.executeUpdate("insert into appointment values('"+Pid+"','"+ADate+"','"+ATime+"','"+Diagnosis+"');");
            
                JOptionPane.showMessageDialog(this,"Appointment register successfully","InfoMessage", JOptionPane.INFORMATION_MESSAGE);
                con.close();   
            }
        
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"DataBase Error","InfoMessage", JOptionPane.INFORMATION_MESSAGE);
        }
        ARPatientId.setText("");
        ARDate.setText("");
        ARTime.setText("");
        ARDiagnosis.setText("");
        TimeCombo.setSelectedIndex(0);
        
    }//GEN-LAST:event_RegisterAppointmentMouseClicked

    private void ARDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARDiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ARDiagnosisActionPerformed

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        // TODO add your handling code here:
        try
        {
            Object[] column={
                "PID", "PName", "Date","TIME", "Diagnosis"
            };
            Object[] row=new Object[5];
            DefaultTableModel model=new DefaultTableModel(column,0);
            DateFormat dateformat=new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date dd=new java.util.Date();
            String date=new String(dateformat.format(dd));
            Todays_appnt_date.setText(date);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select a.Pid,p.name,ADate,ATime,Diagnosis from appointment a left join patient p on p.pid=a.Pid where a.ADate ='"+date+"';");
            while(rs.next())
            {
                row[0]=rs.getString("Pid");
                row[1]=rs.getString("name");
                row[2]=rs.getString("ADate");
                row[3]=rs.getString("ATime");
                row[4]=rs.getString("Diagnosis");
                model.addRow(row);
            }
            TodaysAppTable.setModel(model);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void PDetailAppTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PDetailAppTabMouseClicked
        // TODO add your handling code here:
        Object column[]={"Sr.No.","Pname","ADate","Atime","Treatment"};
        DefaultTableModel model2=new DefaultTableModel(column,0);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            String pid=PDetailEdit.getText();
            //ResultSet rs=st.executeQuery("select p.pid,p.name,a.ADate,a.ATime,t.treatment from patient p left join appointment a on p.pid=a.Pid,treatment as t where p.pid='"+pid+"' and p.pid=t.Pid and a.ADate=t.TDate order by a.ADate; ");\
            ResultSet rs=st.executeQuery(" select p.name,a.ADate,a.ATime,(select treatment from treatment T where T.Pid=p.Pid and T.TDate=a.ADate) from patient p right join appointment a on p.pid=a.Pid where p.pid='"+pid+"' order by a.ADate; ");
            Object[] row=new Object[5];
            int i=1;
            while(rs.next())
            {
                row[0]=i++;
                row[1]=rs.getString(1);
                row[2]=rs.getString(2);
                row[3]=rs.getString(3);
                row[4]=rs.getString(4);
                model2.addRow(row);
            }
            PAllAppTable.setModel(model2);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_PDetailAppTabMouseClicked

    private void AssignBedPidEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignBedPidEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignBedPidEditActionPerformed

    private void DOBcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBcheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBcheckActionPerformed

    private void NameCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameCheckActionPerformed

    private void namecheckeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namecheckeditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namecheckeditActionPerformed

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked
        // TODO add your handling code here:
        Object[] column1={"Sr.No.","BedID","RoomId","Type"};
        Object[] column2={"Sr.No.","RoomId","Type","Charges"};
        Object[] row1=new Object[4];
        Object[] row2=new Object[4];
        javax.swing.table.DefaultTableModel model1=new DefaultTableModel(column1,0);
        javax.swing.table.DefaultTableModel model2=new DefaultTableModel(column2,0);

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            String Query1,Query2;
            //Query1="select Bedid,b.Roomid,Type from bed b left join room r on b.Roomid=r.Roomid where b.Pid is NULL; ";
            Query1="select b.Bedid,r.Roomid,r.Type from bed b left join room r on r.Roomid=b.Roomid where b.Bedid not in (select A.Bedid from admited as A where DDate is NULL );";
            Query2="select Roomid,Type,Charges from room;";
            ResultSet rs1=st.executeQuery(Query1);
            
            int i=1;
            while(rs1.next())
            {
                row1[0]=i++;
                row1[1]=rs1.getString("Bedid");
                row1[2]=rs1.getString("Roomid");
                row1[3]=rs1.getString("Type");
                model1.addRow(row1);
            }
            ResultSet rs2=st.executeQuery(Query2); 
            i=1;
            while(rs2.next())
            {
                row2[0]=i++;
                row2[1]=rs2.getString("Roomid");
                row2[2]=rs2.getString("Type");
                row2[3]=rs2.getString("Charges");
                model2.addRow(row2);
            }
            
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        AssignbedAvailableTable.setModel(model1);
        AssignBedChargedTable.setModel(model2);
    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void AssignBedidEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignBedidEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignBedidEditActionPerformed

    private void AssignBedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignBedButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignBedButtonActionPerformed

    private void AssignBedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignBedButtonMouseClicked
        // TODO add your handling code here:
        String Message="";
        try
        {
            String Pid=AssignBedPidEdit.getText();
            String bedid=AssignBedidEdit.getText();
            DateFormat dd=new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date date=new java.util.Date();
            String Date=new String(dd.format(date));
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            String Query1="select BedId from admited where DDate is NULL;";
            ResultSet rs=st.executeQuery(Query1);
            while(rs.next())
            {
                if(rs.getInt(1)==Integer.parseInt(bedid))
                {
                    JOptionPane.showMessageDialog(this, "Enter valid Bed Info","InfoMessage", JOptionPane.INFORMATION_MESSAGE);
                    con.close();
                    return;
                }
            }
            String Query="insert into admited values('"+Pid+"','"+bedid+"','"+Date+"',NULL);";
            st.executeUpdate(Query);
            Message="Bed Assign Successfully";
            con.close();
        }
        catch(Exception e)
        {
            System.err.println(e);
            Message="Database Error";
            
        }
        JOptionPane.showMessageDialog(this, Message,"InfoMessage", JOptionPane.INFORMATION_MESSAGE);
        AssignBedPidEdit.setText("");
        AssignBedidEdit.setText("");
        
    }//GEN-LAST:event_AssignBedButtonMouseClicked

    private void AddBedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBedButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBedButtonActionPerformed

    private void RemoveBedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBedButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveBedButtonActionPerformed

    private void AddRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoomButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddRoomButtonActionPerformed

    private void RemoveRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveRoomButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveRoomButtonActionPerformed

    private void PDetailEditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PDetailEditButtonMouseClicked
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            System.out.println(NameCheck.isSelected());
            if(NameCheck.isSelected())
            {
                String Query="update patient set name='"+namecheckedit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            if(DOBcheck.isSelected())
            {
                String Query="update patient set dob='"+dobcheckedit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            if(BGcheck.isSelected())
            {
                String Query="update patient set bg='"+bgcheckedit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            if(Wtcheck.isSelected())
            {
                String Query="update patient set Wt='"+wtcheckedit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            if(Htcheck.isSelected())
            {
                String Query="update patient set Ht='"+Htcheckedit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            if(Addresscheck.isSelected())
            {
                String Query="update  patient set address='"+Addrescheckedit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            if(Pincodecheck.isSelected())
            {
                String Query="update patient set Pincode='"+PincodecheckEdit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            if(citycheck.isSelected())
            {
                String Query="update patient set City='"+citycheckedit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            if(contactcheck.isSelected())
            {
                String Query="update patient set contact='"+ContactcheckEdit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            if(Emailcheck.isSelected())
            {
                String Query="update patient set Email='"+EmailcheckEdit.getText()+"' where pid='"+PDetailEdit.getText()+"';";
                st.executeUpdate(Query);
            }
            con.close();
            JOptionPane.showMessageDialog(this,"Patient Details Updated Successfully", "Info Message",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(this,"Database Error", "Info Message",JOptionPane.INFORMATION_MESSAGE);

        }
        
    }//GEN-LAST:event_PDetailEditButtonMouseClicked

    private void AddRoomButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddRoomButtonMouseClicked
        // TODO add your handling code here:
        AddRoom adroom=new AddRoom(url,username,password);
        this.setVisible(true);
    }//GEN-LAST:event_AddRoomButtonMouseClicked

    private void RemoveRoomButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveRoomButtonMouseClicked
        // TODO add your handling code here:
        RemoveRoom remove=new RemoveRoom(url,username,password);
        
    }//GEN-LAST:event_RemoveRoomButtonMouseClicked

    private void AddBedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBedButtonMouseClicked
        // TODO add your handling code here:
        AddBed abed=new AddBed(url,username,password);
    }//GEN-LAST:event_AddBedButtonMouseClicked

    private void RemoveBedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveBedButtonMouseClicked
        // TODO add your handling code here:
        RemoveBed rm=new RemoveBed(url,username,password);
    }//GEN-LAST:event_RemoveBedButtonMouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Object[] column={"Sr.No","Room Id","Type","Charges"};
            Object[] row=new Object[4];
            DefaultTableModel model=new DefaultTableModel(column,0);
            Statement st=con.createStatement();
            String Query="select * from room";
            ResultSet rs=st.executeQuery(Query);
            int i=1;
            while(rs.next())
            {
                row[0]=i++;
                row[1]=rs.getString(1);
                row[2]=rs.getString(3);
                row[3]=rs.getString(2);
                model.addRow(row);
            }
            EditRoomTable.setModel(model);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Object[] column={"Sr.No","Bed Id","RoomId"};
            Object[] row=new Object[3];
            DefaultTableModel model=new DefaultTableModel(column,0);
            Statement st=con.createStatement();
            String Query="select * from bed";
            ResultSet rs=st.executeQuery(Query);
            int i=1;
            while(rs.next())
            {
                row[0]=i++;
                row[1]=rs.getString(1);
                row[2]=rs.getString(2);
                model.addRow(row);
            }
            EditBedTable.setModel(model);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }//GEN-LAST:event_jLabel35MouseClicked

    private void ServerIPEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerIPEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServerIPEditActionPerformed

    private void DBUserNameEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBUserNameEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DBUserNameEditActionPerformed

    private void OKButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKButtonMouseClicked
        // TODO add your handling code here:
        Properties prop = new Properties();
	OutputStream output = null;

	try {

		output = new FileOutputStream("config.properties");

		// set the properties value
		prop.setProperty("ServerIP", ServerIPEdit.getText());
		prop.setProperty("dbuser", DBUserNameEdit.getText());
		prop.setProperty("dbpassword",DBpasswordEdit.getText());

		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        }
        Properties prop1 = new Properties();
	InputStream input = null;
        String IP="";

	try {

		input = new FileInputStream("config.properties");

		// load a properties file
		prop1.load(input);

		// get the property value and print it out
		IP=prop1.getProperty("ServerIP");
		username=prop1.getProperty("dbuser");
		password=prop1.getProperty("dbpassword");

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
        url="jdbc:mysql://"+IP+":3306/project";
        JOptionPane.showMessageDialog(this,"Settings Updated Successfully", "Info Message",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_OKButtonMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        Properties prop1 = new Properties();
	InputStream input = null;
        try {

		input = new FileInputStream("config.properties");

		// load a properties file
		prop1.load(input);

		// get the property value and print it out
		ServerIPEdit.setText(prop1.getProperty("ServerIP"));
		DBUserNameEdit.setText(prop1.getProperty("dbuser"));
		DBpasswordEdit.setText(prop1.getProperty("dbpassword"));

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void PDetailNameEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDetailNameEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PDetailNameEditActionPerformed

    private void PBillAdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBillAdEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBillAdEditActionPerformed

    private void GenerateBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateBillButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerateBillButtonActionPerformed

    private void GenerateBillButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerateBillButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_GenerateBillButtonMouseClicked

    private void CancelBedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBedButtonMouseClicked
        // TODO add your handling code here:
        DateFormat dd=new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date date=new java.util.Date();
        String DATE=new String(dd.format(date));
        System.out.println(DATE);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            String Query="update admited set DDate='"+DATE+"' where DDate is NULL and Pid='"+CancelBedPidEdit.getText()+"';";
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Bed Cancel Sucessfully", "Info Message",JOptionPane.INFORMATION_MESSAGE);
            con.close();
        }
        catch(Exception e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(this,"Database Error", "Info Message",JOptionPane.INFORMATION_MESSAGE);
        }
        CancelBedPidEdit.setText("");
    }//GEN-LAST:event_CancelBedButtonMouseClicked

    private void SearchbyNameEditKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchbyNameEditKeyReleased
        // TODO add your handling code here:
        try
        {
            String Pattern=SearchbyNameEdit.getText();
            System.out.println(Pattern);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            String Query="select pid,name from patient where name like '%"+Pattern+"%';";
            ResultSet rs=st.executeQuery(Query);
            Object[] Column={"Sr.No.","Patient Name","Patient Pid"};
            Object[]Row=new Object[3];
            DefaultTableModel model=new DefaultTableModel(Column,0);
            int i=1;
            while(rs.next())
            {
                Row[0]=i++;
                Row[1]=rs.getString(2);
                Row[2]=rs.getString(1);
                model.addRow(Row);
            }
            SearchByNameTable.setModel(model);
            con.close();
        }
        catch(Exception e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(this,"Database Error", "Info Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SearchbyNameEditKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ARDate;
    private javax.swing.JTextField ARDiagnosis;
    private javax.swing.JTextField ARPatientId;
    private javax.swing.JFormattedTextField ARTime;
    private javax.swing.JButton AddBedButton;
    private javax.swing.JButton AddRoomButton;
    private javax.swing.JTextArea Addrescheckedit;
    private javax.swing.JCheckBox Addresscheck;
    private javax.swing.JTable AdmitedInfoTable;
    private javax.swing.JButton AssignBedButton;
    private javax.swing.JTable AssignBedChargedTable;
    private javax.swing.JTextField AssignBedPidEdit;
    private javax.swing.JTextField AssignBedidEdit;
    private javax.swing.JTable AssignbedAvailableTable;
    private javax.swing.JTable AvailablebedTable;
    private javax.swing.JCheckBox BGcheck;
    private javax.swing.JButton CancelBedButton;
    private javax.swing.JTextField CancelBedPidEdit;
    private javax.swing.JTextField ContactcheckEdit;
    private javax.swing.JTextField DBUserNameEdit;
    private javax.swing.JTextField DBpasswordEdit;
    private javax.swing.JCheckBox DOBcheck;
    private javax.swing.JTable EditBedTable;
    private javax.swing.JTable EditRoomTable;
    private javax.swing.JCheckBox Emailcheck;
    private javax.swing.JTextField EmailcheckEdit;
    private javax.swing.JButton GenerateBillButton;
    private javax.swing.JCheckBox Htcheck;
    private javax.swing.JTextField Htcheckedit;
    private javax.swing.JCheckBox NameCheck;
    private javax.swing.JButton OKButton;
    private javax.swing.JTextArea PAdd;
    private javax.swing.JTable PAllAppTable;
    private javax.swing.JTextField PBG;
    private javax.swing.JTextField PBillAdEdit;
    private javax.swing.JTextField PBillPidEdit;
    private javax.swing.JTextField PContact;
    private javax.swing.JTextField PDOB;
    private javax.swing.JTextArea PDetailAddEdit;
    private javax.swing.JTabbedPane PDetailAppTab;
    private javax.swing.JTextField PDetailBGEdit;
    private javax.swing.JTextField PDetailCityEdit;
    private javax.swing.JTextField PDetailContactEdit;
    private javax.swing.JTextField PDetailDobEdit;
    private javax.swing.JTextField PDetailEdit;
    private javax.swing.JButton PDetailEditButton;
    private javax.swing.JTextField PDetailEmailEdit;
    private javax.swing.JTextField PDetailHtEdit;
    private javax.swing.JTextField PDetailNameEdit;
    private javax.swing.JTextField PDetailPinEdit;
    private javax.swing.JTextField PDetailWtEdit;
    private javax.swing.JTextField PHT;
    private javax.swing.JTextField PNAME;
    private javax.swing.JTextField PWT;
    private javax.swing.JPanel Patient_detail_panel;
    private javax.swing.JCheckBox Pincodecheck;
    private javax.swing.JTextField PincodecheckEdit;
    private javax.swing.JButton Register;
    private javax.swing.JButton RegisterAppointment;
    private javax.swing.JButton RemoveBedButton;
    private javax.swing.JButton RemoveRoomButton;
    private javax.swing.JTable SearchByNameTable;
    private javax.swing.JTextField SearchbyNameEdit;
    private javax.swing.JTextField ServerIPEdit;
    private javax.swing.JComboBox TimeCombo;
    private javax.swing.JTable TodaysAppTable;
    private javax.swing.JLabel Todays_appnt_date;
    private javax.swing.JButton View_appint_button;
    private javax.swing.JFormattedTextField View_appint_date;
    private javax.swing.JButton View_patientdetail_button;
    private javax.swing.JTable Viewapptable;
    private javax.swing.JCheckBox Wtcheck;
    private javax.swing.JTextField bgcheckedit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox citycheck;
    private javax.swing.JTextField citycheckedit;
    private javax.swing.JCheckBox contactcheck;
    private javax.swing.JTextField dobcheckedit;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField namecheckedit;
    private javax.swing.JTextField wtcheckedit;
    // End of variables declaration//GEN-END:variables
    private String url,username,password;

}

