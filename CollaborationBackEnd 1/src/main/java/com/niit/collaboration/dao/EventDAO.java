package com.niit.collaboration.dao;

import com.niit.collaboration.model.Event;


public interface EventDAO {
	public void saveOrUpdate(Event event);
	public Event get(String id);

}
