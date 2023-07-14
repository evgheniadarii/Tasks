package TrickyTasks;

import java.util.*;

public class ScoreCalculator {
    public static void main(String[] args) {
        //identifying the input and declaring String[] for players and for sentences
        String[] players = {"Bobby", "Sarah", "Horatio", "Brenda", "Pat"};
        String[] sentences =
                {"The quick brown fox jumped over the lazy dog",
                "The rules of this game do not make any sense",
                "She sells seas shells by the sea shore",
                "Bobby has a better string than I do",
                "Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo"};

        //creating a new HashMap with name scores that will keep the key=players and value=sentences
        Map<String, Integer> scores = new HashMap<>();
        //iterate through loop over the player's length
        for (int i = 0; i < players.length; i++) {
            String player = players[i];
            String str = sentences[i];
            int score = calculateScore(str);
            scores.put(player, score);
        }

        List<Map.Entry<String, Integer>> sortedScores = new ArrayList<>(scores.entrySet());
        sortedScores.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : sortedScores) {
            String player = entry.getKey();
            int score = entry.getValue();
            System.out.println(player + ": " + score);
        }

    }

    //creating a method that will calculate the score
    private static int calculateScore(String str) {
        int score = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)){
                switch (Character.toLowerCase(c)){
                    case 'a' :
                        score += 1;
                        break;
                    case 'b' :
                        score += 2;
                        break;
                    case 'c' :
                        score += 3;
                        break;
                }
            }
        }
        return score;
    }

}

/**
Each player inputs a string and a score is calculated based on the letters in the string.
* each A is worth 1 point
* each B is worth 2 points
* each C is worth 3 points

Create a small routine that calculates the scores for the following players, and prints them in descending order by score:
* Bobby enters "The quick brown fox jumped over the lazy dog"
* Sarah enters "The rules of this game do not make any sense"
* Horatio enters "She sells seas shells by the sea shore"
* Brenda enters "Bobby has a better string than I do"
* Pat enters "Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo"
 */



/**
 * // My opinion how I should solve this problem:
 *
 * 1) first let's understand the problem, here it is required to calculate the scores for each player based on the letters
 * in their input strings and also we can notice that each letter has a specific point
 *
 * now how we can write our code / what approach should we use
 *
 * so, I would identify the input, I will declare 2 String[] for players and for strings(sentences)
 *
 * 2) i will create a HashMap with name scores that will keep the keys and values of the map with the names:
 * key = String (that will keep the player's name)
 * value = integer (that will keep the player's score),
 * then I will iterate through a for loop over the player's length (assuming that the length for players and strings arrays
 * are the same.
 * then I'll call a method that will pass the input as an argument and will calculate the score.
 * why I want to do like this because each player's score it will be calculated by the method I will declare and the map
 * will keep the track of these scores for each player.
 *
 * when I declare my method I have to create her to not get a compiler, and this method will calculate the score.
 * so what I will do, I will initialize the score to variable 0 then I will iterate over each character using a each-loop
 * then within the loop I will declare an if-statement, and also I will use a switch statement to determine the corresponding
 * value of the score. And finally, I will return the calculated score from the method.
 *
 * 3) Then I will create a new ArrayList called sortedScores and I will pass the entries of the scores map to its constructor.
 * then I will use the sort method of ArrayList to sort the sortedScores in descending order based on the values of the map entries
 * then I will use a comparator that compares the values of the map entries in reversed order.
 *after I will sort the scores I will iterate over each entry in the sortedScores list using a for-each loop.
 * then I will retrieve the player's name using entry.getKey() assigned to player's variable and similarly I will do
 * with the score just i will use entry.getValue().
 *
 * at the end I will print the player's name and score. and I will check the console
 */
