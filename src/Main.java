import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Main {

    public static void main(String[] args) throws Exception {

        // Parsing of XML from URL
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse("http://www.geoplugin.net/xml.gp?base_currency=USD");

        NodeList nodeList = document.getElementsByTagName("*");

        // Printing
        System.out.println("======================================\n" +
                "Number of elements: "  + (nodeList.getLength() - 1));

        System.out.println("Root element: " + document.getDocumentElement().getNodeName() +
                "\n======================================");

        for (int i = 1, len = nodeList.getLength(); i < len; i++) {
            System.out.println(nodeList.item(i).getNodeName() + ": " + nodeList.item(i).getTextContent());
        }
    }
}