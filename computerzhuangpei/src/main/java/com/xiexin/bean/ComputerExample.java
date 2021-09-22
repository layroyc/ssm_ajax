package com.xiexin.bean;

import java.util.ArrayList;
import java.util.List;

public class ComputerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ComputerExample() {
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

        public Criteria andPcIdIsNull() {
            addCriterion("pc_id is null");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNotNull() {
            addCriterion("pc_id is not null");
            return (Criteria) this;
        }

        public Criteria andPcIdEqualTo(Integer value) {
            addCriterion("pc_id =", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotEqualTo(Integer value) {
            addCriterion("pc_id <>", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThan(Integer value) {
            addCriterion("pc_id >", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pc_id >=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThan(Integer value) {
            addCriterion("pc_id <", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThanOrEqualTo(Integer value) {
            addCriterion("pc_id <=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdIn(List<Integer> values) {
            addCriterion("pc_id in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotIn(List<Integer> values) {
            addCriterion("pc_id not in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdBetween(Integer value1, Integer value2) {
            addCriterion("pc_id between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pc_id not between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcNameIsNull() {
            addCriterion("pc_name is null");
            return (Criteria) this;
        }

        public Criteria andPcNameIsNotNull() {
            addCriterion("pc_name is not null");
            return (Criteria) this;
        }

        public Criteria andPcNameEqualTo(String value) {
            addCriterion("pc_name =", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotEqualTo(String value) {
            addCriterion("pc_name <>", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameGreaterThan(String value) {
            addCriterion("pc_name >", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameGreaterThanOrEqualTo(String value) {
            addCriterion("pc_name >=", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLessThan(String value) {
            addCriterion("pc_name <", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLessThanOrEqualTo(String value) {
            addCriterion("pc_name <=", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLike(String value) {
            addCriterion("pc_name like", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotLike(String value) {
            addCriterion("pc_name not like", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameIn(List<String> values) {
            addCriterion("pc_name in", values, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotIn(List<String> values) {
            addCriterion("pc_name not in", values, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameBetween(String value1, String value2) {
            addCriterion("pc_name between", value1, value2, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotBetween(String value1, String value2) {
            addCriterion("pc_name not between", value1, value2, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcMemoryIsNull() {
            addCriterion("pc_memory is null");
            return (Criteria) this;
        }

        public Criteria andPcMemoryIsNotNull() {
            addCriterion("pc_memory is not null");
            return (Criteria) this;
        }

        public Criteria andPcMemoryEqualTo(String value) {
            addCriterion("pc_memory =", value, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryNotEqualTo(String value) {
            addCriterion("pc_memory <>", value, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryGreaterThan(String value) {
            addCriterion("pc_memory >", value, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("pc_memory >=", value, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryLessThan(String value) {
            addCriterion("pc_memory <", value, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryLessThanOrEqualTo(String value) {
            addCriterion("pc_memory <=", value, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryLike(String value) {
            addCriterion("pc_memory like", value, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryNotLike(String value) {
            addCriterion("pc_memory not like", value, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryIn(List<String> values) {
            addCriterion("pc_memory in", values, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryNotIn(List<String> values) {
            addCriterion("pc_memory not in", values, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryBetween(String value1, String value2) {
            addCriterion("pc_memory between", value1, value2, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcMemoryNotBetween(String value1, String value2) {
            addCriterion("pc_memory not between", value1, value2, "pcMemory");
            return (Criteria) this;
        }

        public Criteria andPcCpuIsNull() {
            addCriterion("pc_cpu is null");
            return (Criteria) this;
        }

        public Criteria andPcCpuIsNotNull() {
            addCriterion("pc_cpu is not null");
            return (Criteria) this;
        }

        public Criteria andPcCpuEqualTo(String value) {
            addCriterion("pc_cpu =", value, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuNotEqualTo(String value) {
            addCriterion("pc_cpu <>", value, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuGreaterThan(String value) {
            addCriterion("pc_cpu >", value, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuGreaterThanOrEqualTo(String value) {
            addCriterion("pc_cpu >=", value, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuLessThan(String value) {
            addCriterion("pc_cpu <", value, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuLessThanOrEqualTo(String value) {
            addCriterion("pc_cpu <=", value, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuLike(String value) {
            addCriterion("pc_cpu like", value, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuNotLike(String value) {
            addCriterion("pc_cpu not like", value, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuIn(List<String> values) {
            addCriterion("pc_cpu in", values, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuNotIn(List<String> values) {
            addCriterion("pc_cpu not in", values, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuBetween(String value1, String value2) {
            addCriterion("pc_cpu between", value1, value2, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcCpuNotBetween(String value1, String value2) {
            addCriterion("pc_cpu not between", value1, value2, "pcCpu");
            return (Criteria) this;
        }

        public Criteria andPcVideocardIsNull() {
            addCriterion("pc_videocard is null");
            return (Criteria) this;
        }

        public Criteria andPcVideocardIsNotNull() {
            addCriterion("pc_videocard is not null");
            return (Criteria) this;
        }

        public Criteria andPcVideocardEqualTo(String value) {
            addCriterion("pc_videocard =", value, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardNotEqualTo(String value) {
            addCriterion("pc_videocard <>", value, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardGreaterThan(String value) {
            addCriterion("pc_videocard >", value, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardGreaterThanOrEqualTo(String value) {
            addCriterion("pc_videocard >=", value, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardLessThan(String value) {
            addCriterion("pc_videocard <", value, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardLessThanOrEqualTo(String value) {
            addCriterion("pc_videocard <=", value, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardLike(String value) {
            addCriterion("pc_videocard like", value, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardNotLike(String value) {
            addCriterion("pc_videocard not like", value, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardIn(List<String> values) {
            addCriterion("pc_videocard in", values, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardNotIn(List<String> values) {
            addCriterion("pc_videocard not in", values, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardBetween(String value1, String value2) {
            addCriterion("pc_videocard between", value1, value2, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcVideocardNotBetween(String value1, String value2) {
            addCriterion("pc_videocard not between", value1, value2, "pcVideocard");
            return (Criteria) this;
        }

        public Criteria andPcDisplayIsNull() {
            addCriterion("pc_display is null");
            return (Criteria) this;
        }

        public Criteria andPcDisplayIsNotNull() {
            addCriterion("pc_display is not null");
            return (Criteria) this;
        }

        public Criteria andPcDisplayEqualTo(String value) {
            addCriterion("pc_display =", value, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayNotEqualTo(String value) {
            addCriterion("pc_display <>", value, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayGreaterThan(String value) {
            addCriterion("pc_display >", value, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("pc_display >=", value, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayLessThan(String value) {
            addCriterion("pc_display <", value, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayLessThanOrEqualTo(String value) {
            addCriterion("pc_display <=", value, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayLike(String value) {
            addCriterion("pc_display like", value, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayNotLike(String value) {
            addCriterion("pc_display not like", value, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayIn(List<String> values) {
            addCriterion("pc_display in", values, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayNotIn(List<String> values) {
            addCriterion("pc_display not in", values, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayBetween(String value1, String value2) {
            addCriterion("pc_display between", value1, value2, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcDisplayNotBetween(String value1, String value2) {
            addCriterion("pc_display not between", value1, value2, "pcDisplay");
            return (Criteria) this;
        }

        public Criteria andPcHddIsNull() {
            addCriterion("pc_hdd is null");
            return (Criteria) this;
        }

        public Criteria andPcHddIsNotNull() {
            addCriterion("pc_hdd is not null");
            return (Criteria) this;
        }

        public Criteria andPcHddEqualTo(String value) {
            addCriterion("pc_hdd =", value, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddNotEqualTo(String value) {
            addCriterion("pc_hdd <>", value, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddGreaterThan(String value) {
            addCriterion("pc_hdd >", value, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddGreaterThanOrEqualTo(String value) {
            addCriterion("pc_hdd >=", value, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddLessThan(String value) {
            addCriterion("pc_hdd <", value, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddLessThanOrEqualTo(String value) {
            addCriterion("pc_hdd <=", value, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddLike(String value) {
            addCriterion("pc_hdd like", value, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddNotLike(String value) {
            addCriterion("pc_hdd not like", value, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddIn(List<String> values) {
            addCriterion("pc_hdd in", values, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddNotIn(List<String> values) {
            addCriterion("pc_hdd not in", values, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddBetween(String value1, String value2) {
            addCriterion("pc_hdd between", value1, value2, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcHddNotBetween(String value1, String value2) {
            addCriterion("pc_hdd not between", value1, value2, "pcHdd");
            return (Criteria) this;
        }

        public Criteria andPcPriceIsNull() {
            addCriterion("pc_price is null");
            return (Criteria) this;
        }

        public Criteria andPcPriceIsNotNull() {
            addCriterion("pc_price is not null");
            return (Criteria) this;
        }

        public Criteria andPcPriceEqualTo(String value) {
            addCriterion("pc_price =", value, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceNotEqualTo(String value) {
            addCriterion("pc_price <>", value, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceGreaterThan(String value) {
            addCriterion("pc_price >", value, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceGreaterThanOrEqualTo(String value) {
            addCriterion("pc_price >=", value, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceLessThan(String value) {
            addCriterion("pc_price <", value, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceLessThanOrEqualTo(String value) {
            addCriterion("pc_price <=", value, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceLike(String value) {
            addCriterion("pc_price like", value, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceNotLike(String value) {
            addCriterion("pc_price not like", value, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceIn(List<String> values) {
            addCriterion("pc_price in", values, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceNotIn(List<String> values) {
            addCriterion("pc_price not in", values, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceBetween(String value1, String value2) {
            addCriterion("pc_price between", value1, value2, "pcPrice");
            return (Criteria) this;
        }

        public Criteria andPcPriceNotBetween(String value1, String value2) {
            addCriterion("pc_price not between", value1, value2, "pcPrice");
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