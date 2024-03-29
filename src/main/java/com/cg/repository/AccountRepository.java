package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
