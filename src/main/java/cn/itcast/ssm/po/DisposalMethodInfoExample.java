package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class DisposalMethodInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisposalMethodInfoExample() {
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

        public Criteria andDisposalMethodNameIsNull() {
            addCriterion("disposal_method_name is null");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameIsNotNull() {
            addCriterion("disposal_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameEqualTo(String value) {
            addCriterion("disposal_method_name =", value, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameNotEqualTo(String value) {
            addCriterion("disposal_method_name <>", value, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameGreaterThan(String value) {
            addCriterion("disposal_method_name >", value, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("disposal_method_name >=", value, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameLessThan(String value) {
            addCriterion("disposal_method_name <", value, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameLessThanOrEqualTo(String value) {
            addCriterion("disposal_method_name <=", value, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameLike(String value) {
            addCriterion("disposal_method_name like", value, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameNotLike(String value) {
            addCriterion("disposal_method_name not like", value, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameIn(List<String> values) {
            addCriterion("disposal_method_name in", values, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameNotIn(List<String> values) {
            addCriterion("disposal_method_name not in", values, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameBetween(String value1, String value2) {
            addCriterion("disposal_method_name between", value1, value2, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMethodNameNotBetween(String value1, String value2) {
            addCriterion("disposal_method_name not between", value1, value2, "disposalMethodName");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureIsNull() {
            addCriterion("disposal_measure is null");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureIsNotNull() {
            addCriterion("disposal_measure is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureEqualTo(String value) {
            addCriterion("disposal_measure =", value, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureNotEqualTo(String value) {
            addCriterion("disposal_measure <>", value, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureGreaterThan(String value) {
            addCriterion("disposal_measure >", value, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("disposal_measure >=", value, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureLessThan(String value) {
            addCriterion("disposal_measure <", value, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureLessThanOrEqualTo(String value) {
            addCriterion("disposal_measure <=", value, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureLike(String value) {
            addCriterion("disposal_measure like", value, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureNotLike(String value) {
            addCriterion("disposal_measure not like", value, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureIn(List<String> values) {
            addCriterion("disposal_measure in", values, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureNotIn(List<String> values) {
            addCriterion("disposal_measure not in", values, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureBetween(String value1, String value2) {
            addCriterion("disposal_measure between", value1, value2, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalMeasureNotBetween(String value1, String value2) {
            addCriterion("disposal_measure not between", value1, value2, "disposalMeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalContentIsNull() {
            addCriterion("disposal_content is null");
            return (Criteria) this;
        }

        public Criteria andDisposalContentIsNotNull() {
            addCriterion("disposal_content is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalContentEqualTo(String value) {
            addCriterion("disposal_content =", value, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentNotEqualTo(String value) {
            addCriterion("disposal_content <>", value, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentGreaterThan(String value) {
            addCriterion("disposal_content >", value, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentGreaterThanOrEqualTo(String value) {
            addCriterion("disposal_content >=", value, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentLessThan(String value) {
            addCriterion("disposal_content <", value, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentLessThanOrEqualTo(String value) {
            addCriterion("disposal_content <=", value, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentLike(String value) {
            addCriterion("disposal_content like", value, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentNotLike(String value) {
            addCriterion("disposal_content not like", value, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentIn(List<String> values) {
            addCriterion("disposal_content in", values, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentNotIn(List<String> values) {
            addCriterion("disposal_content not in", values, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentBetween(String value1, String value2) {
            addCriterion("disposal_content between", value1, value2, "disposalContent");
            return (Criteria) this;
        }

        public Criteria andDisposalContentNotBetween(String value1, String value2) {
            addCriterion("disposal_content not between", value1, value2, "disposalContent");
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