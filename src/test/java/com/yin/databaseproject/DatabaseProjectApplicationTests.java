package com.yin.databaseproject;

import com.yin.databaseproject.controller.UserController;
import com.yin.databaseproject.dao.pingyougou.UserMapper;
import com.yin.databaseproject.vo.ItemVO;
import com.yin.databaseproject.vo.OrderVO;
import com.yin.databaseproject.vo.UserVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseProjectApplicationTests {
    @Autowired
    private UserController userController;

    @Test
    public void contextLoads() {
         List<UserVO> users = userController.getUsers();
        for (UserVO user : users) {
            System.out.println("user = " + user);
        }
        final List<OrderVO> order = userController.getOrder();
        System.out.println(order.get(0));
    }

}
