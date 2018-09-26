package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlarmDisposalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmDisposalInfoExample() {
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

        public Criteria andDisposalMethodIdIsNull() {
            addCriterion("disposal_method_id is null");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdIsNotNull() {
            addCriterion("disposal_method_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdEqualTo(Integer value) {
            addCriterion("disposal_method_id =", value, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdNotEqualTo(Integer value) {
            addCriterion("disposal_method_id <>", value, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdGreaterThan(Integer value) {
            addCriterion("disposal_method_id >", value, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("disposal_method_id >=", value, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdLessThan(Integer value) {
            addCriterion("disposal_method_id <", value, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("disposal_method_id <=", value, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdIn(List<Integer> values) {
            addCriterion("disposal_method_id in", values, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdNotIn(List<Integer> values) {
            addCriterion("disposal_method_id not in", values, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("disposal_method_id between", value1, value2, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("disposal_method_id not between", value1, value2, "disposalMethodId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIsNull() {
            addCriterion("alarm_id is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIsNotNull() {
            addCriterion("alarm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdEqualTo(Integer value) {
            addCriterion("alarm_id =", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotEqualTo(Integer value) {
            addCriterion("alarm_id <>", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThan(Integer value) {
            addCriterion("alarm_id >", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_id >=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThan(Integer value) {
            addCriterion("alarm_id <", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_id <=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIn(List<Integer> values) {
            addCriterion("alarm_id in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotIn(List<Integer> values) {
            addCriterion("alarm_id not in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdBetween(Integer value1, Integer value2) {
            addCriterion("alarm_id between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_id not between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusIsNull() {
            addCriterion("disposal_status is null");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusIsNotNull() {
            addCriterion("disposal_status is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusEqualTo(Integer value) {
            addCriterion("disposal_status =", value, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusNotEqualTo(Integer value) {
            addCriterion("disposal_status <>", value, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusGreaterThan(Integer value) {
            addCriterion("disposal_status >", value, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("disposal_status >=", value, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusLessThan(Integer value) {
            addCriterion("disposal_status <", value, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("disposal_status <=", value, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusIn(List<Integer> values) {
            addCriterion("disposal_status in", values, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusNotIn(List<Integer> values) {
            addCriterion("disposal_status not in", values, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusBetween(Integer value1, Integer value2) {
            addCriterion("disposal_status between", value1, value2, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("disposal_status not between", value1, value2, "disposalStatus");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeIsNull() {
            addCriterion("disposal_time is null");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeIsNotNull() {
            addCriterion("disposal_time is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeEqualTo(Date value) {
            addCriterion("disposal_time =", value, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeNotEqualTo(Date value) {
            addCriterion("disposal_time <>", value, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeGreaterThan(Date value) {
            addCriterion("disposal_time >", value, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("disposal_time >=", value, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeLessThan(Date value) {
            addCriterion("disposal_time <", value, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeLessThanOrEqualTo(Date value) {
            addCriterion("disposal_time <=", value, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeIn(List<Date> values) {
            addCriterion("disposal_time in", values, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeNotIn(List<Date> values) {
            addCriterion("disposal_time not in", values, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeBetween(Date value1, Date value2) {
            addCriterion("disposal_time between", value1, value2, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andDisposalTimeNotBetween(Date value1, Date value2) {
            addCriterion("disposal_time not between", value1, value2, "disposalTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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