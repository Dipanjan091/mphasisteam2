package com.mphasis.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public class AuthenticationImpl implements Remote {
    public boolean validateUser(String username,String password) throws RemoteException{
        if (username.equalsIgnoreCase("Ravi") && password.equals("Pass"))

        {
            return true;
        }
        return false;
    }
}
