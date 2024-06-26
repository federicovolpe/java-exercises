import java.util.Scanner;

public class TestRunner {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int termsP = s.nextInt(), termsQ = s.nextInt();
      SparsePoly p = new SparsePoly(), q = new SparsePoly();
      for (int i = 0; i < termsP; i++) p = p.add(new SparsePoly(s.nextInt(), s.nextInt()));
      System.out.println(p);

      for (int i = 0; i < termsQ; i++) q = q.add(new SparsePoly(s.nextInt(), s.nextInt()));
      System.out.println(q);

      System.out.println(p.minus());
      System.out.println(p.add(q));
      System.out.println(p.sub(q));
      System.out.println(p.mul(q));
    }
  }
}
