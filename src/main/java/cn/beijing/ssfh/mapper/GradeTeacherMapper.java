package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.GradeTeacher;

public interface GradeTeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_teacher
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer gradeTeacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_teacher
     *
     * @mbggenerated
     */
    int insert(GradeTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_teacher
     *
     * @mbggenerated
     */
    int insertSelective(GradeTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_teacher
     *
     * @mbggenerated
     */
    GradeTeacher selectByPrimaryKey(Integer gradeTeacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_teacher
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GradeTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_teacher
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GradeTeacher record);
}