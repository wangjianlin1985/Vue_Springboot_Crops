package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjishuDao;
import com.entity.DiscussjishuEntity;
import com.service.DiscussjishuService;
import com.entity.vo.DiscussjishuVO;
import com.entity.view.DiscussjishuView;

@Service("discussjishuService")
public class DiscussjishuServiceImpl extends ServiceImpl<DiscussjishuDao, DiscussjishuEntity> implements DiscussjishuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjishuEntity> page = this.selectPage(
                new Query<DiscussjishuEntity>(params).getPage(),
                new EntityWrapper<DiscussjishuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjishuEntity> wrapper) {
		  Page<DiscussjishuView> page =new Query<DiscussjishuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjishuVO> selectListVO(Wrapper<DiscussjishuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjishuVO selectVO(Wrapper<DiscussjishuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjishuView> selectListView(Wrapper<DiscussjishuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjishuView selectView(Wrapper<DiscussjishuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
