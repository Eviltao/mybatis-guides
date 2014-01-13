package cc.pp.mybatis.ex2.method;

import org.apache.ibatis.annotations.Select;

public interface UserDaoMapper {

	@Select("SELECT COUNT(*) FROM user")
	public int getCount();

}
