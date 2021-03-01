package com.hibernate.DemoHib;

import java.sql.ResultSet;
import java.util.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.Session.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Employee e= new Employee();
//        EmpName name = new EmpName();
//        name.setFname("Shreesh");
//        name.setLname("Srivastava");
//        
//        e.setId(2);
//        e.setEname(name);
//        e.setAge(22);
//        
//        Configuration con =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
//        
//        SessionFactory sf = con.buildSessionFactory();
//        Session session =sf.openSession();
//        
//        Transaction tx= session.beginTransaction();
//        session.save(e);
//        e = (Employee)session.get(Employee.class,2);
//        
//        tx.commit();
//        System.out.println(e);
        Menu outObj=new Menu();
        Scanner sch = new Scanner(System.in);
        int choice;
        String sql;
        do 
        {
        	System.out.println("\n\n----------MENU-------\n");
            outObj.printList();
            choice = sch.nextInt();
            Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
    		SessionFactory sf=con.buildSessionFactory();
    		Session session= sf.openSession();
    		Transaction tx=session.beginTransaction();

            switch (choice)
            {
                case 1:
                	System.out.println("\n\n");
                	Employee addE=outObj.entChoice();
                	if (Objects.isNull(addE))
                		break;
                	else {
                		session.save(addE);
                		System.out.println("----------------------------------");
                		System.out.println("EMPLOYEE ADDED");
                		System.out.println("----------------------------------");
                		tx.commit();
                	}
                	System.out.println("\n\n");
                	break;
                case 2: 
                	System.out.println("\n\n");
                	System.out.println("Enter the ID to update");
                	int oldID=sch.nextInt();
                	outObj.printChoice();
                	int updChoice=sch.nextInt();
                	sch.nextLine();
                	
                	Employee updateRec=null;
                	switch(updChoice)
                	{
                		
                		case 1:
                			System.out.println("Enter New First Name");
                			String newFN=sch.nextLine();
                			sql = String.format("Update Employee SET fname='%s' where id='%d';",newFN,oldID);
                    		try {
                    			session.createSQLQuery(sql).executeUpdate();
                    			System.out.println("----------------------------------");
                    			System.out.println("FIRST NAME UPDATED");
                    			System.out.println("----------------------------------");
                    			tx.commit();
                    		}
                    		catch(Exception e2) {
                    			System.out.println("Employee Not Found!");
                    		}
                    		break;
                    	
                		case 2:
                			System.out.println("Enter New Last Name");
                			String newLN=sch.nextLine();
                			sql = String.format("Update Employee SET lname='%s' where id='%d';",newLN,oldID);
                    		try {
                    			session.createSQLQuery(sql).executeUpdate();
                    			System.out.println("----------------------------------");
                    			System.out.println("LAST NAME UPDATED");
                    			System.out.println("----------------------------------");
                    			tx.commit();
                    		}
                    		catch(Exception e2) {
                    			System.out.println("Employee Not Found!");
                    		}
                    		break;
                    	                		
                		case 3:
                			System.out.println("Enter New Age");
                			int newAGE=sch.nextInt();
                			sch.nextLine();
                			sql = String.format("Update Employee SET age='%d' where id='%d';",newAGE,oldID);
                    		try {
                    			session.createSQLQuery(sql).executeUpdate();
                    			System.out.println("----------------------------------");
                    			System.out.println("AGE UPDATED");
                    			System.out.println("----------------------------------");
                    			tx.commit();
                    		}
                    		catch(Exception e2) {
                    			System.out.println("Employee Not Found!");
                    		}
                    		break;
             			
                		default:
                			System.out.println("Invalid Choice!");
                			break;	
                	}
                	System.out.println("\n\n");
                    break;
                case 3: 
                	System.out.println("\n\n");
                    System.out.println("Enter ID to delete");
                    int toDel=sch.nextInt();
        			sch.nextLine();
        			sql = String.format("Delete from Employee where id='%d';",toDel);
            		try {
            			session.createSQLQuery(sql).executeUpdate();
            			System.out.println("**********RECORD DELETED*************");
            			tx.commit();
            		}
            		catch(Exception e2) {
            			System.out.println("Employee Not Found!");
            		}
            		System.out.println("\n\n");
                    break;
                   
                case 4:
                	System.out.println("\n\n");
            		try {
            			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            			CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
            			Root<Employee> root = criteriaQuery.from(Employee.class);
            			criteriaQuery.select(root);
            			Query<Employee> query = session.createQuery(criteriaQuery);
            			List<Employee> EmployeeList = query.getResultList();
            			//System.out.println(EmployeeList);
            			System.out.println("------------Printing All Results---------");
            			for(int i=0;i<EmployeeList.size();i++) {
            				System.out.println("Emloyee: "+(i+1));
            				Employee temp= (Employee) EmployeeList.get(i);
            				System.out.println(temp.toString());
            			}
            			System.out.println("\n\n");
            			
            		}
            		catch(Exception e2) {
            			System.out.println("Employee Not Found!");
            		}
            		break;
            		
                case 5:
                	System.out.println("\n\n");
                	Employee fetchedID=null;
                	System.out.println("Enter ID whose records to be fetched");
                    int userID=sch.nextInt();
                    System.out.println("\nFETCHIING RECORD....");
                	fetchedID=(Employee) session.get(Employee.class, userID);
                	System.out.println(fetchedID.toString());
                	break;
                	
                	
                default:
                    System.out.println("Choice must be a value between 1 and 6.");
            }   
        	
        }while(choice!=6);
    }
}
