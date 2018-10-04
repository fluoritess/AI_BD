package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class GrowthEnviromentSetingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrowthEnviromentSetingExample() {
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

        public Criteria andGropIdIsNull() {
            addCriterion("grop_id is null");
            return (Criteria) this;
        }

        public Criteria andGropIdIsNotNull() {
            addCriterion("grop_id is not null");
            return (Criteria) this;
        }

        public Criteria andGropIdEqualTo(Integer value) {
            addCriterion("grop_id =", value, "gropId");
            return (Criteria) this;
        }

        public Criteria andGropIdNotEqualTo(Integer value) {
            addCriterion("grop_id <>", value, "gropId");
            return (Criteria) this;
        }

        public Criteria andGropIdGreaterThan(Integer value) {
            addCriterion("grop_id >", value, "gropId");
            return (Criteria) this;
        }

        public Criteria andGropIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grop_id >=", value, "gropId");
            return (Criteria) this;
        }

        public Criteria andGropIdLessThan(Integer value) {
            addCriterion("grop_id <", value, "gropId");
            return (Criteria) this;
        }

        public Criteria andGropIdLessThanOrEqualTo(Integer value) {
            addCriterion("grop_id <=", value, "gropId");
            return (Criteria) this;
        }

        public Criteria andGropIdIn(List<Integer> values) {
            addCriterion("grop_id in", values, "gropId");
            return (Criteria) this;
        }

        public Criteria andGropIdNotIn(List<Integer> values) {
            addCriterion("grop_id not in", values, "gropId");
            return (Criteria) this;
        }

        public Criteria andGropIdBetween(Integer value1, Integer value2) {
            addCriterion("grop_id between", value1, value2, "gropId");
            return (Criteria) this;
        }

        public Criteria andGropIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grop_id not between", value1, value2, "gropId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdIsNull() {
            addCriterion("growth_parameter_id is null");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdIsNotNull() {
            addCriterion("growth_parameter_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdEqualTo(Integer value) {
            addCriterion("growth_parameter_id =", value, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdNotEqualTo(Integer value) {
            addCriterion("growth_parameter_id <>", value, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdGreaterThan(Integer value) {
            addCriterion("growth_parameter_id >", value, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth_parameter_id >=", value, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdLessThan(Integer value) {
            addCriterion("growth_parameter_id <", value, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdLessThanOrEqualTo(Integer value) {
            addCriterion("growth_parameter_id <=", value, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdIn(List<Integer> values) {
            addCriterion("growth_parameter_id in", values, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdNotIn(List<Integer> values) {
            addCriterion("growth_parameter_id not in", values, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdBetween(Integer value1, Integer value2) {
            addCriterion("growth_parameter_id between", value1, value2, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("growth_parameter_id not between", value1, value2, "growthParameterId");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueIsNull() {
            addCriterion("growth_parameter_value is null");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueIsNotNull() {
            addCriterion("growth_parameter_value is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueEqualTo(Float value) {
            addCriterion("growth_parameter_value =", value, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueNotEqualTo(Float value) {
            addCriterion("growth_parameter_value <>", value, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueGreaterThan(Float value) {
            addCriterion("growth_parameter_value >", value, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueGreaterThanOrEqualTo(Float value) {
            addCriterion("growth_parameter_value >=", value, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueLessThan(Float value) {
            addCriterion("growth_parameter_value <", value, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueLessThanOrEqualTo(Float value) {
            addCriterion("growth_parameter_value <=", value, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueIn(List<Float> values) {
            addCriterion("growth_parameter_value in", values, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueNotIn(List<Float> values) {
            addCriterion("growth_parameter_value not in", values, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueBetween(Float value1, Float value2) {
            addCriterion("growth_parameter_value between", value1, value2, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterValueNotBetween(Float value1, Float value2) {
            addCriterion("growth_parameter_value not between", value1, value2, "growthParameterValue");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxIsNull() {
            addCriterion("growth_parameter_max is null");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxIsNotNull() {
            addCriterion("growth_parameter_max is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxEqualTo(Float value) {
            addCriterion("growth_parameter_max =", value, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxNotEqualTo(Float value) {
            addCriterion("growth_parameter_max <>", value, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxGreaterThan(Float value) {
            addCriterion("growth_parameter_max >", value, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxGreaterThanOrEqualTo(Float value) {
            addCriterion("growth_parameter_max >=", value, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxLessThan(Float value) {
            addCriterion("growth_parameter_max <", value, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxLessThanOrEqualTo(Float value) {
            addCriterion("growth_parameter_max <=", value, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxIn(List<Float> values) {
            addCriterion("growth_parameter_max in", values, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxNotIn(List<Float> values) {
            addCriterion("growth_parameter_max not in", values, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxBetween(Float value1, Float value2) {
            addCriterion("growth_parameter_max between", value1, value2, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMaxNotBetween(Float value1, Float value2) {
            addCriterion("growth_parameter_max not between", value1, value2, "growthParameterMax");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinIsNull() {
            addCriterion("growth_parameter_min is null");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinIsNotNull() {
            addCriterion("growth_parameter_min is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinEqualTo(Float value) {
            addCriterion("growth_parameter_min =", value, "growthParameterMin");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinNotEqualTo(Float value) {
            addCriterion("growth_parameter_min <>", value, "growthParameterMin");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinGreaterThan(Float value) {
            addCriterion("growth_parameter_min >", value, "growthParameterMin");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinGreaterThanOrEqualTo(Float value) {
            addCriterion("growth_parameter_min >=", value, "growthParameterMin");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinLessThan(Float value) {
            addCriterion("growth_parameter_min <", value, "growthParameterMin");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinLessThanOrEqualTo(Float value) {
            addCriterion("growth_parameter_min <=", value, "growthParameterMin");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinIn(List<Float> values) {
            addCriterion("growth_parameter_min in", values, "growthParameterMin");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinNotIn(List<Float> values) {
            addCriterion("growth_parameter_min not in", values, "growthParameterMin");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinBetween(Float value1, Float value2) {
            addCriterion("growth_parameter_min between", value1, value2, "growthParameterMin");
            return (Criteria) this;
        }

        public Criteria andGrowthParameterMinNotBetween(Float value1, Float value2) {
            addCriterion("growth_parameter_min not between", value1, value2, "growthParameterMin");
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