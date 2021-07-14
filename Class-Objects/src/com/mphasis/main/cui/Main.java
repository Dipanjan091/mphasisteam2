package com.mphasis.main.cui;

import com.mphasis.livingbeings.mammals.Man;

public class Main {

    public static void main(String[] args) {
        Man man = new Man();
        man.leftEye.color = "Brown";
        man.rightEye.color = "Brown";
        man.leftEye.power = 0.5f;
        man.rightEye.power = 1.0f;
        man = null;
        ///1000 lines

    }
}
