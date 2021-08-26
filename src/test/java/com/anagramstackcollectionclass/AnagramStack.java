package com.anagramstackcollectionclass;
import java.util.*;
import java.io.*;

public class AnagramStack {
    public static void main(String[] theArgs) {
        LinkedList<Word> wordObjects = new LinkedList<Word>();
        ArrayList<String> localWords = new ArrayList<String>();
        BufferedReader localInput = null;
        BufferedWriter localOutput = null;


        try {
            String localLine;
            localInput = new BufferedReader(new FileReader("words.txt"));
//         localOutput = new BufferedWriter(new FileWriter("out9.txt"));
            while ((localLine = localInput.readLine()) != null) {
                if (localLine != "") {
                    localWords.add(localLine);
                }
//
//
            }
            /*
             */
            localInput.close();
//       localOutput.close();
        } catch (Exception e) {
            System.out.println("Difficulties opening the file! " + e);
            System.exit(1);
        }

        localWords.removeAll(Collections.singleton(""));
        Map<String, List<String>> anagramList = new HashMap<String, List<String>>();
        Iterator<String> iterAdd = localWords.iterator();

        while (iterAdd.hasNext()) {
            wordObjects.add(new Word(iterAdd.next()));
        }
        Collections.sort(wordObjects);

        LinkedList<AnagramFamily> anagramObjects = new LinkedList<AnagramFamily>();

    }
}
