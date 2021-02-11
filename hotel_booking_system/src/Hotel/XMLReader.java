package Hotel;
//SID 1610314 Object Oriented Programming Assign2
//imports API's needed for program 
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

//abstract class XML reader
public abstract class XMLReader {
	// used to store file input
	private File inputFile;
	// used to store DocumentBuilder dBuilder
	private DocumentBuilder dBuilder;
	// used to store DocumentBuilderFactory dbFactory
	private DocumentBuilderFactory dbFactory;
	// used to store Document doc (works now)
	private Document doc;

	// method serverconnection returns doc
	public Document serverConnection(String filename) {
		try {
			// inputting file from filename
			inputFile = new File(filename);
			// dbFactory stores new instance of builder
			dbFactory = DocumentBuilderFactory.newInstance();
			// factory creates new document builder , stored in dBuilder
			dBuilder = dbFactory.newDocumentBuilder();
			// doc = new Document(); //can cause error
			// parsing input file
			doc = dBuilder.parse(inputFile);
			// normalizing input to prevent errors (correct format)
			doc.getDocumentElement().normalize();
			// catch Exception for possible errors
		} catch (Exception e) {
			// print error
			e.printStackTrace();
		} // end try...catch
		return doc;

	}// end method
		// abstract table Display

	abstract void tableDisplay(String[][] aDataTable, String aColumn[], JPanel displayPanel, JFrame displayFrame);

}
