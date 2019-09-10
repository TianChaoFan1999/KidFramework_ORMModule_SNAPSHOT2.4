package com.tcf.kid.smart.framework.test;

import com.tcf.kid.smart.framework.core.SqlSession;
import com.tcf.kid.smart.framework.entity.UserInfo;
import com.tcf.kid.smart.framework.mapper.UserInfoMapper;

public class Test {

	public static void main(String[] args) 
	{
		SqlSession sqlSession=new SqlSession();
		
		//TODO TCF 获取映射器接口JDK动态代理实例
		UserInfoMapper userInfoMapper=(UserInfoMapper)sqlSession.getMapper(UserInfoMapper.class);
		
		//TODO TCF 调用代理实例的代理方法 => MapperProxyManager中的invoke方法
		UserInfo userInfo=userInfoMapper.selectById("20190824001");
		
		if(userInfo!=null)
		{
			System.out.println(userInfo.getId());
			System.out.println(userInfo.getName());
			System.out.println(userInfo.getSex());
			System.out.println(userInfo.getAge());
		}
	}
}
