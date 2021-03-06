package com.deliveryjumper.repository;

import com.deliveryjumper.domain.Item;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Project : delivery-jumper
 * Created by gonuu
 * Date : 2021-08-09
 * Time : 오전 9:39
 * Blog : http://devonuu.tistory.com
 * Github : http://github.com/devonuu
 */


public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("select i from Item i where i.id in :ids")
    List<Item> findAllByIds(@Param("ids") List<Long> ids);
}
