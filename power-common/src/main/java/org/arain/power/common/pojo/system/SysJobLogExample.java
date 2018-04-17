package org.arain.power.common.pojo.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysJobLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysJobLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("ID_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JOB_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JOB_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Long value) {
            addCriterion("JOB_ID_ =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Long value) {
            addCriterion("JOB_ID_ <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Long value) {
            addCriterion("JOB_ID_ >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("JOB_ID_ >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Long value) {
            addCriterion("JOB_ID_ <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Long value) {
            addCriterion("JOB_ID_ <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Long> values) {
            addCriterion("JOB_ID_ in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Long> values) {
            addCriterion("JOB_ID_ not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Long value1, Long value2) {
            addCriterion("JOB_ID_ between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Long value1, Long value2) {
            addCriterion("JOB_ID_ not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingIsNull() {
            addCriterion("TIME_CONSUMING is null");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingIsNotNull() {
            addCriterion("TIME_CONSUMING is not null");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingEqualTo(String value) {
            addCriterion("TIME_CONSUMING =", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotEqualTo(String value) {
            addCriterion("TIME_CONSUMING <>", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingGreaterThan(String value) {
            addCriterion("TIME_CONSUMING >", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_CONSUMING >=", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingLessThan(String value) {
            addCriterion("TIME_CONSUMING <", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingLessThanOrEqualTo(String value) {
            addCriterion("TIME_CONSUMING <=", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingLike(String value) {
            addCriterion("TIME_CONSUMING like", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotLike(String value) {
            addCriterion("TIME_CONSUMING not like", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingIn(List<String> values) {
            addCriterion("TIME_CONSUMING in", values, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotIn(List<String> values) {
            addCriterion("TIME_CONSUMING not in", values, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingBetween(String value1, String value2) {
            addCriterion("TIME_CONSUMING between", value1, value2, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotBetween(String value1, String value2) {
            addCriterion("TIME_CONSUMING not between", value1, value2, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andJobSuccessIsNull() {
            addCriterion("JOB_SUCCESS is null");
            return (Criteria) this;
        }

        public Criteria andJobSuccessIsNotNull() {
            addCriterion("JOB_SUCCESS is not null");
            return (Criteria) this;
        }

        public Criteria andJobSuccessEqualTo(Long value) {
            addCriterion("JOB_SUCCESS =", value, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobSuccessNotEqualTo(Long value) {
            addCriterion("JOB_SUCCESS <>", value, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobSuccessGreaterThan(Long value) {
            addCriterion("JOB_SUCCESS >", value, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobSuccessGreaterThanOrEqualTo(Long value) {
            addCriterion("JOB_SUCCESS >=", value, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobSuccessLessThan(Long value) {
            addCriterion("JOB_SUCCESS <", value, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobSuccessLessThanOrEqualTo(Long value) {
            addCriterion("JOB_SUCCESS <=", value, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobSuccessIn(List<Long> values) {
            addCriterion("JOB_SUCCESS in", values, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobSuccessNotIn(List<Long> values) {
            addCriterion("JOB_SUCCESS not in", values, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobSuccessBetween(Long value1, Long value2) {
            addCriterion("JOB_SUCCESS between", value1, value2, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobSuccessNotBetween(Long value1, Long value2) {
            addCriterion("JOB_SUCCESS not between", value1, value2, "jobSuccess");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnIsNull() {
            addCriterion("JOB_EXCEPTIPN is null");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnIsNotNull() {
            addCriterion("JOB_EXCEPTIPN is not null");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnEqualTo(String value) {
            addCriterion("JOB_EXCEPTIPN =", value, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnNotEqualTo(String value) {
            addCriterion("JOB_EXCEPTIPN <>", value, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnGreaterThan(String value) {
            addCriterion("JOB_EXCEPTIPN >", value, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_EXCEPTIPN >=", value, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnLessThan(String value) {
            addCriterion("JOB_EXCEPTIPN <", value, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnLessThanOrEqualTo(String value) {
            addCriterion("JOB_EXCEPTIPN <=", value, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnLike(String value) {
            addCriterion("JOB_EXCEPTIPN like", value, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnNotLike(String value) {
            addCriterion("JOB_EXCEPTIPN not like", value, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnIn(List<String> values) {
            addCriterion("JOB_EXCEPTIPN in", values, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnNotIn(List<String> values) {
            addCriterion("JOB_EXCEPTIPN not in", values, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnBetween(String value1, String value2) {
            addCriterion("JOB_EXCEPTIPN between", value1, value2, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andJobExceptipnNotBetween(String value1, String value2) {
            addCriterion("JOB_EXCEPTIPN not between", value1, value2, "jobExceptipn");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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