package content;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * spring bean factory
 * @author halley.w 2011-3-19
 *
 */
public class BeanFactory implements ApplicationContextAware {

  /**
   * 
   */
  private static Logger log = Logger.getLogger(BeanFactory.class);

  /**
   * spring application context
   */
  public static ApplicationContext appContext;

  /**
   * return spring applicationContext
   * @return ApplicationContext
   */
  public static ApplicationContext getContext() {
    if (appContext == null) {
      log.error("ApplicationContext in BeanFactory Init Failed!");
    }
    return appContext;
  }

  /**
   * 返回服务
   * @param name
   * @return Object
   */
  public static Object getBean(String name) {
    log.debug("getBean:" + name);
    return getContext().getBean(name);
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    appContext = applicationContext;
  }
}
