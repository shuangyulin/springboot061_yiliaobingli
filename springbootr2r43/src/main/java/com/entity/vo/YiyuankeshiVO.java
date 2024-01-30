package com.entity.vo;

import com.entity.YiyuankeshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医院科室
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public class YiyuankeshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室类型
	 */
	
	private String keshileixing;
		
	/**
	 * 科室简介
	 */
	
	private String keshijianjie;
		
	/**
	 * 科室人员
	 */
	
	private String keshirenyuan;
		
	/**
	 * 科室图片
	 */
	
	private String keshitupian;
		
	/**
	 * 医院编号
	 */
	
	private String yiyuanbianhao;
				
	
	/**
	 * 设置：科室类型
	 */
	 
	public void setKeshileixing(String keshileixing) {
		this.keshileixing = keshileixing;
	}
	
	/**
	 * 获取：科室类型
	 */
	public String getKeshileixing() {
		return keshileixing;
	}
				
	
	/**
	 * 设置：科室简介
	 */
	 
	public void setKeshijianjie(String keshijianjie) {
		this.keshijianjie = keshijianjie;
	}
	
	/**
	 * 获取：科室简介
	 */
	public String getKeshijianjie() {
		return keshijianjie;
	}
				
	
	/**
	 * 设置：科室人员
	 */
	 
	public void setKeshirenyuan(String keshirenyuan) {
		this.keshirenyuan = keshirenyuan;
	}
	
	/**
	 * 获取：科室人员
	 */
	public String getKeshirenyuan() {
		return keshirenyuan;
	}
				
	
	/**
	 * 设置：科室图片
	 */
	 
	public void setKeshitupian(String keshitupian) {
		this.keshitupian = keshitupian;
	}
	
	/**
	 * 获取：科室图片
	 */
	public String getKeshitupian() {
		return keshitupian;
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
			
}
