package workingwithxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import workingwithjson.Address;
import workingwithjson.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class XMLToObject {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("Person.xml");

        String xmlInString = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n"));

        System.out.println(xmlInString);

        XmlMapper xmlMapper = new XmlMapper();
        Person person = xmlMapper.readValue(
                xmlInString,
                Person.class);

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
