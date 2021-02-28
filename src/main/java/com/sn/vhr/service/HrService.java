package com.sn.vhr.service;

import com.sn.vhr.mapper.HrMapper;
import com.sn.vhr.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

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
}
