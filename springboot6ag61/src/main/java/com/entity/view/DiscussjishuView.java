package com.entity.view;

import com.entity.DiscussjishuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 技术评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
@TableName("discussjishu")
public class DiscussjishuView  extends DiscussjishuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjishuView(){
	}
 
 	public DiscussjishuView(DiscussjishuEntity discussjishuEntity){
 	try {
			BeanUtils.copyProperties(this, discussjishuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
