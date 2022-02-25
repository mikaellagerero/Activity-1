package Activity1;

public class removespace {

  public static void main(String[] args)
    {
        String str = "    win   for    win       ";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }
}