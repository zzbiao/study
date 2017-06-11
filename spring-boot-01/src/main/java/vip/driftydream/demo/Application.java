package vip.driftydream.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan--可以一起存在
//@SpringBootApplication还提供了别名来定制@EnableAutoConfiguration和@ComponentScan的属性。
@Configuration
@EnableAutoConfiguration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//禁用指定的自动配置
//如果类不在classpath路径上，则可以使用注释的excludeName属性，并指定全限定名(fully qualified name)。 最后还可以通过spring.autoconfigure.exclude属性控制要排除的自动配置类列表。
@ComponentScan
public class Application {
	
	
	public static void main(String[] args) throws Exception{
		//完全禁用重新启动支持，因为它在一些特定库中不能正常运行，则需要在调用SpringApplication.run（...）之前设置System属性
//		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(Application.class, args);
	}

}
