package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.TestPaper;

public interface TestPaperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_paper
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer testPaperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_paper
     *
     * @mbggenerated
     */
    int insert(TestPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_paper
     *
     * @mbggenerated
     */
    int insertSelective(TestPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_paper
     *
     * @mbggenerated
     */
    TestPaper selectByPrimaryKey(Integer testPaperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_paper
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TestPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_paper
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TestPaper record);
}