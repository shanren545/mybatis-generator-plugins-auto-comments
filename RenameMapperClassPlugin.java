package org.mybatis.generator.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * 将Mapper类改成DAO类
 * 
 * @author tanxw
 *
 */
public class RenameMapperClassPlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public void initialized(IntrospectedTable intrp) {
		intrp.setMyBatis3JavaMapperType(intrp.getMyBatis3JavaMapperType().replaceAll("Mapper$", "DAO"));
	}
}
