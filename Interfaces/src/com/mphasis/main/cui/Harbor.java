package com.mphasis.main.cui;

import com.mphasis.contracts.Sailer;
import com.mphasis.entities.RiverBarage;
import com.mphasis.entities.Seaplane;

public class Harbor {
    public static void main(String[] args) {
        Harbor bostonHarbor = new Harbor();
        RiverBarage barage = new RiverBarage();
        Seaplane sPlane = new Seaplane();

        bostonHarbor.givenPermissionToDock(barage);
        bostonHarbor.givenPermissionToDock(sPlane);

    }

    private void givenPermissionToDock(Sailer sailer){
        sailer.dock();
}
}
