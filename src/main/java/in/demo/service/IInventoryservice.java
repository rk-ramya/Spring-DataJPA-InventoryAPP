package in.demo.service;

import java.util.List;

import in.demo.bo.Inventory;

public interface IInventoryservice {

	public String registerItem(Inventory inventory);
	public Iterable<Inventory> fetchUsersById(List<Integer> IDs);
	
}
