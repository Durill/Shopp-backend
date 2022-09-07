package com.spring.shoppbackend.repository;

import com.spring.shoppbackend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query(value = "select * from items order by product_date_of_adding desc limit ?;",
            nativeQuery = true)
    public List<Item> getNewestItems(Integer numberOfItems);

    @Query(value = "select * from items order by quantity desc limit ?;",
            nativeQuery = true)
    public List<Item> getBestsellers(Integer numberOfItems);
}
