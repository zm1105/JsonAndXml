package JavaToJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsonTest02 {
    public static void main(String[] args) throws IOException {
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(23);
        p1.setGender("男");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("张三");
        p2.setAge(23);
        p2.setGender("男");
        p2.setBirthday(new Date());

        List<Person> people = new ArrayList<Person>();
        people.add(p);
        people.add(p1);
        people.add(p2);

        //list转出来是数组
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(people);
        System.out.println(s);//[{"name":"张三","gender":"男","age":23,"birthday":"2019-08-13"},
        // {"name":"张三","gender":"男","age":23,"birthday":"2019-08-13"},
        // {"name":"张三","gender":"男","age":23,"birthday":"2019-08-13"}]
    }
}
