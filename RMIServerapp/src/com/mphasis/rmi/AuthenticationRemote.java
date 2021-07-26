package com.mphasis.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthenticationRemote extends Remote {

        public abstract boolean validateUser(String username, String password) throws RemoteException;
    }

