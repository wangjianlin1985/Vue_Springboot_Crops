package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 农作物收购商
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
@TableName("nongzuowushougoushang")
public class NongzuowushougoushangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongzuowushougoushangEntity() {
		
	}
	
	public NongzuowushougoushangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 收购商名称
	 */
					
	private String shougoushangmingcheng;
	
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
	 * 农作物名称
	 */
					
	private String nongzuowumingcheng;
	
	/**
	 * 收购价格
	 */
					
	private String shougoujiage;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：收购商名称
	 */
	public void setShougoushangmingcheng(String shougoushangmingcheng) {
		this.shougoushangmingcheng = shougoushangmingcheng;
	}
	/**
	 * 获取：收购商名称
	 */
	public String getShougoushangmingcheng() {
		return shougoushangmingcheng;
	}
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
	 * 设置：农作物名称
	 */
	public void setNongzuowumingcheng(String nongzuowumingcheng) {
		this.nongzuowumingcheng = nongzuowumingcheng;
	}
	/**
	 * 获取：农作物名称
	 */
	public String getNongzuowumingcheng() {
		return nongzuowumingcheng;
	}
	/**
	 * 设置：收购价格
	 */
	public void setShougoujiage(String shougoujiage) {
		this.shougoujiage = shougoujiage;
	}
	/**
	 * 获取：收购价格
	 */
	public String getShougoujiage() {
		return shougoujiage;
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
