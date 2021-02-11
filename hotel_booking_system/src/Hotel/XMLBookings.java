package Hotel;
//SID 1610314 Object Oriented Programming Assign2
//importing API's Used 
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import javax.swing.*;
import java.awt.*;

//extends to abstract class 
public class XMLBookings extends XMLReader {
	// creates document data type aDoc
	private Document aDoc;
	// new object String[][] for formatting of XML
	private String[][] data = new String[10][9];
	// counter for the rows of the XML
	private int rowCounter = 0;
	// counter for the columns of the XML
	private int columnCounter = 0;
	// JTable and JScrollPane for displaying XML with GUI rather than console
	private JTable apartmentsTable;
	private JScrollPane displayScrollPanel;

	// constructor of bookingsreader
	public String[][] bookingsreader() {
		// Document server connection to the bookingsURI of the xml file
		aDoc = serverConnection(hotelManagement.bookingURI);
		// tells the user the root element (for debugging purposes
		System.out.println("Root element :" + aDoc.getDocumentElement().getNodeName());
		// gets the node listing of the document by booking tag element
		NodeList nList = aDoc.getElementsByTagName("booking");
		// prints this as a seperator in the console
		System.out.println("----------------------------");
		// counts through 0 to list length (acts as counter)
		for (int temp = 0; temp < nList.getLength(); temp++) {
			// for node list item, counts through all
			Node nNode = nList.item(temp);
			// displays current element print everytime
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			// if the node type is equal to the node element then
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				// the element becomes the node
				Element eElement = (Element) nNode;
				// String element apartment name stored as aptname_table (after getting text)
				// same occurs for each element tag item
				String aptName_Table = eElement.getElementsByTagName("apartmentname").item(0).getTextContent();
				String catering_Table = eElement.getElementsByTagName("catering").item(0).getTextContent();
				String clientName_Table = eElement.getElementsByTagName("firstname").item(0).getTextContent();
				String clientLName_Table = eElement.getElementsByTagName("lastname").item(0).getTextContent();
				String startDate_Table = eElement.getElementsByTagName("startdate").item(0).getTextContent();
				String endDate_Table = eElement.getElementsByTagName("enddate").item(0).getTextContent();
				String Guests_Table = eElement.getElementsByTagName("numberguests").item(0).getTextContent();

				// Debugging statements
				System.out.println("Apartment ID: " + "1");
				System.out.println("Apartment name: " + aptName_Table);
				System.out.println("Client name : " + clientName_Table + " " + clientLName_Table);
				System.out.println("Start Date: " + startDate_Table);
				System.out.println("Start Date: " + endDate_Table);
				System.out.println("Number of guests: " + Guests_Table);
				System.out.println("Date: " + startDate_Table);
				System.out.println("Required Catering?: " + catering_Table);
			} // end if
				// adds to the counter for each row of the table
			rowCounter = rowCounter + 1;
			// column counter does not change
			columnCounter = 0;
		} // end for
			// returns data (table)
		return data;
	}

	// used for displaying the table , dataTable , column table, Jpanel (GUI is
	// used)
	public void tableDisplay(String[][] dataTable, String columnTable[], JPanel displayPanel, JFrame displayFrame) {
		// creation of new JTable apartments table for displaying datTable, and
		// columntable , uses JTable constructor

		apartmentsTable = new JTable(dataTable, columnTable);
		// sets bounds of the table (formatting)

		apartmentsTable.setBounds(30, 40, 1200, 200);
		// used for the displays scroll pane , object creation of display Scroll Pane

		displayScrollPanel = new JScrollPane(apartmentsTable);
		// Adds scroll panel to display panel

		displayPanel.add(displayScrollPanel);
		// adds display pane to display frame

		displayFrame.add(displayPanel);
		// displayFrame.setSize(300,400);
		// visiblilty set to true

		displayFrame.setVisible(true);
	}

}
