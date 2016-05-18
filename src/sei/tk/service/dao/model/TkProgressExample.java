package sei.tk.service.dao.model;

import java.util.ArrayList;
import java.util.List;

public class TkProgressExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public TkProgressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProUuidIsNull() {
            addCriterion("pro_uuid is null");
            return (Criteria) this;
        }

        public Criteria andProUuidIsNotNull() {
            addCriterion("pro_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andProUuidEqualTo(Long value) {
            addCriterion("pro_uuid =", value, "proUuid");
            return (Criteria) this;
        }

        public Criteria andProUuidNotEqualTo(Long value) {
            addCriterion("pro_uuid <>", value, "proUuid");
            return (Criteria) this;
        }

        public Criteria andProUuidGreaterThan(Long value) {
            addCriterion("pro_uuid >", value, "proUuid");
            return (Criteria) this;
        }

        public Criteria andProUuidGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_uuid >=", value, "proUuid");
            return (Criteria) this;
        }

        public Criteria andProUuidLessThan(Long value) {
            addCriterion("pro_uuid <", value, "proUuid");
            return (Criteria) this;
        }

        public Criteria andProUuidLessThanOrEqualTo(Long value) {
            addCriterion("pro_uuid <=", value, "proUuid");
            return (Criteria) this;
        }

        public Criteria andProUuidIn(List<Long> values) {
            addCriterion("pro_uuid in", values, "proUuid");
            return (Criteria) this;
        }

        public Criteria andProUuidNotIn(List<Long> values) {
            addCriterion("pro_uuid not in", values, "proUuid");
            return (Criteria) this;
        }

        public Criteria andProUuidBetween(Long value1, Long value2) {
            addCriterion("pro_uuid between", value1, value2, "proUuid");
            return (Criteria) this;
        }

        public Criteria andProUuidNotBetween(Long value1, Long value2) {
            addCriterion("pro_uuid not between", value1, value2, "proUuid");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Long value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Long value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Long value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Long value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Long value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Long> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Long> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Long value1, Long value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Long value1, Long value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Short value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Short value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Short value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Short value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Short value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Short value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Short> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Short> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Short value1, Short value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Short value1, Short value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andProCourseIsNull() {
            addCriterion("pro_course is null");
            return (Criteria) this;
        }

        public Criteria andProCourseIsNotNull() {
            addCriterion("pro_course is not null");
            return (Criteria) this;
        }

        public Criteria andProCourseEqualTo(Byte value) {
            addCriterion("pro_course =", value, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProCourseNotEqualTo(Byte value) {
            addCriterion("pro_course <>", value, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProCourseGreaterThan(Byte value) {
            addCriterion("pro_course >", value, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProCourseGreaterThanOrEqualTo(Byte value) {
            addCriterion("pro_course >=", value, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProCourseLessThan(Byte value) {
            addCriterion("pro_course <", value, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProCourseLessThanOrEqualTo(Byte value) {
            addCriterion("pro_course <=", value, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProCourseIn(List<Byte> values) {
            addCriterion("pro_course in", values, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProCourseNotIn(List<Byte> values) {
            addCriterion("pro_course not in", values, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProCourseBetween(Byte value1, Byte value2) {
            addCriterion("pro_course between", value1, value2, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProCourseNotBetween(Byte value1, Byte value2) {
            addCriterion("pro_course not between", value1, value2, "proCourse");
            return (Criteria) this;
        }

        public Criteria andProChapterIsNull() {
            addCriterion("pro_chapter is null");
            return (Criteria) this;
        }

        public Criteria andProChapterIsNotNull() {
            addCriterion("pro_chapter is not null");
            return (Criteria) this;
        }

        public Criteria andProChapterEqualTo(String value) {
            addCriterion("pro_chapter =", value, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterNotEqualTo(String value) {
            addCriterion("pro_chapter <>", value, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterGreaterThan(String value) {
            addCriterion("pro_chapter >", value, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterGreaterThanOrEqualTo(String value) {
            addCriterion("pro_chapter >=", value, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterLessThan(String value) {
            addCriterion("pro_chapter <", value, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterLessThanOrEqualTo(String value) {
            addCriterion("pro_chapter <=", value, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterLike(String value) {
            addCriterion("pro_chapter like", value, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterNotLike(String value) {
            addCriterion("pro_chapter not like", value, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterIn(List<String> values) {
            addCriterion("pro_chapter in", values, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterNotIn(List<String> values) {
            addCriterion("pro_chapter not in", values, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterBetween(String value1, String value2) {
            addCriterion("pro_chapter between", value1, value2, "proChapter");
            return (Criteria) this;
        }

        public Criteria andProChapterNotBetween(String value1, String value2) {
            addCriterion("pro_chapter not between", value1, value2, "proChapter");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tk_progress
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 23 12:38:48 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tk_progress
     *
     * @mbggenerated Wed Mar 23 12:38:48 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}