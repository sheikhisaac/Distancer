//Isaac Sheikh 06.06.2017

/*
Inputs data from two separate text files, one with nodes/hubs and the other with cities.
Checks each city against a node/hub and outputs the results to a new text file, separated by node/hub.
Implements DistanceCalculator.java to calculate distance from node/hub to city
 */

import java.io.*;

public class Indexer {
//    File node = new File("node.txt");
//    File city = new File("city.txt");
//
//    BufferedReader nodes = new BufferedReader(new FileReader(node));
//    BufferedReader cities = new BufferedReader(new FileReader(city));
    public Indexer() {
        //associates each face to its respective suit and adds to deck list
        for (int i = 0; i <= 2 - 1; i++) {          //nodes/hubs
            for (int j = 0; j <= 2 - 1; j++) {       //cities
                System.out.println(i + " " + j);
                PrintWriter output = createFile("output.txt");
            }
        }
    }

    public static  PrintWriter createFile(String fileName){
        try{
            File output = new File(fileName);

            PrintWriter stufftowrite = new PrintWriter(new BufferedWriter(new FileWriter(output)));
        }

        catch(IOException e){
            System.out.println("An I/O Error has Occurred");
            System.exit(0);
        }

        return null;
    }

    public static void ReadFile(String file_path){
         String path = file_path;
    }
}
