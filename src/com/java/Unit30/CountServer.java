package com.java.Unit30;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by chl1327 on 2018/6/18.
 */
public class CountServer {

    private RandomAccessFile raf;
    private int count;

    public static void main(String[] args){
        new CountServer();
    }

    public CountServer(){
        try{
            ServerSocket serverSocket = new ServerSocket(8002);
            System.out.println("Server started");
            raf = new RandomAccessFile("count.dat", "rw");

            if (raf.length() == 0)
                count = 0;
            else
                count = raf.readInt();
            while (true){
                Socket socket = serverSocket.accept();
                DataOutputStream outputToClient =
                        new DataOutputStream(socket.getOutputStream());
                count++;
                outputToClient.writeInt(count);
                raf.seek(0);
                raf.writeInt(count);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
