package com.example.nanqiao.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityInfoDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityInfoDOExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Long value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Long value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Long value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Long value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Long value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Long> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Long> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Long value1, Long value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Long value1, Long value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("image_path is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("image_path is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("image_path =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("image_path <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("image_path >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("image_path >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("image_path <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("image_path <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("image_path like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("image_path not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("image_path in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("image_path not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("image_path between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("image_path not between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andDescPathIsNull() {
            addCriterion("desc_path is null");
            return (Criteria) this;
        }

        public Criteria andDescPathIsNotNull() {
            addCriterion("desc_path is not null");
            return (Criteria) this;
        }

        public Criteria andDescPathEqualTo(String value) {
            addCriterion("desc_path =", value, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathNotEqualTo(String value) {
            addCriterion("desc_path <>", value, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathGreaterThan(String value) {
            addCriterion("desc_path >", value, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathGreaterThanOrEqualTo(String value) {
            addCriterion("desc_path >=", value, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathLessThan(String value) {
            addCriterion("desc_path <", value, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathLessThanOrEqualTo(String value) {
            addCriterion("desc_path <=", value, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathLike(String value) {
            addCriterion("desc_path like", value, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathNotLike(String value) {
            addCriterion("desc_path not like", value, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathIn(List<String> values) {
            addCriterion("desc_path in", values, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathNotIn(List<String> values) {
            addCriterion("desc_path not in", values, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathBetween(String value1, String value2) {
            addCriterion("desc_path between", value1, value2, "descPath");
            return (Criteria) this;
        }

        public Criteria andDescPathNotBetween(String value1, String value2) {
            addCriterion("desc_path not between", value1, value2, "descPath");
            return (Criteria) this;
        }

        public Criteria andContentPathIsNull() {
            addCriterion("content_path is null");
            return (Criteria) this;
        }

        public Criteria andContentPathIsNotNull() {
            addCriterion("content_path is not null");
            return (Criteria) this;
        }

        public Criteria andContentPathEqualTo(String value) {
            addCriterion("content_path =", value, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathNotEqualTo(String value) {
            addCriterion("content_path <>", value, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathGreaterThan(String value) {
            addCriterion("content_path >", value, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathGreaterThanOrEqualTo(String value) {
            addCriterion("content_path >=", value, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathLessThan(String value) {
            addCriterion("content_path <", value, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathLessThanOrEqualTo(String value) {
            addCriterion("content_path <=", value, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathLike(String value) {
            addCriterion("content_path like", value, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathNotLike(String value) {
            addCriterion("content_path not like", value, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathIn(List<String> values) {
            addCriterion("content_path in", values, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathNotIn(List<String> values) {
            addCriterion("content_path not in", values, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathBetween(String value1, String value2) {
            addCriterion("content_path between", value1, value2, "contentPath");
            return (Criteria) this;
        }

        public Criteria andContentPathNotBetween(String value1, String value2) {
            addCriterion("content_path not between", value1, value2, "contentPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathIsNull() {
            addCriterion("attention_path is null");
            return (Criteria) this;
        }

        public Criteria andAttentionPathIsNotNull() {
            addCriterion("attention_path is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionPathEqualTo(String value) {
            addCriterion("attention_path =", value, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathNotEqualTo(String value) {
            addCriterion("attention_path <>", value, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathGreaterThan(String value) {
            addCriterion("attention_path >", value, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathGreaterThanOrEqualTo(String value) {
            addCriterion("attention_path >=", value, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathLessThan(String value) {
            addCriterion("attention_path <", value, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathLessThanOrEqualTo(String value) {
            addCriterion("attention_path <=", value, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathLike(String value) {
            addCriterion("attention_path like", value, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathNotLike(String value) {
            addCriterion("attention_path not like", value, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathIn(List<String> values) {
            addCriterion("attention_path in", values, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathNotIn(List<String> values) {
            addCriterion("attention_path not in", values, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathBetween(String value1, String value2) {
            addCriterion("attention_path between", value1, value2, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andAttentionPathNotBetween(String value1, String value2) {
            addCriterion("attention_path not between", value1, value2, "attentionPath");
            return (Criteria) this;
        }

        public Criteria andNumberLimitIsNull() {
            addCriterion("number_limit is null");
            return (Criteria) this;
        }

        public Criteria andNumberLimitIsNotNull() {
            addCriterion("number_limit is not null");
            return (Criteria) this;
        }

        public Criteria andNumberLimitEqualTo(Integer value) {
            addCriterion("number_limit =", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitNotEqualTo(Integer value) {
            addCriterion("number_limit <>", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitGreaterThan(Integer value) {
            addCriterion("number_limit >", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_limit >=", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitLessThan(Integer value) {
            addCriterion("number_limit <", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitLessThanOrEqualTo(Integer value) {
            addCriterion("number_limit <=", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitIn(List<Integer> values) {
            addCriterion("number_limit in", values, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitNotIn(List<Integer> values) {
            addCriterion("number_limit not in", values, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitBetween(Integer value1, Integer value2) {
            addCriterion("number_limit between", value1, value2, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("number_limit not between", value1, value2, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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