package com.hzzl.sg.model;

/**
* @Program: SG
* @Description: ${description}
* @Author: MaQingFu
* @Date: 2018/7/26 15:34
**/
public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_id
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_name
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_describe
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    private String roleDescribe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_id
     *
     * @return the value of sys_role.role_id
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_id
     *
     * @param roleId the value for sys_role.role_id
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_name
     *
     * @return the value of sys_role.role_name
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_name
     *
     * @param roleName the value for sys_role.role_name
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_describe
     *
     * @return the value of sys_role.role_describe
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    public String getRoleDescribe() {
        return roleDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_describe
     *
     * @param roleDescribe the value for sys_role.role_describe
     *
     * @mbggenerated Thu Jul 26 14:31:00 CST 2018
     */
    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe == null ? null : roleDescribe.trim();
    }
}