package com.deliveryjumper.repository;

import com.deliveryjumper.domain.Store;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project : delivery-jumper
 * Created by gonuu
 * Date : 2021-08-09
 * Time : 오전 9:33
 * Blog : http://devonuu.tistory.com
 * Github : http://github.com/devonuu
 */


public interface StoreRepository extends JpaRepository<Store, Long> {
    List<Store> findByStoreName(String storeName);
}
