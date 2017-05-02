# 01节-html

## 一、html简介

- 超文本标记语言（Hyper Text Markup Language）, 是一种 **标记语言**（与 **编程语言** 相对应）

## 二、html书写规范


  > &lt;html&gt;<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&lt;head&gt;<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;包括资讯信息 : 整个页面的属性, 指导浏览器解析标签,引入外部文件的标签<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&lt;/head&gt;<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&lt;body&gt;<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们需要展示的内容<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&lt;/body&gt;<br>
> &lt;/html&gt;

---

## 三、html基本标签

- ### 1、文件标签（结构标签）
  - &lt;html&gt;: 根标签
    - &lt;head&gt;
      - &lt;title&gt;: 页面的标题<br>
    - &lt;body text="green" bgcolor="black" background="images/...jpg"&gt;<br>
		↓↓↓<br>
      - text : 文本的颜色  为绿
	  - bgcolor : 背景色  为黑
	  - background : 背景图片  某张jpg（在 bgcolor 的上层）

- 另 : **颜色** 写法:
  - ① 单词 : red  green  black
  - ② rgb : rgb(0,0,0)	0~255
  - ③ 十六进制 : #000000 黑色	#ffffff 白色	# 3245b3(通过ColorPicker拾取颜色)

- 尺寸写法:
  - ① ?px ->多少像素
  - ② ?%  ->占百分比	区别 : 百分比会随着标签大小进行 **动态改变**

- ### 2、排版标签
  - ① 注释标签 &lt;!-- --&gt;
  - ② 换行标签 &lt;br/&gt;
  - ③ 段落标签 &lt;p align="left / center / right"&gt;&lt;/p&gt;	注:段与段之间有空行
  - ④ 水平线标签 &lt;hr width="长度(px) / %" size="粗度px" color="颜色" align="默认为center"&gt;

- ### 3、块标签
  - ① 行级块标签 : &lt;div&gt;(默认占据 **一整行**)	->div+css布局
  - ② 行内块标签 : &lt;span&gt;(仅占据一行 **一部分**)	->进行友好提示

- ### 4、文字标签
  - ① 基本标签 : &lt;font color="red" size="最小1,最大7,默认3" face="黑体"&gt;
  - ② 标题标签 : &lt;h1&gt;-&lt;h6&gt;	数字↑字体↓,默认加粗,并占据一行

- ### 5、清单标签
  - ① 无序列表 : &lt;ul type="默认disc / square / circle"&gt;
	  - &lt;li&gt;: 列表项
  - ② 有序列表 : &lt;ol type="1,A,a,I,i" start="开始位置的数字"&gt;

	作用 : 网页菜单(结合css修饰)

- ### 6、图形标签
  - &lt;img src="images/...jpg" width="70%" height="70%" border="5" align="top/middle/bottom与文本相对位置" alt="文字说明" /&gt;

- ### 7、链接标签
  - &lt;a href="地址" name="锚点名称" target="默认_self **本页** 打开 / _blank **空白页** 打开"&gt;

    - 作用 :
    - ①页面跳转
	   - 注 : 访问外网资源,前面必须加协议 **http://** ,否则访问本地相对位置
    - ②锚点访问
     - 访问锚点的时候 书写格式 href="#name的值"	# 代表本页

- ### 8、表格标签
  - &lt;table border="2" width="50%" align="center" bgcolor="blue"&gt;
    - &lt;caption&gt;表格标题&lt;/caption&gt;
    - &lt;tr align="center"&gt;
      - &lt;th&gt;表头(默认居中加粗)&lt;/th&gt;
      - &lt;td colspan="列合并" rowspan="行合并"&gt;单元格&lt;/td&gt;	// 可进行布局
  - &lt;thead&gt;
  - &lt;tbody&gt;
  - &lt;tfoot&gt;		优化加载，增强用户体验

  ## 四、表单标签(重点)

- ### 1、form标签:
  - &lt;form name="表单名称" action="提交地址" method="get / post"&gt;&lt;/form&gt;

  - get / post的区别(重点) :
> (1)get提交将数据加在地址栏的后面，post提交将数据封装在请求体中<br>
>	(2) get提交相对不安全；post提交相对安全<br>
> (3) get提交有大小限制，根据浏览器不同而不同；post不限制大小<br>

