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


import com.dao.XuanboDao;
import com.entity.XuanboEntity;
import com.service.XuanboService;
import com.entity.vo.XuanboVO;
import com.entity.view.XuanboView;

@Service("xuanboService")
public class XuanboServiceImpl extends ServiceImpl<XuanboDao, XuanboEntity> implements XuanboService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuanboEntity> page = this.selectPage(
                new Query<XuanboEntity>(params).getPage(),
                new EntityWrapper<XuanboEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuanboEntity> wrapper) {
		  Page<XuanboView> page =new Query<XuanboView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuanboVO> selectListVO(Wrapper<XuanboEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuanboVO selectVO(Wrapper<XuanboEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuanboView> selectListView(Wrapper<XuanboEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuanboView selectView(Wrapper<XuanboEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
