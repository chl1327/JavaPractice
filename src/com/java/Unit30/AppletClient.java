package com.java.Unit30;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by chl1327 on 2018/6/18.
 */
public class AppletClient extends JApplet {
    private JLabel jlblCount = new JLabel();

    private boolean isStandAlone = false;

    private String host = "localhost";

    public void init(){
        add(jlblCount);
        try{
            Socket socket;
            if (isStandAlone)
                socket = new Socket(host, 8002);
            else
                socket = new Socket(getCodeBase().getHost(),8002);
            DataInputStream inputFromServer =
                    new DataInputStream(socket.getInputStream());
            int count = inputFromServer.readInt();
            jlblCount.setText("You are visitor number " + count);
            inputFromServer.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Applet Client");
        AppletClient applet = new AppletClient();
        applet.isStandAlone = true;
        if (args.length == 1) applet.host = args[0];
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.pack();
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
