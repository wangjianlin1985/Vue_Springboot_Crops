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
 * 技术
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
@TableName("jishu")
public class JishuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JishuEntity() {
		
	}
	
	public JishuEntity(T t) {
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
	 * 农作物名称
	 */
					
	private String nongzuowumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 主要病虫害
	 */
					
	private String zhuyaobingchonghai;
	
	/**
	 * 防治方法
	 */
					
	private String fangzhifangfa;
	
	/**
	 * 技术员账号
	 */
					
	private String jishuyuanzhanghao;
	
	/**
	 * 技术员姓名
	 */
					
	private String jishuyuanxingming;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
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
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：主要病虫害
	 */
	public void setZhuyaobingchonghai(String zhuyaobingchonghai) {
		this.zhuyaobingchonghai = zhuyaobingchonghai;
	}
	/**
	 * 获取：主要病虫害
	 */
	public String getZhuyaobingchonghai() {
		return zhuyaobingchonghai;
	}
	/**
	 * 设置：防治方法
	 */
	public void setFangzhifangfa(String fangzhifangfa) {
		this.fangzhifangfa = fangzhifangfa;
	}
	/**
	 * 获取：防治方法
	 */
	public String getFangzhifangfa() {
		return fangzhifangfa;
	}
	/**
	 * 设置：技术员账号
	 */
	public void setJishuyuanzhanghao(String jishuyuanzhanghao) {
		this.jishuyuanzhanghao = jishuyuanzhanghao;
	}
	/**
	 * 获取：技术员账号
	 */
	public String getJishuyuanzhanghao() {
		return jishuyuanzhanghao;
	}
	/**
	 * 设置：技术员姓名
	 */
	public void setJishuyuanxingming(String jishuyuanxingming) {
		this.jishuyuanxingming = jishuyuanxingming;
	}
	/**
	 * 获取：技术员姓名
	 */
	public String getJishuyuanxingming() {
		return jishuyuanxingming;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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
