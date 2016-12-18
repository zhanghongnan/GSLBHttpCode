package jetty.web;

import jetty.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static javax.servlet.http.HttpServletResponse.*;

/**
 * Created by 张宏南 on 2016-10-25.
 * Project GSLBHttpCode
 * Package jetty.web.SampleController
 */
@RestController
@RequestMapping("/api")
@EnableAutoConfiguration
public class SampleController {
    private long time=1;

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/status100")
    public String status100(HttpServletResponse response) {
        response.setStatus(SC_CONTINUE );
        System.out.println("status100");
        return this.helloWorldService.getMessage100();
    }
    @RequestMapping("/status101")
    public String status101(HttpServletResponse response) {
        response.setStatus(SC_SWITCHING_PROTOCOLS);
        System.out.println("status101");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status200")
    public String status200(HttpServletResponse response) {
        response.setStatus(SC_OK);
        System.out.println("status200");
        return this.helloWorldService.getHelloMessage();
    }
    @RequestMapping("/status201")
    public String status201(HttpServletResponse response) {
        response.setStatus(SC_CREATED);
        System.out.println("status201");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status202")
    public String status202(HttpServletResponse response) {
        response.setStatus(SC_ACCEPTED);
        System.out.println("status202");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status203")
    public String status203(HttpServletResponse response) {
        response.setStatus(SC_NON_AUTHORITATIVE_INFORMATION );
        System.out.println("status203");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status204")
    public String status204(HttpServletResponse response) {
        response.setStatus(SC_NO_CONTENT  );
        System.out.println("status204");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status205")
    public String status205(HttpServletResponse response) {
        response.setStatus(SC_RESET_CONTENT  );
        System.out.println("status205");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status206")
    public String status206(HttpServletResponse response) {
        response.setStatus(SC_PARTIAL_CONTENT  );
        System.out.println("status206");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status300")
    public String status300(HttpServletResponse response) {
        response.setStatus(SC_MULTIPLE_CHOICES);
        System.out.println("status300");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status301")
    public String status301(HttpServletResponse response) {
        response.setStatus(SC_MOVED_PERMANENTLY );
        System.out.println("status301");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status302m")
    public String status302m(HttpServletResponse response) {
        response.setStatus(SC_MOVED_TEMPORARILY  );
        System.out.println("status302m");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status302f")
    public String status302f(HttpServletResponse response) {
        response.setStatus(SC_FOUND);
        System.out.println("status302f");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status303")
    public String status303(HttpServletResponse response) {
        response.setStatus(SC_SEE_OTHER);
        System.out.println("status303");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status304")
    public String status304(HttpServletResponse response) {
        response.setStatus(SC_NOT_MODIFIED);
        System.out.println("status304");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status305")
    public String status305(HttpServletResponse response) {
        response.setStatus(SC_USE_PROXY);
        System.out.println("status305");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status307")
    public String status307(HttpServletResponse response) {
        response.setStatus(SC_TEMPORARY_REDIRECT );
        System.out.println("status307");
        return this.helloWorldService.getMessage();
    }
//    4**和5**   可以使用sendError用于发送表示错误消息的状态码（也就是400~599之间的状态码），而且还可以设置状态消息。
//    public  void  sendError (int  sc)  throws  IOException
//    public  void  sendError (int  sc, String  msg)  throws  IOException
//        response.sendError(SC_NOT_FOUND);
    @RequestMapping("/status400")
    public String status400(HttpServletResponse response) {
        response.setStatus(SC_BAD_REQUEST);
        System.out.println("status400");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status401")
    public String status401(HttpServletResponse response) {
        response.setStatus(SC_UNAUTHORIZED);
        System.out.println("status401");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status402")
    public String status402(HttpServletResponse response) {
        response.setStatus(SC_PAYMENT_REQUIRED);
        System.out.println("status402");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status403")
    public String status403(HttpServletResponse response) {
        response.setStatus(SC_FORBIDDEN);
        System.out.println("status403");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status404")
    public String status404(HttpServletResponse response) throws IOException {
        response.setStatus(SC_NOT_FOUND );
        System.out.println("status404");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status405")
    public String status405(HttpServletResponse response) {
        response.setStatus(SC_METHOD_NOT_ALLOWED  );
        System.out.println("status405");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status406")
    public String status406(HttpServletResponse response) {
        response.setStatus(SC_NOT_ACCEPTABLE);
        System.out.println("status406");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status407")
    public String status407(HttpServletResponse response) {
        response.setStatus(SC_PROXY_AUTHENTICATION_REQUIRED);
        System.out.println("status407");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status408")
    public String status408(HttpServletResponse response) {
        response.setStatus(SC_REQUEST_TIMEOUT);
        System.out.println("status408");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status409")
    public String status409(HttpServletResponse response) {
        response.setStatus(SC_CONFLICT);
        System.out.println("status409");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status410")
    public String status410(HttpServletResponse response) {
        response.setStatus(SC_GONE);
        System.out.println("status410");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status411")
    public String status411(HttpServletResponse response) {
        response.setStatus(SC_LENGTH_REQUIRED);
        System.out.println("status411");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status412")
    public String status412(HttpServletResponse response) {
        response.setStatus(SC_PRECONDITION_FAILED);
        System.out.println("status412");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status413")
    public String status413(HttpServletResponse response) {
        response.setStatus(SC_REQUEST_ENTITY_TOO_LARGE );
        System.out.println("status413");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status414")
    public String status414(HttpServletResponse response) {
        response.setStatus(SC_REQUEST_URI_TOO_LONG);
        System.out.println("status414");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status415")
    public String status415(HttpServletResponse response) {
        response.setStatus(SC_UNSUPPORTED_MEDIA_TYPE);
        System.out.println("status415");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status416")
    public String status416(HttpServletResponse response) {
        response.setStatus(SC_REQUESTED_RANGE_NOT_SATISFIABLE);
        System.out.println("status416");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status417")
    public String status417(HttpServletResponse response) {
        response.setStatus(SC_EXPECTATION_FAILED);
        System.out.println("status417");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status500")
    public String status500(HttpServletResponse response) {
        response.setStatus(SC_INTERNAL_SERVER_ERROR );
        System.out.println("status500");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status501")
    public String status501(HttpServletResponse response) {
        response.setStatus(SC_NOT_IMPLEMENTED);
        System.out.println("status501");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status502")
    public String status502(HttpServletResponse response) {
        response.setStatus(SC_BAD_GATEWAY);
        System.out.println("status502");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status503")
    public String status503(HttpServletResponse response) {
        response.setStatus(SC_SERVICE_UNAVAILABLE);
        System.out.println("status503");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status504")
    public String status504(HttpServletResponse response) {
        response.setStatus(SC_GATEWAY_TIMEOUT);
        System.out.println("status504");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status505")
    public String status505(HttpServletResponse response) {
        response.setStatus(SC_HTTP_VERSION_NOT_SUPPORTED);
        System.out.println("status505");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/status888")
    public String status888(HttpServletResponse response) {
        response.setStatus(888,"no status code");
        System.out.println("status888");
        return this.helloWorldService.getMessage();
    }
    @RequestMapping("/wait1")
    public String wait1(HttpServletResponse response) throws InterruptedException {
        Thread.sleep(1*1000);
        response.setStatus(200);
        System.out.println("wait1S");
        return this.helloWorldService.getMessage200();
    }
    @RequestMapping("/wait5")
    public String wait5(HttpServletResponse response) throws InterruptedException {
        Thread.sleep(5*1000);
        response.setStatus(200);
        System.out.println("wait5S");
        return this.helloWorldService.getMessage200();
    }
    @RequestMapping("/wait9")
    public String wait9(HttpServletResponse response) throws InterruptedException {
        Thread.sleep(9*1000);
        response.setStatus(200);
        System.out.println("wait9S");
        return this.helloWorldService.getMessage200();
    }
    @RequestMapping("/wait10")
    public String wait10(HttpServletResponse response) throws InterruptedException {
        Thread.sleep(10*1000);
        response.setStatus(200);
        System.out.println("wait10S");
        return this.helloWorldService.getMessage200();
    }
















    @RequestMapping("/")
    public String status(HttpServletResponse response) {
        response.setStatus(203);
        return this.helloWorldService.getHelloMessage();
    }
}
