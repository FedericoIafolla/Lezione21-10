package com.example.Pizzeria;

import com.example.Pizzeria.model.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PizzeriaMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaMenuApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext ctx) {
		return args -> {
			Menu menu = ctx.getBean(Menu.class);
			System.out.println("Pizzeria Menu:");
			System.out.println("Pizze:");
			menu.getPizze().forEach(p ->
					System.out.printf("%s (%s) - Calories: %d, Price: %.2f%n",
							p.getName(), String.join(", ", p.getIngredients()), p.getCalories(), p.getPrice()));

			System.out.println("\nToppings:");
			menu.getToppings().forEach(t ->
					System.out.printf("%s - Calories: %d, Price: %.2f%n",
							t.getName(), t.getCalories(), t.getPrice()));

			System.out.println("\nDrinks:");
			menu.getBevande().forEach(d ->
					System.out.printf("%s - Calories: %d, Price: %.2f%n",
							d.getName(), d.getCalories(), d.getPrice()));
		};
	}
}