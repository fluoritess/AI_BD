package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class ControlTypeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ControlTypeInfoExample() {
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

        public Criteria andControlTypeNameIsNull() {
            addCriterion("control_type_name is null");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameIsNotNull() {
            addCriterion("control_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameEqualTo(String value) {
            addCriterion("control_type_name =", value, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameNotEqualTo(String value) {
            addCriterion("control_type_name <>", value, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameGreaterThan(String value) {
            addCriterion("control_type_name >", value, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("control_type_name >=", value, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameLessThan(String value) {
            addCriterion("control_type_name <", value, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameLessThanOrEqualTo(String value) {
            addCriterion("control_type_name <=", value, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameLike(String value) {
            addCriterion("control_type_name like", value, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameNotLike(String value) {
            addCriterion("control_type_name not like", value, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameIn(List<String> values) {
            addCriterion("control_type_name in", values, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameNotIn(List<String> values) {
            addCriterion("control_type_name not in", values, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameBetween(String value1, String value2) {
            addCriterion("control_type_name between", value1, value2, "controlTypeName");
            return (Criteria) this;
        }

        public Criteria andControlTypeNameNotBetween(String value1, String value2) {
            addCriterion("control_type_name not between", value1, value2, "controlTypeName");
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

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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