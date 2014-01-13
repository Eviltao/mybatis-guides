package cc.pp.mybatis.ex4.configuration;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Demo4 {

	/**
	 * 测试函数
	 */
	public static void main(String[] args) {

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Thread.currentThread()
				.getContextClassLoader().getResourceAsStream("mybatis-config4.xml"), Config.getProps("db.properties"));
		Configuration conf = sqlSessionFactory.getConfiguration();
		System.out.println(conf.getCache("db_username"));

	}

}
