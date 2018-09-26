package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class GreenhouseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GreenhouseInfoExample() {
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

        public Criteria andGreenhouseIdIsNull() {
            addCriterion("greenhouse_id is null");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdIsNotNull() {
            addCriterion("greenhouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdEqualTo(Integer value) {
            addCriterion("greenhouse_id =", value, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdNotEqualTo(Integer value) {
            addCriterion("greenhouse_id <>", value, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdGreaterThan(Integer value) {
            addCriterion("greenhouse_id >", value, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("greenhouse_id >=", value, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdLessThan(Integer value) {
            addCriterion("greenhouse_id <", value, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("greenhouse_id <=", value, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdIn(List<Integer> values) {
            addCriterion("greenhouse_id in", values, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdNotIn(List<Integer> values) {
            addCriterion("greenhouse_id not in", values, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdBetween(Integer value1, Integer value2) {
            addCriterion("greenhouse_id between", value1, value2, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("greenhouse_id not between", value1, value2, "greenhouseId");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameIsNull() {
            addCriterion("greenhouse_name is null");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameIsNotNull() {
            addCriterion("greenhouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameEqualTo(String value) {
            addCriterion("greenhouse_name =", value, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameNotEqualTo(String value) {
            addCriterion("greenhouse_name <>", value, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameGreaterThan(String value) {
            addCriterion("greenhouse_name >", value, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("greenhouse_name >=", value, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameLessThan(String value) {
            addCriterion("greenhouse_name <", value, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameLessThanOrEqualTo(String value) {
            addCriterion("greenhouse_name <=", value, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameLike(String value) {
            addCriterion("greenhouse_name like", value, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameNotLike(String value) {
            addCriterion("greenhouse_name not like", value, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameIn(List<String> values) {
            addCriterion("greenhouse_name in", values, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameNotIn(List<String> values) {
            addCriterion("greenhouse_name not in", values, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameBetween(String value1, String value2) {
            addCriterion("greenhouse_name between", value1, value2, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseNameNotBetween(String value1, String value2) {
            addCriterion("greenhouse_name not between", value1, value2, "greenhouseName");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageIsNull() {
            addCriterion("greenhouse_useage is null");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageIsNotNull() {
            addCriterion("greenhouse_useage is not null");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageEqualTo(String value) {
            addCriterion("greenhouse_useage =", value, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageNotEqualTo(String value) {
            addCriterion("greenhouse_useage <>", value, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageGreaterThan(String value) {
            addCriterion("greenhouse_useage >", value, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageGreaterThanOrEqualTo(String value) {
            addCriterion("greenhouse_useage >=", value, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageLessThan(String value) {
            addCriterion("greenhouse_useage <", value, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageLessThanOrEqualTo(String value) {
            addCriterion("greenhouse_useage <=", value, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageLike(String value) {
            addCriterion("greenhouse_useage like", value, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageNotLike(String value) {
            addCriterion("greenhouse_useage not like", value, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageIn(List<String> values) {
            addCriterion("greenhouse_useage in", values, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageNotIn(List<String> values) {
            addCriterion("greenhouse_useage not in", values, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageBetween(String value1, String value2) {
            addCriterion("greenhouse_useage between", value1, value2, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseUseageNotBetween(String value1, String value2) {
            addCriterion("greenhouse_useage not between", value1, value2, "greenhouseUseage");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressIsNull() {
            addCriterion("greenhouse_address is null");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressIsNotNull() {
            addCriterion("greenhouse_address is not null");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressEqualTo(String value) {
            addCriterion("greenhouse_address =", value, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressNotEqualTo(String value) {
            addCriterion("greenhouse_address <>", value, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressGreaterThan(String value) {
            addCriterion("greenhouse_address >", value, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("greenhouse_address >=", value, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressLessThan(String value) {
            addCriterion("greenhouse_address <", value, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressLessThanOrEqualTo(String value) {
            addCriterion("greenhouse_address <=", value, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressLike(String value) {
            addCriterion("greenhouse_address like", value, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressNotLike(String value) {
            addCriterion("greenhouse_address not like", value, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressIn(List<String> values) {
            addCriterion("greenhouse_address in", values, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressNotIn(List<String> values) {
            addCriterion("greenhouse_address not in", values, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressBetween(String value1, String value2) {
            addCriterion("greenhouse_address between", value1, value2, "greenhouseAddress");
            return (Criteria) this;
        }

        public Criteria andGreenhouseAddressNotBetween(String value1, String value2) {
            addCriterion("greenhouse_address not between", value1, value2, "greenhouseAddress");
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