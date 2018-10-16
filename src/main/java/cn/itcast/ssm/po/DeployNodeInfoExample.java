package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class DeployNodeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeployNodeInfoExample() {
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

        public Criteria andDeployNodeIdIsNull() {
            addCriterion("deploy_node_id is null");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdIsNotNull() {
            addCriterion("deploy_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdEqualTo(Integer value) {
            addCriterion("deploy_node_id =", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdNotEqualTo(Integer value) {
            addCriterion("deploy_node_id <>", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdGreaterThan(Integer value) {
            addCriterion("deploy_node_id >", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deploy_node_id >=", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdLessThan(Integer value) {
            addCriterion("deploy_node_id <", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("deploy_node_id <=", value, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdIn(List<Integer> values) {
            addCriterion("deploy_node_id in", values, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdNotIn(List<Integer> values) {
            addCriterion("deploy_node_id not in", values, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdBetween(Integer value1, Integer value2) {
            addCriterion("deploy_node_id between", value1, value2, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andDeployNodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deploy_node_id not between", value1, value2, "deployNodeId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNull() {
            addCriterion("node_name is null");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNotNull() {
            addCriterion("node_name is not null");
            return (Criteria) this;
        }

        public Criteria andNodeNameEqualTo(String value) {
            addCriterion("node_name =", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotEqualTo(String value) {
            addCriterion("node_name <>", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThan(String value) {
            addCriterion("node_name >", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("node_name >=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThan(String value) {
            addCriterion("node_name <", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThanOrEqualTo(String value) {
            addCriterion("node_name <=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLike(String value) {
            addCriterion("node_name like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotLike(String value) {
            addCriterion("node_name not like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameIn(List<String> values) {
            addCriterion("node_name in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotIn(List<String> values) {
            addCriterion("node_name not in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameBetween(String value1, String value2) {
            addCriterion("node_name between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotBetween(String value1, String value2) {
            addCriterion("node_name not between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainIsNull() {
            addCriterion("purpose_explain is null");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainIsNotNull() {
            addCriterion("purpose_explain is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainEqualTo(String value) {
            addCriterion("purpose_explain =", value, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainNotEqualTo(String value) {
            addCriterion("purpose_explain <>", value, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainGreaterThan(String value) {
            addCriterion("purpose_explain >", value, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_explain >=", value, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainLessThan(String value) {
            addCriterion("purpose_explain <", value, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainLessThanOrEqualTo(String value) {
            addCriterion("purpose_explain <=", value, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainLike(String value) {
            addCriterion("purpose_explain like", value, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainNotLike(String value) {
            addCriterion("purpose_explain not like", value, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainIn(List<String> values) {
            addCriterion("purpose_explain in", values, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainNotIn(List<String> values) {
            addCriterion("purpose_explain not in", values, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainBetween(String value1, String value2) {
            addCriterion("purpose_explain between", value1, value2, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andPurposeExplainNotBetween(String value1, String value2) {
            addCriterion("purpose_explain not between", value1, value2, "purposeExplain");
            return (Criteria) this;
        }

        public Criteria andInsideLocationIsNull() {
            addCriterion("inside_location is null");
            return (Criteria) this;
        }

        public Criteria andInsideLocationIsNotNull() {
            addCriterion("inside_location is not null");
            return (Criteria) this;
        }

        public Criteria andInsideLocationEqualTo(String value) {
            addCriterion("inside_location =", value, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationNotEqualTo(String value) {
            addCriterion("inside_location <>", value, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationGreaterThan(String value) {
            addCriterion("inside_location >", value, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationGreaterThanOrEqualTo(String value) {
            addCriterion("inside_location >=", value, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationLessThan(String value) {
            addCriterion("inside_location <", value, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationLessThanOrEqualTo(String value) {
            addCriterion("inside_location <=", value, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationLike(String value) {
            addCriterion("inside_location like", value, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationNotLike(String value) {
            addCriterion("inside_location not like", value, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationIn(List<String> values) {
            addCriterion("inside_location in", values, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationNotIn(List<String> values) {
            addCriterion("inside_location not in", values, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationBetween(String value1, String value2) {
            addCriterion("inside_location between", value1, value2, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andInsideLocationNotBetween(String value1, String value2) {
            addCriterion("inside_location not between", value1, value2, "insideLocation");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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