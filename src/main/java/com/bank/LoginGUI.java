package com.bank;

import javax.swing.*;
import java.awt.*;

public class LoginGUI extends JFrame {
    public static LoginGUI frame;

    Container container = getContentPane();




    public LoginGUI(){
        frame=this;

        JLabel login = new JLabel("Username");
        login.setBounds(50,50,100,30);

        frame.add(login);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.setLocationRelativeTo(null);
    }






}
