package com.niit.collaboration.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.collaboration.model.Chat;
import com.niit.collaboration.model.User;

@Repository
public interface ChatDAO {


		public boolean save(Chat chat);
		public boolean update(Chat chat);
		public boolean delete(Chat chat);
		public List<Chat> list();
		public Chat get(int chat_Id);
	
}
