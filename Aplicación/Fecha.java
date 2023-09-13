package Aplicación;

/**
 *
 * @author Andyzinho
 */
public class Fecha {

    //Atributos
    private int day;
    private int month;
    private int year;

    //Constructor
    public Fecha() {
    }

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Métodos
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBisiesto() {
        return false;
    }

    public void restarSumarDays(int value) {

    }

    public void restarSumarMonths(int value) {

    }

    public void restarSumarYear(int value) {

    }

}
