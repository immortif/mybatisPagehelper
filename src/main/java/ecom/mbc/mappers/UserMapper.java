package ecom.mbc.mappers;

import java.util.List;

import ecom.mbc.pojo.User;

public interface UserMapper {
    List<User> selectAllUsers();
}
