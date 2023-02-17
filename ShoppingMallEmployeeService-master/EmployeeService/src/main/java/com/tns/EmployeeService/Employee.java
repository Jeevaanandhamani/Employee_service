package com.tns.EmployeeService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{

	private Integer Employee_Id;
	private String Mall_name;
	private String Employee_Name;
	private Integer Ph_Number;
	private Integer Pwd;

	
	public Employee() 
	{
		super();
	}
	
	public Employee(Integer Employee_Id, String mall_name, String Employee_Name, Integer ph_Number, Integer pwd) 
	{
		super();
		Employee_Id = Employee_Id;
		Mall_name = mall_name;
		Employee_Name = Employee_Name;
		Ph_Number = ph_Number;
		Pwd = pwd;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	public Integer getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(Integer Employee_Id) {
		Employee_Id = Employee_Id;
	}
	public String getMall_name() {
		return Mall_name;
	}
	public void setMall_name(String mall_name) {
		Mall_name = mall_name;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String Employee_Name) {
		Employee_Name = Employee_Name;
	}
	public Integer getPh_Number() {
		return Ph_Number;
	}
	public void setPh_Number(Integer ph_Number) {
		Ph_Number = ph_Number;
	}
	public Integer getPwd() {
		return Pwd;
	}
	public void setPwd(Integer pwd) {
		Pwd = pwd;
	}
	@Override
	
	public String toString()
	{
		return "Employee[Employee id:"+Employee_Id+" Mall Name"+Mall_name+"Employee Name"+Employee_Name+"Phone Number"+Ph_Number+"Password"+Pwd+"]";
	}
}

