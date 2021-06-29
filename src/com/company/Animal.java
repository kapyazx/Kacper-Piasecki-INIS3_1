package com.company;

public class Animal {
    final private String species;
    private Double weight;

    static final public double DEFAULT_ANIMAL_WEIGHT = 2.0;
    static final public double DEFAULT_DOG_WEIGHT = 5.0;
    static final public double DEFAULT_CAT_WEIGHT = 2.0;
    static final public double DEFAULT_COW_WEIGHT = 300.0;

    public Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "dog": {
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            }
            case "cat": {
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            }
            case "cow": {
                this.weight = DEFAULT_COW_WEIGHT;
                break;
            }
            default: {
                this.weight = DEFAULT_ANIMAL_WEIGHT;
            }

        }


    }

    public void feed() {
        if (weight > 0) {
            this.weight += 1;
            System.out.println("Thx for the food, bro, weight = " + this.weight);
            System.out.println("Im happy " + this.species);
        } else {
            System.out.println("I'm a dead " + this.species + " bro, why are u feedin me? weight = " + this.weight);
        }
    }

    public void takeForAWalk() {
        if (weight > 0) {
            this.weight -= 1;
            System.out.println("Thx for the walk, bro, weight = " + this.weight);
            System.out.println("Im happy " + this.species);
        } else {
            System.out.println("I'm a dead " + this.species + " bro, what do u want? weight = " + this.weight);
        }
    }
}