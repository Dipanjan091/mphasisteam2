package com.mphasis.main.cui;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) {
        try {

            Registry registry = LocateRegistry.getRegistry(null);
            AutheticationRemote stud = (AutheticationRemote) registry.lookup("authen");
            System.out.println(stud.validateUser("Revi", "pass"));

        } catch (Exception e) {
            System.err.println("Client exception:" + e.toString());
            e.printStackTrace();
        }
    }
}