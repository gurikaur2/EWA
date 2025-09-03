
/* Write a program that reads a file and displays the words of that file as a list.

First, display all words. !
Then display them in reverse order. !
Then display them with all plurals (ending with "s"). !
Then display them with all plural words removed and the size of the updated list.
 */
import java.util.*;
import java.io.*;
 class P1_ArrayList
{
 public static void main(String[] args) {
    try {
        File file= new File("P1_convertingtoList.txt");
        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file)); //BufferedReader = faster, line oriented reading
            String line;
            List<String> wordsList = new ArrayList<>();
            while ((line = br.readLine()) !=null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordsList.add(word);
                    }
                }
            }
            System.out.println("All Words:");
            System.out.println(wordsList);


            System.out.println("\n Words in reverse:");
            

        } else {
            
        }
        
    } catch (Exception e) {
        // TODO: handle exception
    }
 }
}
