package serviceImpl;

import bean.User;
import org.apache.dubbo.config.annotation.Service;
import service.UserService;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //@Override
    public List<User> getUserByName(String name) {
        User u1 = new User(1, name, "B");
        User u2 = new User(2, name, "A");
        return Arrays.asList(u1, u2);
        //return Stream.of(u1, u2).collect(Collectors.toList());
    }

}
