/*Reyes, Marius Alberto
 * CS203
 * 2CSA
 * Lab Exercise 4
 */

import java.io.*;
import java.util.Scanner;

public class SearchAndSort {
    static int linearCt = 0;
    static int mergeCt = 0;

    public static void main(String args[]) throws FileNotFoundException{
        try {
            String filename = "ioc.txt";
            String line = null;
            FileReader filereader = new FileReader(filename);
            BufferedReader br = new BufferedReader(filereader);
            Scanner sc = new Scanner(System.in);
            System.out.print("Input size: ");
            int size = sc.nextInt();
            int i=1;
            String arr1[] = new String[size+1];
            String arr2[] = new String[size+1];
            while((line = br.readLine()) != null && i<=size) {
                arr1[i]=line;
                i++;
            } 
            arr2=arr1;
            for (i=1;i<arr1.length;i++){
                System.out.println (i +".)"+ arr1[i]);
            }
            System.out.print ("\n");
            for (i=1;i<arr1.length;i++){
                System.out.println (i +".)"+ arr2[i]);
            }
            
            System.out.print ("Searh key: ");
            sc.nextLine();
            String key = sc.nextLine();
            System.out.println (key);
            //
            System.out.print ("Start index: ");
            int start = sc.nextInt();
            System.out.print ("End index: ");
            int end = sc.nextInt();
            System.out.println("Index for \"" + key + "\" is : " + linearSearch(start, end, key, arr1));
            System.out.println ("Linear Search Counter = " + linearCt);
            MergeSort (arr1, start, end);
            for (i=1;i<arr1.length;i++){
                System.out.println (i +".)"+ arr1[i]);
            }
            System.out.println ("Merge Sort Counter = " + mergeCt);
            sc.close();
            br.close();
            filereader.close();
        }catch (IOException ioe) {
            ioe.printStackTrace();
        } 
    }
    static String linearSearch(int start, int end, String key, String[] arr) {
        String index = "";
        for (int i = start; start <= end; start++) {
            if (arr[start].equals(key)) {
                linearCt++;
                index += start;
                return index;
            } else {
                linearCt++;
            }
        }
        return "Not found";
    }
    static void MergeSort(String[] name, int start, int end) {
        int mid=0;
        if (start < end) {
            mid = (int) Math.floor((start + end) / 2);
            MergeSort(name, start, mid);

            MergeSort(name, mid + 1, end);
            merge(name, start, mid + 1, end);
        }
    }

    static void merge(String[] name, int start, int middle, int end) {
        String[] temp = new String[end - start + 1];
        int startLimit = (start + end) / 2;
        int x = start, index = 0;

        while (start <= startLimit && middle <= end) {
            if (name[start].compareTo(name[middle]) >= 0) {
                temp[index] = name[start];
                start++;
            } else {
                temp[index] = name[middle];
                middle++;
            }
            index++;
            mergeCt++;
        }

        while (start <= startLimit && index < temp.length) {
            temp[index] = name[start];
            start++;
            index++;
        }

        while (middle <= end && index < temp.length) {
            temp[index] = name[middle];
            index++;
            middle++;
        }

        int h = temp.length;
        int i = x, s = 0;

        while (h > 0) {
            name[i++] = temp[s++];
            h--;
        }
    }
}
