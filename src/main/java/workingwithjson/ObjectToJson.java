package workingwithjson;

import com.google.gson.Gson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjectToJson {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Khanh";
        person.lastName = "Trần";
        person.phoneNumbers = Arrays.asList("0924448888");

        Address firstAddress = new Address();
        firstAddress.city = "Hà Nội";
        firstAddress.streetName = "Thái Hà";

        Address secondAddress = new Address();
        secondAddress.city = "Hà Nội";
        secondAddress.streetName = "Duy Tân";

        person.address = Arrays.asList(firstAddress, secondAddress);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
