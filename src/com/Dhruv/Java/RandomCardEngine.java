package com.Dhruv.Java;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

import static java.awt.Font.*;

/**
 * Created by dhruv on 1/15/2017.
 */
public class RandomCardEngine{
    public static String[] cards = new String[67];
    public static String[] skeletonCards = new String[10];
    public static Random random = new Random();

    JFrame frame = new JFrame();
    Container pane = frame.getContentPane();
    JTextArea jTextArea = new JTextArea();
    JButton jButtonRandom = new JButton("Random Deck");


    public void randomDeck() {
        frame.setSize(300,300);
        jTextArea.setFont(getFont(SERIF));
        jTextArea.setBackground(Color.magenta);
        frame.getContentPane().add(jTextArea);
        frame.getContentPane().add(jButtonRandom);
        pane.add(jButtonRandom, BorderLayout.LINE_START);
        jButtonRandom.setPreferredSize(new Dimension(100, 300));
        pane.add(jTextArea, BorderLayout.LINE_END);
        jTextArea.setPreferredSize(new Dimension(250, 300));
        jTextArea.getLineWrap();
        cards[1] = "mirror";
        cards[2] = "ice spirit";
        cards[3] = "1 elixer skeleton";
        cards[4] = "zap";
        cards[5] = "fire spirits";
        cards[6] = "log";
        cards[7] = "stab goblins";
        cards[8] = "rage";
        cards[9] = "ice golem";
        cards[10] = "spear goblins";
        cards[11] = "clone";
        cards[12] = "archers";
        cards[13] = "arrows";
        cards[14] = "bomber";
        cards[15] = "goblin barrel";
        cards[16] = "skarmy";
        cards[17] = "miner";
        cards[18] = "cannon";
        cards[19] = "dart goblin";
        cards[20] = "mega minion";
        cards[21] = "tomb stone";
        cards[22] = "minnions";
        cards[23] = "tornado";
        cards[24] = "guards";
        cards[25] = "ice wizard";
        cards[26] = "knight";
        cards[27] = "valkyire";
        cards[28] = "musketeer";
        cards[29] = "hog rider";
        cards[30] = "dark prince";
        cards[31] = "poison";
        cards[32] = "mini peka";
        cards[33] = "freeze";
        cards[34] = "baby dragon";
        cards[35] = "mortar";
        cards[36] = "tesla";
        cards[37] = "fireball";
        cards[38] = "furnace";
        cards[39] = "inferno dragon";
        cards[40] = "minnion hord";
        cards[41] = "graveyard";
        cards[42] = "balloon";
        cards[43] = "bowler";
        cards[44] = "barbarians";
        cards[45] = "wizard";
        cards[46] = "prince";
        cards[47] = "giant";
        cards[48] = "goblin hut";
        cards[49] = "inferno dragon";
        cards[50] = "bomb tower";
        cards[51] = "witch";
        cards[52] = "x-bow";
        cards[53] = "elixer collecter";
        cards[54] = "elite barbs";
        cards[55] = "rocket";
        cards[56] = "sparky";
        cards[57] = "lightning";
        cards[58] = "royal giant";
        cards[59] = "giant skeleton";
        cards[60] = "barb hut";
        cards[61] = "big PEKKA";
        cards[62] = "lava hound";
        cards[63] = "golem";
        cards[64] = "three musketeers";
        cards[65] = "princess";
        cards[66] = "lumberjack";

        String[] countedCard = new String[8];
        int length = 0;
        while(length < 8){
            String randomCard = cards[random.nextInt(66)];
            if (!Arrays.asList(countedCard).contains(randomCard)) {
                jTextArea.append(randomCard + "\n" );
                countedCard[length] = randomCard;
                System.out.println(randomCard);
                length++;

            }

        }
        jTextArea.setVisible(true);
        frame.setVisible(true);

    }
    public void skeletonDeck(){
        skeletonCards[0] = "skarmy";
        skeletonCards[1] = "witch";
        skeletonCards[2] = "1 elixer skeletons";
        skeletonCards[3] = "tombstone";
        skeletonCards[4] = "bomb tower";
        skeletonCards[5] = "giant skeleton";
        skeletonCards[6] = "balloon";
        skeletonCards[7] = "graveyard";
        skeletonCards[8] = "guards";
        skeletonCards[9] = "bomber";

        String[] countedCard = new String[8];
        int length = 0;
        while(length < 8){
            String randomCard = skeletonCards[random.nextInt(10)];
            if (!Arrays.asList(countedCard).contains(randomCard)) {
                System.out.println(randomCard);
                countedCard[length] = randomCard;
                length++;

            }
//test
        }

    }
//    public void goblinDeck(){}
//    public void airDeck(){}
//    public void spawnerDeck(){}

}
