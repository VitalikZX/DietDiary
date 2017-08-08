package org.dietdiary.www.model.diet;

/**
 * Created by 412 on 27.07.2017.
 */
public class DietOfTheDay {
    private Eating breakfast;
    private Eating lunch;
    private Eating snack;
    private Eating dinner;

    public Eating getBreakfast() {
        return breakfast;
    }

    public void   setBreakfast(Eating breakfast) {
        this.breakfast = breakfast;
    }

    public Eating getLunch() {
        return lunch;
    }

    public void   setLunch(Eating lunch) {
        this.lunch = lunch;
    }

    public Eating getSnack() {
        return snack;
    }

    public void   setSnack(Eating snack) {
        this.snack = snack;
    }

    public Eating getDinner() {
        return dinner;
    }

    public void   setDinner(Eating dinner) {
        this.dinner = dinner;
    }
}
