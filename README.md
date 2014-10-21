mybatis-generator-plugins-auto-comments
=======================================

将数据库中的注释自动带入java bean中的插件


本插件的作用：
    当从数据反向生成Java Bean的时候，会自动将数据的字段、表注释带入Java Bean注释，同时可以配置Java Bean的作者。目前测试过的数据库有MySql、PostgreSQL

用法：
1. 把本java类加入mybatis generator的classpath中。
2. 在generatorConfig.xml（也可能叫别的名字）配置文件中进行如下配置：

<code>
    <plugin type="org.mybatis.generator.plugin.CommentPlugin">
    	<!-- 制定java bean的作者，默认情况下会读取计算机当前用户作为作者 -->
			<property name="modelClassAuthor" value="tanxw"/>
		</plugin>
		<commentGenerator>
			<!-- 不生成原生的注解信息 -->
			<property name="suppressAllComments" value="true" />
		</commentGenerator>
</code>
