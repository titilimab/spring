package myorg.spring.beanfactoryimplmnt;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
		ClassPathResource springConfigXmlPath = new ClassPathResource("XML/xml-bean-factory-config.xml");
		rdr.loadBeanDefinitions(springConfigXmlPath);
		Oracle oracle = (Oracle)factory.getBean("oracle");
		System.out.println( oracle.defineMeaningOfLife());
		
	}

}
