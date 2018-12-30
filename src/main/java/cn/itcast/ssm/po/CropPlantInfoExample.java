package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CropPlantInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CropPlantInfoExample() {
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

        public Criteria andCropPlantIdIsNull() {
            addCriterion("crop_plant_id is null");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdIsNotNull() {
            addCriterion("crop_plant_id is not null");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdEqualTo(Integer value) {
            addCriterion("crop_plant_id =", value, "cropPlantId");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdNotEqualTo(Integer value) {
            addCriterion("crop_plant_id <>", value, "cropPlantId");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdGreaterThan(Integer value) {
            addCriterion("crop_plant_id >", value, "cropPlantId");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("crop_plant_id >=", value, "cropPlantId");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdLessThan(Integer value) {
            addCriterion("crop_plant_id <", value, "cropPlantId");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdLessThanOrEqualTo(Integer value) {
            addCriterion("crop_plant_id <=", value, "cropPlantId");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdIn(List<Integer> values) {
            addCriterion("crop_plant_id in", values, "cropPlantId");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdNotIn(List<Integer> values) {
            addCriterion("crop_plant_id not in", values, "cropPlantId");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdBetween(Integer value1, Integer value2) {
            addCriterion("crop_plant_id between", value1, value2, "cropPlantId");
            return (Criteria) this;
        }

        public Criteria andCropPlantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("crop_plant_id not between", value1, value2, "cropPlantId");
            return (Criteria) this;
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

        public Criteria andCropPlantStarttimeIsNull() {
            addCriterion("crop_plant_starttime is null");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeIsNotNull() {
            addCriterion("crop_plant_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeEqualTo(Date value) {
            addCriterion("crop_plant_starttime =", value, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeNotEqualTo(Date value) {
            addCriterion("crop_plant_starttime <>", value, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeGreaterThan(Date value) {
            addCriterion("crop_plant_starttime >", value, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crop_plant_starttime >=", value, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeLessThan(Date value) {
            addCriterion("crop_plant_starttime <", value, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("crop_plant_starttime <=", value, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeIn(List<Date> values) {
            addCriterion("crop_plant_starttime in", values, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeNotIn(List<Date> values) {
            addCriterion("crop_plant_starttime not in", values, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeBetween(Date value1, Date value2) {
            addCriterion("crop_plant_starttime between", value1, value2, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("crop_plant_starttime not between", value1, value2, "cropPlantStarttime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeIsNull() {
            addCriterion("crop_plant_endtime is null");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeIsNotNull() {
            addCriterion("crop_plant_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeEqualTo(Date value) {
            addCriterion("crop_plant_endtime =", value, "cropPlantEndtime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeNotEqualTo(Date value) {
            addCriterion("crop_plant_endtime <>", value, "cropPlantEndtime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeGreaterThan(Date value) {
            addCriterion("crop_plant_endtime >", value, "cropPlantEndtime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crop_plant_endtime >=", value, "cropPlantEndtime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeLessThan(Date value) {
            addCriterion("crop_plant_endtime <", value, "cropPlantEndtime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("crop_plant_endtime <=", value, "cropPlantEndtime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeIn(List<Date> values) {
            addCriterion("crop_plant_endtime in", values, "cropPlantEndtime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeNotIn(List<Date> values) {
            addCriterion("crop_plant_endtime not in", values, "cropPlantEndtime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeBetween(Date value1, Date value2) {
            addCriterion("crop_plant_endtime between", value1, value2, "cropPlantEndtime");
            return (Criteria) this;
        }

        public Criteria andCropPlantEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("crop_plant_endtime not between", value1, value2, "cropPlantEndtime");
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