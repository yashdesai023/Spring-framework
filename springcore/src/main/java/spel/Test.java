package spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spel/spel_config.xml"); 
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);
        
        
    }

}
