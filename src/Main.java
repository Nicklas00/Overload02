public class Main {
  public static void out(String str) {
    System.out.println(str);
  }
  public static void out(int num) {
    System.out.println(num);
  }
  public static void out(boolean b){
    System.out.println(b);
  }
  public static void out(Integer ii){
    out(ii.equals("17"));
    System.out.println(ii);
  }

  public static void out(Student std){
    String className = std.getClass().getName();
    var obj = Integer.toHexString(std.hashCode());
    out(className + "@" + Integer.toHexString(std.hashCode()));
  }

  public static void main(String[] args) {

    Student std = new Student();
    System.out.println(std);
    out(std);

  }
}
