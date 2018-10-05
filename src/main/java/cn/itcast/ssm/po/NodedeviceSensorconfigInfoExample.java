package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class NodedeviceSensorconfigInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodedeviceSensorconfigInfoExample() {
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

        public Criteria andSensorIdIsNull() {
            addCriterion("sensor_id is null");
            return (Criteria) this;
        }

        public Criteria andSensorIdIsNotNull() {
            addCriterion("sensor_id is not null");
            return (Criteria) this;
        }

        public Criteria andSensorIdEqualTo(Integer value) {
            addCriterion("sensor_id =", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotEqualTo(Integer value) {
            addCriterion("sensor_id <>", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdGreaterThan(Integer value) {
            addCriterion("sensor_id >", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sensor_id >=", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdLessThan(Integer value) {
            addCriterion("sensor_id <", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdLessThanOrEqualTo(Integer value) {
            addCriterion("sensor_id <=", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdIn(List<Integer> values) {
            addCriterion("sensor_id in", values, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotIn(List<Integer> values) {
            addCriterion("sensor_id not in", values, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdBetween(Integer value1, Integer value2) {
            addCriterion("sensor_id between", value1, value2, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sensor_id not between", value1, value2, "sensorId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
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

        public Criteria andSensorPositionIsNull() {
            addCriterion("sensor_position is null");
            return (Criteria) this;
        }

        public Criteria andSensorPositionIsNotNull() {
            addCriterion("sensor_position is not null");
            return (Criteria) this;
        }

        public Criteria andSensorPositionEqualTo(String value) {
            addCriterion("sensor_position =", value, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionNotEqualTo(String value) {
            addCriterion("sensor_position <>", value, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionGreaterThan(String value) {
            addCriterion("sensor_position >", value, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionGreaterThanOrEqualTo(String value) {
            addCriterion("sensor_position >=", value, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionLessThan(String value) {
            addCriterion("sensor_position <", value, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionLessThanOrEqualTo(String value) {
            addCriterion("sensor_position <=", value, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionLike(String value) {
            addCriterion("sensor_position like", value, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionNotLike(String value) {
            addCriterion("sensor_position not like", value, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionIn(List<String> values) {
            addCriterion("sensor_position in", values, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionNotIn(List<String> values) {
            addCriterion("sensor_position not in", values, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionBetween(String value1, String value2) {
            addCriterion("sensor_position between", value1, value2, "sensorPosition");
            return (Criteria) this;
        }

        public Criteria andSensorPositionNotBetween(String value1, String value2) {
            addCriterion("sensor_position not between", value1, value2, "sensorPosition");
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