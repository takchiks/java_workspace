package springcoreproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car car = context.getBean(Car.class);
		
		car.travel();
		
	}

}
