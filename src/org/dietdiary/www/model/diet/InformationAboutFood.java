package org.dietdiary.www.model.diet;

/**
 * Created by 412 on 27.07.2017.
 */
public class InformationAboutFood {
    private String name;
    private int    weight;
    private float  proteins;
    private float  fats;
    private float  carbohydrates;
    private int    energy;

    public InformationAboutFood(String name, int weight, float proteins, float fats, float carbohydrates, int enetgy) {
        this.name = name;
        this.weight = weight;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.energy = enetgy;
    }

    public InformationAboutFood  getAllInformationAboutFood() {
        return new InformationAboutFood(this.name, this.weight, this.proteins, this.fats, this.carbohydrates, this.energy);
    }

    public String                getName() {
        return name;
    }

    public void                  setName(String name) {
        this.name = name;
    }

    public int                   getWeight() {
        return weight;
    }

    public void                  setWeight(int weight) {
        this.weight = weight;
    }

    public float                 getProteins() {
        return proteins;
    }

    public void                  setProteins(float proteins) {
        this.proteins = proteins;
    }

    public float                 getFats() {
        return fats;
    }

    public void                  setFats(float fats) {
        this.fats = fats;
    }

    public float                 getCarbohydrates() {
        return carbohydrates;
    }

    public void                  setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int                   getEnergy() {
        return energy;
    }

    public void                  setEnergy(int energy) {
        this.energy = energy;
    }
}
