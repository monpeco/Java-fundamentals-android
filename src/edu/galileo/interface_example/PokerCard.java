package edu.galileo.interface_example;

import java.util.Comparator;

/**
 * Created by M on 05-03-2017.
 */
public class PokerCard implements Comparable<PokerCard> {
    int suit;       //4-spades, 3-hearts, 2-clubs, 1-diamods
    int number;     //from 2 to 14, begin 11 the jack, 12 the queen, 13 the king and 14 the ace

    public PokerCard(int s, int n){
        suit = s;
        number = n;
    }

    public int compareTo(PokerCard pc) {
        if(this.number < pc.number){
            return -1;
        }else if(this.number > pc.number){
            return 1;
        }else{
            if(this.suit < pc.suit){
                return -1;
            }else if(this.suit > pc.suit){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
