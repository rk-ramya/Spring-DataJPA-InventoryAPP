package in.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.demo.bo.Inventory;
import in.demo.dao.IInventoryRepo;

@Service
public class InventoryServiceImp implements IInventoryservice {
	
	@Autowired
	IInventoryRepo repo;
	
	@Override
	public String registerItem(Inventory inventory) {
		Inventory in=null;
		if(inventory!=null)
			in=repo.save(inventory);
		return (in!=null)? "Record inserted Succesfully":"Record insertion failed";
	}

	@Override
	public Iterable<Inventory> fetchUsersById(List<Integer>IDs) {
			return repo.findAllById(IDs);
	}

}
