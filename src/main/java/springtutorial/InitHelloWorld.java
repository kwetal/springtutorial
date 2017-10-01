package springtutorial;

/**
 *
 * @author Arjen Bax <arjen.bax@cgi.com>
 */
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class InitHelloWorld implements BeanPostProcessor
{
    private static final Logger LOG = LogManager.getLogger(InitHelloWorld.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        LOG.info("BeforeInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        LOG.info("AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}
