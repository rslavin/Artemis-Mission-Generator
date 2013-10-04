package main;

import java.util.List;
import java.util.NoSuchElementException;

import objects.*;

public class Main {
	private static List<MapObject> objects;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// randomly generate parameters for StartCondition and missionSnippets
		
		createMap();

	}
	
	/** MAP CREATION **/
	// choose missionSnippets
	// read information from missionSnippets
	// generate StartCondition
	private static void createMap(){
		
	}
	
	/** HELPERS **/
	private static int idToIndex(String objectID){
		int c = 0;
		for(MapObject obj:objects){
			if(obj.objectID.equals(objectID))
				return c;
			c++;
		}
		throw new NoSuchElementException();
	}
	
	/** ACTIONS **/
	
	
	private static void CreateObject(MapObject object){
		objects.add(object);	
	}
	
	private static void DestroyObject(String objectID){
		try {
			objects.get(idToIndex(objectID)).destroyed = true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.println(objectID+" not found in list of generated objects.");
		}
	}
	

}
