package com.example.demo.demo.constant;

public class SystemDef {


	public enum SYS_RESULT_STATUS {
		OK(10000,"success"), //状态码 统一用5位数字; 操作成功
		FAIL(20000,"fail"); // 服务器异常
		
		
		
		private Integer value;
		private String remark;
		
		SYS_RESULT_STATUS(Integer value , String remark ) {
			this.value = value;
			this.remark = remark;
		}

		public Integer getValue() {
			return this.value;
		}
		public String getRemark() {
			return this.remark;
		}
	}
	

	/**
	 * 分类
	 * @author abc
	 *
	 */
	public enum CATEGORY {
		MEDICAL_CARE(1,"Medical Care")
		;  
		
		
		
		private Integer value;
		private String remark;
		
		CATEGORY(Integer value , String remark ) {
			this.value = value;
			this.remark = remark;
		}

		public Integer getValue() {
			return this.value;
		}
		public String getRemark() {
			return this.remark;
		}
	}

	
	
	
	
}
