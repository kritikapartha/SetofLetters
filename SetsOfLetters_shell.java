//Name: Kritika Partha  
//Date: March 08 2020 
import java.util.*;
import java.io.*;
public class Pd6ParthaKritikaSetofLetters_shell {
   public static void main (String [] args) throws FileNotFoundException
   {
      ArrayList<HashSet> lowercase = new ArrayList <HashSet>();
      ArrayList<HashSet> uppercase = new ArrayList <HashSet>();
      ArrayList<HashSet> punctuation = new ArrayList <HashSet>();
         File file = new File ("test.txt");
         Scanner sc = new Scanner (file);
         while (sc.hasNextLine())
            {
               HashSet<Character> lower = new HashSet <Character>();
               HashSet<Character> upper = new HashSet <Character>();
               HashSet<Character> punct = new HashSet <Character>();
                  char[] arr = sc.nextLine().toCharArray();
                     for (Character c:arr){
                        if(Character.isLetter(c))
                           {
                              if(Character.isUpperCase(c))
                                 upper.add(c);
                              else
                                 lower.add(c);
                           }
                         punct.add(c);     
                     }
               lowercase.add(lower);
               uppercase.add(upper);
               punctuation.add(punct);               
            }
            
       TreeSet<Character> lowerOrg = new TreeSet <Character>();
       TreeSet<Character> upperOrg = new TreeSet <Character>();
       TreeSet<Character> punctOrg = new TreeSet <Character>();
         for (Object x: lowercase.get(0))
            {
               boolean all = true;
                  for (HashSet set:lowercase)
                     {
                        if(!(set.contains(a)))
                           {
                              all = false;
                              break;
                           }
                     }
            }
         if(all)
           {
            lowerOrg.add((char)a);
           }
         for (Object a:punctuation.get(0))
            {
               boolean all=true;
               for (HashSet set:punctuation)
                     {
                        if(!(set.contains(a)))
                           {
                              all = false;
                              break;
                           }
                     }
                     
                if (all)
                  {
                     punctOrg.add((char)a);
                  }
           

            }
 
      System.out.println("Common lower case: ");
      System.out.print(lowerOrg);
      System.out.println("Common upper case: ");
      System.out.print(upperOrg);
      System.out.println("Common punctuation: ");
      System.out.print(punctOrg);






   }
}
