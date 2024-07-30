public class Datatime{

public String currentDateTime (){
        long timestamp1 = System.currentTimeMillis() /1000;
        LocalDateTime datatime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp1));
        return date;
    }
    String hora = currentDateTime().toString();
}
  public static void main(String[] args) {
      Datatime timeNow = new Datatime();
      System.out.print(timeNow);
  }
