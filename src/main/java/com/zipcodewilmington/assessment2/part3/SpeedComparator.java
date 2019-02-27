package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        if (animal1.getSpeed() == animal2.getSpeed()) {
            return 0;
        } else if (animal1.getSpeed() > animal2.getSpeed()){
            return animal2.getSpeed() - animal1.getSpeed();
        } else {
            return animal2.getSpeed() - animal1.getSpeed();
        }
    }
}
