package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class RootInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RootInfExample() {
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

        public Criteria andRootidIsNull() {
            addCriterion("rootid is null");
            return (Criteria) this;
        }

        public Criteria andRootidIsNotNull() {
            addCriterion("rootid is not null");
            return (Criteria) this;
        }

        public Criteria andRootidEqualTo(String value) {
            addCriterion("rootid =", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotEqualTo(String value) {
            addCriterion("rootid <>", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThan(String value) {
            addCriterion("rootid >", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThanOrEqualTo(String value) {
            addCriterion("rootid >=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThan(String value) {
            addCriterion("rootid <", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThanOrEqualTo(String value) {
            addCriterion("rootid <=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLike(String value) {
            addCriterion("rootid like", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotLike(String value) {
            addCriterion("rootid not like", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidIn(List<String> values) {
            addCriterion("rootid in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotIn(List<String> values) {
            addCriterion("rootid not in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidBetween(String value1, String value2) {
            addCriterion("rootid between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotBetween(String value1, String value2) {
            addCriterion("rootid not between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootpwIsNull() {
            addCriterion("rootpw is null");
            return (Criteria) this;
        }

        public Criteria andRootpwIsNotNull() {
            addCriterion("rootpw is not null");
            return (Criteria) this;
        }

        public Criteria andRootpwEqualTo(String value) {
            addCriterion("rootpw =", value, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwNotEqualTo(String value) {
            addCriterion("rootpw <>", value, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwGreaterThan(String value) {
            addCriterion("rootpw >", value, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwGreaterThanOrEqualTo(String value) {
            addCriterion("rootpw >=", value, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwLessThan(String value) {
            addCriterion("rootpw <", value, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwLessThanOrEqualTo(String value) {
            addCriterion("rootpw <=", value, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwLike(String value) {
            addCriterion("rootpw like", value, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwNotLike(String value) {
            addCriterion("rootpw not like", value, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwIn(List<String> values) {
            addCriterion("rootpw in", values, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwNotIn(List<String> values) {
            addCriterion("rootpw not in", values, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwBetween(String value1, String value2) {
            addCriterion("rootpw between", value1, value2, "rootpw");
            return (Criteria) this;
        }

        public Criteria andRootpwNotBetween(String value1, String value2) {
            addCriterion("rootpw not between", value1, value2, "rootpw");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
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