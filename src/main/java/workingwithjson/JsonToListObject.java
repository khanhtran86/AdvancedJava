package workingwithjson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class JsonToListObject {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("Persons.json");

        Gson gson = new Gson();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

        Type type = new TypeToken<List<Person>>(){}.getType();
        List<Person> persons = gson.fromJson(reader, type);

        for (Person person: persons)
        {
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

            System.out.println("\n");
        }
    }
}
