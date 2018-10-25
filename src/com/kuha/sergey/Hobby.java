package com.kuha.sergey;

public class Hobby {
    private byte index;
    private char name;
    private short timePerDay;
    private int daysOfYear;
    private long howLong;
    private float monthlyIncome;
    private double expensesPerMonth;
    private boolean futureEvolution;

    public Hobby() {}

    public Hobby(byte index, char name, boolean futureEvolution) {
        this.index = index;
        this.name = name;
        this.futureEvolution = futureEvolution;
    }

    public Hobby(byte index, short timePerDay, int daysOfYear, long howLong, char name, float monthlyIncome, double expensesPerMonth, boolean futureEvolution) {
        this.index = index;
        this.name = name;
        this.timePerDay = timePerDay;
        this.daysOfYear = daysOfYear;
        this.howLong = howLong;
        this.monthlyIncome = monthlyIncome;
        this.expensesPerMonth = expensesPerMonth;
        this.futureEvolution = futureEvolution;
    }

    public void tellAboutHobby() {
        StringBuilder tell = new StringBuilder();
        tell.append("Hobby index: ").append(index).append("\n");
        tell.append("Hobby name: ").append(name).append("\n");
        tell.append("How much time per day: ").append(timePerDay).append("\n");
        tell.append("How much days of year: ").append(daysOfYear).append("\n");
        tell.append("How long practicing: ").append(howLong).append("\n");
        tell.append("What monthly income does hobby bring: ").append(monthlyIncome).append("\n");
        tell.append("How much spending per month goes to a hobby: ").append(expensesPerMonth).append("\n");
        tell.append("Are you planning to develop a hobby in the future: ").append(futureEvolution).append("\n");

        System.out.println(tell);
    }

    public byte getIndex() {
        return index;
    }

    public void setIndex(byte index) {
        this.index = index;
    }

    public short getTimePerDay() {
        return timePerDay;
    }

    public void setTimePerDay(short timePerDay) {
        this.timePerDay = timePerDay;
    }

    public int getDaysOfYear() {
        return daysOfYear;
    }

    public void setDaysOfYear(int daysOfYear) {
        this.daysOfYear = daysOfYear;
    }

    public long getHowLong() {
        return howLong;
    }

    public void setHowLong(long howLong) {
        this.howLong = howLong;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public float getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(float monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getExpensesPerMonth() {
        return expensesPerMonth;
    }

    public void setExpensesPerMonth(double expensesPerMonth) {
        this.expensesPerMonth = expensesPerMonth;
    }

    public boolean isFutureEvolution() {
        return futureEvolution;
    }

    public void setFutureEvolution(boolean futureEvolution) {
        this.futureEvolution = futureEvolution;
    }
}
