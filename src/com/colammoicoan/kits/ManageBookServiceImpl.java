package com.colammoicoan.kits;

import com.theplayer.kits.vo.LoginUser;

public class ManageBookServiceImpl implements ManageBookService {

	private BookItem[] books;
	int seq;// 0 ~ 9

	public ManageBookServiceImpl() {
		super();
		books = new BookItem[10];
		seq = 0;
	}

	@Override
	public void add(BookItem book) {
		// TODO Auto-generated method stub
		// khai bao doi tuong user cua ham join
		if (seq < books.length) { // 0 < 10
			for (int i = 0; i < 10; i++) {
				if (books[i].getName().equals(books[i].getName()))
					System.out.println("name exists");
				else {
					books[seq] = book; // array users[0]
					seq++;
				}

			}
		} else {
			System.out.println("full slot");
		}
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		boolean exist = false;
		for (int i = 0; i < 10; i++) {
			if (books[i] != null) {
				if (books[i].getName().equals(name)) {

					books[i] = null;
					System.out.println("Delete success");
					exist = true;
				}
			}

		}
		if (!exist) {
			System.out.println("No find");
		}

	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		if (seq == 0) {
			System.out.println("We have no book");
		} else {
			for (int k = 0; k < seq; k++) {
				if (books[k] != null) {
					System.out.print(books[k].getName() + "\t");
					System.out.print(books[k].getQuantity() + "\t");
					System.out.print(books[k].getPrice() + "\t");
					System.out.println();
				}
			}
		}

	}

}
