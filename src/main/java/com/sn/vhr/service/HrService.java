package com.sn.vhr.service;

import com.sn.vhr.mapper.HrMapper;
import com.sn.vhr.model.Hr;
import com.sn.vhr.utils.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 查询用户信息
 */
@Service
public class HrService implements UserDetailsService {

    @Autowired
    HrMapper hrMapper;

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
}
