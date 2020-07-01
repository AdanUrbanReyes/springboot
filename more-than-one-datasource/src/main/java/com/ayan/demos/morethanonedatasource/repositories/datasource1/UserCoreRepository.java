package com.ayan.demos.morethanonedatasource.repositories.datasource1;

import com.ayan.demos.morethanonedatasource.entities.datasource1.UserCore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "userCoreRepository1")
public interface UserCoreRepository extends JpaRepository<UserCore, String> {
}
