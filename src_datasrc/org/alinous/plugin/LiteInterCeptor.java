package org.alinous.plugin;

import java.util.ArrayList;
import java.util.List;

import org.alinous.plugin.openec.OpenEcSetupper;

public class LiteInterCeptor extends NumberInterceptor{
	
	private List<String> tableList = new ArrayList<String>();
	
	public LiteInterCeptor()
	{
		OpenEcSetupper.setup(this.tableList);
	}
	
	@Override
	protected int getMaxRecord()
	{
		return 400;
	}

	@Override
	protected boolean isUnlimitedTable(String tableName)
	{
		if(tableName == null){
			return false;
		}
		
		String upperName = tableName.toUpperCase();
		boolean isUnlimit = this.tableList.contains(upperName);
		if(isUnlimit){
			return true;
		}
		
		if(upperName.startsWith("CUSTOM_MULTIPLEVALUE_")){
			return true;
		}
		if(upperName.startsWith("CUSTOM_TABLE")){
			return true;
		}
		
		return false;
	}
}

