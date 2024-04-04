public class string 
{
    public static void main(String[] args)
    {
        String s1 = "india";
        String s2 = "india";
            System.out.println(s1 == s2);
        String s3 = new String ("india");
        String s4 = new String("India");
            System.out.println(s3==s4);
        System.out.println("---------------");
         System.out.println(s3 . equals(s4));
         System.out.println(s1 . equals (s3));
         System.out.println(s4. equals (s2));
        System.out.println("--------------");
         System.out.println(s1 == s3.intern());
         System.out.println(s2 == s3 .intern());
         System.out.println(s2 == s4.intern());

        System.out.println("------------------");
          String s = "india";
          for(int i=0;i<s.length();i++)
          {
            System.out.println(" " + s. charAt(i));
            System.out.println(s.substring(1,5));
          }
        System.out.println("---------------");
         System.out.println(s. contains("dia"));
         System.out.println(s.indexOf("ia"));
         System.out.println(s.replace('a','b' ));

    }
    
}
