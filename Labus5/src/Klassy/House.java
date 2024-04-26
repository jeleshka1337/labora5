package Klassy;

public class House {
    private String name; //Поле может быть null
    private Integer year; //Максимальное значение поля: 638, Значение поля должно быть больше 0
    private Long numberOfLifts; //Значение поля должно быть больше 0

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getNumberOfLifts() {
        return numberOfLifts;
    }

    public void setNumberOfLifts(Long numberOfLifts) {
        this.numberOfLifts = numberOfLifts;
    }
}
