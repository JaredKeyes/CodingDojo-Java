import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class TrackList {

    public static void main(String args[]) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("First Song", "First Lyrics");
        trackList.put("Generic Song Title", "We have nothing new or interesting to say");
        trackList.put("Everybody loves the third song", "Three is the best number");
        trackList.put("Are we almost done?", "I hope so.");

        String pull = trackList.get("First Song");
        System.out.println(pull);

        Set set = trackList.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
           Map.Entry mentry = (Map.Entry)iterator.next();
           System.out.print("Track: "+ mentry.getKey() + " & Lyrics: ");
           System.out.println(mentry.getValue());

        }
    }
}