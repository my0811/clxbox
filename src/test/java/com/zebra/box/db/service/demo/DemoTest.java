package com.zebra.box.db.service.demo;

import org.junit.Test;

import com.zebra.framework.test.SpringJunit4Test;

import contants.TestContant;

public class DemoTest extends SpringJunit4Test {

//    @Autowired
//    private UserService userService;

    @Test
    public void testfinUserList() {

//        System.out.println(userService.finUserList());
//        for (User u : userService.finUserList()) {
//            System.out.println(u.getAcccount());
//        }

    }

    @Test
    public void testAddUser() {

//        User user = new User();
//        user.setAcccount("yang002");
//        user.setPassWord("123456");
//        user.setMobile("15504265998");
//        user.setName("杨中奎test");
//        UserDetail userDetail = new UserDetail();
//        userDetail.setAddress("辽宁大连-test");
//        userDetail.setAge(26);
//        userDetail.setCompany("斑马科技-test");
//        userService.addUser(user, userDetail);

    }
	@Override
	public String getLogLocation() {
		return TestContant.log4jPath;

	}

}
