package XML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo01 {
    public static void main(String[] args) throws IOException {
        //获取xml文件路径
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        //解析xml文档
        Document parse = Jsoup.parse(new File(path), "utf-8");
        //获取元素对象
        Elements elements = parse.getElementsByTag("name");
        System.out.println(elements.size());
        Element element = elements.get(0);

        String text = element.text();
        System.out.println(text);
    }
}
