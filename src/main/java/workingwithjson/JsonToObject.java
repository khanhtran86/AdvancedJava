package workingwithjson;

import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JsonToObject {
    public static void main(String[] args) throws FileNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("Person.json");

        Gson gson = new Gson();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        Person person = gson.fromJson(reader, Person.class);

        System.out.println("First Name: " + person.firstName);
        System.out.println("Last Name: " + person.lastName);
        System.out.println("Phone Numbers: ");
        for(String phone : person.phoneNumbers)
        {
            System.out.println("\t"+ phone);
        }

        System.out.println("Addresses: ");

        for(Address addr : person.address)
        {
            System.out.println("\t"+addr.streetName +"-"+ addr.city);
        }
    }
}
