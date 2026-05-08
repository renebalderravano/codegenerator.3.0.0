package com.codegenerator.util;

import java.util.List;

public class Table {

	private String schema;
	private String name;
	private List<Column> columns;
	private List<ForeignKeyReferences> tableReferences;
	
	public Table() {
		// TODO Auto-generated constructor stub
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	
	public List<ForeignKeyReferences> getTableReferences() {
		return tableReferences;
	}
	

	public void setTableReferences(List<ForeignKeyReferences> tableReferences) {
		this.tableReferences = tableReferences;
	}

	
}
