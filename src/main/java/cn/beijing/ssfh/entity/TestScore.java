package cn.beijing.ssfh.entity;

import java.util.Date;

public class TestScore {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_score.test_code_id
     *
     * @mbggenerated
     */
    private Integer testCodeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_score.test_paper_id
     *
     * @mbggenerated
     */
    private Integer testPaperId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_score.student_id
     *
     * @mbggenerated
     */
    private Integer studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_score.score
     *
     * @mbggenerated
     */
    private Double score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_score.test_time
     *
     * @mbggenerated
     */
    private Date testTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_score.test_code_id
     *
     * @return the value of test_score.test_code_id
     *
     * @mbggenerated
     */
    public Integer getTestCodeId() {
        return testCodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_score.test_code_id
     *
     * @param testCodeId the value for test_score.test_code_id
     *
     * @mbggenerated
     */
    public void setTestCodeId(Integer testCodeId) {
        this.testCodeId = testCodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_score.test_paper_id
     *
     * @return the value of test_score.test_paper_id
     *
     * @mbggenerated
     */
    public Integer getTestPaperId() {
        return testPaperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_score.test_paper_id
     *
     * @param testPaperId the value for test_score.test_paper_id
     *
     * @mbggenerated
     */
    public void setTestPaperId(Integer testPaperId) {
        this.testPaperId = testPaperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_score.student_id
     *
     * @return the value of test_score.student_id
     *
     * @mbggenerated
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_score.student_id
     *
     * @param studentId the value for test_score.student_id
     *
     * @mbggenerated
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_score.score
     *
     * @return the value of test_score.score
     *
     * @mbggenerated
     */
    public Double getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_score.score
     *
     * @param score the value for test_score.score
     *
     * @mbggenerated
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_score.test_time
     *
     * @return the value of test_score.test_time
     *
     * @mbggenerated
     */
    public Date getTestTime() {
        return testTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_score.test_time
     *
     * @param testTime the value for test_score.test_time
     *
     * @mbggenerated
     */
    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }
}