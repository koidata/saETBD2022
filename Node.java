//This class represents each Parent generated in a population

import java.util.*;
import java.io.*;

public class Node {
    //node builds its bitArray of size 10
    ArrayList<Integer> data = new ArrayList<>(10);
    //constructor
    public Node () {
        //When constructing a new Node, auto-gen the genotype on its call. 
        this.data = BitArray(data);
    }
    /**
     * @param data An ArrayList of initial size 10 that holds each bit in the bitString
     * @return
     */
    // Generate a 10-bit string of random bits to represent the genotype of each parent. 
    public static ArrayList<Integer> BitArray (ArrayList<Integer> input) {
        ArrayList<Integer> temp = input;
        for (int i =0; i<12; i++) {
            Random r = new Random();
            int next = r.nextInt(2);
            input.add(next);
        } 
        return temp;
    }
    //Helper method prints all the bits in the genotype
    public void printBits (ArrayList<Integer> input) { 
        ArrayList<Integer> temp = input;
        for(int x : temp) {
            System.out.print(x);
        }
        System.out.println("");
    }
}
