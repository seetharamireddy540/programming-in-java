package com.ram;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

// Execute around method pattern.
public class SampleApp {

    public static void main(String[] args) {

        Resource.use(resource -> resource.opt1().opt2());
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();

        try {
            ObjectName objectName = new ObjectName("com.ram:type=basic,name=game");
            Game mbean = new Game();
            server.registerMBean(mbean, objectName);
        } catch (MalformedObjectNameException e) {
            e.printStackTrace();
        } catch (NotCompliantMBeanException e) {
            e.printStackTrace();
        } catch (InstanceAlreadyExistsException e) {
            e.printStackTrace();
        } catch (MBeanRegistrationException e) {
            e.printStackTrace();
        }
        try {
            Thread.currentThread().join();
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
