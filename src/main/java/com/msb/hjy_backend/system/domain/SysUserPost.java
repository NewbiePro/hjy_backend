package com.msb.hjy_backend.system.domain;

/**
 * 用户和岗位中间表
 **/
public class SysUserPost {

    /** 用户ID */
    private Long userId;

    /** 岗位ID */
    private Long postId;

    public SysUserPost() {
    }

    public SysUserPost(Long userId, Long postId) {
        this.userId = userId;
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
