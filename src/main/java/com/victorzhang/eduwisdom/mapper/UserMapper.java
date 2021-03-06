package com.victorzhang.eduwisdom.mapper;

import com.victorzhang.eduwisdom.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper extends BaseMapper<User, String> {
    boolean doJudgePasswordIsRight(User user) throws Exception;

    Map<String,Object> getUserInfo(String userId) throws Exception;

    List<Map<String,Object>> listUserType() throws Exception;
}
