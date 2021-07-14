package com.mphasis.main.cui;


import com.mphasis.contracts.Flyer;
import com.mphasis.entities.Seaplane;


public class Airport {

    public static void main(String[] args) {
      Airport metropolishAirport = new Airport();
      Helicopter copter = new Helicopter();
        Seaplane sPlnae = new Seaplane();

        metropolishAirport.givenPermissionToLand(copter);
        metropolishAirport.givenPermissionToLand(sPlnae);
        System.out.println(sPlnae);

    }

    private void givenPermissionToLand(Flyer flyer){
        flyer.land();
        System.out.println(flyer);
    }
}
