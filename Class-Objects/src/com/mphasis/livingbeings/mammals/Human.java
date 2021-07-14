package com.mphasis.livingbeings.mammals;

import com.mphasis.livingbeings.mammals.organs.Eye;

public class Human {
    public HumanEye leftEye,rightEye;  //field

    public Human(){
        System.out.println("Human created");
        leftEye = new HumanEye();
        rightEye = new HumanEye();
    }

    public class HumanEye extends Eye {    //Nested Class
        public float power; //field
    }
}
