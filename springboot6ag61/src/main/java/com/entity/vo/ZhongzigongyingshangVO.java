package com.entity.vo;

import com.entity.ZhongzigongyingshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 种子供应商
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public class ZhongzigongyingshangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 经营范围
	 */
	
	private String jingyingfanwei;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 种子名称
	 */
	
	private String zhongzimingcheng;
		
	/**
	 * 销售价格
	 */
	
	private String xiaoshoujiage;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：经营范围
	 */
	 
	public void setJingyingfanwei(String jingyingfanwei) {
		this.jingyingfanwei = jingyingfanwei;
	}
	
	/**
	 * 获取：经营范围
	 */
	public String getJingyingfanwei() {
		return jingyingfanwei;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：种子名称
	 */
	 
	public void setZhongzimingcheng(String zhongzimingcheng) {
		this.zhongzimingcheng = zhongzimingcheng;
	}
	
	/**
	 * 获取：种子名称
	 */
	public String getZhongzimingcheng() {
		return zhongzimingcheng;
	}
				
	
	/**
	 * 设置：销售价格
	 */
	 
	public void setXiaoshoujiage(String xiaoshoujiage) {
		this.xiaoshoujiage = xiaoshoujiage;
	}
	
	/**
	 * 获取：销售价格
	 */
	public String getXiaoshoujiage() {
		return xiaoshoujiage;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
