package com.tencent.qcloud.presentation.viewfeatures;

import com.tencent.TIMFriendStatus;

/**
 * 好友关系链管理接口
 */
public interface FriendshipManageView {

    /**
     * 添加好友结果回调
     *
     * @param status 返回状态
     */
    void onAddFriend(TIMFriendStatus status);
}