package com.mycompany.realestate;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;




public class adminPage extends JFrame implements ActionListener{

    private JPanel panelLogo, panelHeader, panelUsers, panelADD, panelDelete, panelProfile, transactJPanel, homeJPanel,panelAddLayout,panelHome,panelTransaction,panelUsersPanel; 
    private JLabel lblRichField, lblRealEstates,lblPropertyName,lblLocation,lblPrice,lblDescription,lblImage,lblAdminDetails,lblUsers, previewImg;
    private JButton btnHome, btnAdd, btnDel, btnTransact, btnUsers,  btnProfile,btnImage,btnAddImage,btnChangePassword,btnSignOut,btnUserSearch;
    private JTabbedPane jtab;
    private JTable tableEstate, tableUser,tableTransactions;
    private JScrollPane estates;
    private JTextField txtPropertyName,txtLocation,txtPrice;
    private JTextArea txaDescription;
    private ImageIcon accountIc, homeIc, finalAccountIc, finalHomeIc, clientIc, finalClientIc, transIc, finalTransIc;
    private DefaultTableModel tableEstateModel, tableUserModel, tableTransactionModel;
    private JFileChooser jfcImage = new JFileChooser();
    private Color cGreen = (Color.decode("#28A745"));
    private Color cBlue = (Color.decode("#004A8C")); 
        
        
    public adminPage() {
        
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        panelLogo=new JPanel();
        panelLogo.setBounds(10,10,80,80);
        panelLogo.setBackground(Color.green);
        add(panelLogo);
        
        lblRichField=new JLabel("RICHFIELD");
        lblRichField.setBounds(120,10,350,50);
        lblRichField.setForeground(Color.WHITE);
        lblRichField.setFont(new Font("Arial", Font.BOLD, 25));
        add(lblRichField);
        
        lblRealEstates=new JLabel("REAL ESTATES");
        lblRealEstates.setBounds(120,40,300,50);
        lblRealEstates.setForeground(Color.WHITE);
        lblRealEstates.setFont(new Font("Arial", Font.BOLD, 15));
        add(lblRealEstates);
        
        accountIc = new ImageIcon("infoIcon.png");
        finalAccountIc = new ImageIcon(accountIc.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));

