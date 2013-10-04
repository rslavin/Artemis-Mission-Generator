package xmlWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import mission.*;
import mission.event.Command;
import mission.event.Condition;
import mission.event.Timer;
import mission.event.WithAttributes;
import mission.event.WithBody;
import mission.event.commands.CSetTimer;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXML {
	private static final String FILENAME = "C://RandomMission.xml";

	private Mission mission;

	public WriteXML(Mission mission) {

		this.mission = mission;

	}

	public void write() {
		try {
			write(new FileWriter(new File(FILENAME)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void write(Writer w) {

		// make sure everything is resolved
		preprocess();

		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root element
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("mission");
			doc.appendChild(rootElement);
			Attr attr = doc.createAttribute("version");
			attr.setValue(mission.version);
			rootElement.setAttributeNode(attr);

			/*
			 * Do the <start> element
			 */
			Element start = writeStart(doc);
			rootElement.appendChild(start);

			/*
			 * Do all the events
			 */
			writeEvents(doc, rootElement);

			// // ImmediateEvent elements
			// for(Event singleEvent:mission.immEvents){
			// Element event = doc.createElement("event");
			// rootElement.appendChild(event);
			// //*********************** iterate through event and add children
			// here *************************//
			// }

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,
					"yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(
					"{http://xml.apache.org/xslt}indent-amount", "2");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");

			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(w);

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}

	/*
	 * Start preprocessing so we have resolved all references etc.
	 */
	protected void preprocess() {
		preprocessNames();
	}

	private void preprocessNames() {

		int c = 0;

		for (Named n : mission.getNamedObjects()) {
			if (n.getId() == null) {
				n.setId("id" + (c++));
			}
		}

	}

	/**
	 * Write the start block
	 * 
	 * @param doc
	 * @param rootElement
	 */
	private Element writeStart(Document doc) {

		Element start = doc.createElement("start");

		// first set up what the mission has as starts

		for (Command com : mission.getStartCommands()) {
			Element cElem = writeCommand(doc, com);
			start.appendChild(cElem);
		}

		// now all the snippets

		for (Story s : mission.getSnippets()) {

			// set up timers
			for (Timer t : s.getStartTimers()) {
				Command com = new CSetTimer(t);
				Element cElem = writeCommand(doc, com);
				start.appendChild(cElem);
			}

			// do start commands, likely empty
			for (Command com : s.getStartCommands()) {
				Element cElem = writeCommand(doc, com);
				start.appendChild(cElem);
			}

		}

		return start;
	}

	private void writeEvents(Document doc, Element root) {

		// go through all the snippets

		for (Story s : mission.getSnippets()) {

			// go through all the events

			for (mission.event.Event event : s.getEvents()) {
				Element eElem = writeEvent(doc, event);
				root.appendChild(eElem);
			}

		}

	}

	protected Element writeEvent(Document doc, mission.event.Event event) {
		Element root = doc.createElement("event");

		for (Condition cond : event.getConditions()) {
			Element cElem = writeCondition(doc, cond);
			root.appendChild(cElem);
		}

		for (Command com : event.getCommands()) {
			Element cElem = writeCommand(doc, com);
			root.appendChild(cElem);
		}

		return root;
	}

	private Element writeCondition(Document doc, Condition cond) {
		Element cElem = doc.createElement(cond.getTag());

		writeAttr(cElem, cond);

		if (cond instanceof WithBody) {
			writeBody(cElem, (WithBody) cond);
		}

		return cElem;
	}

	private Element writeCommand(Document doc, Command com) {
		Element cElem = doc.createElement(com.getTag());

		writeAttr(cElem, com);

		if (com instanceof WithBody) {
			writeBody(cElem, (WithBody) com);
		}

		return cElem;
	}

	private void writeAttr(Element elem, WithAttributes src) {
		Map<String, Object> attr = src.getAttributes();
		for (String key : attr.keySet()) {
			Object val = attr.get(key);

			String valueToSet = null;
			if (val instanceof Named) {
				valueToSet = ((Named) val).getId();
			} else if (val instanceof Float) {
				// make sure it's decimal
				valueToSet = String.format("%.4f", ((Float) val).floatValue());
			} else {
				valueToSet = val.toString();
			}

			elem.setAttribute(key, valueToSet);
		}
	}

	private void writeBody(Element elem, WithBody src) {
		String body = src.getBody();
		elem.setTextContent(body);
	}
}