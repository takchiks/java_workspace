package springcoreautowireproblem;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:travelproperties")
public class SpringConfig {
	@Value("${carNo}")
	private int carNo;
	@Value("${engineNo}")
	private int engineNo;
	@Value("${bhp}")
	private int bhp;
	@Value("${model}")
	private String model;
	
	
	@Bean
	public Car getCarBean(){
		return new Car(carNo,model);
	}
	
	@Bean
	public Engine getEngineBean() {
		return new Engine(engineNo,bhp);
	}
	@Bean
	public Driver getDriverBean() {
		return new Driver(8998,"taku");
	}

}
