package com.hzzl.sg.dao;

import com.hzzl.sg.model.Flight;

public interface FlightMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flight
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flight
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int insert(Flight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flight
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int insertSelective(Flight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flight
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    Flight selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flight
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int updateByPrimaryKeySelective(Flight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flight
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    int updateByPrimaryKey(Flight record);
}