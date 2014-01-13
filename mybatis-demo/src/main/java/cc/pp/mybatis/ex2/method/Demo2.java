package cc.pp.mybatis.ex2.method;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Demo2 {

	public static void main(String[] args) throws IOException {

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Thread.currentThread()
				.getContextClassLoader().getResourceAsStream("mybatis-config2.xml"));

		try (SqlSession session = sqlSessionFactory.openSession();) {
			int count = session.selectOne("cc.pp.mybatis.ex2.method.UserDaoMapper.getCount");
			System.out.println(count);
		}

		try (SqlSession session = sqlSessionFactory.openSession();) {
			UserDaoMapper userDaoMapper = session.getMapper(UserDaoMapper.class);
			int count = userDaoMapper.getCount();
			System.out.println(count);
		}

	}

}
