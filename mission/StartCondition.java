package mission;

import java.util.List;

import objects.terrain.Terrain;

/**
 * Events will depend on start conditions. e.g., any
 * quests involving retrieving information from space 
 * stations will need to check here for available space
 * stations.
 * @author Rocky
 *
 */
public class StartCondition extends Event{
	public List<Terrain> terrain;

}
