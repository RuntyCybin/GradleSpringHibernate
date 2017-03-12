package com.cybindev;


import com.cybindev.config.AppConfig;
import com.cybindev.dao.IPersonDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PruebaHibernate {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        IPersonDao pdao = ctx.getBean(IPersonDao.class);
        pdao.savePerson();
        System.out.println("DONE!");
    }
}
