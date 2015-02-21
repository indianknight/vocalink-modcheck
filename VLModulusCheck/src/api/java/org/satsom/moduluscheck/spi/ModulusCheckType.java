package org.satsom.moduluscheck.spi;

public enum ModulusCheckType {
	
	MOD10("MOD10"),MOD11("MOD11"),DBLAL("DBLAL");
	
	private ModulusCheckType(String checkType) {
		this.checkType = checkType;
	}
	
	public String getCheckType(){
		return this.checkType;
	}
	
	private String checkType;
}
