package com.java.JavaAdvanced.Unit30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by chl1327 on 2018/6/18.
 */
public class ViewRemoteFile extends JApplet{
    private JButton jbtView = new JButton("View");
    private JTextField jtfURL = new JTextField(12);
    private JTextArea jtaFile = new JTextArea();
    private JLabel jlblStatus = new JLabel();

    public void init(){
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(new JLabel("Filename"),BorderLayout.WEST);
        p1.add(jtfURL,BorderLayout.CENTER);
        p1.add(jbtView,BorderLayout.EAST);

        setLayout(new BorderLayout());
        add(new JScrollPane(jtaFile),BorderLayout.CENTER);
        add(p1,BorderLayout.NORTH);
        add(jlblStatus,BorderLayout.SOUTH);

        jbtView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showFile();
            }
        });
    }

    private void showFile(){
        Scanner input = null;
        URL url = null;

        try{
            url = new URL(jtfURL.getText().trim());
            input = new Scanner(url.openStream());
            while(input.hasNext()){
                jtaFile.append(input.nextLine() + "\n");
            }
            jlblStatus.setText("File loaded successfully");
        }catch (MalformedURLException ex){
            jlblStatus.setText("URL " + url + " not found.");
        }catch (IOException e){
            jlblStatus.setText(e.getMessage());
        }finally {
            if(input != null) input.close();
        }
    }
}
