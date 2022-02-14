package com.williamdsw.structural.decorator.classes;

public class DataSourceDecorator implements IDataSource {

	private IDataSource wrappee;

	public DataSourceDecorator(IDataSource source) {
		this.wrappee = source;
	}

	// OVERRIDED FUNCTIONS

	@Override
	public void writeData(String data) {
		wrappee.writeData(data);
	}

	@Override
	public String readData() {
		return wrappee.readData();
	}
}
