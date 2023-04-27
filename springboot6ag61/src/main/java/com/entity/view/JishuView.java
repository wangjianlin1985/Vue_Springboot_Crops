package com.entity.view;

import com.entity.JishuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 技术
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
@TableName("jishu")
public class JishuView  extends JishuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JishuView(){
	}
 
 	public JishuView(JishuEntity jishuEntity){
 	try {
			BeanUtils.copyProperties(this, jishuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
