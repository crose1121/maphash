package maphash;
import java.util.HashMap;
import java.util.Set;

public class LyricsMap {
	
	public HashMap<String, String> generateMap() {
		HashMap<String, String> lyricsMap = new HashMap<String, String>();
		lyricsMap.put("One", "All i know. Darkness, suffering");
		lyricsMap.put("Master Exploder", "I do not neeeeeed...");
		lyricsMap.put("Funktown", "These are some funky tunes");
		lyricsMap.put("Randomness", "I got faith in you and me");
		return lyricsMap;
	}
	
	public String displayOneSong(String title) {
		HashMap<String, String> lyricsMap = generateMap();
//		
		String lyrics = lyricsMap.get(title);
		return lyrics;
	}
	
	public void displayAllSongs() {
		HashMap<String, String> lyricsMap = generateMap();
		Set<String> keys = lyricsMap.keySet();
		
		for (String key: keys) {
            System.out.println(key);
            System.out.println(lyricsMap.get(key)); 
		}
	}
}