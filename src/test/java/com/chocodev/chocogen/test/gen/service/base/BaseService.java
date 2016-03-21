package com.chocodev.chocogen.test.gen.service.base;
import com.chocodev.chocogen.test.gen.model.IdRequest;
import com.chocodev.chocogen.test.gen.model.PostResponse;
import com.chocodev.chocogen.test.gen.model.CommentResponse;
import com.chocodev.chocogen.test.gen.model.SampleRequest;
import com.chocodev.chocogen.test.gen.model.SampleResponse;
import com.chocodev.chocogen.test.gen.util.ServiceContext;
import com.chocodev.chocogen.test.gen.util.ServiceFilter;
import com.chocodev.chocogen.test.gen.util.ServiceUtils;
import com.chocodev.chocogen.test.gen.util.ResponseWrapper;
import org.apache.commons.io.IOUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.util.List;
import java.util.ArrayList;

public class BaseService
{
	private List<ServiceFilter> filters=new ArrayList<>();
	public void addFilter(ServiceFilter filter)
	{
		this.filters.add(filter);
	}


	public ResponseWrapper<PostResponse> onlineTest(ServiceContext context,IdRequest request)
	{
		try
		{
			OkHttpClient client=new OkHttpClient();
			String url="http://jsonplaceholder.typicode.com/posts/${id}";	
			url=preFilter(url);
			if(context.get("")!=null)
			{
				url=url.replace("${id}",context.get("id"));
			}
			else
			{
				url=url.replace("${id}",request.getProperty("id"));
			}
			url=postFilter(url);		
			Request serviceRequest;
			serviceRequest=new Request.Builder().url(url).get().build();
			Response serviceResponse=client.newCall(serviceRequest).execute();
			String stringContents=IOUtils.toString(serviceResponse.body().charStream());
			if(stringContents.trim().startsWith("["))
			{
				stringContents="{ \"items\":"+stringContents+"}";
			}
			return new ResponseWrapper(new ObjectMapper().readValue(stringContents,PostResponse.class));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}	
	public ResponseWrapper<CommentResponse> onlineTest2(ServiceContext context,IdRequest request)
	{
		try
		{
			OkHttpClient client=new OkHttpClient();
			String url="http://jsonplaceholder.typicode.com/posts/${id}/comments";	
			url=preFilter(url);
			if(context.get("")!=null)
			{
				url=url.replace("${id}",context.get("id"));
			}
			else
			{
				url=url.replace("${id}",request.getProperty("id"));
			}
			url=postFilter(url);		
			Request serviceRequest;
			serviceRequest=new Request.Builder().url(url).get().build();
			Response serviceResponse=client.newCall(serviceRequest).execute();
			String stringContents=IOUtils.toString(serviceResponse.body().charStream());
			if(stringContents.trim().startsWith("["))
			{
				stringContents="{ \"items\":"+stringContents+"}";
			}
			return new ResponseWrapper(new ObjectMapper().readValue(stringContents,CommentResponse.class));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}	
	public ResponseWrapper<SampleResponse> testMessage1(ServiceContext context,SampleRequest request)
	{
		try
		{
			OkHttpClient client=new OkHttpClient();
			String url="http://www.google.com?systemParam=${systemParam}&param1=${intValue}&param2=${doubleValue}";	
			url=preFilter(url);
			if(context.get("")!=null)
			{
				url=url.replace("${systemParam}",context.get("systemParam"));
			}
			else
			{
				url=url.replace("${systemParam}",request.getProperty("systemParam"));
			}
			if(context.get("")!=null)
			{
				url=url.replace("${intValue}",context.get("intValue"));
			}
			else
			{
				url=url.replace("${intValue}",request.getProperty("intValue"));
			}
			if(context.get("")!=null)
			{
				url=url.replace("${doubleValue}",context.get("doubleValue"));
			}
			else
			{
				url=url.replace("${doubleValue}",request.getProperty("doubleValue"));
			}
			url=postFilter(url);		
			Request serviceRequest;
			serviceRequest=new Request.Builder().url(url).get().build();
			Response serviceResponse=client.newCall(serviceRequest).execute();
			String stringContents=IOUtils.toString(serviceResponse.body().charStream());
			if(stringContents.trim().startsWith("["))
			{
				stringContents="{ \"items\":"+stringContents+"}";
			}
			return new ResponseWrapper(new ObjectMapper().readValue(stringContents,SampleResponse.class));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}	
	public ResponseWrapper<SampleResponse> testMessage2(ServiceContext context,SampleRequest request)
	{
		try
		{
			OkHttpClient client=new OkHttpClient();
			String url="http://www.server.com?systemParam=${systemParam}&param1=${intValue}&param2=${doubleValue}";	
			url=preFilter(url);
			if(context.get("")!=null)
			{
				url=url.replace("${systemParam}",context.get("systemParam"));
			}
			else
			{
				url=url.replace("${systemParam}",request.getProperty("systemParam"));
			}
			if(context.get("")!=null)
			{
				url=url.replace("${intValue}",context.get("intValue"));
			}
			else
			{
				url=url.replace("${intValue}",request.getProperty("intValue"));
			}
			if(context.get("")!=null)
			{
				url=url.replace("${doubleValue}",context.get("doubleValue"));
			}
			else
			{
				url=url.replace("${doubleValue}",request.getProperty("doubleValue"));
			}
			url=postFilter(url);		
			Request serviceRequest;
			serviceRequest=new Request.Builder().url(url).post(RequestBody.create(MediaType.parse("application/json"), new ObjectMapper().writeValueAsString(request)) ).build();
			Response serviceResponse=client.newCall(serviceRequest).execute();
			String stringContents=IOUtils.toString(serviceResponse.body().charStream());
			if(stringContents.trim().startsWith("["))
			{
				stringContents="{ \"items\":"+stringContents+"}";
			}
			return new ResponseWrapper(new ObjectMapper().readValue(stringContents,SampleResponse.class));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}	
	String preFilter(String url)
	{
		String returnUrl=url;
		for(ServiceFilter filter:filters)
		{
			returnUrl=filter.preFilter(returnUrl);
		}
		return returnUrl;
	}
	String postFilter(String url)
	{
		String returnUrl=url;
		for(ServiceFilter filter:filters)
		{
			returnUrl=filter.postFilter(returnUrl);
		}
		return returnUrl;
	}	
}