package com.codeclan.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 20/12/2017.
 */

public class Computer {

    ArrayList<String> selectionArray;

    public Computer() {
        selectionArray = new ArrayList<>();
        selectionArray.add("rock");
        selectionArray.add("paper");
        selectionArray.add("scissor");
    }

    public String randomSelection(){
        Collections.shuffle(this.selectionArray);
        return selectionArray.get(0);
    }


}
