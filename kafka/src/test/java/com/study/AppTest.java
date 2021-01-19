package com.study;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@EmbeddedKafka(count = 1,ports = 9093)
public class AppTest 
{
    @Test
    public void contextLoads()throws IOException {
        System.in.read();
    }


}
