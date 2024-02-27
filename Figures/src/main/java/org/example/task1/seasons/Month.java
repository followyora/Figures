package org.example.task1.seasons;

public enum Month implements Season {
    JANUARY("January", -2.0),
    FEBRUARY("February", 0.0),
    MARCH("March", 5.0),
    APRIL("April", 12.0),
    MAY("May", 18.0),
    JUNE("June", 24.0),
    JULY("July", 28.0),
    AUGUST("August", 25.0),
    SEPTEMBER("September", 18.0),
    OCTOBER("October", 10.0),
    NOVEMBER("November", 3.0),
    DECEMBER("December", -1.0);

    private final String monthName;
    private final double averageTemperature;

    Month(String monthName, double averageTemperature) {
        this.monthName = monthName;
        this.averageTemperature = averageTemperature;
    }

    public String getMonthName() {
        return monthName;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    @Override
    public String getSeason() {
        if (this == DECEMBER || this == JANUARY || this == FEBRUARY) {
            return "Winter";
        } else if (this == MARCH || this == APRIL || this == MAY) {
            return "Spring";
        } else if (this == JUNE || this == JULY || this == AUGUST) {
            return "Summer";
        } else {
            return "Autumn";
        }
    }
}
