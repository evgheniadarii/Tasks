package June6th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDistance {
    private Map<String, List<Integer> > wordIndex;

    public WordDistance(String filePath) {
        wordIndex = new HashMap<>();
        buildIndex(filePath);
    }

    private void buildIndex(String filePath) {
        try(BufferedReader reader = new BufferedReader((new FileReader(filePath)))){
            String line;
            int position = 0;
            while ((line = reader.readLine()) != null){
                String[] words = line.split(" ");

                //Process each word in the line
                for (String word :words) {
                    word = word.toLowerCase();

                    //If the word is not in the index, add it with an empty list
                    if (!wordIndex.containsKey(word)){
                        wordIndex.put(word, new ArrayList<>());
                    }

                    //add the current position to the list of word positions in the index
                    wordIndex.get(word).add(position);

                    //incrementing the position counter
                    position++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int findShortestDistance(String word1, String word2){
        //checking if both words exist in the index
        if (!wordIndex.containsKey(word1)|| !wordIndex.containsKey(word2)){
            return -1; // one or both words not found in the file
        }
        //retrieving the lists of positions for word1 and word2 from the index
        List<Integer> positions1 = wordIndex.get(word1);
        List<Integer> positions2 = wordIndex.get(word2);

        int i = 0; // pointer for positions1
        int j = 0; // pointer for positions2
        int minDistance = Integer.MAX_VALUE;

        //iterating over the positions lists to find the shorter distance
        while( i < positions1.size() && j < positions2.size()){
            int pos1 = positions1.get(i);
            int pos2 = positions2.get(j);

            //Calculating the current distance and updating minDistance if needed
            minDistance = Math.min(minDistance, Math.abs(pos1-pos2));

            // moving the pointers based on the comparison of positions
            if (pos1 < pos2){
                i++;
            }else {
                j++;
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        String filePath = "path/to/your/large/txt/file.txt";
        WordDistance wordDistance = new WordDistance(filePath);

        String word1 = "you";
        String word2 = "special";
        int shortDistance = wordDistance.findShortestDistance(word1, word2);
        if (shortDistance ==-1){
            System.out.println("One or both words not found in the file.");
        }else {
            System.out.println("Shortest distance between \"" + word1 + "\" and \"" + word2 + "\": " + shortDistance);
        }
    }


}

/*
Task 3
You have a large text file containing words. Given any 2 words, find the shortest distance(in terms of number of words)
between them in the file. If the operation will be repeated many times for the same file (but different pairs of words),
can you optimize your solution?

 */
