package yasuo.hungnv287.springmvcshoppingcart.dao;

import java.util.List;

import yasuo.hungnv287.springmvcshoppingcart.model.CartInfo;
import yasuo.hungnv287.springmvcshoppingcart.model.OrderDetailInfo;
import yasuo.hungnv287.springmvcshoppingcart.model.OrderInfo;
import yasuo.hungnv287.springmvcshoppingcart.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}