package com.ayan.demos.morethanonedatasource.repositories.datasource2;

import com.ayan.demos.morethanonedatasource.entities.datasource2.UserCore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "userCoreRepository2")
public interface UserCoreRepository extends JpaRepository<UserCore, String> {
}
