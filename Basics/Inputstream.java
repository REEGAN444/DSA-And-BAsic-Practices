import java.io.*;
import java.lang.*;
import java.util.*;

class Inputstream
{
 public static void main(String args[])
 {
  File fin=new File("G:\filetest.txt");
  FileInputStream r=new FileInputStream(fin);
  Byte b[]=new Byte[(int)fin.length()];
  r.read(b[]);
  File fout=new File("G:\filetest2.txt");
  FileOutputStream w=new FileOutputStream(fout);
  w.write(b[]);
  w.flush();
  
 }
}