package com.hzzl.sg.dao;


import com.hzzl.sg.model.Settings;

public interface SettingsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_settings
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_settings
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int insert(Settings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_settings
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int insertSelective(Settings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_settings
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    Settings selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_settings
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int updateByPrimaryKeySelective(Settings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_settings
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int updateByPrimaryKey(Settings record);
}