        homeIc = new ImageIcon("homeIcon.png");
        finalHomeIc = new ImageIcon(homeIc.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH));
        
        btnHome=new JButton();
        btnHome.setBounds(1150,60,30,30);
        btnHome.setBorder(null);
        btnHome.setBackground(cBlue);
        btnHome.setIcon(finalAccountIc);
        btnHome.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnHome);
        
        panelAddLayout = new JPanel();
        panelAddLayout.setLayout(null);
        panelAddLayout.setBounds(0, 0, 1200, 560);
        add(panelAddLayout);

        lblPropertyName = new JLabel("PROPERTY NAME : ");
        lblPropertyName.setBounds(50, 50, 250, 30);
        lblPropertyName.setHorizontalAlignment(SwingConstants.LEFT);
        lblPropertyName.setFont(new Font("Arial", Font.BOLD, 14));
        panelAddLayout.add(lblPropertyName);

        txtPropertyName = new JTextField();
        txtPropertyName.setBounds(220, 50, 250, 30);
        panelAddLayout.add(txtPropertyName);

        lblLocation = new JLabel("LOCATION :");
        lblLocation.setBounds(50, 95, 250, 30);
        lblLocation.setFont(new Font("Arial", Font.BOLD, 14));
        panelAddLayout.add(lblLocation);
    
        lblPrice = new JLabel("Price :");
        lblPrice.setBounds(50, 140, 250, 30);
        lblPrice.setFont(new Font("Arial", Font.BOLD, 14));
        panelAddLayout.add(lblPrice);
    
        txtLocation = new JTextField();
        txtLocation.setBounds(220, 95, 250, 30);
        panelAddLayout.add(txtLocation);

        txtPrice = new JTextField();
        txtPrice.setBounds(220, 140, 250, 30);
        panelAddLayout.add(txtPrice);

        lblDescription = new JLabel("DESCRIPTION :");
        lblDescription.setBounds(50, 185, 250, 30);
        lblDescription.setFont(new Font("Arial", Font.BOLD, 14));
        panelAddLayout.add(lblDescription);

        txaDescription = new JTextArea();
        txaDescription.setBounds(50, 215, 500, 300);
        panelAddLayout.add(txaDescription);

        lblImage = new JLabel();
        lblImage.setBounds(650, 100, 500, 300);
        lblImage.setBackground(Color.gray);
        lblImage.setOpaque(true);
        panelAddLayout.add(lblImage);

        btnImage = new JButton("Choose an Image");
        btnImage.setBounds(650, 450, 200, 50);
        panelAddLayout.add(btnImage);
        
        btnAddImage = new JButton("Add");
        btnAddImage.setBounds(950, 450, 200, 50);
        panelAddLayout.add(btnAddImage);
        
        clientIc = new ImageIcon("accountIcon.png");
        finalClientIc = new ImageIcon(clientIc.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH));
        
        btnUsers=new JButton();
        btnUsers.setBounds(1100, 60, 30, 30);
        btnUsers.setBorder(null);
        btnUsers.setFocusable(false);
        btnUsers.setBackground(cBlue);
        btnUsers.setIcon(finalClientIc);
        btnUsers.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnUsers);
        
        transIc = new ImageIcon("transIcon.png");
        finalTransIc = new ImageIcon(transIc.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH));
        
        btnTransact=new JButton();
        btnTransact.setBounds(1050, 60, 30, 30);
        btnTransact.setBorder(null);
        btnTransact.setFocusable(false);
        btnTransact.setBackground(cBlue);
        btnTransact.setIcon(finalTransIc);
        btnTransact.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnTransact);
        
        panelHeader=new JPanel();
        panelHeader.setBounds(0,0,1200,100);
        panelHeader.setBackground(cBlue);
        add(panelHeader);
        
        jtab = new JTabbedPane();
        jtab.setBounds(0,95,1200,560);
        jtab.setLayout(null);
        jtab.setBackground(Color.PINK);
        add(jtab);
        
        homeJPanel= new JPanel();
        homeJPanel.setBounds(0,0,1200,560);
        homeJPanel.setLayout(null);
        jtab.add(homeJPanel);
        
        panelHome = new JPanel();
        panelHome.setBounds(0, 0, 800, 560);
        homeJPanel.add(panelHome);

        
        Object[][] data = {{}};
        String[] tablecolumn = {"Property Name", "Location", "Price", "Status"};
        
        tableEstateModel = new DefaultTableModel(data, tablecolumn);
        tableEstate = new JTable(tableEstateModel);
        tableEstate.setDefaultEditor(Object.class, null);
        tableEstate.setRowHeight(30);
        tableEstate.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableEstate.setBounds(0,0,800,560);

        JScrollPane scrollPaneEstate = new JScrollPane(tableEstate);
        scrollPaneEstate.setPreferredSize(new Dimension(800, 560));
        panelHome.add(scrollPaneEstate);
           
        JLabel lblpreviewImg = new JLabel("Preview Image");
        lblpreviewImg.setBounds(820, 20, 360, 30);
        lblpreviewImg.setHorizontalAlignment(SwingConstants.CENTER);
        homeJPanel.add(lblpreviewImg);
        
        previewImg = new JLabel();
        previewImg.setBounds(820, 60, 350, 280);
        previewImg.setBorder(BorderFactory.createLineBorder(Color.black));
        homeJPanel.add(previewImg);
        
        JButton btnDetails=new JButton("DETAILS");
        btnDetails.setBounds(820,350,100,25);
        btnDetails.setForeground(Color.WHITE);
        btnDetails.setBorder(null);
        btnDetails.setBackground(cGreen);
        btnDetails.setFocusable(false);
        btnDetails.setFont(new Font("Arial", Font.BOLD, 15));
        homeJPanel.add(btnDetails);
        
        JButton btnUpdate =new JButton("UPDATE");
        btnUpdate.setBounds(950,350,100,25);
        btnUpdate.setForeground(Color.WHITE);
        btnUpdate.setBorder(null);
        btnUpdate.setBackground(cGreen);
        btnUpdate.setFocusable(false);
        btnUpdate.setFont(new Font("Arial", Font.BOLD, 15));
        homeJPanel.add(btnUpdate);
        
        btnDel=new JButton("DELETE");
        btnDel.setBounds(1070,350,100,25);
        btnDel.setBorder(null);
        btnDel.setForeground(Color.white);
        btnDel.setBackground(cGreen);
        btnDel.setFocusable(false);
        btnDel.setFont(new Font("Arial", Font.BOLD, 15));
        homeJPanel.add(btnDel);
        
        btnAdd=new JButton("ADD A NEW ITEM");
        btnAdd.setBounds(820, 385, 350, 30);
        btnAdd.setBorder(null);
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setBackground(cGreen);
        btnAdd.setFocusable(false);
        btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
        homeJPanel.add(btnAdd);

        panelADD= new JPanel();
        panelADD.setBounds(0,0,1200,560);
        panelADD.setBackground(Color.green);
        jtab.add(panelAddLayout);
        
        panelUsers= new JPanel();
        panelUsers.setBounds(0,0,1200,560);
        panelUsers.setLayout(null);
        jtab.add(panelUsers);      
        
        panelUsersPanel = new JPanel();
        panelUsersPanel.setBounds(0, 0, 800, 560);
        panelUsers.add(panelUsersPanel);
        
        //Temporary Data
        
        String[][] data2 = {{"1", "Lex", "Reyes", "Lexterqtqt", "91234567890", "lexterqtqt@gmail.com"},
                            {"2", "Abdul", "Disomimba", "Abdulmalik22", "91235621", "malik@gmail.com"}};
        String[] tablecolumn2 = {"ID", "First Name", "Last Name", "Username", "Contact No.", "Email"};
        // sa database mang gagaling
        tableUserModel = new DefaultTableModel(data2, tablecolumn2);
        tableUser = new JTable(tableUserModel);
        tableUser.setDefaultEditor(Object.class, null);
        tableUser.setRowHeight(30);
        tableUser.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        JScrollPane sp2 = new JScrollPane(tableUser);
        sp2.setPreferredSize(new Dimension(800, 560));
        panelUsersPanel.add(sp2);

        lblUsers = new JLabel("Clients");
        lblUsers.setBounds(940, 40, 200, 30);
        lblUsers.setFont(new Font("Arial", Font.BOLD, 30));
        panelUsers.add(lblUsers);
        
        JTextField txtUserSearch = new JTextField();
        txtUserSearch.setBounds(890, 80, 200, 30);
        panelUsers.add(txtUserSearch);
        
        JButton btnUserSearch = new JButton("Search");
        btnUserSearch.setBounds(890, 120, 100, 30);
        panelUsers.add(btnUserSearch);
        
        JButton btnClearUserSearch = new JButton("Clear");
        btnClearUserSearch.setBounds(990, 120, 100, 30);
        panelUsers.add(btnClearUserSearch);
        
        transactJPanel= new JPanel();
        transactJPanel.setBounds(0,0,1200,560);
        transactJPanel.setLayout(null);
      
        jtab.add(transactJPanel);
        
        panelTransaction = new JPanel();
        panelTransaction.setBounds(0, 0, 800, 560);
        transactJPanel.add(panelTransaction);
        
        // sa database ito kukunin
        String[][] transactions = {{"123", "property123", "ClientID", "10/28/2024"}};
        String[] transactionsColumns = {"Transaction ID", "Property ID", "Client ID", "Date"};
        tableTransactionModel = new DefaultTableModel(transactions, transactionsColumns);
        tableTransactions = new JTable(tableTransactionModel);
        tableTransactions.setDefaultEditor(Object.class, null);
        tableTransactions.setRowHeight(30);
        tableTransactions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableTransactions.setBounds(0,0,800,560);
        
        panelTransaction.add(tableTransactions);

        JScrollPane scrollPaneTransaction = new JScrollPane(tableTransactions);
        scrollPaneTransaction.setPreferredSize(new Dimension(800, 560));
        panelTransaction.add(scrollPaneTransaction);
        
        JButton btnMarketAnalysis = new JButton("Generate Market Analysis");
        btnMarketAnalysis.setBounds(900, 40, 200, 30);
        transactJPanel.add(btnMarketAnalysis);
        
        JButton btnSalesReport = new JButton("Sales Report");
        btnSalesReport.setBounds(900, 80, 200, 30);
        transactJPanel.add(btnSalesReport);
        
        
        panelProfile= new JPanel();
        panelProfile.setBounds(0,0,1200,560);
        panelProfile.setLayout(null);
        jtab.add(panelProfile);
        
        lblAdminDetails = new JLabel("Admin");
        lblAdminDetails.setBounds(530,160, 500, 30);
        lblAdminDetails.setFont(new Font("Arial", Font.BOLD, 30));
        panelProfile.add(lblAdminDetails);
        
        btnChangePassword = new JButton("Change Password");
        btnChangePassword.setBounds(480, 200, 200, 30);
        btnChangePassword.setFont(new Font("Arial", Font.BOLD, 15));
        panelProfile.add(btnChangePassword);
        
        btnSignOut = new JButton("Sign Out");
         btnSignOut.setBounds(480, 240, 200, 30);
        btnSignOut.setFont(new Font("Arial", Font.BOLD, 15));
        panelProfile.add(btnSignOut);
        
        btnHome.addActionListener(this);
        btnAdd.addActionListener(this);
        btnUsers.addActionListener(this);
        btnTransact.addActionListener(this);
        btnImage.addActionListener(this);
        btnAddImage.addActionListener(this);
        btnSignOut.addActionListener(this);
        btnChangePassword.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==btnHome){
            int currentIndex = jtab.getSelectedIndex();
            if (currentIndex == 0) {
              jtab.setSelectedIndex(4);
              btnHome.setIcon(finalHomeIc);
            } else  {
              btnHome.setIcon(finalAccountIc);
                jtab.setSelectedIndex(0);
              }
        }else if(e.getSource()==btnAdd){
            btnHome.setIcon(finalHomeIc);
            jtab.setSelectedIndex(1);
        }else if(e.getSource()==btnUsers){
            btnHome.setIcon(finalHomeIc);
            jtab.setSelectedIndex(2);
        }else if(e.getSource()==btnTransact){
            btnHome.setIcon(finalHomeIc);
            jtab.setSelectedIndex(3);
        }else if (e.getSource() == btnImage) {
            
            jfcImage.setCurrentDirectory(new File("user.dir"));
            
            FileNameExtensionFilter fneFilter = new FileNameExtensionFilter("*.images", "jpg", "png");
            jfcImage.addChoosableFileFilter(fneFilter);
            
            int res = jfcImage.showOpenDialog(null);
        
                if (res == JFileChooser.APPROVE_OPTION) {
                    File fSelect = jfcImage.getSelectedFile();
                    String imagePath = fSelect.getAbsolutePath();

                    ImageIcon path = new ImageIcon(imagePath);
                    ImageIcon imageIcon = new ImageIcon(path.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH));

                    lblImage.setIcon(imageIcon);
                }
        }else if (e.getSource() == btnAddImage) {
            
        }else if(e.getSource() == btnSignOut) {
            
            int response = JOptionPane.showConfirmDialog(this, "You are signing out\nClick ok to proceed","Sign out",JOptionPane.OK_CANCEL_OPTION);
            
            if(response == JOptionPane.OK_OPTION) {
       
                JOptionPane.showMessageDialog(null, "Signed Out");
                new welcomePage();
                dispose();
            } 
        }else if(e.getSource() == btnChangePassword) {
            
                new changePassword();
                dispose();
            
            
        }
       
    }
   
}