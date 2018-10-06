package com.niit.imp;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.dao.OrderDAO;
import com.niit.model.Orders;

public class OrderDAOImp implements OrderDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addorder(Orders order) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(order);
			return true;
		}
		catch (Exception e){
			return false;
		}
	}

	
}
