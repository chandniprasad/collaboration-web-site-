package com.niit.collaboration.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.model.BlogComment;
@SuppressWarnings("deprecation")
@EnableTransactionManagement
@Repository("blogCommentDAO")
public class BlogCommentDAOImpl implements BlogCommentDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public BlogCommentDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(BlogComment blogComment) {

		try{
		  sessionFactory.getCurrentSession().save(blogComment);
	return true;
		}catch (Exception e ){
			//TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}	
	@Transactional
	public boolean update(BlogComment blogComment) {

		try{
			sessionFactory.getCurrentSession().update(blogComment);
	return true;
		} catch (Exception e){
			//TODO Auto-generated catch block
	       e.printStackTrace();
	       return false;
		}
	}
	@Transactional
	public boolean delete(BlogComment blogComment) {
		try{
		       sessionFactory.getCurrentSession().delete(blogComment);
		return true;
			} catch (Exception e){
				//TODO Auto-generated catch block
		       e.printStackTrace();
		       return false;
			}
		}
	@Transactional
	public List<BlogComment> list() {
		String hql = "from BlogComment";
		@SuppressWarnings("rawtypes")
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		
		List<BlogComment> listBlogComment = query.list();
		if(listBlogComment == null  || listBlogComment.isEmpty())
		{
			 return null;
			 
		}
		return query.list();
		}
	@Transactional
	public BlogComment get(int id) {
		String hql = "from BlogComment where id = " + "'" + id + "'";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<BlogComment> list=query.list();
		if(list==null || list.isEmpty()){
			return null;
		}
		else
		{
			return new BlogComment();
		}
	}
}
