package com.zjrealtech.trace.dao;

import com.zjrealtech.trace.dao.entity.PoemInfo;

/**
 * Created by longtaiye on 2017/12/10.
 */
public interface IPoemDao {
    PoemInfo getPoemByID(int id);
}
