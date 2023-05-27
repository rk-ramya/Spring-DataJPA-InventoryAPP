package in.demo.dao;

import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.demo.bo.Inventory;

@Repository
public interface IInventoryRepo extends CrudRepository<Inventory, Integer> {


}
