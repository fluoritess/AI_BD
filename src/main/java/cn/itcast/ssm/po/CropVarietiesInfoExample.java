package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class CropVarietiesInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CropVarietiesInfoExample() {
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

        public Criteria andCropVarietiesIdIsNull() {
            addCriterion("crop_varieties_id is null");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdIsNotNull() {
            addCriterion("crop_varieties_id is not null");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdEqualTo(Integer value) {
            addCriterion("crop_varieties_id =", value, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdNotEqualTo(Integer value) {
            addCriterion("crop_varieties_id <>", value, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdGreaterThan(Integer value) {
            addCriterion("crop_varieties_id >", value, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("crop_varieties_id >=", value, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdLessThan(Integer value) {
            addCriterion("crop_varieties_id <", value, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdLessThanOrEqualTo(Integer value) {
            addCriterion("crop_varieties_id <=", value, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdIn(List<Integer> values) {
            addCriterion("crop_varieties_id in", values, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdNotIn(List<Integer> values) {
            addCriterion("crop_varieties_id not in", values, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdBetween(Integer value1, Integer value2) {
            addCriterion("crop_varieties_id between", value1, value2, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("crop_varieties_id not between", value1, value2, "cropVarietiesId");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameIsNull() {
            addCriterion("crop_varieties_name is null");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameIsNotNull() {
            addCriterion("crop_varieties_name is not null");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameEqualTo(String value) {
            addCriterion("crop_varieties_name =", value, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameNotEqualTo(String value) {
            addCriterion("crop_varieties_name <>", value, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameGreaterThan(String value) {
            addCriterion("crop_varieties_name >", value, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameGreaterThanOrEqualTo(String value) {
            addCriterion("crop_varieties_name >=", value, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameLessThan(String value) {
            addCriterion("crop_varieties_name <", value, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameLessThanOrEqualTo(String value) {
            addCriterion("crop_varieties_name <=", value, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameLike(String value) {
            addCriterion("crop_varieties_name like", value, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameNotLike(String value) {
            addCriterion("crop_varieties_name not like", value, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameIn(List<String> values) {
            addCriterion("crop_varieties_name in", values, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameNotIn(List<String> values) {
            addCriterion("crop_varieties_name not in", values, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameBetween(String value1, String value2) {
            addCriterion("crop_varieties_name between", value1, value2, "cropVarietiesName");
            return (Criteria) this;
        }

        public Criteria andCropVarietiesNameNotBetween(String value1, String value2) {
            addCriterion("crop_varieties_name not between", value1, value2, "cropVarietiesName");
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