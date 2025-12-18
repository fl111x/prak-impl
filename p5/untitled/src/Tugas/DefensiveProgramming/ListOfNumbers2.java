package Tugas.DefensiveProgramming;

import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    private Vector victor;
    private static final int size = 10;
    public ListOfNumbers2() throws IOException {
        victor = new Vector(size);
        for (int i = 0; i < size; i++)
            victor.addElement(new Integer(i));
        this.readList("infile.txt");
        this.writeList();
    }
    public void readList(String fileName) {
        try {
            String line = null;
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {
                Integer i = new Integer(Integer.parseInt(line));
                System.out.println(i);
                victor.addElement(i);
            }
        }catch (Exception e){
            System.out.println("Error in reading file: "+e.getMessage());
        }
    }
    public void writeList() throws IOException {
        try {
            PrintWriter out = null;
            out = new PrintWriter(new FileWriter("outfile.txt"));

            for (int i = 0; i < victor.size(); i++) {
                out.println("Value at: " + i + " = " + victor.elementAt(i));
                //Tambahkan Exception jika array melebihi batas
                //Tambahkan Exception untuk output error
                //Tambahkan Exception untuk exception akhir menampilkan Closing Print Writer jika out tidak null dan Printwriter not open jika out null

            }
        }catch (FileNotFoundException e){
            System.out.println("Error in writing file: "+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error in array out of bounds: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        new ListOfNumbers2();
    }

}
