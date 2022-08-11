/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import add.Add1;
import delete.delete1;
import display.display1;
import java.sql.Statement;
import mainhome.connection;
import modify.modify1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import report.showReport;

/**
 *
 * @author aaa
 */
public class Store {
    Add1 add;
    delete1 delete;
    display1 display;
    modify1 modify;
    showReport report;
    connection con;
    public Store() {
        add=new Add1();
         delete=new delete1();
          display=new display1();
           modify=new modify1();
            report=new showReport();
        con =new connection();
    }
       //التخقق من دالة الاضافة
    @Test
    public void TestAdd1(){
    assertFalse(add.Add(4, "mama3", "no", "34/5", "25/9"));
    }
         //التخقق من دالة الحدق
    @Test
    public void Testdelete(){
    assertEquals("fail",delete.delete(55));
    }
      @Test
      //test 
      //the select =order_id ,customer_id,status,date,shipping_date
    public void Testupdate(){
    assertEquals("fail",modify.update("date", 0, "14/2"));
    }
      @Test
      //text display
      //the display available tables
    public void Testdisplay(){
    assertEquals("fail",display.showo("order"));
    }
       @Test
      //text report
      //the report to the valid date
    public void Testreport(){
    assertFalse(report.showreport("34/9"));
    }
      @Test
      //text Verification order_ID
      //the Verification from the valid order_ID
    public void TestVerification(){
    assertFalse(delete.verfication(44));
    }
    @BeforeClass
    public static void setUpClass() {
//con.connect();
    }
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
