package ecom.mbc;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import ecom.mbc.mappers.UserMapper;
import ecom.mbc.pojo.User;
import ecom.mbc.utils.MybatisUtil;

public class TestMybatis {

    @Test
    public void testMybatisBasic() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.selectAllUsers();
        System.out.println(list.size());
        sqlSession.close();
    }
}
