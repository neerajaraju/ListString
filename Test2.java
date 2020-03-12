package springproject;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class Test2 {
public static void main(String[] args) {
	Resource r=new ClassPathResource("springproject/applicationcontext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	Question q=(Question)factory.getBean("q");
	q.displayInfo();
}
}
