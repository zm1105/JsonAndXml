import JavaToJson.Person;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setGender("男");
        person.setAge(20);
        person.setBirthday(new Date());
        String s = JsonUtil.objectToJson(person);
        System.out.println(s); //{"name":"张三","gender":"男","age":20,"birthday":"2019-08-15"}


        String json = "{\"name\":\"张三\",\"gender\":\"男\",\"age\":20,\"birthday\":\"2019-08-15\"}";
        JsonUtil.jsonToPojo(json,Person.class);//{"name":"张三","gender":"男","age":20,"birthday":"2019-08-15"}




    }

}


