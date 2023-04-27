package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.NongzuowushougoushangEntity;
import com.entity.view.NongzuowushougoushangView;

import com.service.NongzuowushougoushangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 农作物收购商
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
@RestController
@RequestMapping("/nongzuowushougoushang")
public class NongzuowushougoushangController {
    @Autowired
    private NongzuowushougoushangService nongzuowushougoushangService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NongzuowushougoushangEntity nongzuowushougoushang,
		HttpServletRequest request){
        EntityWrapper<NongzuowushougoushangEntity> ew = new EntityWrapper<NongzuowushougoushangEntity>();
		PageUtils page = nongzuowushougoushangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongzuowushougoushang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NongzuowushougoushangEntity nongzuowushougoushang, 
		HttpServletRequest request){
        EntityWrapper<NongzuowushougoushangEntity> ew = new EntityWrapper<NongzuowushougoushangEntity>();
		PageUtils page = nongzuowushougoushangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongzuowushougoushang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NongzuowushougoushangEntity nongzuowushougoushang){
       	EntityWrapper<NongzuowushougoushangEntity> ew = new EntityWrapper<NongzuowushougoushangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nongzuowushougoushang, "nongzuowushougoushang")); 
        return R.ok().put("data", nongzuowushougoushangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NongzuowushougoushangEntity nongzuowushougoushang){
        EntityWrapper< NongzuowushougoushangEntity> ew = new EntityWrapper< NongzuowushougoushangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nongzuowushougoushang, "nongzuowushougoushang")); 
		NongzuowushougoushangView nongzuowushougoushangView =  nongzuowushougoushangService.selectView(ew);
		return R.ok("查询农作物收购商成功").put("data", nongzuowushougoushangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NongzuowushougoushangEntity nongzuowushougoushang = nongzuowushougoushangService.selectById(id);
        return R.ok().put("data", nongzuowushougoushang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NongzuowushougoushangEntity nongzuowushougoushang = nongzuowushougoushangService.selectById(id);
        return R.ok().put("data", nongzuowushougoushang);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        NongzuowushougoushangEntity nongzuowushougoushang = nongzuowushougoushangService.selectById(id);
        if(type.equals("1")) {
        	nongzuowushougoushang.setThumbsupnum(nongzuowushougoushang.getThumbsupnum()+1);
        } else {
        	nongzuowushougoushang.setCrazilynum(nongzuowushougoushang.getCrazilynum()+1);
        }
        nongzuowushougoushangService.updateById(nongzuowushougoushang);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NongzuowushougoushangEntity nongzuowushougoushang, HttpServletRequest request){
    	nongzuowushougoushang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongzuowushougoushang);
        nongzuowushougoushangService.insert(nongzuowushougoushang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody NongzuowushougoushangEntity nongzuowushougoushang, HttpServletRequest request){
    	nongzuowushougoushang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongzuowushougoushang);
        nongzuowushougoushangService.insert(nongzuowushougoushang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody NongzuowushougoushangEntity nongzuowushougoushang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nongzuowushougoushang);
        nongzuowushougoushangService.updateById(nongzuowushougoushang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        nongzuowushougoushangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<NongzuowushougoushangEntity> wrapper = new EntityWrapper<NongzuowushougoushangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = nongzuowushougoushangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
