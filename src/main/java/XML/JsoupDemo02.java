package XML;


import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        Document parse = Jsoup.parse(new File(path), "utf-8");
        JXDocument jxDocument = new JXDocument(parse);
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("======");

        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);

        }
        System.out.println("=======");
        List<JXNode> jxNodes1 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes1) {
            System.out.println(jxNode);

        }
        System.out.println("=========");

        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id='3']");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);

        }
    }
}
