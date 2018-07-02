package morse;

public class Convert_Words_To_Morse {
	public String uniqueMorseRepresentations(String word) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".",
        		"..-.","--.","....","..",".---","-.-",".-..",
        		"--","-.","---",".--.","--.-",".-.","...",
        		"-","..-","...-",".--","-..-","-.--","--.."};
        
        String answer = "";
        for (int j = 0; j < word.length(); j++)
            answer += morse[word.charAt(j) - 'a'];
        return answer;
    }
}
