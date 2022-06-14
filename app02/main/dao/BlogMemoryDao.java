package main.dao;

import java.util.ArrayList;
import java.util.List;

import blog.entity.BlogCategory;
import blog.entity.BlogPost;

/**
 * 
 * data store in memory
 * DAO has method
 * Create : new data store						data object
 * Read(Retrieve) : get data, view, search		select by key
 * Update : change date value					data object has id
 * Delete : remove data							id
 * 
 * @version 0.0.1 - Trainning
 * @author phuoc
 * 
 * */

public class BlogMemoryDao {
	private List<BlogPost> postRepo;
	private List<BlogCategory> cateRepo;
	
	public BlogMemoryDao() {
		super();
		postRepo = new ArrayList<BlogPost>();
		cateRepo = new ArrayList<BlogCategory>();
	}
}
