package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class CropInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CropInfoExample() {
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

        public Criteria andCropIdIsNull() {
            addCriterion("crop_id is null");
            return (Criteria) this;
        }

        public Criteria andCropIdIsNotNull() {
            addCriterion("crop_id is not null");
            return (Criteria) this;
        }

        public Criteria andCropIdEqualTo(Integer value) {
            addCriterion("crop_id =", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdNotEqualTo(Integer value) {
            addCriterion("crop_id <>", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdGreaterThan(Integer value) {
            addCriterion("crop_id >", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("crop_id >=", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdLessThan(Integer value) {
            addCriterion("crop_id <", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdLessThanOrEqualTo(Integer value) {
            addCriterion("crop_id <=", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdIn(List<Integer> values) {
            addCriterion("crop_id in", values, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdNotIn(List<Integer> values) {
            addCriterion("crop_id not in", values, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdBetween(Integer value1, Integer value2) {
            addCriterion("crop_id between", value1, value2, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdNotBetween(Integer value1, Integer value2) {
            addCriterion("crop_id not between", value1, value2, "cropId");
            return (Criteria) this;
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

        public Criteria andSoilTypeIdIsNull() {
            addCriterion("soil_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdIsNotNull() {
            addCriterion("soil_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdEqualTo(Integer value) {
            addCriterion("soil_type_id =", value, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdNotEqualTo(Integer value) {
            addCriterion("soil_type_id <>", value, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdGreaterThan(Integer value) {
            addCriterion("soil_type_id >", value, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("soil_type_id >=", value, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdLessThan(Integer value) {
            addCriterion("soil_type_id <", value, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("soil_type_id <=", value, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdIn(List<Integer> values) {
            addCriterion("soil_type_id in", values, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdNotIn(List<Integer> values) {
            addCriterion("soil_type_id not in", values, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("soil_type_id between", value1, value2, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("soil_type_id not between", value1, value2, "soilTypeId");
            return (Criteria) this;
        }

        public Criteria andCropNameIsNull() {
            addCriterion("crop_name is null");
            return (Criteria) this;
        }

        public Criteria andCropNameIsNotNull() {
            addCriterion("crop_name is not null");
            return (Criteria) this;
        }

        public Criteria andCropNameEqualTo(String value) {
            addCriterion("crop_name =", value, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameNotEqualTo(String value) {
            addCriterion("crop_name <>", value, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameGreaterThan(String value) {
            addCriterion("crop_name >", value, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameGreaterThanOrEqualTo(String value) {
            addCriterion("crop_name >=", value, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameLessThan(String value) {
            addCriterion("crop_name <", value, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameLessThanOrEqualTo(String value) {
            addCriterion("crop_name <=", value, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameLike(String value) {
            addCriterion("crop_name like", value, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameNotLike(String value) {
            addCriterion("crop_name not like", value, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameIn(List<String> values) {
            addCriterion("crop_name in", values, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameNotIn(List<String> values) {
            addCriterion("crop_name not in", values, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameBetween(String value1, String value2) {
            addCriterion("crop_name between", value1, value2, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropNameNotBetween(String value1, String value2) {
            addCriterion("crop_name not between", value1, value2, "cropName");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingIsNull() {
            addCriterion("\"crop_row spacing\" is null");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingIsNotNull() {
            addCriterion("\"crop_row spacing\" is not null");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingEqualTo(Integer value) {
            addCriterion("\"crop_row spacing\" =", value, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingNotEqualTo(Integer value) {
            addCriterion("\"crop_row spacing\" <>", value, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingGreaterThan(Integer value) {
            addCriterion("\"crop_row spacing\" >", value, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"crop_row spacing\" >=", value, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingLessThan(Integer value) {
            addCriterion("\"crop_row spacing\" <", value, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingLessThanOrEqualTo(Integer value) {
            addCriterion("\"crop_row spacing\" <=", value, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingIn(List<Integer> values) {
            addCriterion("\"crop_row spacing\" in", values, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingNotIn(List<Integer> values) {
            addCriterion("\"crop_row spacing\" not in", values, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingBetween(Integer value1, Integer value2) {
            addCriterion("\"crop_row spacing\" between", value1, value2, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropRowSpacingNotBetween(Integer value1, Integer value2) {
            addCriterion("\"crop_row spacing\" not between", value1, value2, "cropRowSpacing");
            return (Criteria) this;
        }

        public Criteria andCropDensityIsNull() {
            addCriterion("crop_density is null");
            return (Criteria) this;
        }

        public Criteria andCropDensityIsNotNull() {
            addCriterion("crop_density is not null");
            return (Criteria) this;
        }

        public Criteria andCropDensityEqualTo(Integer value) {
            addCriterion("crop_density =", value, "cropDensity");
            return (Criteria) this;
        }

        public Criteria andCropDensityNotEqualTo(Integer value) {
            addCriterion("crop_density <>", value, "cropDensity");
            return (Criteria) this;
        }

        public Criteria andCropDensityGreaterThan(Integer value) {
            addCriterion("crop_density >", value, "cropDensity");
            return (Criteria) this;
        }

        public Criteria andCropDensityGreaterThanOrEqualTo(Integer value) {
            addCriterion("crop_density >=", value, "cropDensity");
            return (Criteria) this;
        }

        public Criteria andCropDensityLessThan(Integer value) {
            addCriterion("crop_density <", value, "cropDensity");
            return (Criteria) this;
        }

        public Criteria andCropDensityLessThanOrEqualTo(Integer value) {
            addCriterion("crop_density <=", value, "cropDensity");
            return (Criteria) this;
        }

        public Criteria andCropDensityIn(List<Integer> values) {
            addCriterion("crop_density in", values, "cropDensity");
            return (Criteria) this;
        }

        public Criteria andCropDensityNotIn(List<Integer> values) {
            addCriterion("crop_density not in", values, "cropDensity");
            return (Criteria) this;
        }

        public Criteria andCropDensityBetween(Integer value1, Integer value2) {
            addCriterion("crop_density between", value1, value2, "cropDensity");
            return (Criteria) this;
        }

        public Criteria andCropDensityNotBetween(Integer value1, Integer value2) {
            addCriterion("crop_density not between", value1, value2, "cropDensity");
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