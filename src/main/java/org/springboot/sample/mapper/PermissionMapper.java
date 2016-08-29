package org.springboot.sample.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springboot.sample.entity.Permission;
import org.springboot.sample.entity.PermissionExample;

public interface PermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbggenerated Fri Aug 19 12:28:37 CST 2016
     */
    int countByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbggenerated Fri Aug 19 12:28:37 CST 2016
     */
    int deleteByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbggenerated Fri Aug 19 12:28:37 CST 2016
     */
    int insert(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbggenerated Fri Aug 19 12:28:37 CST 2016
     */
    int insertSelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbggenerated Fri Aug 19 12:28:37 CST 2016
     */
    List<Permission> selectByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbggenerated Fri Aug 19 12:28:37 CST 2016
     */
    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbggenerated Fri Aug 19 12:28:37 CST 2016
     */
    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);
}