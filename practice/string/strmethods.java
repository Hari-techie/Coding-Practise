package string;
import java.util.*;

public class strmethods {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = "Java";
        String s2 = new String ("Program"); //
        int l = s1.length();   // isblank returns true if it contains any spaces 
        System.out.println(l+" "+s1.isEmpty()); // isempty returns true only if length=0
        System.out.println(s1.charAt(0)); // prints indexed char 
        String str1 = String.format("%d", 101);  // 101
        String str2 = String.format("|%10d|", 101);  //|      101| Specifying length of integer  
        String str3 = String.format("|%-10d|", 101); // |101     |Left-justifying within the specified width  
        String str4 = String.format("|% d|", 101);  // | 101|
        String str5 = String.format("|%010d|", 101); // |0000000101|
        String st1 = String.format("%d", 101);          // Integer value --> 101  
        String st2 = String.format("%s", "Amar Singh"); // String value  --> Amar singh
        String st3 = String.format("%f", 101.00);       // Float value   --> 101.000000
        String st4 = String.format("%x", 101);          // Hexadecimal value --> 65 
        String st5 = String.format("%c", 'c');          // Char  --> c
        System.out.println(s1.substring(2));//returns va
        System.out.println(s2.substring(2,4));//returns  og
        System.out.println(s1.contains("v"));// return true
        String stjoin = String.join("-", s1,s2);
        System.out.println(stjoin);
         String date = String.join("/","22","02","2021");    
        System.out.print(date);    
        String time = String.join(":", "02","30","10");  
        System.out.println(" "+time); 
        String t1="javatpoint";  
        String t2=new String ("javatpoint");  
        String t3="JAVATPOINT";  
        String t4="python"; 
        String t5=t1.intern();
        System.out.println(t1.equals(t2)); // true
        System.out.println(t1.equals(t3)); // false
        System.out.println(t1.equalsIgnoreCase(t3)); //true
        System.out.println(t1==t5); // true
        if (t1==t2)  // return false
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        System.out.println(s1.concat(s2).concat(t1));
        System.out.println(s1.replace("a", "aa"));
        String a="java string split method by javatpoint";  
        String[] words=a.split("\\s");
        System.out.println(words.length);
        for(String w:a.split("\\s",3)){    // split into 3 parts
        System.out.println(w);  }   
        String r="Tomorrow Will be a Holiday";
        System.out.println(r.indexOf("w"));
        System.out.println(r.indexOf("w",8));
        System.out.println(r.lastIndexOf("w",8));
        System.out.println(r.toLowerCase()); 
        System.out.println(r.toUpperCase()); 
        String s = "  Hello Man! Have good day   ";
        System.out.println(s.trim().length()+" "+s.length()); 
        boolean b1=true;  
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l1 = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'j','a','v','a'};  
        strmethods obj=new strmethods();     
        System.out.println(String.valueOf(b1)); // valueOf converts other data types into string  
        System.out.println(String.valueOf(b2));  
        System.out.println(String.valueOf(sh));  
        System.out.println(String.valueOf(i));  
        System.out.println(String.valueOf(l1));  
        System.out.println(String.valueOf(f));  
        System.out.println(String.valueOf(d));  
        System.out.println(String.valueOf(chr));  
        System.out.println(String.valueOf(obj));  
        System.out.println(t3.endsWith("T")); 
        System.out.println(s1.startsWith("J")); 
        String sn1="ABCDEFG";  
       byte[] barr=sn1.getBytes();  
       for(int j=0;j<barr.length;j++){  
        System.out.print(barr[j]+" ");  
      }
      System.out.print("\n");
      String c1 = "Welcome to Javatpoint";  
      char[] ch = c1.toCharArray();
      for(char j:ch)
      {
          System.out.print(j+" ");
      }
      System.out.print("\n");
      int arr[]= {1,2,5,3,4};
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
    } 
   }
