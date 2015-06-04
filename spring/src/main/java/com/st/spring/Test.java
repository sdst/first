/**
 * 
 */
package com.st.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author st
 *
 */
public class Test extends TestCase {
	
  
    
    public void testApp()

    {

     BeanFactory bf = new ClassPathXmlApplicationContext(

"aplicationContext.xml");

     App at = (App) bf.getBean("app");

     System.out.println(at.getPerson().getName());

     System.out.println(at.getPerson().getAge());

        assertTrue( true );

    }


}
