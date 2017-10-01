package springtutorial;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Arjen Bax <arjen.bax@cgi.com>
 */
public class HelloWorld
{
    private static final Logger LOG = LogManager.getLogger(HelloWorld.class);

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void init() {
        LOG.info("Bean is going through init.");
    }

    public void destroy() {
        LOG.info("Bean will destroy now.");
    }
}
