package com.codegenerator.util;

public class ForeignKeyReferences {

	private String principalTable;
	private String principalSchema;
	private String dependentTable;
	private String dependentSchema;
	private String foreignKeyName;
	private String dependentColumn;
	private String principalColumn;

	// Constructor vacío
	public ForeignKeyReferences() {
	}

	// Constructor completo
	public ForeignKeyReferences(String principalTable, String principalSchema, String dependentTable, String dependentSchema,
			String foreignKeyName, String dependentColumn, String principalColumn) {
		this.principalTable = principalTable;
		this.principalSchema = principalSchema;
		this.dependentTable = dependentTable;
		this.dependentSchema = dependentSchema;
		this.foreignKeyName = foreignKeyName;
		this.dependentColumn = dependentColumn;
		this.principalColumn = principalColumn;
	}

	// Getters y Setters
	public String getPrincipalTable() {
		return principalTable;
	}

	public void setPrincipalTable(String principalTable) {
		this.principalTable = principalTable;
	}

	public String getPrincipalSchema() {
		return principalSchema;
	}

	public void setPrincipalSchema(String principalSchema) {
		this.principalSchema = principalSchema;
	}

	public String getDependentTable() {
		return dependentTable;
	}

	public void setDependentTable(String dependentTable) {
		this.dependentTable = dependentTable;
	}

	public String getDependentSchema() {
		return dependentSchema;
	}

	public void setDependentSchema(String dependentSchema) {
		this.dependentSchema = dependentSchema;
	}

	public String getForeignKeyName() {
		return foreignKeyName;
	}

	public void setForeignKeyName(String foreignKeyName) {
		this.foreignKeyName = foreignKeyName;
	}

	public String getDependentColumn() {
		return dependentColumn;
	}

	public void setDependentColumn(String dependentColumn) {
		this.dependentColumn = dependentColumn;
	}

	public String getPrincipalColumn() {
		return principalColumn;
	}

	public void setPrincipalColumn(String principalColumn) {
		this.principalColumn = principalColumn;
	}

	@Override
	public String toString() {
		return String.format("FK: %s | Principal: %s.%s(%s) -> Dependent: %s.%s(%s)", foreignKeyName, principalSchema,
				principalTable, principalColumn, dependentSchema, dependentTable, dependentColumn);
	}
}
