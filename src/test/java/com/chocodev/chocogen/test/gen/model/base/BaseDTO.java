package com.chocodev.chocogen.test.gen.model.base;
import java.util.List;
import java.util.ArrayList;
import com.chocodev.chocogen.test.gen.model.IdRequest;
import com.chocodev.chocogen.test.gen.model.CommentResponse;
import com.chocodev.chocogen.test.gen.model.CommentItem;
import com.chocodev.chocogen.test.gen.model.PostResponse;
import com.chocodev.chocogen.test.gen.model.SampleRequest;
import com.chocodev.chocogen.test.gen.model.SampleResponse;
import com.chocodev.chocogen.test.gen.model.SubItem;
public class BaseDTO{
	public static class BaseIdRequest {
					private Integer id=null;
							public Integer getId()
			{
				return this.id;
			}
			public void setId(Integer id)
			{
				this.id=id;
			}
					public String getProperty(String key)
			{
					if("id".equals(key))
			{
				return String.valueOf(getId());
			}
					return null;				
			}
	}
	public static class BaseCommentResponse {
					private List<CommentItem> items=new ArrayList<CommentItem>();
							public List<CommentItem> getItems()
			{
				return this.items;
			}
			public void setItems(List<CommentItem> items)
			{
				this.items=items;
			}
					public String getProperty(String key)
			{
					if("items".equals(key))
			{
				return String.valueOf(getItems());
			}
					return null;				
			}
	}
	public static class BaseCommentItem {
					private String postId=null;
					private String id=null;
					private String name=null;
					private String email=null;
					private String body=null;
							public String getPostId()
			{
				return this.postId;
			}
			public void setPostId(String postId)
			{
				this.postId=postId;
			}
					public String getId()
			{
				return this.id;
			}
			public void setId(String id)
			{
				this.id=id;
			}
					public String getName()
			{
				return this.name;
			}
			public void setName(String name)
			{
				this.name=name;
			}
					public String getEmail()
			{
				return this.email;
			}
			public void setEmail(String email)
			{
				this.email=email;
			}
					public String getBody()
			{
				return this.body;
			}
			public void setBody(String body)
			{
				this.body=body;
			}
					public String getProperty(String key)
			{
					if("postId".equals(key))
			{
				return String.valueOf(getPostId());
			}
					if("id".equals(key))
			{
				return String.valueOf(getId());
			}
					if("name".equals(key))
			{
				return String.valueOf(getName());
			}
					if("email".equals(key))
			{
				return String.valueOf(getEmail());
			}
					if("body".equals(key))
			{
				return String.valueOf(getBody());
			}
					return null;				
			}
	}
	public static class BasePostResponse {
					private Integer userId=null;
					private Integer id=null;
					private String title=null;
					private String body=null;
							public Integer getUserId()
			{
				return this.userId;
			}
			public void setUserId(Integer userId)
			{
				this.userId=userId;
			}
					public Integer getId()
			{
				return this.id;
			}
			public void setId(Integer id)
			{
				this.id=id;
			}
					public String getTitle()
			{
				return this.title;
			}
			public void setTitle(String title)
			{
				this.title=title;
			}
					public String getBody()
			{
				return this.body;
			}
			public void setBody(String body)
			{
				this.body=body;
			}
					public String getProperty(String key)
			{
					if("userId".equals(key))
			{
				return String.valueOf(getUserId());
			}
					if("id".equals(key))
			{
				return String.valueOf(getId());
			}
					if("title".equals(key))
			{
				return String.valueOf(getTitle());
			}
					if("body".equals(key))
			{
				return String.valueOf(getBody());
			}
					return null;				
			}
	}
	public static class BaseSampleRequest {
					private Integer intValue=null;
					private Double doubleValue=null;
					private String stringValue=null;
					private Float floatValue=null;
					private Boolean booleanValue=null;
					private List<Integer> arrayIntValue=new ArrayList<Integer>();
					private List<Double> arrayDoubleValue=new ArrayList<Double>();
					private List<String> arrayStringValue=new ArrayList<String>();
					private List<Float> arrayFloatValue=new ArrayList<Float>();
					private List<Boolean> arrayBooleanValue=new ArrayList<Boolean>();
					private SubItem subItem=null;
					private List<SubItem> arraySubItem=new ArrayList<SubItem>();
							public Integer getIntValue()
			{
				return this.intValue;
			}
			public void setIntValue(Integer intValue)
			{
				this.intValue=intValue;
			}
					public Double getDoubleValue()
			{
				return this.doubleValue;
			}
			public void setDoubleValue(Double doubleValue)
			{
				this.doubleValue=doubleValue;
			}
					public String getStringValue()
			{
				return this.stringValue;
			}
			public void setStringValue(String stringValue)
			{
				this.stringValue=stringValue;
			}
					public Float getFloatValue()
			{
				return this.floatValue;
			}
			public void setFloatValue(Float floatValue)
			{
				this.floatValue=floatValue;
			}
					public Boolean getBooleanValue()
			{
				return this.booleanValue;
			}
			public void setBooleanValue(Boolean booleanValue)
			{
				this.booleanValue=booleanValue;
			}
					public List<Integer> getArrayIntValue()
			{
				return this.arrayIntValue;
			}
			public void setArrayIntValue(List<Integer> arrayIntValue)
			{
				this.arrayIntValue=arrayIntValue;
			}
					public List<Double> getArrayDoubleValue()
			{
				return this.arrayDoubleValue;
			}
			public void setArrayDoubleValue(List<Double> arrayDoubleValue)
			{
				this.arrayDoubleValue=arrayDoubleValue;
			}
					public List<String> getArrayStringValue()
			{
				return this.arrayStringValue;
			}
			public void setArrayStringValue(List<String> arrayStringValue)
			{
				this.arrayStringValue=arrayStringValue;
			}
					public List<Float> getArrayFloatValue()
			{
				return this.arrayFloatValue;
			}
			public void setArrayFloatValue(List<Float> arrayFloatValue)
			{
				this.arrayFloatValue=arrayFloatValue;
			}
					public List<Boolean> getArrayBooleanValue()
			{
				return this.arrayBooleanValue;
			}
			public void setArrayBooleanValue(List<Boolean> arrayBooleanValue)
			{
				this.arrayBooleanValue=arrayBooleanValue;
			}
					public SubItem getSubItem()
			{
				return this.subItem;
			}
			public void setSubItem(SubItem subItem)
			{
				this.subItem=subItem;
			}
					public List<SubItem> getArraySubItem()
			{
				return this.arraySubItem;
			}
			public void setArraySubItem(List<SubItem> arraySubItem)
			{
				this.arraySubItem=arraySubItem;
			}
					public String getProperty(String key)
			{
					if("intValue".equals(key))
			{
				return String.valueOf(getIntValue());
			}
					if("doubleValue".equals(key))
			{
				return String.valueOf(getDoubleValue());
			}
					if("stringValue".equals(key))
			{
				return String.valueOf(getStringValue());
			}
					if("floatValue".equals(key))
			{
				return String.valueOf(getFloatValue());
			}
					if("booleanValue".equals(key))
			{
				return String.valueOf(getBooleanValue());
			}
					if("arrayIntValue".equals(key))
			{
				return String.valueOf(getArrayIntValue());
			}
					if("arrayDoubleValue".equals(key))
			{
				return String.valueOf(getArrayDoubleValue());
			}
					if("arrayStringValue".equals(key))
			{
				return String.valueOf(getArrayStringValue());
			}
					if("arrayFloatValue".equals(key))
			{
				return String.valueOf(getArrayFloatValue());
			}
					if("arrayBooleanValue".equals(key))
			{
				return String.valueOf(getArrayBooleanValue());
			}
					if("subItem".equals(key))
			{
				return String.valueOf(getSubItem());
			}
					if("arraySubItem".equals(key))
			{
				return String.valueOf(getArraySubItem());
			}
					return null;				
			}
	}
	public static class BaseSampleResponse {
							public String getProperty(String key)
			{
					return null;				
			}
	}
	public static class BaseSubItem {
							public String getProperty(String key)
			{
					return null;				
			}
	}
}