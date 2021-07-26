package com.mphasis.main.cui;

import com.mphasis.rmi.AuthenticationImpl;
import com.mphasis.rmi.AuthenticationRemote;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class Main {

    public static void main(String[] args) {
        AuthenticationImpl authenticationImpl=new AuthenticationImpl();
        try {
            AuthenticationRemote stub = (AuthenticationRemote) UnicastRemoteObject.exportObject(authenticationImpl, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("authen", stub);
        } catch (RemoteException e){
            e.printStackTrace();
        } catch (AlreadyBoundException e){
            e.printStackTrace();
        }
        System.err.println("Server Ready");
    }
}
