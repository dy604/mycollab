/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table s_relay_email_notification*/
package com.esofthead.mycollab.common.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("s_relay_email_notification")
class RelayEmailNotification extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_relay_email_notification.id
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_relay_email_notification.sAccountId
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_relay_email_notification.type
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_relay_email_notification.action
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("action")
    private String action;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_relay_email_notification.changeBy
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("changeBy")
    private String changeby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_relay_email_notification.extraTypeId
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("extraTypeId")
    private Integer extratypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_relay_email_notification.emailHandlerBean
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=400, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("emailHandlerBean")
    private String emailhandlerbean;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_relay_email_notification.id
     *
     * @return the value of s_relay_email_notification.id
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_relay_email_notification.id
     *
     * @param id the value for s_relay_email_notification.id
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_relay_email_notification.sAccountId
     *
     * @return the value of s_relay_email_notification.sAccountId
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_relay_email_notification.sAccountId
     *
     * @param saccountid the value for s_relay_email_notification.sAccountId
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_relay_email_notification.type
     *
     * @return the value of s_relay_email_notification.type
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_relay_email_notification.type
     *
     * @param type the value for s_relay_email_notification.type
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_relay_email_notification.action
     *
     * @return the value of s_relay_email_notification.action
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_relay_email_notification.action
     *
     * @param action the value for s_relay_email_notification.action
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_relay_email_notification.changeBy
     *
     * @return the value of s_relay_email_notification.changeBy
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public String getChangeby() {
        return changeby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_relay_email_notification.changeBy
     *
     * @param changeby the value for s_relay_email_notification.changeBy
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public void setChangeby(String changeby) {
        this.changeby = changeby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_relay_email_notification.extraTypeId
     *
     * @return the value of s_relay_email_notification.extraTypeId
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public Integer getExtratypeid() {
        return extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_relay_email_notification.extraTypeId
     *
     * @param extratypeid the value for s_relay_email_notification.extraTypeId
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public void setExtratypeid(Integer extratypeid) {
        this.extratypeid = extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_relay_email_notification.emailHandlerBean
     *
     * @return the value of s_relay_email_notification.emailHandlerBean
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public String getEmailhandlerbean() {
        return emailhandlerbean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_relay_email_notification.emailHandlerBean
     *
     * @param emailhandlerbean the value for s_relay_email_notification.emailHandlerBean
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    public void setEmailhandlerbean(String emailhandlerbean) {
        this.emailhandlerbean = emailhandlerbean;
    }
}