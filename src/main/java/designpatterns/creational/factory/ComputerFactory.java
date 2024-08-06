package designpatterns.creational.factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }

    /*
    Một số điểm quan trọng về design pattern này là:

        Chúng ta có thể giữ Factory class dưới dạng Singleton, hoặc giữ phương thức trả về class con dưới dạng static.
        Các class con khác nhau có thể được tạo và trả về, tùy vào phương thức đầu vào. getComputer() là factory method.
     */
}
