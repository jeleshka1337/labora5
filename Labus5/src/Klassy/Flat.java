package Klassy;

import java.time.LocalDate;

public class Flat {
    private Long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer area; //Значение поля должно быть больше 0
    private Long numberOfRooms; //Значение поля должно быть больше 0
    private Long numberOfBathrooms; //Поле может быть null, Значение поля должно быть больше 0
    private Double timeToMetroByTransport; //Значение поля должно быть больше 0
    private Furnish furnish; //Поле может быть null
    private House house; //Поле не может быть null

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Long getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Long numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Long getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(Long numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public Double getTimeToMetroByTransport() {
        return timeToMetroByTransport;
    }

    public void setTimeToMetroByTransport(Double timeToMetroByTransport) {
        this.timeToMetroByTransport = timeToMetroByTransport;
    }

    public Furnish getFurnish() {
        return furnish;
    }

    public void setFurnish(Furnish furnish) {
        this.furnish = furnish;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + coordinates + "|" + creationDate + "|" + area + "|" + numberOfRooms + "|" + numberOfBathrooms + "|" + timeToMetroByTransport + "|" + furnish + "|" + house;
    }

    public int compareTo (Flat o) {
        return Long.compare(this.id, o.id);
    }
}
