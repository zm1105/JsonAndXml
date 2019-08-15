package JavaToJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class JsonTest01 {

    public static void main(String[] args) throws IOException {
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        ObjectMapper mapper = new ObjectMapper();

        /**
         * writevalue（参数1，obj）
         *      参数1：
         *          File:将obj转为JSon字符串,并保存到指定文件
         *          Write:将obj对象转为JSON字符串，并将Json数据填充到字符输出流中
         *          OutputStream:将obj对象转为JSON字符串，并将Json数据填充到字节输出流中
         * writevalueAsString(obj):将对象转为字符串
         */
        String s = mapper.writeValueAsString(p);
        System.out.println(s);//{"name":"张三","gender":"男","age":23,"birthday":"2019-08-15"}
        mapper.writeValue(new File("D:\\a.txt"), p);
        mapper.writeValue(new FileWriter("D:\\b.txt"), p);


    }
}
