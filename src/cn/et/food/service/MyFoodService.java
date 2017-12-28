package cn.et.food.service;

import java.util.List;
import java.util.Map;

public interface MyFoodService {

	public abstract List<Map<String, Object>> queryAllFood(String foodname);

	public abstract void deleteFood(String foodId);

	public abstract void saveFood(String foodName, String price);

	public abstract void updateFood(String foodId, String foodName, String price);

}