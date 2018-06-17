package com.java.Unit30;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by chl1327 on 2018/6/17.
 */
public class Client extends JFrame {
    private JTextField jtf = new JTextField();

    private JTextArea jta = new JTextArea();

    private DataOutputStream toServer;
    private DataInputStream fromServer;

    public static void main(String[] args){
        new Client();
    }

    public Client(){
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(new JLabel("Enter radius"),BorderLayout.WEST);
        p.add(jtf, BorderLayout.CENTER);
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        setLayout(new BorderLayout());
        add(p,BorderLayout.NORTH);
        add(new JScrollPane(jta),BorderLayout.CENTER);

        jtf.addActionListener(new TexFieldListener());

        setTitle("Client");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try{
            Socket socket = new Socket("localhost",8000);
            System.out.println("local port: " + socket.getLocalPort());
            fromServer = new DataInputStream(socket.getInputStream());
            toServer = new DataOutputStream(socket.getOutputStream());
        }catch (IOException ex){
            jta.append(ex.toString() + '\n');
        }
    }

    private class TexFieldListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                double radius = Double.parseDouble(jtf.getText().trim());

                toServer.writeDouble(radius);
                toServer.flush();
                double area = fromServer.readDouble();
                jta.append("Radius is " + radius + "\n");
                jta.append("Area received from the server is " + area + '\n');
            }catch (IOException ex){
                System.err.println(ex);
            }
        }
    }
}
