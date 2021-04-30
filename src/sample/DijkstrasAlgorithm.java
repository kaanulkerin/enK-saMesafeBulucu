package sample;// A Java program for Dijkstra's
// single source shortest path  
// algorithm. The program is for 
// adjacency matrix representation 
// of the graph. 

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class DijkstrasAlgorithm {

    public DijkstrasAlgorithm() {

    }

    private static final int NO_PARENT = -1;

    // Function that implements Dijkstra's 
    // single source shortest path 
    // algorithm for a graph represented  
    // using adjacency matrix 
    // representation 
    public static void dijkstra(int[][] adjacencyMatrix , int startVertex , ArrayList<City> x){  // startVertex = kocaeli

        int nVertices = adjacencyMatrix[0].length; // => sehir sayisi

        // shortestDistances[i] will hold the 
        // shortest distance from src to i 
        int[] shortestDistances = new int[nVertices];  // kocaeli ile i şehri arası en kısa mesafeyi tutacak dizi.

        // added[i] will true if vertex i is 
        // included / in shortest path tree 
        // or shortest distance from src to  
        // i is finalized 
        boolean[] added = new boolean[nVertices];   // => i şehrinin kocaeline olan uzaklığı bulunduysa , bu dizi[i] true olacak.
                                                    // kocaeli harici şehirlerin uzaklıklarının bulunup bulunmadığıını tutacak dizi.

        // Initialize all distances as  
        // INFINITE and added[] as false 
        for (int vertexIndex = 0 ; vertexIndex < nVertices ; vertexIndex++){

            shortestDistances[vertexIndex] = Integer.MAX_VALUE;             // bu for döngüsünde gezilen şehirlerin mesafelerine sonsuz ,
            added[vertexIndex] = false;                                     // gezilme durumlarına false veriyoruz.
        }

        // Distance of source vertex from 
        // itself is always 0 
        shortestDistances[startVertex] = 0; // kocaelinin kendine olan uzaklığı 0

        // Parent array to store shortest 
        // path tree 
        int[] parents = new int[nVertices];   // kocaeli istanbul edirne mesela. edirnenin parenti istanbul, istanbulun kocaeli.

        // The starting vertex does not  
        // have a parent 
        parents[startVertex] = NO_PARENT;     // kocaeline bir yerden gelinmedi.başlangıç yeri , o yüzden -1

        // Find shortest path for all  
        // vertices 
        for (int i = 1 ; i < nVertices; i++){

            // Pick the minimum distance vertex
            // from the set of vertices not yet 
            // processed. nearestVertex is  
            // always equal to startNode in  
            // first iteration.

            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;

            for (int vertexIndex = 0 ; vertexIndex < nVertices ; vertexIndex++){

                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance){

                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }

            }

            // Mark the picked vertex as 
            // processed 
            added[nearestVertex] = true;

            // Update distance value of the
            // adjacent vertices of the 
            // picked vertex.

            for (int vertexIndex = 0 ; vertexIndex < nVertices ; vertexIndex++){

                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];

                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex]) ){

                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }


        }
        addCityDatas(x , startVertex , shortestDistances , parents);
        printSolution(startVertex, shortestDistances, parents);
    }

    // A utility function to print  
    // the constructed distances 
    // array and shortest paths 
    public static void printSolution(int startVertex , int[] distances , int[] parents)
    {
        int nVertices = distances.length;
        System.out.print("Vertex\t Distance\tPath");

        for (int vertexIndex = 0 ; vertexIndex < nVertices ; vertexIndex++){

            if (vertexIndex != startVertex){

                System.out.print("\n" + startVertex + " -> ");
                System.out.print(vertexIndex + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, parents);
            }
        }
    }

    // Function to print shortest path 
    // from source to currentVertex 
    // using parents array 
    public static void printPath(int currentVertex , int[] parents){

        // Base case : Source node has 
        // been processed 
        if (currentVertex == NO_PARENT){
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }

    // Driver Code

    public static void addCityDatas(ArrayList<City> x , int startVertex , int[] distances , int[] parents){

        int nVertices = distances.length;
        ListIterator<City> iterator = x.listIterator();
        int index = 0;

        while(iterator.hasNext()){
            if(iterator.next().getPlateNo() == startVertex){
                break;
            }
            index++;
        }

        for(int vertexIndex = 0 ; vertexIndex < nVertices ; vertexIndex++){

            if(vertexIndex != startVertex){
              x.get(index).distancesToOtherCities.add(distances[vertexIndex]);
            }
            else{
               x.get(index).distancesToOtherCities.add(0);
            }
        }



        for(int vertexIndex = 0 ; vertexIndex < nVertices ; vertexIndex++){

            if(vertexIndex != startVertex){
                x.get(index).paths.add(new ArrayList<>());
                int temp = vertexIndex;
                addPaths(x.get(index) , vertexIndex , parents , temp );
            }
            else{
                x.get(index).paths.add(new ArrayList<>());
                x.get(index).paths.get(vertexIndex).add(-1);
            }
        }



    }

    public static void addPaths(City x , int currentVertex , int[] parents , int whereAmI){

        if (currentVertex == NO_PARENT){
            return;
        }
        /*printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");*/

        addPaths( x , parents[currentVertex], parents , whereAmI);
        x.paths.get(whereAmI).add(currentVertex);


    }

    public static int cityCount(){

          Scanner s = new Scanner(System.in);

          System.out.println("Kac sehre gitmek istiyorsunuz?");
           int x = s.nextInt();

          while(x > 10){
              System.out.println("Maximum 10 sehir secebilirsiniz.");
              System.out.println("Kac sehre gitmek istiyorsunuz?");
              x = s.nextInt();
          }
          return x;
      }
    public static void readFileAndPrintCities() throws IOException {
       File file = new File("sehirler ve plaka kodları.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
          String[] cities = new String[81];
          int i = 0;
          System.out.println();
          while ((cities[i] = br.readLine()) != null){
              System.out.println(cities[i]);
              i++;
          }
          System.out.println("Listeden istediginiz sehirlerin plaka kodlarini girin :");
      }
}