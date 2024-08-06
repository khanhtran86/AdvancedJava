package workingwithxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import workingwithjson.Address;
import workingwithjson.Person;

import java.util.Arrays;

public class ObjectToXML {
    public static void main(String[] args) throws JsonProcessingException {
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

        XmlMapper xmlMapper = new XmlMapper();
        String dataXml = xmlMapper.writeValueAsString(person);

        System.out.println(dataXml);
    }
}
