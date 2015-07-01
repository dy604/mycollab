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
package com.esofthead.mycollab.common.dao;

import com.esofthead.mycollab.common.domain.CustomerFeedbackExample;
import com.esofthead.mycollab.common.domain.CustomerFeedbackWithBLOBs;
import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CustomerFeedbackMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    int countByExample(CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    int deleteByExample(CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    int insert(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    int insertSelective(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    List<CustomerFeedbackWithBLOBs> selectByExampleWithBLOBs(CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    CustomerFeedbackWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    int updateByExampleSelective(@Param("record") CustomerFeedbackWithBLOBs record, @Param("example") CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    int updateByExampleWithBLOBs(@Param("record") CustomerFeedbackWithBLOBs record, @Param("example") CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    int updateByPrimaryKeySelective(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    int updateByPrimaryKeyWithBLOBs(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    Integer insertAndReturnKey(CustomerFeedbackWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbggenerated Wed Jul 01 11:51:35 ICT 2015
     */
    void massUpdateWithSession(@Param("record") CustomerFeedbackWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}