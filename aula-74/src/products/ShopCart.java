package products;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ShopCart {
    
    public static void main(String[] args) {
        
        List<Products> cart = new ArrayList<Products>();

        cart.add(new Products(1,"iphone", 5000.00));
        cart.add(new Products(2,"ipad", 12000.00));
        cart.add(new Products(3,"ipod", 4000.00));
        cart.add(new Products(4,"imac", 20000.00));
        cart.add(new Products(5,"macbook pro", 50000.00));
        cart.add(new Products(6,"mac mini", 6000.00));
        cart.add(new Products(7,"mac m1 ultra", 120000.00));
        cart.add(new Products(8,"iphone 13", 10000.00));
        
        //filtra os elementos da classe Product pelo preço e gera uma nova lista com os valores
        List<Double> priceList = cart.stream().filter(product -> product.getPrice() <= 5000.00)
        .limit(5)
        .map(product -> product.getPrice()).toList();


        priceList.forEach((price) -> System.out.println("Price:" + price));
        
        //lista de produtos filtrados por preço
        List<Products> productList = cart.stream().filter(product -> product.getPrice() > 7500.00)
        .map(product -> product).toList();

        productList
        .forEach((product) -> System.out.println("Products:" + product.getId() + "" + product.getId() + "" + product. 
        getName() + "" + product.getPrice()));

         System.out.println();

        Map<Integer, String> productMap = cart.stream()
        .filter(product -> product.getPrice() > 7500.00)
        .collect(Collectors.toMap(product -> product.getId(), product -> product.getName()));

        System.out.println(productMap);
    }

}
