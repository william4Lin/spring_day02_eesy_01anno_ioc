package com.william.dao.impl;

import com.william.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * 模拟持久层的实现
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao {

    public void saveAccount(){
        System.out.println("持久层保存账户22222");
    }
}
