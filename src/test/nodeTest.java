package test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class nodeTest {
	
	public static void main(String[] args) {
		new nodeTest().loadDocument();
	
	}
	public void loadDocument(){
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document doc=builder.parse("NewFile.xml");;
			NodeList brandList=doc.getElementsByTagName("Brand");
			for(int i=0;i<brandList.getLength();i++)
			{
				System.out.println(brandList.getLength());
				Node brand=brandList.item(i);
				Element element=(Element) brand;
				String attrValue=element.getAttribute("name");
				System.out.println(attrValue);
				NodeList types =element.getChildNodes();				
				System.out.println("types::"+types.getLength());
				for(int j=0;j<types.getLength();j++)
				{
					
					Node tempType = types.item(j);
					if(tempType.getNodeType()==Node.ELEMENT_NODE) {
					Element typeElement=(Element)tempType;
					String type=typeElement.getAttribute("name");
					System.out.print("手机"+attrValue+type);
				}
					}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

