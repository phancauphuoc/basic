package com.colammoicoan.kits;

public interface ManageBookService {

	void add(BookItem book);
	
	// delete item by name
	void delete( String name);
	void list();
	
	// update book quantity
	//void update(BookItem book);
	
	// find item by name
//	BookItem search( String name);
	// cal total quantity of all item
	//int getTotalQuantity();
	// print list
	
}
