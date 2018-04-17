package org.arain.power.common.pojo.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLogHandleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLogHandleExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Long value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Long value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Long value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Long value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Long value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Long> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Long> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Long value1, Long value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Long value1, Long value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("LOG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("LOG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("LOG_TIME =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("LOG_TIME <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("LOG_TIME >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOG_TIME >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("LOG_TIME <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOG_TIME <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("LOG_TIME in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("LOG_TIME not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("LOG_TIME between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOG_TIME not between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogUserIsNull() {
            addCriterion("LOG_USER is null");
            return (Criteria) this;
        }

        public Criteria andLogUserIsNotNull() {
            addCriterion("LOG_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLogUserEqualTo(String value) {
            addCriterion("LOG_USER =", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotEqualTo(String value) {
            addCriterion("LOG_USER <>", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserGreaterThan(String value) {
            addCriterion("LOG_USER >", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_USER >=", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLessThan(String value) {
            addCriterion("LOG_USER <", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLessThanOrEqualTo(String value) {
            addCriterion("LOG_USER <=", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLike(String value) {
            addCriterion("LOG_USER like", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotLike(String value) {
            addCriterion("LOG_USER not like", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserIn(List<String> values) {
            addCriterion("LOG_USER in", values, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotIn(List<String> values) {
            addCriterion("LOG_USER not in", values, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserBetween(String value1, String value2) {
            addCriterion("LOG_USER between", value1, value2, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotBetween(String value1, String value2) {
            addCriterion("LOG_USER not between", value1, value2, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUrlIsNull() {
            addCriterion("LOG_URL is null");
            return (Criteria) this;
        }

        public Criteria andLogUrlIsNotNull() {
            addCriterion("LOG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLogUrlEqualTo(String value) {
            addCriterion("LOG_URL =", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotEqualTo(String value) {
            addCriterion("LOG_URL <>", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlGreaterThan(String value) {
            addCriterion("LOG_URL >", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_URL >=", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLessThan(String value) {
            addCriterion("LOG_URL <", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLessThanOrEqualTo(String value) {
            addCriterion("LOG_URL <=", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLike(String value) {
            addCriterion("LOG_URL like", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotLike(String value) {
            addCriterion("LOG_URL not like", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlIn(List<String> values) {
            addCriterion("LOG_URL in", values, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotIn(List<String> values) {
            addCriterion("LOG_URL not in", values, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlBetween(String value1, String value2) {
            addCriterion("LOG_URL between", value1, value2, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotBetween(String value1, String value2) {
            addCriterion("LOG_URL not between", value1, value2, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogSuccessIsNull() {
            addCriterion("LOG_SUCCESS is null");
            return (Criteria) this;
        }

        public Criteria andLogSuccessIsNotNull() {
            addCriterion("LOG_SUCCESS is not null");
            return (Criteria) this;
        }

        public Criteria andLogSuccessEqualTo(String value) {
            addCriterion("LOG_SUCCESS =", value, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessNotEqualTo(String value) {
            addCriterion("LOG_SUCCESS <>", value, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessGreaterThan(String value) {
            addCriterion("LOG_SUCCESS >", value, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_SUCCESS >=", value, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessLessThan(String value) {
            addCriterion("LOG_SUCCESS <", value, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessLessThanOrEqualTo(String value) {
            addCriterion("LOG_SUCCESS <=", value, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessLike(String value) {
            addCriterion("LOG_SUCCESS like", value, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessNotLike(String value) {
            addCriterion("LOG_SUCCESS not like", value, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessIn(List<String> values) {
            addCriterion("LOG_SUCCESS in", values, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessNotIn(List<String> values) {
            addCriterion("LOG_SUCCESS not in", values, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessBetween(String value1, String value2) {
            addCriterion("LOG_SUCCESS between", value1, value2, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogSuccessNotBetween(String value1, String value2) {
            addCriterion("LOG_SUCCESS not between", value1, value2, "logSuccess");
            return (Criteria) this;
        }

        public Criteria andLogExceptionIsNull() {
            addCriterion("LOG_EXCEPTION is null");
            return (Criteria) this;
        }

        public Criteria andLogExceptionIsNotNull() {
            addCriterion("LOG_EXCEPTION is not null");
            return (Criteria) this;
        }

        public Criteria andLogExceptionEqualTo(String value) {
            addCriterion("LOG_EXCEPTION =", value, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionNotEqualTo(String value) {
            addCriterion("LOG_EXCEPTION <>", value, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionGreaterThan(String value) {
            addCriterion("LOG_EXCEPTION >", value, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_EXCEPTION >=", value, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionLessThan(String value) {
            addCriterion("LOG_EXCEPTION <", value, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionLessThanOrEqualTo(String value) {
            addCriterion("LOG_EXCEPTION <=", value, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionLike(String value) {
            addCriterion("LOG_EXCEPTION like", value, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionNotLike(String value) {
            addCriterion("LOG_EXCEPTION not like", value, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionIn(List<String> values) {
            addCriterion("LOG_EXCEPTION in", values, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionNotIn(List<String> values) {
            addCriterion("LOG_EXCEPTION not in", values, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionBetween(String value1, String value2) {
            addCriterion("LOG_EXCEPTION between", value1, value2, "logException");
            return (Criteria) this;
        }

        public Criteria andLogExceptionNotBetween(String value1, String value2) {
            addCriterion("LOG_EXCEPTION not between", value1, value2, "logException");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNull() {
            addCriterion("LOG_IP is null");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNotNull() {
            addCriterion("LOG_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLogIpEqualTo(String value) {
            addCriterion("LOG_IP =", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotEqualTo(String value) {
            addCriterion("LOG_IP <>", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThan(String value) {
            addCriterion("LOG_IP >", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_IP >=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThan(String value) {
            addCriterion("LOG_IP <", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThanOrEqualTo(String value) {
            addCriterion("LOG_IP <=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLike(String value) {
            addCriterion("LOG_IP like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotLike(String value) {
            addCriterion("LOG_IP not like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpIn(List<String> values) {
            addCriterion("LOG_IP in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotIn(List<String> values) {
            addCriterion("LOG_IP not in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpBetween(String value1, String value2) {
            addCriterion("LOG_IP between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotBetween(String value1, String value2) {
            addCriterion("LOG_IP not between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogDescIsNull() {
            addCriterion("LOG_DESC is null");
            return (Criteria) this;
        }

        public Criteria andLogDescIsNotNull() {
            addCriterion("LOG_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andLogDescEqualTo(String value) {
            addCriterion("LOG_DESC =", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescNotEqualTo(String value) {
            addCriterion("LOG_DESC <>", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescGreaterThan(String value) {
            addCriterion("LOG_DESC >", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_DESC >=", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescLessThan(String value) {
            addCriterion("LOG_DESC <", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescLessThanOrEqualTo(String value) {
            addCriterion("LOG_DESC <=", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescLike(String value) {
            addCriterion("LOG_DESC like", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescNotLike(String value) {
            addCriterion("LOG_DESC not like", value, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescIn(List<String> values) {
            addCriterion("LOG_DESC in", values, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescNotIn(List<String> values) {
            addCriterion("LOG_DESC not in", values, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescBetween(String value1, String value2) {
            addCriterion("LOG_DESC between", value1, value2, "logDesc");
            return (Criteria) this;
        }

        public Criteria andLogDescNotBetween(String value1, String value2) {
            addCriterion("LOG_DESC not between", value1, value2, "logDesc");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("ORGID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Long value) {
            addCriterion("ORGID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Long value) {
            addCriterion("ORGID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Long value) {
            addCriterion("ORGID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Long value) {
            addCriterion("ORGID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Long value) {
            addCriterion("ORGID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Long value) {
            addCriterion("ORGID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Long> values) {
            addCriterion("ORGID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Long> values) {
            addCriterion("ORGID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Long value1, Long value2) {
            addCriterion("ORGID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Long value1, Long value2) {
            addCriterion("ORGID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andLogMethedIsNull() {
            addCriterion("LOG_METHED is null");
            return (Criteria) this;
        }

        public Criteria andLogMethedIsNotNull() {
            addCriterion("LOG_METHED is not null");
            return (Criteria) this;
        }

        public Criteria andLogMethedEqualTo(String value) {
            addCriterion("LOG_METHED =", value, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedNotEqualTo(String value) {
            addCriterion("LOG_METHED <>", value, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedGreaterThan(String value) {
            addCriterion("LOG_METHED >", value, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_METHED >=", value, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedLessThan(String value) {
            addCriterion("LOG_METHED <", value, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedLessThanOrEqualTo(String value) {
            addCriterion("LOG_METHED <=", value, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedLike(String value) {
            addCriterion("LOG_METHED like", value, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedNotLike(String value) {
            addCriterion("LOG_METHED not like", value, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedIn(List<String> values) {
            addCriterion("LOG_METHED in", values, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedNotIn(List<String> values) {
            addCriterion("LOG_METHED not in", values, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedBetween(String value1, String value2) {
            addCriterion("LOG_METHED between", value1, value2, "logMethed");
            return (Criteria) this;
        }

        public Criteria andLogMethedNotBetween(String value1, String value2) {
            addCriterion("LOG_METHED not between", value1, value2, "logMethed");
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