package com.bank;

import javax.swing.*;
import java.awt.*;

public class LoginGUI extends JFrame {
    public static LoginGUI frame;





    public LoginGUI(){
        frame=this;

        JLabel login = new JLabel("Username");
        login.setBounds(50,50,100,20);
        JTextField loginField = new JTextField();
        loginField.setBounds(120,50,100,20);


        JLabel password = new JLabel("Password");
        password.setBounds(50,100,100,20);
        JPasswordField passwordField = new JPasswordField(5);
        passwordField.setBounds(120,100,100,20);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120,140,70,25);


        frame.add(login);
        frame.add(loginField);
        frame.add(password);
        frame.add(passwordField);
        frame.add(loginButton);

        frame.setTitle("Login");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.setLocationRelativeTo(null);
    }






}
