public class Laptop {
    private String name, color, os;
    private int ram, hdd, price;


    public Laptop(String name, String os, int ram, int hdd, String color, int price ) {
        this.name = name;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
        this.price = price;
    }
//1
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
//2
    public String getOS(){
        return os;
    }
    public void setOS(String os){
        this.os = os;
    }
//3
public int getRam(){
    return ram;
}
public void setName(int ram){
    this.ram = ram;
}
//4
public int getHdd(){
    return hdd;
}
public void setHdd(int hdd){
    this.hdd = hdd;
}
//5
public String getColor(){
    return color;
}
public void setColor(String color){
    this.color = color;
}
//6
public int getPrice(){
    return price;
}
public void setPrice(int price){
    this.price = price;
}

@Override
public String toString() {
    return "Название: " + name + "; Цвет: " + color + "; ОС: " + os + "; ОЗУ: " + ram + "; HDD: " + hdd + "; Цена: " + price;
}

}    

