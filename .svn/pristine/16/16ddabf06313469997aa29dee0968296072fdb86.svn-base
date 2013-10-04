package main;

import java.io.StringWriter;

import xmlWriter.WriteXML;
import mission.Mission;
import mission.Story;
import mission.snippets.FindObjectTemplate;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Mission m = new Mission();
		
		// generate State
		FindObjectTemplate fot = new FindObjectTemplate(m);
		// convert State to Story
		Story st = fot.make();
		
		m.addSnippet(st);
		
		WriteXML w = new WriteXML(m);
		StringWriter sw = new StringWriter();
		w.write(sw);
		
		System.out.println(sw);
		
		System.out.println(st);
		
		// TODO Auto-generated method stub

	}

}
