package serviceImpl;

import bean.User;
import service.OrderService;
import service.UserService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private UserService userService;

    //@Override
    public List<User> initOrder(String name) {
        return userService.getUserByName(name);
    }
}
