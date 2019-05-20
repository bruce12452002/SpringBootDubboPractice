package controller;

import bean.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import java.util.List;

@RestController
public class OrderController {
    @Reference
    private OrderService orderService;

    @RequestMapping("/initOrder")
    public List<User> initOrder(@RequestParam("name") String name) {
        return orderService.initOrder(name);
    }
}
