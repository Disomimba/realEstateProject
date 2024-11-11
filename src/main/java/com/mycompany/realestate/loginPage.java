package com.mycompany.realestate;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class loginPage extends JFrame{
    private JLabel hdrLogin,lblUserName,lblPassword,lblProfile;
    private JPanel pnlLogin;
    private JTextField txtUsername,txtPassword;
    private JButton btnLogin,btnBack;
    private ImageIcon finalAvatarIcon, mainBg, finalMainBgIC;
    private Image bgImg, adjustedBgIC, mainBgImg, adjustedMainBgIC;
    private Color cGreen = (Color.decode("#28A745"));
    private Color cGray = (Color.decode("#E0E0E0"));
    private Color cBlue = (Color.decode("#004A8C")); 
    public loginPage() {
        
        setSize(400, 600);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        ImageIcon mainBg = new ImageIcon("C:\\Users\\AACI Admin\\Pictures\\ClientUI\\mainBg.png");
        mainBgImg = mainBg.getImage();
        adjustedMainBgIC = mainBgImg.getScaledInstance(400, 600, Image.SCALE_SMOOTH);
        finalMainBgIC = new ImageIcon(adjustedMainBgIC);
        
        hdrLogin = new JLabel("Login");
        hdrLogin.setBounds(0, 50, 400, 30);
        hdrLogin.setHorizontalAlignment(SwingConstants.CENTER);
        hdrLogin.setForeground(Color.white);
        hdrLogin.setFont(new Font("Arial",Font.BOLD,30));
        add(hdrLogin);
        
        ImageIcon avatarIcon = new ImageIcon("C:\\Users\\AACI Admin\\Pictures\\ClientUI\\avatarIcon.png");
        finalAvatarIcon = new ImageIcon(avatarIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        
        lblProfile = new JLabel();
        lblProfile.setIcon(finalAvatarIcon);
        lblProfile.setBounds(150, 100, 100, 140);
        add(lblProfile);
        
        pnlLogin = new JPanel();
        pnlLogin.setBounds(70, 300, 250, 180);
        pnlLogin.setOpaque(true);
        pnlLogin.setBackground(new Color(80, 133,200,150));
        pnlLogin.setLayout(null);
        add(pnlLogin);
        
        lblUserName = new JLabel("Username:");
        lblUserName.setBounds(10, 30, 150, 30);
        lblUserName.setForeground(Color.white);
        lblUserName.setFont(new Font("Arial",Font.BOLD,15));
        pnlLogin.add(lblUserName);
        
        txtUsername = new JTextField();
        txtUsername.setForeground(Color.black);
        txtUsername.setBackground(cGray);
        txtUsername.setBounds(100, 30, 130, 30);
        pnlLogin.add(txtUsername);
        
        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(10, 80, 150, 30);
        lblPassword.setForeground(Color.white);
        lblPassword.setFont(new Font("Arial",Font.BOLD,15));
        pnlLogin.add(lblPassword);
        
        txtPassword = new JTextField();
        txtPassword.setForeground(Color.black);
        txtPassword.setBackground(cGray);
        txtPassword.setBounds(100, 80, 130, 30);
        
        pnlLogin.add(txtPassword);
               
        btnLogin = new JButton("Login");
        btnLogin.setForeground(Color.white);
        btnLogin.setBackground(cGreen);
        btnLogin.setBounds(110, 120, 110, 30);
        pnlLogin.add(btnLogin);
        setVisible(true);
        
        btnBack = new JButton("Back");
        btnBack.setBounds(10, 10, 80, 30);
        add(btnBack);
        
        JPanel lblmainBg = new JPanel();
        lblmainBg.setBounds(0,0,400,600);
        lblmainBg.setLayout(null);
        add(lblmainBg);
        
        JLabel lblBg = new JLabel(finalMainBgIC);
        lblBg.setBounds(0,0,400,600);
        lblmainBg.add(lblBg);   
        
    }
     public static void main (String[] args){
        new loginPage();
    }
}