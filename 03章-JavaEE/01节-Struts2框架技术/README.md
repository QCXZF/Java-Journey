# 01节-Struts2框架技术

## 一、搭建开发环境

- 1>下载struts2安装包 [官网下载链接](https://struts.apache.org/)
- 2>导入所需 **jar包** （可参照实例工程 \apps\struts2-blank\WEB-INF\lib）
- 3>顶层类路径下（一般为 **/src** 下）新建 **struts.xml** 配置文件

```struts
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE struts PUBLIC
	"-//Apache Software Foundation//DTD Struts Configuration 2.3//EN"
	"http://struts.apache.org/dtds/struts-2.3.dtd">
<struts></struts>
```

- 4>配置 **web.xml**
```web.xml
  <!-- 配置Struts的核心控制器,就是一个过滤器 -->
  <filter>
      <filter-name>struts2</filter-name>
      <filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
  </filter>
  <filter-mapping>
      <filter-name>struts2</filter-name>
      <url-pattern>/*</url-pattern>
  </filter-mapping>
```

---

# 二、入门案例

- 1>用户访问网页 -> [index.jsp源码](WebRoot/index.jsp)

- 2>添加 **struts.xml** 对于请求转发的配置 -> [struts.xml源码](src/struts.xml)

- 3>添加 **动作类** 具体实现方法 -> [HelloAction.java源码](src/com/cdut/web/action/HelloAction.java)

- 4>跳转至结果页面 -> [success.jsp源码](WebRoot/success.jsp)
