package JsonToJava;

import JavaToJson.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonTest04 {
    public static void main(String[] args) throws IOException {
        String json="{\"name\":\"张三\",\"gender\":\"男\",\"age\":23}";
        ObjectMapper mapper=new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);//Person{name='张三', gender='男', age=23}

    }


}
