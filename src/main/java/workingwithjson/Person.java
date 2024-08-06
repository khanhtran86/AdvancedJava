package workingwithjson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    public String firstName;
    public String lastName;
    @JacksonXmlElementWrapper(localName = "phoneNumbers")
    public List<String> phoneNumbers = new ArrayList<>();
    public List<Address> address = new ArrayList<>();

}
