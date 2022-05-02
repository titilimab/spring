package myorg.spring.beanfactoryimplmnt;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

	public static void main(String[] args) {

		//Step 1: Create a BeanFactory object
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		//Step 2: Create an XmlBeanDefinitionReader object to read the bean definitions from an XML file which contains the beans metadata registered into the factory
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);

		//Step 3: Create a ClassPathResource object referring to the xml file which contains beans details
		ClassPathResource springConfigXmlPath = new ClassPathResource("XML/xml-bean-factory-config.xml");

		//Step 4: Lod the bean definitions from the xml file which contains the beans details
		rdr.loadBeanDefinitions(springConfigXmlPath);

		//Step 5: Fetch the specific bean by method getBean("<name of the bean>") by id we have provided in the xml file and type convert to the specific bean type. Here it is Oracle
		Oracle oracle = (Oracle)factory.getBean("oracle");

		/*Step 6: Invoke the method on the interface(Oracle) object 
				Print it to verify the details of method definition from the implementing class "BookwormOracle.java" has been invoked
		 */
		System.out.println(oracle.defineMeaningOfLife());

		/*Expected Output :
		log4j:WARN No appenders could be found for logger (org.springframework.core.env.StandardEnvironment).
		log4j:WARN Please initialize the log4j system properly.
		log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
		Encyclopedias are a waste of time - go see the world instead
		 */
	}

}
