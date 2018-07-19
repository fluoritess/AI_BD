package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class UserStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserStateExample() {
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

        public Criteria andStateidIsNull() {
            addCriterion("stateId is null");
            return (Criteria) this;
        }

        public Criteria andStateidIsNotNull() {
            addCriterion("stateId is not null");
            return (Criteria) this;
        }

        public Criteria andStateidEqualTo(String value) {
            addCriterion("stateId =", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotEqualTo(String value) {
            addCriterion("stateId <>", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThan(String value) {
            addCriterion("stateId >", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThanOrEqualTo(String value) {
            addCriterion("stateId >=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThan(String value) {
            addCriterion("stateId <", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThanOrEqualTo(String value) {
            addCriterion("stateId <=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLike(String value) {
            addCriterion("stateId like", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotLike(String value) {
            addCriterion("stateId not like", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidIn(List<String> values) {
            addCriterion("stateId in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotIn(List<String> values) {
            addCriterion("stateId not in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidBetween(String value1, String value2) {
            addCriterion("stateId between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotBetween(String value1, String value2) {
            addCriterion("stateId not between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStatenameIsNull() {
            addCriterion("stateName is null");
            return (Criteria) this;
        }

        public Criteria andStatenameIsNotNull() {
            addCriterion("stateName is not null");
            return (Criteria) this;
        }

        public Criteria andStatenameEqualTo(String value) {
            addCriterion("stateName =", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotEqualTo(String value) {
            addCriterion("stateName <>", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameGreaterThan(String value) {
            addCriterion("stateName >", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameGreaterThanOrEqualTo(String value) {
            addCriterion("stateName >=", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLessThan(String value) {
            addCriterion("stateName <", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLessThanOrEqualTo(String value) {
            addCriterion("stateName <=", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLike(String value) {
            addCriterion("stateName like", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotLike(String value) {
            addCriterion("stateName not like", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameIn(List<String> values) {
            addCriterion("stateName in", values, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotIn(List<String> values) {
            addCriterion("stateName not in", values, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameBetween(String value1, String value2) {
            addCriterion("stateName between", value1, value2, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotBetween(String value1, String value2) {
            addCriterion("stateName not between", value1, value2, "statename");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
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