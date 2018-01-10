public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String finish = (str1.trim() + str2.trim());
        return finish;
    }
    public Integer getIndexOrNull(String str, char letter) {
        Integer index = (str.indexOf(letter));
        if ( index < 0 ){
            return null;
        }
        else {
            return index;
        }
    }
    public Integer getIndexOrNull(String str1, String str2) {
        Integer index = (str1.indexOf(str2));
        if ( index < 0 ){
            return null;
        }
        else {
            return index;
        }
    }
    public String concatSubstring(String str1, int index1, int index2, String str2){
        String done = str1.substring(index1,index2) + str2;
        return done;
    }
}