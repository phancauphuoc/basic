package main.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

import main.dao.BlogMemoryDao;

public class Blogservice {
	private BlogMemoryDao dao;

	// remove default constructor by JVM
	public Blogservice() {
	}

	public Blogservice(BlogMemoryDao blogMemoryDao) {
		super();
		// TODO : below your code
		this.dao = blogMemoryDao;
	}

//	public Map<String, String>process
	public Map<String, String> process(String cmd) {
		Map<String, String> model = new HashMap<String, String>();
		if (!cmd.contains("?")) {
			// only command(path)
		} else {
			// has query string
			String[] req = cmd.split("\\?");
			if (req.length == 2) {
				String command = req[0];
				String parameter = req[1];
				//string -> map<string,string>
				StringTokenizer tokenizer = new StringTokenizer(parameter,"&");
				while( tokenizer.hasMoreTokens() ) {
					System.out.println(tokenizer.nextToken("="));
					//tokenizer.nextToken("=");
				}
			} else {
				// model include req, resp
				registPost(model);
				getPostAll(model);
				getPostAll(model);
				getPostWithCategory(model);
				getPostByString(model);
				updatePost(model);
				deletePost(model);

				registCategory(model);
				getCategoryAll(model);
				getCategoryById(model);
				getCategoryWithCategory(model);
				getCategoryByString(model);
				updateCategory(model);
				deleteCategory(model);

			}

		}
		return model;
	}

	private void deleteCategory(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void updateCategory(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getCategoryByString(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getCategoryWithCategory(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getCategoryById(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getCategoryAll(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void registCategory(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void deletePost(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void updatePost(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getPostByString(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getPostWithCategory(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getPostAll(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void registPost(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

}
