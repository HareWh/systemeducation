package cn.beijing.ssfh.entity;

import java.util.Date;

public class DateTime {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column date_time.date_time_id
     *
     * @mbggenerated
     */
    private Integer dateTimeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column date_time.date_time
     *
     * @mbggenerated
     */
    private Date dateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column date_time.date_time_id
     *
     * @return the value of date_time.date_time_id
     *
     * @mbggenerated
     */
    public Integer getDateTimeId() {
        return dateTimeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column date_time.date_time_id
     *
     * @param dateTimeId the value for date_time.date_time_id
     *
     * @mbggenerated
     */
    public void setDateTimeId(Integer dateTimeId) {
        this.dateTimeId = dateTimeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column date_time.date_time
     *
     * @return the value of date_time.date_time
     *
     * @mbggenerated
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column date_time.date_time
     *
     * @param dateTime the value for date_time.date_time
     *
     * @mbggenerated
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}