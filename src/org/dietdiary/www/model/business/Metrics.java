package org.dietdiary.www.model.business;

/**
 * Created by 412 on 27.07.2017.
 */
public class Metrics {
    private boolean habitFlag;
    private int     weight;

    public boolean isHabitFlag() {
        return habitFlag;
    }

    public void    setHabitFlag(boolean habitFlag) {
        this.habitFlag = habitFlag;
    }

    public int     getWeight() {
        return weight;
    }

    public void    setWeight(int weight) {
        this.weight = weight;
    }
}
