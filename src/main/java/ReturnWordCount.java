
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        boolean wordFlag = false;
        int wordCount = 0;
        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i) != ' '){
                wordFlag = true;
            }
            else{
                wordFlag = false;
            }
            if(i == in.length()- 1 && in.charAt(i) != ' ') wordCount++;
            if (wordFlag == false) wordCount++;
        }
        return wordCount;
    }
}
