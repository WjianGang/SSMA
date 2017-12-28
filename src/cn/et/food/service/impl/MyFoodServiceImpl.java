package cn.et.food.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.food.dao.MyFoodDao;
import cn.et.food.dao.impl.MyFoodDaoImpl;
import cn.et.food.service.MyFoodService;
@Repository
public class MyFoodServiceImpl implements  MyFoodService {
	@Autowired
	MyFoodDao dao;
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#queryAllFood(java.lang.String)
	 */
	public List<Map<String, Object>> queryAllFood(String foodname){
		return dao.queryAllFood(foodname);
	}
	
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#deleteFood(java.lang.String)
	 */
	public void deleteFood(String foodId){
		dao.deleteFood(foodId);
	}
	

	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#saveFood(java.lang.String, java.lang.String)
	 */
	public void saveFood(String foodName,String price){
		 dao.saveFood(foodName, price);
	}
	
	
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodId,String foodName,String price){
		dao.updateFood(foodId, foodName, price);
	}
}
