package springtutorial;

/**
 *
 * @author Arjen Bax <arjen.bax@cgi.com>
 */
public class HelloWorld {
   private String message;

   public void setMessage(String message) {
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}