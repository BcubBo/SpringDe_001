package biz;

import dao.DaoFactory;
import dao.ITestDao;
import dao.TestDao;

public class TestBiz {
	
	private ITestDao dao;
	
	
	
	
	
	
	
	
	
	
	public void testBiz() {
		
		
//		ITestDao dao = DaoFactory.getInstance();
		System.out.println("Hello,Spring");
		dao.testDao();
		
		
	}
	//某方法
	public ITestDao getDao() {
		return dao;
	}//
	public void setDao(ITestDao dao) {
		this.dao = dao;
	}//
	
	
}
