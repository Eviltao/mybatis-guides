package cc.pp.mybatis.ex1.method;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Demo1 {

	public static void main(String[] args) throws IOException {

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Thread.currentThread()
				.getContextClassLoader().getResourceAsStream("mybatis-config1.xml"));

		try (SqlSession session = sqlSessionFactory.openSession();) {
			int count = session.selectOne("cc.pp.mybatis.ex1.method.UserDao.getCount");
			System.out.println(count);
		}

		try (SqlSession session = sqlSessionFactory.openSession();) {
			UserDao userDao = session.getMapper(UserDao.class);
			int count = userDao.getCount();
			System.out.println(count);
		}

	}

}
