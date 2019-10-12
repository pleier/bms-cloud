package com.github.plei.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * 菜单
 *
 * @author ：plei
 * @date ：2019/10/12 17:31
 */
@Data
public class SysMenu extends Model<SysMenu> {
    
    private static final long serialVersionUID = -267102294860563595L;
    
    /**
     * 菜单ID
     */
    @NotNull(message = "菜单ID不能为空")
    @TableId(value = "menu_id", type = IdType.INPUT)
    private Integer menuId;
    /**
     * 菜单名称
     */
    @NotBlank(message = "菜单名称不能为空")
    private String name;
    /**
     * 菜单权限标识
     */
    private String permission;
    /**
     * 父菜单ID
     */
    @NotNull(message = "菜单父ID不能为空")
    private Integer parentId;
    /**
     * 图标
     */
    private String icon;
    /**
     * VUE页面
     */
    private String component;
    /**
     * 排序值
     */
    private Integer sort;
    /**
     * 菜单类型 （0菜单 1按钮）
     */
    @NotNull(message = "菜单类型不能为空")
    private String type;
    /**
     * 路由缓冲
     */
    private String keepAlive;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 0--正常 1--删除
     */
    @TableLogic
    private String delFlag;
    /**
     * 前端URL
     */
    private String path;
}
