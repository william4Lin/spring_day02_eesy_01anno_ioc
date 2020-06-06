package com.william.dao.impl;

import com.william.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * 模拟持久层的实现
 */
@Repository("accountDao1")
public class AccountDaoImpl implements IAccountDao {

    public void saveAccount(){
        System.out.println("持久层保存账户1111");
    }
}
