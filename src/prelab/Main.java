package prelab;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(new File("src/prelab/jobs.txt"));
      List<Printjob> jobs = new ArrayList<>();

      while (sc.hasNext()) {
         String type = sc.next();
         String id = sc.next();
         int pages = sc.nextInt();
         if (type.equals("MONO")) {
            jobs.add(new Monoprint(id, pages));
         } else if (type.equals("COLOUR") || type.equals("COLOR")) {
            jobs.add(new Colorprint(id, pages));
         }
      }

      sc.close();

      for (Printjob job : jobs) {
         System.out.println(job.summary());
      }
   }
}