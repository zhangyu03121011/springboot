package com.mm.dev.dao.jpa.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.dev.entity.user.UserWithdrawalApply;

/**
 * @Description: UserWithdrawalApplyDao
 * @author Jacky
 * @date 2017年8月6日 下午9:45:39
 */
@Repository
public interface UserWithdrawalApplyDao extends JpaRepository<UserWithdrawalApply, String> {

}
