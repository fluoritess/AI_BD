package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipmentDeployInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentDeployInfoExample() {
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

        public Criteria andEquipmentDeployIdIsNull() {
            addCriterion("equipment_deploy_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdIsNotNull() {
            addCriterion("equipment_deploy_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdEqualTo(Integer value) {
            addCriterion("equipment_deploy_id =", value, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdNotEqualTo(Integer value) {
            addCriterion("equipment_deploy_id <>", value, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdGreaterThan(Integer value) {
            addCriterion("equipment_deploy_id >", value, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_deploy_id >=", value, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdLessThan(Integer value) {
            addCriterion("equipment_deploy_id <", value, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_deploy_id <=", value, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdIn(List<Integer> values) {
            addCriterion("equipment_deploy_id in", values, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdNotIn(List<Integer> values) {
            addCriterion("equipment_deploy_id not in", values, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdBetween(Integer value1, Integer value2) {
            addCriterion("equipment_deploy_id between", value1, value2, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDeployIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_deploy_id not between", value1, value2, "equipmentDeployId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(Integer value) {
            addCriterion("equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(Integer value) {
            addCriterion("equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(Integer value) {
            addCriterion("equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(Integer value) {
            addCriterion("equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<Integer> values) {
            addCriterion("equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<Integer> values) {
            addCriterion("equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdIsNull() {
            addCriterion("deploy_node_id is null");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdIsNotNull() {
            addCriterion("deploy_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdEqualTo(Integer value) {
            addCriterion("deploy_node_id =", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdNotEqualTo(Integer value) {
            addCriterion("deploy_node_id <>", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdGreaterThan(Integer value) {
            addCriterion("deploy_node_id >", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deploy_node_id >=", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdLessThan(Integer value) {
            addCriterion("deploy_node_id <", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("deploy_node_id <=", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdIn(List<Integer> values) {
            addCriterion("deploy_node_id in", values, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdNotIn(List<Integer> values) {
            addCriterion("deploy_node_id not in", values, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdBetween(Integer value1, Integer value2) {
            addCriterion("deploy_node_id between", value1, value2, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deploy_node_id not between", value1, value2, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployTimeIsNull() {
            addCriterion("deploy_time is null");
            return (Criteria) this;
        }

        public Criteria andDeployTimeIsNotNull() {
            addCriterion("deploy_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeployTimeEqualTo(Date value) {
            addCriterion("deploy_time =", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeNotEqualTo(Date value) {
            addCriterion("deploy_time <>", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeGreaterThan(Date value) {
            addCriterion("deploy_time >", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deploy_time >=", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeLessThan(Date value) {
            addCriterion("deploy_time <", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeLessThanOrEqualTo(Date value) {
            addCriterion("deploy_time <=", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeIn(List<Date> values) {
            addCriterion("deploy_time in", values, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeNotIn(List<Date> values) {
            addCriterion("deploy_time not in", values, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeBetween(Date value1, Date value2) {
            addCriterion("deploy_time between", value1, value2, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeNotBetween(Date value1, Date value2) {
            addCriterion("deploy_time not between", value1, value2, "deployTime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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