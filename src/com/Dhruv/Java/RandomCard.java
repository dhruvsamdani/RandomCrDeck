package com.Dhruv.Java;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dhruv on 1/15/2017.
 */
public class RandomCard {
    private static RandomCardEngine randomCardEngine = new RandomCardEngine();
    public static void main(String[] args){
        randomCardEngine.randomDeck();
        System.out.println("                    ");
        randomCardEngine.skeletonDeck();
    }


}
