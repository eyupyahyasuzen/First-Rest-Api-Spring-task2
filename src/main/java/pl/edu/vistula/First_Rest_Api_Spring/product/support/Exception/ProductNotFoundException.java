package pl.edu.vistula.First_Rest_Api_Spring.product.support.Exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super(String.format("Product with %d not found", id));
    }
}