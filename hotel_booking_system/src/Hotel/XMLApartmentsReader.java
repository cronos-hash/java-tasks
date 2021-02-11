package Hotel;
//SID 1610314 Object Oriented Programming Assign2
//import all needed APIs for functional program
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import javax.swing.*;
import java.awt.*;

//GUI only 
//extends to abract class XMLReader
public class XMLApartmentsReader extends XMLReader
{
	//creates document data type aDoc
	private Document aDoc;
	//new object String[][] for formatting of XML 
	private String[][] data = new String[10][9];	
	//private String column[]={"Apartment ID","Price per Night","Start Date", "End Date", "Max Guests", "Number Beds", "Number Baths", "Living Room"};  
	//counter for the rows of the XML
	private int rowCounter = 0;
	//counter for the columns of the XML
	private int columnCounter = 0;
	//JTable and JScrollPane for displaying XML with GUI rather than console
	private JTable apartmentsTable;   
	private JScrollPane displayScrollPanel;
	//constructor of apartmentsReader
	public String[][] apartmentsReader()
	{
		//commented out code for creating of JTable , and Scroll Pane (used for debugging purposes)
		//apartmentsTable = new JTable(data,column);    
		//apartmentsTable.setBounds(30,40,200,300);
		//apartmentsScrollPanel = new JScrollPane(apartmentsTable);
		//Document server connection to the apartmentsURI of the xml file 
		aDoc = serverConnection(hotelManagement.apartmentsURI);
		//tells the user the root element (for debugging purposes
		System.out.println("Root element :" + aDoc.getDocumentElement().getNodeName()); //nodename of docuement element (root element)
		//gets the node listing of the document by the apartment tag element 
		NodeList nList = aDoc.getElementsByTagName("apartment");
		//prints this as a seperator in the console 
		System.out.println("----------------------------");
		//counts through 0 to list length (acts as counter)
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
			//for node list item, counts through all 
			Node nNode = nList.item(temp);
			//displays current element print everytime 
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			//if the node type is equal to the node element then 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				// the element becomes the node 
				Element eElement = (Element) nNode;
				// string ID stored as string aptID_table string variable 
				String aptID_Table = eElement.getAttribute("ID");
				//String element apartment name stored as aptname (after getting text) same occurs for each element tag item
				String aptName_Table = eElement.getElementsByTagName("apartmentname").item(0).getTextContent();
				String price_Table = eElement.getElementsByTagName("price").item(0).getTextContent();
				String startDate_Table = eElement.getElementsByTagName("startdate").item(0).getTextContent();
				String endDate_Table = eElement.getElementsByTagName("enddate").item(0).getTextContent();
				String maxGuests_Table = eElement.getElementsByTagName("maxguests").item(0).getTextContent();
				String numBeds_Table = eElement.getElementsByTagName("numberbeds").item(0).getTextContent();
				String numBaths_Table = eElement.getElementsByTagName("numberbaths").item(0).getTextContent();
				String livingRoom_Table = eElement.getElementsByTagName("livingroom").item(0).getTextContent();
				//use counter to display all 
				data[rowCounter][columnCounter] = aptName_Table;
				columnCounter = columnCounter + 1;
				
				data[rowCounter][columnCounter] = aptID_Table;
				columnCounter = columnCounter + 1;
				
				data[rowCounter][columnCounter] = price_Table;
				columnCounter = columnCounter + 1;
				
				data[rowCounter][columnCounter]  = startDate_Table;
				columnCounter = columnCounter + 1;
				
				data[rowCounter][columnCounter] = endDate_Table;
				columnCounter = columnCounter + 1;
				
				data[rowCounter][columnCounter]  = maxGuests_Table;
				columnCounter = columnCounter + 1;
				
				data[rowCounter][columnCounter] = numBeds_Table;
				columnCounter = columnCounter + 1;
				
				data[rowCounter][columnCounter] = numBaths_Table;
				columnCounter = columnCounter + 1;
				
				data[rowCounter][columnCounter] = livingRoom_Table;
				
				// Debugging statements				
				System.out.println("Apartment ID: " +  aptID_Table);
				System.out.println("Price per Night : " + price_Table);				
			    System.out.println("Start Date: " + startDate_Table);
				System.out.println("End Date: " + endDate_Table);
				System.out.println("Max number of guests: " + maxGuests_Table);
				System.out.println("Number of Bedrooms: " + numBeds_Table);
				System.out.println("Number of Bathrooms: " + numBaths_Table);
				System.out.println("Separate Living Room: " + livingRoom_Table);
			}// end if
			//adds to the counter for each row of the table 
			rowCounter = rowCounter + 1;
			//column counter does not change 
			columnCounter = 0;
		}// end for
		//returns data (table)
		return data;
	}
	//used for displaying the table , dataTable , column table, Jpanel  (GUI is used)
	public void tableDisplay(String[][] dataTable, String columnTable[], JPanel displayPanel, JFrame displayFrame)
	{
		//creation of new JTable apartments table for displaying datTable, and columntable , uses JTable constructor 
			apartmentsTable = new JTable(dataTable,columnTable); 
			//sets bounds of the table (formatting)
			apartmentsTable.setBounds(30,40,1200,200);
			//used for the displays scroll pane , object creation of display Scroll Pane 
			displayScrollPanel = new JScrollPane(apartmentsTable);
			// Adds scroll panel to display panel 
		 	displayPanel.add(displayScrollPanel);
		    //adds display pane to display frame 
		    displayFrame.add(displayPanel);          
		    //displayFrame.setSize(300,400);    
		    //visiblilty set to true 
		    displayFrame.setVisible(true);   
	}
		
	
}
