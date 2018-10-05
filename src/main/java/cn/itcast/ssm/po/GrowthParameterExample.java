package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class GrowthParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrowthParameterExample() {
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

        public Criteria andGrowthParametersIdIsNull() {
            addCriterion("growth_parameters_id is null");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdIsNotNull() {
            addCriterion("growth_parameters_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdEqualTo(Integer value) {
            addCriterion("growth_parameters_id =", value, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdNotEqualTo(Integer value) {
            addCriterion("growth_parameters_id <>", value, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdGreaterThan(Integer value) {
            addCriterion("growth_parameters_id >", value, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth_parameters_id >=", value, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdLessThan(Integer value) {
            addCriterion("growth_parameters_id <", value, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdLessThanOrEqualTo(Integer value) {
            addCriterion("growth_parameters_id <=", value, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdIn(List<Integer> values) {
            addCriterion("growth_parameters_id in", values, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdNotIn(List<Integer> values) {
            addCriterion("growth_parameters_id not in", values, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdBetween(Integer value1, Integer value2) {
            addCriterion("growth_parameters_id between", value1, value2, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("growth_parameters_id not between", value1, value2, "growthParametersId");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameIsNull() {
            addCriterion("growth_parameters_name is null");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameIsNotNull() {
            addCriterion("growth_parameters_name is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameEqualTo(String value) {
            addCriterion("growth_parameters_name =", value, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameNotEqualTo(String value) {
            addCriterion("growth_parameters_name <>", value, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameGreaterThan(String value) {
            addCriterion("growth_parameters_name >", value, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameGreaterThanOrEqualTo(String value) {
            addCriterion("growth_parameters_name >=", value, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameLessThan(String value) {
            addCriterion("growth_parameters_name <", value, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameLessThanOrEqualTo(String value) {
            addCriterion("growth_parameters_name <=", value, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameLike(String value) {
            addCriterion("growth_parameters_name like", value, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameNotLike(String value) {
            addCriterion("growth_parameters_name not like", value, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameIn(List<String> values) {
            addCriterion("growth_parameters_name in", values, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameNotIn(List<String> values) {
            addCriterion("growth_parameters_name not in", values, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameBetween(String value1, String value2) {
            addCriterion("growth_parameters_name between", value1, value2, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersNameNotBetween(String value1, String value2) {
            addCriterion("growth_parameters_name not between", value1, value2, "growthParametersName");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionIsNull() {
            addCriterion("growth_parameters_description is null");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionIsNotNull() {
            addCriterion("growth_parameters_description is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionEqualTo(String value) {
            addCriterion("growth_parameters_description =", value, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionNotEqualTo(String value) {
            addCriterion("growth_parameters_description <>", value, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionGreaterThan(String value) {
            addCriterion("growth_parameters_description >", value, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("growth_parameters_description >=", value, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionLessThan(String value) {
            addCriterion("growth_parameters_description <", value, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionLessThanOrEqualTo(String value) {
            addCriterion("growth_parameters_description <=", value, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionLike(String value) {
            addCriterion("growth_parameters_description like", value, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionNotLike(String value) {
            addCriterion("growth_parameters_description not like", value, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionIn(List<String> values) {
            addCriterion("growth_parameters_description in", values, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionNotIn(List<String> values) {
            addCriterion("growth_parameters_description not in", values, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionBetween(String value1, String value2) {
            addCriterion("growth_parameters_description between", value1, value2, "growthParametersDescription");
            return (Criteria) this;
        }

        public Criteria andGrowthParametersDescriptionNotBetween(String value1, String value2) {
            addCriterion("growth_parameters_description not between", value1, value2, "growthParametersDescription");
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