package com.yjt.service.impl;

import com.yjt.entity.Meeting;
import com.yjt.mapper.MeetingMapper;
import com.yjt.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    MeetingMapper meetingMapper;

    @Override
    public Meeting selectByUid(Integer id) {
        return meetingMapper.selectByUid(id);
    }
}
