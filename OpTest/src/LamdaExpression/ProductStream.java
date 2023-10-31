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

        double total = productList.stream().collect(Collectors.summingDouble(pro -> pro.price));
        System.out.println("Sum of Product Price : "+total);

//        Display Product
        productList.stream().filter(product -> product.price<20000).forEach(product -> {
            System.out.println("Product Name : "+product.name);
            System.out.println("Product Id : "+product.id);
            System.out.println("Product Price : "+product.price);
        });
//        Conventional way of filtering
        System.out.println("This is Conventional Way of Filtering");
        List<Double> priceList = new ArrayList<>();
        for(Product prod : productList ){
            if(prod.price>=20000){
                priceList.add(prod.price);
            }
        }
        System.out.println("Product price above 20000 : "+priceList);

//        Using Lamda Expression
        System.out.println("This is Lamda Expression Filtering");
        List<Double> price = productList.stream().filter(p -> p.price>20000).map(p -> p.price).toList();
        System.out.println("Product price above 20000 : "+price);
    }
}
