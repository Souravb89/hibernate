/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb;

import com.sb.model.Stock;
import com.sb.model.StockDetails;
import com.sb.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author SBiswa32
 */
public class Runner {

    public static void main(String[] args) {
        System.out.println("Start");
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Stock st = new Stock();
            st.setStockCode("123");
            st.setStockName("name");
            //session.save(st);
            StockDetails details = new StockDetails();
            details.setCompDesc("LTI Bangalore");
            details.setCompName("L&T");
            details.setRemark("LTI Remark");
            details.setListedDate(new Date());
            st.getStockDetails().add(details);
            
            details.setStock(st);
            session.save(st);
            session.save(details);
            
            transaction.commit();
        }
        //transaction.
        Session s=HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = s.beginTransaction();
        //Stock stock1=session.get(Stock.class, 1);
        Stock stock1=s.get(Stock.class, 1);
        //Stock stock=s.load(Stock.class, 2);
        Query createQuery = s.createQuery("from Stock");
        List list = createQuery.list();
        Query cre = s.createQuery("from StockDetails");
        List list1 = cre.list();
        //createQuery.
        System.out.println(stock1.getStockDetails().iterator().next().getListedDate());
        System.out.println("Done");
        
    }
    
}
