package 工厂方法模式.工厂方法重载;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Copyright @ Biliu工作室
 * xml文件读取工具类
 * @author Suaron
 * @Description TODO
 * @date 2019-02-28 12:29
 */
public class XMLUtils {
    
    public static Object getBean(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document =  documentBuilder.parse(new File("src//工厂方法模式//案列加强反射与配置文件//config.xml"));
            NodeList className = document.getElementsByTagName("className");
            Node firstChild = className.item(0).getFirstChild();
            String nodeValue = firstChild.getNodeValue();
            //nodeValue 是类路径
            Class<?> aClass = Class.forName(nodeValue);
            Object o = aClass.newInstance();
            return o;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        throw new NullPointerException();

    }
}
