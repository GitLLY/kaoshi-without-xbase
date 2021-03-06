package sei.tk.service.dao.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class TkMkpaper {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tk_mkpaper.mkpaper_id
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    private Long mkpaperId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tk_mkpaper.course_id
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    private Short courseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tk_mkpaper.mkpaper_term
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    private String mkpaperTerm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tk_mkpaper.mkpaper_extime
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    private Short mkpaperExtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tk_mkpaper.mkpaper_score
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    private Short mkpaperScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tk_mkpaper.mkpaper_type
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    private Boolean mkpaperType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tk_mkpaper.ppassport_id
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    private Long ppassportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tk_mkpaper.ppassport_time
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    private Date ppassportTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tk_mkpaper.paper_name
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    private String paperName;


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tk_mkpaper.mkpaper_id
     *
     * @return the value of tk_mkpaper.mkpaper_id
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public Long getMkpaperId() {
        return mkpaperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tk_mkpaper.mkpaper_id
     *
     * @param mkpaperId the value for tk_mkpaper.mkpaper_id
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public void setMkpaperId(Long mkpaperId) {
        this.mkpaperId = mkpaperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tk_mkpaper.course_id
     *
     * @return the value of tk_mkpaper.course_id
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public Short getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tk_mkpaper.course_id
     *
     * @param courseId the value for tk_mkpaper.course_id
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public void setCourseId(Short courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tk_mkpaper.mkpaper_term
     *
     * @return the value of tk_mkpaper.mkpaper_term
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public String getMkpaperTerm() {
        return mkpaperTerm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tk_mkpaper.mkpaper_term
     *
     * @param mkpaperTerm the value for tk_mkpaper.mkpaper_term
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    public void setMkpaperTerm(String mkpaperTerm) {
        this.mkpaperTerm = mkpaperTerm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tk_mkpaper.mkpaper_extime
     *
     * @return the value of tk_mkpaper.mkpaper_extime
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public Short getMkpaperExtime() {
        return mkpaperExtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tk_mkpaper.mkpaper_extime
     *
     * @param mkpaperExtime the value for tk_mkpaper.mkpaper_extime
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    public void setMkpaperExtime(Short mkpaperExtime) {
        this.mkpaperExtime = mkpaperExtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tk_mkpaper.mkpaper_score
     *
     * @return the value of tk_mkpaper.mkpaper_score
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public Short getMkpaperScore() {
        return mkpaperScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tk_mkpaper.mkpaper_score
     *
     * @param mkpaperScore the value for tk_mkpaper.mkpaper_score
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public void setMkpaperScore(Short mkpaperScore) {
        this.mkpaperScore = mkpaperScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tk_mkpaper.mkpaper_type
     *
     * @return the value of tk_mkpaper.mkpaper_type
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public Boolean getMkpaperType() {
        return mkpaperType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tk_mkpaper.mkpaper_type
     *
     * @param mkpaperType the value for tk_mkpaper.mkpaper_type
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public void setMkpaperType(Boolean mkpaperType) {
        this.mkpaperType = mkpaperType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tk_mkpaper.ppassport_id
     *
     * @return the value of tk_mkpaper.ppassport_id
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public Long getPpassportId() {
        return ppassportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tk_mkpaper.ppassport_id
     *
     * @param ppassportId the value for tk_mkpaper.ppassport_id
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    public void setPpassportId(Long ppassportId) {
        this.ppassportId = ppassportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tk_mkpaper.ppassport_time
     *
     * @return the value of tk_mkpaper.ppassport_time
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public Date getPpassportTime() {
        return ppassportTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tk_mkpaper.ppassport_time
     *
     * @param ppassportTime the value for tk_mkpaper.ppassport_time
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */


    public void setPpassportTime(Date ppassportTime) {
        this.ppassportTime = ppassportTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tk_mkpaper.paper_name
     *
     * @return the value of tk_mkpaper.paper_name
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */
    public String getPaperName() {
        return paperName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tk_mkpaper.paper_name
     *
     * @param paperName the value for tk_mkpaper.paper_name
     *
     * @mbggenerated Tue Apr 12 20:45:29 CST 2016
     */

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }
}