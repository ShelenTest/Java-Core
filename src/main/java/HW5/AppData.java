package HW5;

import java.io.Serializable;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;

    //сериализуемый объект должен быть максимально простым, поэтому оставляем минимум методов
    //сделаем, чтобы класс описывал струтуру данных и содержал геттеры и сеттеры
    public AppData() {}

    public AppData(String[] header, int[][] data){
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() { return header; }

    public int[][] getData() { return data; }

    public void setHeader(String[] header) { this.header = header; }

    public void setData(int[][] data) { this.data = data; }
}
