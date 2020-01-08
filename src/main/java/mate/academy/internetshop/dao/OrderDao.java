package mate.academy.internetshop.dao;

import mate.academy.internetshop.model.Order;
import java.util.Optional;

public interface OrderDao {
    Order create(Order order);

    Optional<Order> get(Long orderId);

    Order update(Order order);

    boolean deleteById(Long orderId);

    boolean delete(Order order);
}
