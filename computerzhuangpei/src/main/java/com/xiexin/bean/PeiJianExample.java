package com.xiexin.bean;

import java.util.ArrayList;
import java.util.List;

public class PeiJianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PeiJianExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andPeiJianIdIsNull() {
            addCriterion("pei_jian_id is null");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdIsNotNull() {
            addCriterion("pei_jian_id is not null");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdEqualTo(Integer value) {
            addCriterion("pei_jian_id =", value, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdNotEqualTo(Integer value) {
            addCriterion("pei_jian_id <>", value, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdGreaterThan(Integer value) {
            addCriterion("pei_jian_id >", value, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pei_jian_id >=", value, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdLessThan(Integer value) {
            addCriterion("pei_jian_id <", value, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdLessThanOrEqualTo(Integer value) {
            addCriterion("pei_jian_id <=", value, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdIn(List<Integer> values) {
            addCriterion("pei_jian_id in", values, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdNotIn(List<Integer> values) {
            addCriterion("pei_jian_id not in", values, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdBetween(Integer value1, Integer value2) {
            addCriterion("pei_jian_id between", value1, value2, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pei_jian_id not between", value1, value2, "peiJianId");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameIsNull() {
            addCriterion("pei_jian_name is null");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameIsNotNull() {
            addCriterion("pei_jian_name is not null");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameEqualTo(String value) {
            addCriterion("pei_jian_name =", value, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameNotEqualTo(String value) {
            addCriterion("pei_jian_name <>", value, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameGreaterThan(String value) {
            addCriterion("pei_jian_name >", value, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameGreaterThanOrEqualTo(String value) {
            addCriterion("pei_jian_name >=", value, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameLessThan(String value) {
            addCriterion("pei_jian_name <", value, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameLessThanOrEqualTo(String value) {
            addCriterion("pei_jian_name <=", value, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameLike(String value) {
            addCriterion("pei_jian_name like", value, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameNotLike(String value) {
            addCriterion("pei_jian_name not like", value, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameIn(List<String> values) {
            addCriterion("pei_jian_name in", values, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameNotIn(List<String> values) {
            addCriterion("pei_jian_name not in", values, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameBetween(String value1, String value2) {
            addCriterion("pei_jian_name between", value1, value2, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianNameNotBetween(String value1, String value2) {
            addCriterion("pei_jian_name not between", value1, value2, "peiJianName");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangIsNull() {
            addCriterion("pei_jian_rong_liang is null");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangIsNotNull() {
            addCriterion("pei_jian_rong_liang is not null");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangEqualTo(String value) {
            addCriterion("pei_jian_rong_liang =", value, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangNotEqualTo(String value) {
            addCriterion("pei_jian_rong_liang <>", value, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangGreaterThan(String value) {
            addCriterion("pei_jian_rong_liang >", value, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangGreaterThanOrEqualTo(String value) {
            addCriterion("pei_jian_rong_liang >=", value, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangLessThan(String value) {
            addCriterion("pei_jian_rong_liang <", value, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangLessThanOrEqualTo(String value) {
            addCriterion("pei_jian_rong_liang <=", value, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangLike(String value) {
            addCriterion("pei_jian_rong_liang like", value, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangNotLike(String value) {
            addCriterion("pei_jian_rong_liang not like", value, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangIn(List<String> values) {
            addCriterion("pei_jian_rong_liang in", values, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangNotIn(List<String> values) {
            addCriterion("pei_jian_rong_liang not in", values, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangBetween(String value1, String value2) {
            addCriterion("pei_jian_rong_liang between", value1, value2, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianRongLiangNotBetween(String value1, String value2) {
            addCriterion("pei_jian_rong_liang not between", value1, value2, "peiJianRongLiang");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceIsNull() {
            addCriterion("pei_jian_price is null");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceIsNotNull() {
            addCriterion("pei_jian_price is not null");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceEqualTo(Double value) {
            addCriterion("pei_jian_price =", value, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceNotEqualTo(Double value) {
            addCriterion("pei_jian_price <>", value, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceGreaterThan(Double value) {
            addCriterion("pei_jian_price >", value, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pei_jian_price >=", value, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceLessThan(Double value) {
            addCriterion("pei_jian_price <", value, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceLessThanOrEqualTo(Double value) {
            addCriterion("pei_jian_price <=", value, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceIn(List<Double> values) {
            addCriterion("pei_jian_price in", values, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceNotIn(List<Double> values) {
            addCriterion("pei_jian_price not in", values, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceBetween(Double value1, Double value2) {
            addCriterion("pei_jian_price between", value1, value2, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andPeiJianPriceNotBetween(Double value1, Double value2) {
            addCriterion("pei_jian_price not between", value1, value2, "peiJianPrice");
            return (Criteria) this;
        }

        public Criteria andTypeIdfIsNull() {
            addCriterion("type_idf is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdfIsNotNull() {
            addCriterion("type_idf is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdfEqualTo(Integer value) {
            addCriterion("type_idf =", value, "typeIdf");
            return (Criteria) this;
        }

        public Criteria andTypeIdfNotEqualTo(Integer value) {
            addCriterion("type_idf <>", value, "typeIdf");
            return (Criteria) this;
        }

        public Criteria andTypeIdfGreaterThan(Integer value) {
            addCriterion("type_idf >", value, "typeIdf");
            return (Criteria) this;
        }

        public Criteria andTypeIdfGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_idf >=", value, "typeIdf");
            return (Criteria) this;
        }

        public Criteria andTypeIdfLessThan(Integer value) {
            addCriterion("type_idf <", value, "typeIdf");
            return (Criteria) this;
        }

        public Criteria andTypeIdfLessThanOrEqualTo(Integer value) {
            addCriterion("type_idf <=", value, "typeIdf");
            return (Criteria) this;
        }

        public Criteria andTypeIdfIn(List<Integer> values) {
            addCriterion("type_idf in", values, "typeIdf");
            return (Criteria) this;
        }

        public Criteria andTypeIdfNotIn(List<Integer> values) {
            addCriterion("type_idf not in", values, "typeIdf");
            return (Criteria) this;
        }

        public Criteria andTypeIdfBetween(Integer value1, Integer value2) {
            addCriterion("type_idf between", value1, value2, "typeIdf");
            return (Criteria) this;
        }

        public Criteria andTypeIdfNotBetween(Integer value1, Integer value2) {
            addCriterion("type_idf not between", value1, value2, "typeIdf");
            return (Criteria) this;
        }
    }

    /**
     */
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