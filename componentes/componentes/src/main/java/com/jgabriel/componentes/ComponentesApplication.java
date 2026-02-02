package com.jgabriel.componentes;

import com.jgabriel.componentes.entities.Order;
import com.jgabriel.componentes.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Scanner;

@SpringBootApplication
public class ComponentesApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ComponentesApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Id Order: ");
		int idorder = Integer.parseInt(sc.nextLine());

		System.out.print("Basic Price: ");
		double basicprice = Double.parseDouble(sc.nextLine());

		System.out.print("Discount: ");
		double discount = Double.parseDouble(sc.nextLine());

		Order order = new Order();
		order.setCode(idorder);
		order.setBasic(basicprice);
		order.setDiscount(discount);

		System.out.println("-------------------Detlahes do Pedido---------------");
		System.out.println("Pedido Código " + order.getCode());
		System.out.printf("Valor Total: %.2f", orderService.total(order));
	}

}
