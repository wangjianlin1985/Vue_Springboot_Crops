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


import com.dao.NongyejishuyuanDao;
import com.entity.NongyejishuyuanEntity;
import com.service.NongyejishuyuanService;
import com.entity.vo.NongyejishuyuanVO;
import com.entity.view.NongyejishuyuanView;

@Service("nongyejishuyuanService")
public class NongyejishuyuanServiceImpl extends ServiceImpl<NongyejishuyuanDao, NongyejishuyuanEntity> implements NongyejishuyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongyejishuyuanEntity> page = this.selectPage(
                new Query<NongyejishuyuanEntity>(params).getPage(),
                new EntityWrapper<NongyejishuyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongyejishuyuanEntity> wrapper) {
		  Page<NongyejishuyuanView> page =new Query<NongyejishuyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongyejishuyuanVO> selectListVO(Wrapper<NongyejishuyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongyejishuyuanVO selectVO(Wrapper<NongyejishuyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongyejishuyuanView> selectListView(Wrapper<NongyejishuyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongyejishuyuanView selectView(Wrapper<NongyejishuyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
