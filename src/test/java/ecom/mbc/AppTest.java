package ecom.mbc;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testTimestamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp timestamp = new java.sql.Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        System.out.println(simpleDateFormat.format(timestamp));
    }
}
