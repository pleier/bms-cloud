package com.github.plei.api.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 部门关系表
 *
 * @author ：plei
 * @date ：2019/10/12 17:24
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysDeptRelation  extends Model<SysDeptRelation> {
    private static final long serialVersionUID = -6517415311323171919L;
    
    /**
     * 祖先节点
     */
    private Integer ancestor;
    /**
     * 后代节点
     */
    private Integer descendant;
}
