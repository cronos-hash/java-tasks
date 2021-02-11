package Hotel;//SID 1610314 Object Oriented Programming Assign2

//importing needed API'S
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.io.ByteArrayInputStream;
import java.io.File;

//public class XMLWriter
public class XMLWriter {
	// factory for docuement builder
	private DocumentBuilderFactory dbFactory;
	// docuement builder data type as dbuilder
	private DocumentBuilder dBuilder;
	// the editable document
	private Document doc;

	// method returns doc (serverConnection < name)
	public Document serverConnection() {
		try {
			// create the three layers for the XML writer
			// dbFactory stores new instance of builder

			dbFactory = DocumentBuilderFactory.newInstance();
			// factory creates new document builder , stored in dBuilder

			dBuilder = dbFactory.newDocumentBuilder();
			// new document stored in doc
			doc = dBuilder.newDocument();
		} // used to catch exception errors
		catch (Exception e) {
			e.printStackTrace();
		} // end try...catch
			// returns document
		return doc;

	}
}
