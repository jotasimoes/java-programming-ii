/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLC3
 */
public class Hideout<T> {

    private T t;

    public Hideout() {

    }

    public void putIntoHideout(T toHide) {

        this.t = toHide;

    }

    public T takeFromHideout() {
        if (this.t == null) {
            return null;
        } else {
            T valueToReturn = this.t;
            this.t = null;
            return valueToReturn;
        }
    }

    public boolean isInHideout() {
        if (this.t == null) {
            return false;
        } else {
            return true;
        }
    }

}
