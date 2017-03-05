package edu.galileo.interface_example;

import java.util.Comparator;

/**
 * Created by M on 05-03-2017.
 */
public class PokerCard implements Comparable<PokerCard> {
    int suit;
    int number;

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
