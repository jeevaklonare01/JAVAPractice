package LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductStream {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(101,"Laptop",55000));
        productList.add(new Product(102,"Mouse",705));
        productList.add(new Product(103,"Keyboard",2160));
        productList.add(new Product(104,"Printer",25000));
        productList.add(new Product(105,"Monitor",15000));

//        Conventional way of filtering
        List<Double> priceList = new ArrayList<>();
        for(Product prod : productList ){
            if(prod.price>=20000){
                priceList.add(prod.price);
            }
        }
        System.out.println("Product price above 20000 : "+priceList);

//        Using Lamda Expression
        List<Double> price = productList.stream().filter(p -> p.price>20000).map(p -> p.price).toList();
        System.out.println("Product price above 20000 : "+price);
    }
}
