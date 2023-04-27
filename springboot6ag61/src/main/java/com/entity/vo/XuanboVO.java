package com.entity.vo;

import com.entity.XuanboEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 选播
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public class XuanboVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 土壤湿度要求
	 */
	
	private String turangshiduyaoqiu;
		
	/**
	 * 天气要求
	 */
	
	private String tianqiyaoqiu;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 技术员账号
	 */
	
	private String jishuyuanzhanghao;
		
	/**
	 * 技术员姓名
	 */
	
	private String jishuyuanxingming;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：土壤湿度要求
	 */
	 
	public void setTurangshiduyaoqiu(String turangshiduyaoqiu) {
		this.turangshiduyaoqiu = turangshiduyaoqiu;
	}
	
	/**
	 * 获取：土壤湿度要求
	 */
	public String getTurangshiduyaoqiu() {
		return turangshiduyaoqiu;
	}
				
	
	/**
	 * 设置：天气要求
	 */
	 
	public void setTianqiyaoqiu(String tianqiyaoqiu) {
		this.tianqiyaoqiu = tianqiyaoqiu;
	}
	
	/**
	 * 获取：天气要求
	 */
	public String getTianqiyaoqiu() {
		return tianqiyaoqiu;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
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
