package sei.tk.service.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sei.tk.service.dao.model.TkMkpaperrule;
import sei.tk.service.dao.model.TkMkpaperruleExample;

public interface TkMkpaperruleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    int countByExample(TkMkpaperruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    int deleteByExample(TkMkpaperruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    int deleteByPrimaryKey(Long mkpaperruleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    int insert(TkMkpaperrule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    int insertSelective(TkMkpaperrule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    List<TkMkpaperrule> selectByExample(TkMkpaperruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    TkMkpaperrule selectByPrimaryKey(Long mkpaperruleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    int updateByExampleSelective(@Param("record") TkMkpaperrule record, @Param("example") TkMkpaperruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    int updateByExample(@Param("record") TkMkpaperrule record, @Param("example") TkMkpaperruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    int updateByPrimaryKeySelective(TkMkpaperrule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_mkpaperrule
     *
     * @mbggenerated Sat Apr 09 17:02:39 CST 2016
     */
    int updateByPrimaryKey(TkMkpaperrule record);

    int deletebymkpaperid(Long mkpaperId );
}