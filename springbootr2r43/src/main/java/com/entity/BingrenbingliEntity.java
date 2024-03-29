package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病人病历
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
@TableName("bingrenbingli")
public class BingrenbingliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BingrenbingliEntity() {
		
	}
	
	public BingrenbingliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 医院编号
	 */
					
	private String yiyuanbianhao;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 婚姻
	 */
					
	private String hunyin;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 现住地址
	 */
					
	private String xianzhudizhi;
	
	/**
	 * 入院日期
	 */
					
	private String ruyuanriqi;
	
	/**
	 * 主诉
	 */
					
	private String zhusu;
	
	/**
	 * 现病史
	 */
					
	private String xianbingshi;
	
	/**
	 * 既往史
	 */
					
	private String jiwangshi;
	
	/**
	 * 个人史
	 */
					
	private String gerenshi;
	
	/**
	 * 家族史
	 */
					
	private String jiazushi;
	
	/**
	 * 体格检查
	 */
					
	private String tigejiancha;
	
	/**
	 * 病历摘要
	 */
					
	private String binglizhaiyao;
	
	/**
	 * 初步诊断
	 */
					
	private String chubuzhenduan;
	
	/**
	 * 医生账号
	 */
					
	private String yishengzhanghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：医院编号
	 */
	public void setYiyuanbianhao(String yiyuanbianhao) {
		this.yiyuanbianhao = yiyuanbianhao;
	}
	/**
	 * 获取：医院编号
	 */
	public String getYiyuanbianhao() {
		return yiyuanbianhao;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：婚姻
	 */
	public void setHunyin(String hunyin) {
		this.hunyin = hunyin;
	}
	/**
	 * 获取：婚姻
	 */
	public String getHunyin() {
		return hunyin;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：现住地址
	 */
	public void setXianzhudizhi(String xianzhudizhi) {
		this.xianzhudizhi = xianzhudizhi;
	}
	/**
	 * 获取：现住地址
	 */
	public String getXianzhudizhi() {
		return xianzhudizhi;
	}
	/**
	 * 设置：入院日期
	 */
	public void setRuyuanriqi(String ruyuanriqi) {
		this.ruyuanriqi = ruyuanriqi;
	}
	/**
	 * 获取：入院日期
	 */
	public String getRuyuanriqi() {
		return ruyuanriqi;
	}
	/**
	 * 设置：主诉
	 */
	public void setZhusu(String zhusu) {
		this.zhusu = zhusu;
	}
	/**
	 * 获取：主诉
	 */
	public String getZhusu() {
		return zhusu;
	}
	/**
	 * 设置：现病史
	 */
	public void setXianbingshi(String xianbingshi) {
		this.xianbingshi = xianbingshi;
	}
	/**
	 * 获取：现病史
	 */
	public String getXianbingshi() {
		return xianbingshi;
	}
	/**
	 * 设置：既往史
	 */
	public void setJiwangshi(String jiwangshi) {
		this.jiwangshi = jiwangshi;
	}
	/**
	 * 获取：既往史
	 */
	public String getJiwangshi() {
		return jiwangshi;
	}
	/**
	 * 设置：个人史
	 */
	public void setGerenshi(String gerenshi) {
		this.gerenshi = gerenshi;
	}
	/**
	 * 获取：个人史
	 */
	public String getGerenshi() {
		return gerenshi;
	}
	/**
	 * 设置：家族史
	 */
	public void setJiazushi(String jiazushi) {
		this.jiazushi = jiazushi;
	}
	/**
	 * 获取：家族史
	 */
	public String getJiazushi() {
		return jiazushi;
	}
	/**
	 * 设置：体格检查
	 */
	public void setTigejiancha(String tigejiancha) {
		this.tigejiancha = tigejiancha;
	}
	/**
	 * 获取：体格检查
	 */
	public String getTigejiancha() {
		return tigejiancha;
	}
	/**
	 * 设置：病历摘要
	 */
	public void setBinglizhaiyao(String binglizhaiyao) {
		this.binglizhaiyao = binglizhaiyao;
	}
	/**
	 * 获取：病历摘要
	 */
	public String getBinglizhaiyao() {
		return binglizhaiyao;
	}
	/**
	 * 设置：初步诊断
	 */
	public void setChubuzhenduan(String chubuzhenduan) {
		this.chubuzhenduan = chubuzhenduan;
	}
	/**
	 * 获取：初步诊断
	 */
	public String getChubuzhenduan() {
		return chubuzhenduan;
	}
	/**
	 * 设置：医生账号
	 */
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}

}
