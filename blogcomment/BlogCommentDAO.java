package com.niit.collaboration.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.collaboration.model.BlogComment;

@Repository
public interface BlogCommentDAO {
	public boolean save(BlogComment blogComment);
	public boolean update(BlogComment blogComment);
	public boolean delete(BlogComment blogComment);
	public List<BlogComment> list();
	public BlogComment get(int id);

}
