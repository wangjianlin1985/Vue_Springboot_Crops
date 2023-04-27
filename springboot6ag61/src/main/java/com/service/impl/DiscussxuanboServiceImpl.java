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


import com.dao.DiscussxuanboDao;
import com.entity.DiscussxuanboEntity;
import com.service.DiscussxuanboService;
import com.entity.vo.DiscussxuanboVO;
import com.entity.view.DiscussxuanboView;

@Service("discussxuanboService")
public class DiscussxuanboServiceImpl extends ServiceImpl<DiscussxuanboDao, DiscussxuanboEntity> implements DiscussxuanboService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuanboEntity> page = this.selectPage(
                new Query<DiscussxuanboEntity>(params).getPage(),
                new EntityWrapper<DiscussxuanboEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuanboEntity> wrapper) {
		  Page<DiscussxuanboView> page =new Query<DiscussxuanboView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuanboVO> selectListVO(Wrapper<DiscussxuanboEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuanboVO selectVO(Wrapper<DiscussxuanboEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuanboView> selectListView(Wrapper<DiscussxuanboEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuanboView selectView(Wrapper<DiscussxuanboEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
