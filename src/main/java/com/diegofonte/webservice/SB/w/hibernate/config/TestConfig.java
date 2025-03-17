package com.diegofonte.webservice.SB.w.hibernate.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.diegofonte.webservice.SB.w.hibernate.entities.Category;
import com.diegofonte.webservice.SB.w.hibernate.entities.Order;
import com.diegofonte.webservice.SB.w.hibernate.entities.OrderItem;
import com.diegofonte.webservice.SB.w.hibernate.entities.Payment;
import com.diegofonte.webservice.SB.w.hibernate.entities.Product;
import com.diegofonte.webservice.SB.w.hibernate.entities.User;
import com.diegofonte.webservice.SB.w.hibernate.entities.enums.OrderStatus;
import com.diegofonte.webservice.SB.w.hibernate.repositories.CategoryRepository;
import com.diegofonte.webservice.SB.w.hibernate.repositories.OrderItemRepository;
import com.diegofonte.webservice.SB.w.hibernate.repositories.OrderRepository;
import com.diegofonte.webservice.SB.w.hibernate.repositories.ProductRepository;
import com.diegofonte.webservice.SB.w.hibernate.repositories.UserRepository;

@Configuration
@Profile("testdb")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
        Product p6 = new Product(null, "Book", "As Aventuras da Izabella (spoiller, triste)", 120.0, "");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);
        p6.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Izabella Fonte", "iza@gmail.com", "999999999", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.SHIPPED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o4 = new Order(null, Instant.parse("2019-07-22T20:22:20Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));

        // Create OrderItems
        OrderItem oi1 = new OrderItem();
        oi1.setOrder(o1);
        oi1.setProduct(p1);
        oi1.setQuantity(2);
        oi1.setPrice(p1.getPrice());

        OrderItem oi2 = new OrderItem();
        oi2.setOrder(o1);
        oi2.setProduct(p3);
        oi2.setQuantity(1);
        oi2.setPrice(p3.getPrice());

        OrderItem oi3 = new OrderItem();
        oi3.setOrder(o2);
        oi3.setProduct(p3);
        oi3.setQuantity(2);
        oi3.setPrice(p3.getPrice());

        OrderItem oi4 = new OrderItem();
        oi4.setOrder(o3);
        oi4.setProduct(p5);
        oi4.setQuantity(2);
        oi4.setPrice(p5.getPrice());

        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(oi1);
        orderItems.add(oi2);
        orderItems.add(oi3);
        orderItems.add(oi4);

        orderItemRepository.saveAll(orderItems);
        
        Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
        o1.setPayment(pay1);
        
        orderRepository.save(o1);
    }
}