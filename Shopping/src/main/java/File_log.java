import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.*;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class File_log
{
//static Logger log=Logger.getLogger(File_log.class.getName());
static Logger log=Logger.getLogger("Login_INFO");
public static void action(Object uname,String message,String ip)
{
    Layout ly=new SimpleLayout();
Appender a1;
try
{
    a1=new FileAppender(ly,"log_file.txt",false);
    log.addAppender(a1);
    log.info(uname+" "+message+"/"+"IP Address"+ip);
}
catch(Exception ex)
{
log.fatal(ex);
}
System.out.println("Log file create successfully>>>>");
} 


}
