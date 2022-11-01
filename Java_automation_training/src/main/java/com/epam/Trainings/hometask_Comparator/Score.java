package com.epam.Trainings.hometask_Comparator;

import java.util.Comparator;

class Score implements Comparator<Player> {
	
    public int compare(Player o1, Player o2) {
       if (o1.score > o2.score) {
           return -1;
       } if (o1.score < o2.score) {
           return 1;
       } if (o1.score == o2.score) {
           return o1.name.compareTo(o2.name);
       }
    return 0;
    } 
}