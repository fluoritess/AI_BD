package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class SensorTypeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SensorTypeInfoExample() {
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

        public Criteria andSensorTypeIdIsNull() {
            addCriterion("sensor_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdIsNotNull() {
            addCriterion("sensor_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdEqualTo(Integer value) {
            addCriterion("sensor_type_id =", value, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdNotEqualTo(Integer value) {
            addCriterion("sensor_type_id <>", value, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdGreaterThan(Integer value) {
            addCriterion("sensor_type_id >", value, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sensor_type_id >=", value, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdLessThan(Integer value) {
            addCriterion("sensor_type_id <", value, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sensor_type_id <=", value, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdIn(List<Integer> values) {
            addCriterion("sensor_type_id in", values, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdNotIn(List<Integer> values) {
            addCriterion("sensor_type_id not in", values, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sensor_type_id between", value1, value2, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sensor_type_id not between", value1, value2, "sensorTypeId");
            return (Criteria) this;
        }

        public Criteria andSensorNameIsNull() {
            addCriterion("sensor_name is null");
            return (Criteria) this;
        }

        public Criteria andSensorNameIsNotNull() {
            addCriterion("sensor_name is not null");
            return (Criteria) this;
        }

        public Criteria andSensorNameEqualTo(String value) {
            addCriterion("sensor_name =", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameNotEqualTo(String value) {
            addCriterion("sensor_name <>", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameGreaterThan(String value) {
            addCriterion("sensor_name >", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameGreaterThanOrEqualTo(String value) {
            addCriterion("sensor_name >=", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameLessThan(String value) {
            addCriterion("sensor_name <", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameLessThanOrEqualTo(String value) {
            addCriterion("sensor_name <=", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameLike(String value) {
            addCriterion("sensor_name like", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameNotLike(String value) {
            addCriterion("sensor_name not like", value, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameIn(List<String> values) {
            addCriterion("sensor_name in", values, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameNotIn(List<String> values) {
            addCriterion("sensor_name not in", values, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameBetween(String value1, String value2) {
            addCriterion("sensor_name between", value1, value2, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorNameNotBetween(String value1, String value2) {
            addCriterion("sensor_name not between", value1, value2, "sensorName");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkIsNull() {
            addCriterion("sensor_funcation_remark is null");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkIsNotNull() {
            addCriterion("sensor_funcation_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkEqualTo(String value) {
            addCriterion("sensor_funcation_remark =", value, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkNotEqualTo(String value) {
            addCriterion("sensor_funcation_remark <>", value, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkGreaterThan(String value) {
            addCriterion("sensor_funcation_remark >", value, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sensor_funcation_remark >=", value, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkLessThan(String value) {
            addCriterion("sensor_funcation_remark <", value, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkLessThanOrEqualTo(String value) {
            addCriterion("sensor_funcation_remark <=", value, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkLike(String value) {
            addCriterion("sensor_funcation_remark like", value, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkNotLike(String value) {
            addCriterion("sensor_funcation_remark not like", value, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkIn(List<String> values) {
            addCriterion("sensor_funcation_remark in", values, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkNotIn(List<String> values) {
            addCriterion("sensor_funcation_remark not in", values, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkBetween(String value1, String value2) {
            addCriterion("sensor_funcation_remark between", value1, value2, "sensorFuncationRemark");
            return (Criteria) this;
        }

        public Criteria andSensorFuncationRemarkNotBetween(String value1, String value2) {
            addCriterion("sensor_funcation_remark not between", value1, value2, "sensorFuncationRemark");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
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