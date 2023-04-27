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


import com.dao.JishuDao;
import com.entity.JishuEntity;
import com.service.JishuService;
import com.entity.vo.JishuVO;
import com.entity.view.JishuView;

@Service("jishuService")
public class JishuServiceImpl extends ServiceImpl<JishuDao, JishuEntity> implements JishuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JishuEntity> page = this.selectPage(
                new Query<JishuEntity>(params).getPage(),
                new EntityWrapper<JishuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JishuEntity> wrapper) {
		  Page<JishuView> page =new Query<JishuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JishuVO> selectListVO(Wrapper<JishuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JishuVO selectVO(Wrapper<JishuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JishuView> selectListView(Wrapper<JishuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JishuView selectView(Wrapper<JishuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
