package guru.springframework.sfgdi;

import guru.springframework.sfgdi._02_primary_profile.controllers.I18nController;
import guru.springframework.sfgdi._02_primary_profile.controllers.PrimaryInjectedController;
import guru.springframework.sfgdi._01_types_of_di.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi._01_types_of_di.controllers.PropertyInjectedController;
import guru.springframework.sfgdi._01_types_of_di.controllers.SetterInjectedController;
import guru.springframework.sfgdi._04_bean_factory.controller.FactoryBeanController;
import guru.springframework.sfgdi._05_properties.beans.FakeDataSource;
import guru.springframework.sfgdi._05_properties.beans.FakeEnvironmentComponent;
import guru.springframework.sfgdi._05_properties.beans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework"})
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		System.out.println("----------Primary");
		PrimaryInjectedController primaryInjectedController = (PrimaryInjectedController) ctx.getBean("primaryInjectedController");
		String greeting = primaryInjectedController.getGreeting();
		System.out.println(greeting);

		System.out.println("----------Property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------Setter");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("----------I18n");
		I18nController i18nController =
				(I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());


		System.out.println("----------FactoryBean");
		FactoryBeanController factoryBeanController = ctx.getBean(FactoryBeanController.class);
		System.out.println(factoryBeanController.getGreeting());


		System.out.println("05-------Properties");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.toString());

		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.toString());


		FakeEnvironmentComponent fakeEnvironmentComponent = ctx.getBean(FakeEnvironmentComponent.class);
		System.out.println(fakeEnvironmentComponent.toString());
	}

}
