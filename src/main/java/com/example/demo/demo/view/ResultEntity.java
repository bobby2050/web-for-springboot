package com.example.demo.demo.view;

import com.example.demo.demo.constant.SystemDef;

import java.io.Serializable;




public class ResultEntity<T> implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -770757151967874634L;

	/**
	 * 返回状态码
	 */
	private Integer code = SystemDef.SYS_RESULT_STATUS.OK.getValue(); // 默认为成功;
	/**
	 * 返回结果
	 */
	private T data;
	/**
	 * 返回描述
	 */
	private String msg;

	public ResultEntity() {
		super();
	}

	public ResultEntity( T data ) {
		super();
		this.data = data;
	}

	public ResultEntity( SystemDef.SYS_RESULT_STATUS result ) {
		super();
		this.code = result.getValue();
		this.msg = result.getRemark();
	}

	public ResultEntity(SystemDef.SYS_RESULT_STATUS result, T data ) {
		super();
		this.code = result.getValue();
		this.data = data;
		this.msg = result.getRemark();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
