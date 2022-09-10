package com.example.nanqiao.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class BuildingInfoDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildingInfoDOExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNull() {
            addCriterion("building_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNotNull() {
            addCriterion("building_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameEqualTo(String value) {
            addCriterion("building_name =", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotEqualTo(String value) {
            addCriterion("building_name <>", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThan(String value) {
            addCriterion("building_name >", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThanOrEqualTo(String value) {
            addCriterion("building_name >=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThan(String value) {
            addCriterion("building_name <", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThanOrEqualTo(String value) {
            addCriterion("building_name <=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLike(String value) {
            addCriterion("building_name like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotLike(String value) {
            addCriterion("building_name not like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIn(List<String> values) {
            addCriterion("building_name in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotIn(List<String> values) {
            addCriterion("building_name not in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameBetween(String value1, String value2) {
            addCriterion("building_name between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotBetween(String value1, String value2) {
            addCriterion("building_name not between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailIsNull() {
            addCriterion("building_detail is null");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailIsNotNull() {
            addCriterion("building_detail is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailEqualTo(String value) {
            addCriterion("building_detail =", value, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailNotEqualTo(String value) {
            addCriterion("building_detail <>", value, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailGreaterThan(String value) {
            addCriterion("building_detail >", value, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailGreaterThanOrEqualTo(String value) {
            addCriterion("building_detail >=", value, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailLessThan(String value) {
            addCriterion("building_detail <", value, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailLessThanOrEqualTo(String value) {
            addCriterion("building_detail <=", value, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailLike(String value) {
            addCriterion("building_detail like", value, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailNotLike(String value) {
            addCriterion("building_detail not like", value, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailIn(List<String> values) {
            addCriterion("building_detail in", values, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailNotIn(List<String> values) {
            addCriterion("building_detail not in", values, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailBetween(String value1, String value2) {
            addCriterion("building_detail between", value1, value2, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andBuildingDetailNotBetween(String value1, String value2) {
            addCriterion("building_detail not between", value1, value2, "buildingDetail");
            return (Criteria) this;
        }

        public Criteria andGridIdIsNull() {
            addCriterion("grid_id is null");
            return (Criteria) this;
        }

        public Criteria andGridIdIsNotNull() {
            addCriterion("grid_id is not null");
            return (Criteria) this;
        }

        public Criteria andGridIdEqualTo(Integer value) {
            addCriterion("grid_id =", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotEqualTo(Integer value) {
            addCriterion("grid_id <>", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdGreaterThan(Integer value) {
            addCriterion("grid_id >", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grid_id >=", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdLessThan(Integer value) {
            addCriterion("grid_id <", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdLessThanOrEqualTo(Integer value) {
            addCriterion("grid_id <=", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdIn(List<Integer> values) {
            addCriterion("grid_id in", values, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotIn(List<Integer> values) {
            addCriterion("grid_id not in", values, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdBetween(Integer value1, Integer value2) {
            addCriterion("grid_id between", value1, value2, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grid_id not between", value1, value2, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridNameIsNull() {
            addCriterion("grid_name is null");
            return (Criteria) this;
        }

        public Criteria andGridNameIsNotNull() {
            addCriterion("grid_name is not null");
            return (Criteria) this;
        }

        public Criteria andGridNameEqualTo(String value) {
            addCriterion("grid_name =", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotEqualTo(String value) {
            addCriterion("grid_name <>", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameGreaterThan(String value) {
            addCriterion("grid_name >", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameGreaterThanOrEqualTo(String value) {
            addCriterion("grid_name >=", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameLessThan(String value) {
            addCriterion("grid_name <", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameLessThanOrEqualTo(String value) {
            addCriterion("grid_name <=", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameLike(String value) {
            addCriterion("grid_name like", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotLike(String value) {
            addCriterion("grid_name not like", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameIn(List<String> values) {
            addCriterion("grid_name in", values, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotIn(List<String> values) {
            addCriterion("grid_name not in", values, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameBetween(String value1, String value2) {
            addCriterion("grid_name between", value1, value2, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotBetween(String value1, String value2) {
            addCriterion("grid_name not between", value1, value2, "gridName");
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