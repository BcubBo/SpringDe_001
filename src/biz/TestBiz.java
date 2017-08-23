package biz;

import dao.DaoFactory;
import dao.ITestBiz;
import dao.ITestDao;
import dao.TestDao;

public class TestBiz {
	
	private ITestDao dao;
	
	public String testBiz(String msg,Object result) {
		
//		ITestDao dao = DaoFactory.getInstance();
		System.out.println("Hello,Spring");
		dao.testDao();
		return result.toString();
		
	}
	//某方法
	public ITestDao getDao() {
		return dao;
	}//
	public void setDao(ITestDao dao) {
		this.dao = dao;
	}//

	
	
}
