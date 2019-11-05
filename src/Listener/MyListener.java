package Listener;

import javax.servlet.*;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听器的使用：
 * 	作用:
 * 		监听作用域对象request、session、application的创建、销毁和内容的改变
 * 	使用:
 * 		创建一个实现了指定接口的java类
 * 			监听request--->ServletRequestListener  监听request对象的创建和销毁
 * 				requestInitialized(ServletRequestEvent sre)//创建
 * 				requestDestroyed(ServletRequestEvent sre)//销毁
 * 				注意:
 * 					形参可以获取监听的request对象
 * 					sre.getServletRequest();
 *			监听request--->ServletRequestAttributeListener  监听request作用域数据的变更。
 attributeAdded(ServletRequestAttributeEvent srae)
 * 				attributeRemoved(ServletRequestAttributeEvent srae)
 * 				attributeReplaced(ServletRequestAttributeEvent srae)
 * 				注意：形参可以获取被监听的数据
 * 					srae.getName()  获取监听数据的键
 * 					srae.getValue() 获取监听数据的值
 *			监听session--->HttpSessionListener 监听session的创建和销毁
 *				sessionCreated(HttpSessionEvent se)  创建
 *				sessionDestroyed(HttpSessionEvent se) 销毁
 *				注意：形参可以获取被监听的session对象
 *					se.getSession();
 *			监听session--->HttpSessionAttributeListener 监听session数据的变更
 *				attributeAdded(HttpSessionBindingEvent event)
 *				attributeRemoved(HttpSessionBindingEvent event)
 *				attributeReplaced(HttpSessionBindingEvent event)
 *				注意:形参可以获取被监听的数据
 *					event.getName() 	获取数据的键名
 *					event.getValue()	获取数据的值
 *			监听application--->ServletContextListener 监听application对象的初始化和销毁
 *				contextInitialized(ServletContextEvent sce) 初始化    服务器启动
 *				contextDestroyed(ServletContextEvent sce)	销毁	     服务器关闭
 *				注意：
 *					形参可以获取当前application对象。
 *					sce.getServletContext();
 监听application--->ServletContextAttributeListener 监听数据的变更
 attributeAdded(ServletContextAttributeEvent event)
 *					attributeRemoved(ServletContextAttributeEvent event)
 *					attributeReplaced(ServletContextAttributeEvent event)
 *				注意：
 *					形参可以获取当前监听的数据
 *					event.getName()  获取数据的键名
 *					event.getValue() 获取数据的值
 * 		在web.xml中配置监听器类
 * 			<listener>
 <listener-class>src.MyListener</listener-class>
 </listener>
 案例：
 *
 */
public class MyListener implements ServletRequestListener , ServletRequestAttributeListener , HttpSessionListener , HttpSessionAttributeListener , ServletContextListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("创建");
    }
//ServletRequestAttributeListener 内容增加删除修改
    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        servletRequestAttributeEvent.getName();
        servletRequestAttributeEvent.getValue();

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }


    //session

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }

//session 数据变更
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    //

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}