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


import com.dao.DiscussnongzuowushougoushangDao;
import com.entity.DiscussnongzuowushougoushangEntity;
import com.service.DiscussnongzuowushougoushangService;
import com.entity.vo.DiscussnongzuowushougoushangVO;
import com.entity.view.DiscussnongzuowushougoushangView;

@Service("discussnongzuowushougoushangService")
public class DiscussnongzuowushougoushangServiceImpl extends ServiceImpl<DiscussnongzuowushougoushangDao, DiscussnongzuowushougoushangEntity> implements DiscussnongzuowushougoushangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussnongzuowushougoushangEntity> page = this.selectPage(
                new Query<DiscussnongzuowushougoushangEntity>(params).getPage(),
                new EntityWrapper<DiscussnongzuowushougoushangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussnongzuowushougoushangEntity> wrapper) {
		  Page<DiscussnongzuowushougoushangView> page =new Query<DiscussnongzuowushougoushangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussnongzuowushougoushangVO> selectListVO(Wrapper<DiscussnongzuowushougoushangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussnongzuowushougoushangVO selectVO(Wrapper<DiscussnongzuowushougoushangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussnongzuowushougoushangView> selectListView(Wrapper<DiscussnongzuowushougoushangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussnongzuowushougoushangView selectView(Wrapper<DiscussnongzuowushougoushangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
