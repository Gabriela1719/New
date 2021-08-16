package com.agency04.sbss.pizza.Model;

public enum Size {
    SMALL,
    MEDIUM,
    LARGE;

    public String getSize() {

        // this will refer to the object SMALL
        switch(this) {
            case SMALL:
                return "small";

            case MEDIUM:
                return "medium";

            case LARGE:
                return "large";

            default:
                return null;
        }
    }
}
