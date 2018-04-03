package com.design.patterns.FactoryDesignPattern;

public enum OeratingSystemType {
	Windows("Windows") 
	{
	public OperatingSystem getOperatingSystem() 
	{
	return new WindowsOS();
	}
	},
	
	IOS("IOS")
	{
	public OperatingSystem getOperatingSystem() {
	return new IOS();
	}
	},
	
	Android("Android")
	{
	public OperatingSystem getOperatingSystem() {
	return new AndroidOS();
	}
	};
	
	public abstract OperatingSystem getOperatingSystem(); 
	
	private String type;
	
	private OeratingSystemType(String type) {
		this.type = type;
	}
	
	public String getOeratingSystemType() {
		return type;
	}
}
