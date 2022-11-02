import java.util.Scanner;
public class Hello{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int u = str.length();
    System.out.print(str.charAt(u-1));
  }
}
