package com.java.JavaAdvanced.Unit30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by chl1327 on 2018/6/18.
 */
public class StudentServer {
    private ObjectOutputStream outputToFile;
    private ObjectInputStream inputFromClient;

    public static void main(String[] args){
        new StudentServer();
    }

    public StudentServer(){
        try{
            ServerSocket serverSocket = new ServerSocket(8003);
            System.out.println("Server started ");
            outputToFile = new ObjectOutputStream(
                    new FileOutputStream("student.dat", true));
            while(true){
                Socket socket = serverSocket.accept();
                inputFromClient = new ObjectInputStream(socket.getInputStream());
                Object object = inputFromClient.readObject();
                outputToFile.writeObject(object);
                System.out.println("A new student object is stored");
            }
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try{
                inputFromClient.close();
                outputToFile.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
