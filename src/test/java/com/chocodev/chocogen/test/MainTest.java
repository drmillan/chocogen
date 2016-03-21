package com.chocodev.chocogen.test;

import org.junit.Assert;
import org.junit.Test;

import com.chocodev.chocogen.test.gen.model.CommentResponse;
import com.chocodev.chocogen.test.gen.model.IdRequest;
import com.chocodev.chocogen.test.gen.model.PostResponse;
import com.chocodev.chocogen.test.gen.service.base.BaseService;
import com.chocodev.chocogen.test.gen.util.ResponseWrapper;
import com.chocodev.chocogen.test.gen.util.ServiceContext;


public class MainTest {
	@Test
	public void testSampleJson() {
		BaseService service=new BaseService();
		IdRequest request=new IdRequest();
		request.setId(1);
		ServiceContext context=new ServiceContext();
		ResponseWrapper<PostResponse> response=service.onlineTest(context, request);
		Assert.assertNotNull(response.getContents());
		
		ResponseWrapper<CommentResponse> commentsResponse=service.onlineTest2(context, request);
		Assert.assertNotNull(commentsResponse.getContents());
	}
}
