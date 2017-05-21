package yasuo.hungnv287.springmvcshoppingcart.dao;

import yasuo.hungnv287.springmvcshoppingcart.entity.Product;
import yasuo.hungnv287.springmvcshoppingcart.model.PaginationResult;
import yasuo.hungnv287.springmvcshoppingcart.model.ProductInfo;
 
public interface ProductDAO {
 
    
    
    public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}