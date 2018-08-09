package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class EquipmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentInfoExample() {
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

        public Criteria andEquipmentTypeIdIsNull() {
            addCriterion("equipment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdIsNotNull() {
            addCriterion("equipment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdEqualTo(Integer value) {
            addCriterion("equipment_type_id =", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdNotEqualTo(Integer value) {
            addCriterion("equipment_type_id <>", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdGreaterThan(Integer value) {
            addCriterion("equipment_type_id >", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_type_id >=", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdLessThan(Integer value) {
            addCriterion("equipment_type_id <", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_type_id <=", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdIn(List<Integer> values) {
            addCriterion("equipment_type_id in", values, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdNotIn(List<Integer> values) {
            addCriterion("equipment_type_id not in", values, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("equipment_type_id between", value1, value2, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_type_id not between", value1, value2, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNull() {
            addCriterion("equipment_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNotNull() {
            addCriterion("equipment_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameEqualTo(String value) {
            addCriterion("equipment_name =", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotEqualTo(String value) {
            addCriterion("equipment_name <>", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThan(String value) {
            addCriterion("equipment_name >", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_name >=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThan(String value) {
            addCriterion("equipment_name <", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
            addCriterion("equipment_name <=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLike(String value) {
            addCriterion("equipment_name like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotLike(String value) {
            addCriterion("equipment_name not like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIn(List<String> values) {
            addCriterion("equipment_name in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotIn(List<String> values) {
            addCriterion("equipment_name not in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameBetween(String value1, String value2) {
            addCriterion("equipment_name between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotBetween(String value1, String value2) {
            addCriterion("equipment_name not between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateIsNull() {
            addCriterion("equipment_work_state is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateIsNotNull() {
            addCriterion("equipment_work_state is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateEqualTo(String value) {
            addCriterion("equipment_work_state =", value, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateNotEqualTo(String value) {
            addCriterion("equipment_work_state <>", value, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateGreaterThan(String value) {
            addCriterion("equipment_work_state >", value, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_work_state >=", value, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateLessThan(String value) {
            addCriterion("equipment_work_state <", value, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateLessThanOrEqualTo(String value) {
            addCriterion("equipment_work_state <=", value, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateLike(String value) {
            addCriterion("equipment_work_state like", value, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateNotLike(String value) {
            addCriterion("equipment_work_state not like", value, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateIn(List<String> values) {
            addCriterion("equipment_work_state in", values, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateNotIn(List<String> values) {
            addCriterion("equipment_work_state not in", values, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateBetween(String value1, String value2) {
            addCriterion("equipment_work_state between", value1, value2, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentWorkStateNotBetween(String value1, String value2) {
            addCriterion("equipment_work_state not between", value1, value2, "equipmentWorkState");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckIsNull() {
            addCriterion("equipment_check is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckIsNotNull() {
            addCriterion("equipment_check is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckEqualTo(Integer value) {
            addCriterion("equipment_check =", value, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckNotEqualTo(Integer value) {
            addCriterion("equipment_check <>", value, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckGreaterThan(Integer value) {
            addCriterion("equipment_check >", value, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_check >=", value, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckLessThan(Integer value) {
            addCriterion("equipment_check <", value, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_check <=", value, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckIn(List<Integer> values) {
            addCriterion("equipment_check in", values, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckNotIn(List<Integer> values) {
            addCriterion("equipment_check not in", values, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckBetween(Integer value1, Integer value2) {
            addCriterion("equipment_check between", value1, value2, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andEquipmentCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_check not between", value1, value2, "equipmentCheck");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdIsNull() {
            addCriterion("control_type_id is null");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdIsNotNull() {
            addCriterion("control_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdEqualTo(Integer value) {
            addCriterion("control_type_id =", value, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdNotEqualTo(Integer value) {
            addCriterion("control_type_id <>", value, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdGreaterThan(Integer value) {
            addCriterion("control_type_id >", value, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("control_type_id >=", value, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdLessThan(Integer value) {
            addCriterion("control_type_id <", value, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("control_type_id <=", value, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdIn(List<Integer> values) {
            addCriterion("control_type_id in", values, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdNotIn(List<Integer> values) {
            addCriterion("control_type_id not in", values, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("control_type_id between", value1, value2, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andControlTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("control_type_id not between", value1, value2, "controlTypeId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNull() {
            addCriterion("manufacturer_id is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNotNull() {
            addCriterion("manufacturer_id is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdEqualTo(Integer value) {
            addCriterion("manufacturer_id =", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotEqualTo(Integer value) {
            addCriterion("manufacturer_id <>", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThan(Integer value) {
            addCriterion("manufacturer_id >", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manufacturer_id >=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThan(Integer value) {
            addCriterion("manufacturer_id <", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manufacturer_id <=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIn(List<Integer> values) {
            addCriterion("manufacturer_id in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotIn(List<Integer> values) {
            addCriterion("manufacturer_id not in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer_id between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer_id not between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdIsNull() {
            addCriterion("alg_model_id is null");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdIsNotNull() {
            addCriterion("alg_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdEqualTo(String value) {
            addCriterion("alg_model_id =", value, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdNotEqualTo(String value) {
            addCriterion("alg_model_id <>", value, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdGreaterThan(String value) {
            addCriterion("alg_model_id >", value, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("alg_model_id >=", value, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdLessThan(String value) {
            addCriterion("alg_model_id <", value, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdLessThanOrEqualTo(String value) {
            addCriterion("alg_model_id <=", value, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdLike(String value) {
            addCriterion("alg_model_id like", value, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdNotLike(String value) {
            addCriterion("alg_model_id not like", value, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdIn(List<String> values) {
            addCriterion("alg_model_id in", values, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdNotIn(List<String> values) {
            addCriterion("alg_model_id not in", values, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdBetween(String value1, String value2) {
            addCriterion("alg_model_id between", value1, value2, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAlgModelIdNotBetween(String value1, String value2) {
            addCriterion("alg_model_id not between", value1, value2, "algModelId");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainIsNull() {
            addCriterion("function_explain is null");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainIsNotNull() {
            addCriterion("function_explain is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainEqualTo(String value) {
            addCriterion("function_explain =", value, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainNotEqualTo(String value) {
            addCriterion("function_explain <>", value, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainGreaterThan(String value) {
            addCriterion("function_explain >", value, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainGreaterThanOrEqualTo(String value) {
            addCriterion("function_explain >=", value, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainLessThan(String value) {
            addCriterion("function_explain <", value, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainLessThanOrEqualTo(String value) {
            addCriterion("function_explain <=", value, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainLike(String value) {
            addCriterion("function_explain like", value, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainNotLike(String value) {
            addCriterion("function_explain not like", value, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainIn(List<String> values) {
            addCriterion("function_explain in", values, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainNotIn(List<String> values) {
            addCriterion("function_explain not in", values, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainBetween(String value1, String value2) {
            addCriterion("function_explain between", value1, value2, "functionExplain");
            return (Criteria) this;
        }

        public Criteria andFunctionExplainNotBetween(String value1, String value2) {
            addCriterion("function_explain not between", value1, value2, "functionExplain");
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