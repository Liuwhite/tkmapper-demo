package com.white.mapper;

import com.white.beans.User;
import com.white.tk.TkMainApplication;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TkMainApplication.class)
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Resource
    private CategoryMapper categoryMapper;

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testSelect1(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
    @Test
    public void testSelect2(){
        User user = userMapper.selectByPrimaryKey(4);
        System.out.println(user);
    }

    @Test
    public void testSelect3(){
        Example e = new Example(User.class);
        Example.Criteria criteria = e.createCriteria();
        criteria.andBetween("uid", 1, 2);
        userMapper.selectByExample(e);
    }

    @Test
    public void test4(){
        int pageNum = 2;
        int pageSize = 10;
        int start = (pageNum - 1) * pageSize;
        RowBounds rowBounds = new RowBounds(start,pageSize);
        List<User> users = userMapper.selectByRowBounds(new User(), rowBounds);
    }

    @Test
    public void test5(){
        Example e = new Example(User.class);
        Example.Criteria criteria = e.createCriteria();
        criteria.andEqualTo("uid", 1);

        int pageNum = 2;
        int pageSize = 10;
        int start = (pageNum - 1) * pageSize;
        RowBounds rowBounds = new RowBounds(start,pageSize);


        List<User> users = userMapper.selectByExampleAndRowBounds(e, rowBounds);
        System.out.println(users.toString());

        int count = userMapper.selectCountByExample(e);
        System.out.println("总条数"+count);
    }



}
