package Hotel;
//SID 1610314 Object Oriented Programming Assign2
import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XMLBookingWriter extends XMLWriter {
	// Used to store Element rootElement
	private Element rootElement;
	// Used to store Element theBooking
	private Element theBooking;
	// Used to store Element theApartmentName
	private Element theApartmentName;
	// Used to store Atrr attr
	private Attr attr;
	// Used to store Element theFirstName
	private Element theFirstName;
	// Used to store Element theLastName
	private Element theLastName;
	// Used to store Element theMaxGuests
	private Element theMaxGuests;
	// Used to store Element theStartDate
	private Element theStartDate;
	// Used to store Element theEndDate
	private Element theEndDate;
	// Used to store Element theCatering
	private Element theCatering;
	// Used to store TransformerFactory transformerFactory
	private TransformerFactory transformerFactory;
	// Used to store Transformer transformer
	private Transformer transformer;
	// Used to store DOMSource source
	private DOMSource source;
	// Used to store StreamResult result
	private StreamResult result;
	// Used to store StreamResult consoleResult
	private StreamResult consoleResult;
	// Used to store BID integer
	private int BID = 101;

//public method returns nothing , data needed to feed into bookingWriter 
	public void bookingWriter(Document doc, String filenameToWrite, String clientApartmentName, String clientFirstName,
			String clientLastName, String maxGuests, String bookingStartDate, String bookingEndDate,
			String bookingCatering) {
		try {
			// root element of XML is bookings (creates element)
			rootElement = doc.createElement("bookings");
			// appends childen rootElement
			doc.appendChild(rootElement);
			// creates the booking based on follow data type information
			rootElement.appendChild(createBooking(doc, filenameToWrite, clientApartmentName, clientFirstName,
					clientLastName, maxGuests, bookingStartDate, bookingEndDate, bookingCatering));

			// write the content into xml file by creatin transformfactory instance (object)
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transf = transformerFactory.newTransformer();
			// type of encoding used for the XML
			transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transf.setOutputProperty(OutputKeys.INDENT, "yes");
			transf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			// DOM source , object used for constructor of doc
			DOMSource source = new DOMSource(doc);
			// storing bookingURI as new file object
			File myFile = new File(hotelManagement.bookingURI);
			// results is in console object
			StreamResult console = new StreamResult(System.out);
			// file object stream stored in file, using myfile in constructor of file
			StreamResult file = new StreamResult(myFile);
			// setting transform type source = console, source =file
			transf.transform(source, console);
			transf.transform(source, file);
		} catch (Exception e) {// incase of possible errors catch them (Exceptions)
			e.printStackTrace();
		} // end try...catch
	}

	// returns node from method createbooking , revies information for booking
	// elements
	private static Node createBooking(Document doc, String filenameToWrite, String clientApartmentName,
			String clientFirstName, String clientLastName, String maxGuests, String bookingStartDate,
			String bookingEndDate, String bookingCatering) {
		// booking element booking store the creation of booking
		Element booking = doc.createElement("booking");
		// id set to 1
		String id = "1";
		// setting attribute to id
		booking.setAttribute("id", id);
		// setting first name from program to firstname in XML
		booking.appendChild(createBookingElement(doc, "firstname", clientFirstName));
		// setting lastname from program to lastname in XML
		booking.appendChild(createBookingElement(doc, "lastname", clientLastName));
		// setting apartment name from program to XML
		booking.appendChild(createBookingElement(doc, "apartmentname", clientApartmentName));
		// setting maxGuests name from program to XML
		booking.appendChild(createBookingElement(doc, "numberguests", maxGuests));
		// setting startdate name from program to XML

		booking.appendChild(createBookingElement(doc, "startdate", bookingStartDate));
		// setting enddate name from program to XML

		booking.appendChild(createBookingElement(doc, "enddate", bookingEndDate));
		// setting cateringbooking variable from program to XML element
		booking.appendChild(createBookingElement(doc, "catering", bookingCatering));
//returns booking node
		return booking;
	}

	// method which returns Node for creating booking element
	private static Node createBookingElement(Document doc, String name, String value) {
//creates element node based on element node 
		Element node = doc.createElement(name);
		// appends vaule of text node
		node.appendChild(doc.createTextNode(value));
//returns node from method when used 
		return node;
	}

}



