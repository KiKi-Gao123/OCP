package OCP;

import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.NodeList;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;




public class XMLHepler {
    //帮助loginform获取到按钮名字的类 操作xml文件
    public XMLHepler() {
        // TODO Auto-generated constructor stub
    }
    public String getButtonName()
    {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();//实例化一个documentbuilderfactory 用来获取documentbuilder
        DocumentBuilder builder=null;
        try {
            builder=factory.newDocumentBuilder();
        }catch(ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        Document document=null;
        try {
            try {
                document= (Document) builder.parse("OCP.xml");//从指定路径获取xml文件 这里ocp.xml在项目文件夹下
            } catch (org.xml.sax.SAXException e) {
                e.printStackTrace();
            }

        } catch(IOException e)
        {
            e.printStackTrace();
        }
        NodeList nList= ((org.w3c.dom.Document) document).getElementsByTagName("ButtonName");//节点名叫“buttonname” 获取其中的内容
        return nList.item(0).getFirstChild().getNodeValue();//返回其内容
    }
}
