package com.example.fsmtp2;

import com.example.fsmtp2.entities.Product;
import com.example.fsmtp2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FsmiTp2Application implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(FsmiTp2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //productRepository.save(new Product(null,"Computer",4300,3));
        //productRepository.save(new Product(null,"Printer",1200,4));
        //productRepository.save(new Product(null,"Smart Phone",3200,32));
        List<Product> products = productRepository.findAll();
        products.forEach(p -> {
            System.out.println(p.toString());
        });
        Product product =productRepository.findById(Long.valueOf(4)).get();
        System.out.println("*******************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        System.out.println("*******************");
        /*System.out.println("Mettre à jour un produit :");
        Product produit = productRepository.findById(Long.valueOf(1)).orElse(null);
        if (produit != null) {
            produit.setName("SMARTPHONE");
            productRepository.save(produit);
        } else {
            System.out.println("Patient not found");
        }*/
        /*System.out.println("Supprimer un produit :");
        productRepository.deleteById(Long.valueOf(2));*/
        List <Product> productList =productRepository.findByNameContains("C");
        productList.forEach(p->{
            System.out.println(p);
        });
        System.out.println("------------------------------");
        List <Product> productList2 =productRepository.search("%C%");
        productList2.forEach(p->{
            System.out.println(p);
        });


    }
}