&nbsp;&nbsp;&nbsp;&nbsp;&lt;form&gt;<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;table&gt;<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;!--form里面嵌套table--&gt;<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;/table&gt;<br>
&nbsp;&nbsp;&nbsp;&nbsp;&lt;/form&gt;

- ### 2、input标签 :
  - &lt;input type=" "/&gt;&nbsp;&nbsp;&nbsp;&nbsp;type属性 : 根据type属性实现各种不同功能的表单项；

    - ① text : 普通的文本输入框<br>
      - &lt;input type="text" name="" value="显示默认值"/&gt;
    - ② password : 密码输入框，显示为掩码<br>
      - &lt;input type="password" name="" value="显示默认值"/&gt;
    - ③ radio : 单选按钮<br>
      - &lt;input type="radio" name="name1" value="提交的值"/&gt;显示的值<br>
      - &lt;input type="radio" name="name1" value="提交的值" checked="checked"默认被选中/&gt;显示的值<br>
        - 注: 若想让一组单选按钮互斥，就用指定同一name属性值
    - ④ checkbox : 复选框<br>
      - &lt;input type="checkbox" name="name1" value="提交的值"/&gt;显示的值<br>
      - &lt;input type="checkbox" name="name1" value="提交的值" checked="checked"默认被选中/&gt;显示的值
        - 注: 若想多个复选框为一组，就用指定同一name属性值
    - ⑤ file : 上传控件<br>
      - &lt;input type="file" name=""/&gt;
    - ⑥ button : 普通按钮，没有功能 (可做响应事件)<br>
      - &lt;input type="button" name="" value="显示文字"/&gt;
    - ⑦ submit : 提交按钮，提交给action页面<br>
      - &lt;input type="submit" name="" value="显示文字"/&gt;
    - ⑧ reset : 重置按钮<br>
      - &lt;input type="reset" name="" value="显示文字"/&gt;
    - ⑨ image : 图片按钮，功能类似与submit<br>
      - &lt;input type="image" src="...jpg" alt="图片提示文字"/&gt;
    - ⑩ hidden : 隐藏表单，作用是在提交数据的时候，服务器需要这个数据，但是不需要用户看到。

- ### 3.select标签 :
	- &lt;select name="下拉菜单名称"&gt;&lt;/select&gt;
	  - &lt;option value="表单项的值"&gt;一个选择项的显示&lt;/option&gt;<br>
	  - &lt;option value="表单项的值" selected默认被选中&gt;一个选择项的显示&lt;/option&gt;<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; → 注 : 与 单选/多选 的 **checked** 相区分

- ### 4.textarea标签 :
  - &lt;textarea cols="列数" rows="行数"&gt;默认的文本值&lt;/textarea&gt;

## 五、html框架标签及其他
- ### 1、框架标签 ：
```
  	<frameset rows="80,*"&gt;	// 按行分隔，*代表剩余部分
  		→ 注 : frameset 与 body 不能同时存在
  		<frame name="名称" src="加载页面地址"&gt;
  			→ 方便 <a target> 进行定位
  		<frameset cols="150,*"&gt;	// 按列分隔
  			<frame ...>
  			<frame ...>
  	&lt;/frameset>
```
- ### 2、其他标签 ：
  - #### ① &lt;meta&gt; :
  	- &lt;meta http-equiv="keywords" content="keyword1,keyword2,keyword3"&gt;	// 关键字,可通过SEO搜索到
  	- &lt;meta http-equiv="description" content="this is my page"&gt;			// 描述
  	- &lt;meta http-equiv="content-type" content="text/html; charset=UTF-8"&gt;	// 文本的类型,用UTF-8进行解析(固定写法,重点)
  - #### ② &lt;link&gt; :
  	-	&lt;link rel="stylesheet" type="text/css" href=""&gt;	// 引入CSS
  			href：引入css文件的地址
  - #### ③ &lt;script&gt; :
  	- &lt;script type="text/javascript" src=""&gt;&lt;/script&gt;	// 引入JavaScript
  		- src：js的文件地址

- ### 3、特殊字符 :
  -	&+nbsp;	空格
  -	&+gt;	大于号
  -	&+lt;	小于号
  -	&+copy;	版权符号
  -	&+reg;	注册符号
