package designpatterns.creational.factory;

public class FactoryMethod {
    /*
    Factory Design Pattern được sử dụng khi chúng ta có một superclass có nhiều class con và cần phải trả về một trong các class con đó dựa trên một input nhất định.
    Design Pattern này giúp chúng ta khởi tạo class từ factory class thay vì khởi tạo trên chương trình bên client.
     */

    /*
    Ưu điểm của factory design pattern
        Factory design pattern cung cấp cách làm theo nguyên tắc "Program to an interface, not an implementation"

        Factory design pattern tách việc khởi tạo các implementation class thực tế ra khỏi máy client.
        Factory design pattern làm cho code mạnh hơn, ít bị coupled hơn và dễ dàng mở rộng hơn.
        Ví dụ, chúng ta có thể dễ dàng thay đổi implementation của class PC, vì nó không dính líu gì đến code bên client.

        Factory design pattern cung cấp một lớp abstraction giữa implementation class và class bên client thông qua kế thừa.
     */

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}
