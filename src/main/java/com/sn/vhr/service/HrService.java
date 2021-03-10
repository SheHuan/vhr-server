package com.sn.vhr.service;

import com.sn.vhr.mapper.HrMapper;
import com.sn.vhr.mapper.HrRoleMapper;
import com.sn.vhr.model.Hr;
import com.sn.vhr.utils.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 查询用户信息
 */
@Service
public class HrService implements UserDetailsService {

    @Autowired
    HrMapper hrMapper;

    @Autowired
    HrRoleMapper hrRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.findUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        return hr;
    }

    public List<Hr> getAllHrs() {
        List<Hr> allHrs = hrMapper.getAllHrs(HrUtils.getCurrentHr().getId());
        allHrs.forEach(hr -> {
            hr.setPassword(null);
        });
        return allHrs;
    }

    public Integer updateHr(Hr hr) {
        return hrMapper.updateHr(hr);
    }

    @Transactional
    public boolean updateHrRole(Integer hrid, Integer[] rids) {
        hrRoleMapper.deleteRoleByHrId(hrid);
        if (rids == null || rids.length == 0) {
            return true;
        }
        Integer result = hrRoleMapper.insertRecord(hrid, rids);
        return result == rids.length;
    }
}
