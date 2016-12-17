package jetty.service;

import org.springframework.stereotype.Component;

/**
 * Created by 张宏南 on 2016-10-25.
 * Project GSLBHttpCode
 * Package jetty.service
 */

@Component
public class HelloWorldService {

    public String getHelloMessage() {
        return "{\"code\":200,\"message\":\"业务服务器请求成功"+System.getProperty("com.meizu.conf.uselocal")+"\"}";
    }
    public String getMessage() {
        return "{\"code\":200,\"message\":\"业务服务器请求成功,status值为自定义\"}";
    }
    public String getMessage100() {
        return "{\"code\":100,\"message\":\"业务服务器连接成功\"}";
    }
    public String getMessage200() {
        return "{\"code\":200,\"message\":\"业务服务器请求成功\"}";
    }
    public String getMessage202() {
        return "{\"code\":202,\"message\":\"业务服务器连接成功\"}";
    }
    public String getMessage203() {
        return "{\"code\":203,\"message\":\"业务服务器连接成功\"}";
    }
    public String getMessage404() {
        return "{\"code\":404,\"message\":\"业务服务器连接成功\"}";
    }
}
/*    int SC_CONTINUE = 100;初始的请求已经接受，客户应当继续发送请求的其余部分
    int SC_SWITCHING_PROTOCOLS = 101;服务器将遵从客户的请求转换到另外一种协议
    int SC_OK = 200;一切正常，对GET和POST请求的应答文档跟在后面
    int SC_CREATED = 201; 服务器已经创建了文档，Location头给出了它的URL。
    int SC_ACCEPTED = 202;已经接受请求，但处理尚未完成。
    int SC_NON_AUTHORITATIVE_INFORMATION = 203;文档已经正常地返回，但一些应答头可能不正确，因为使用的是文档的拷贝
    int SC_NO_CONTENT = 204;没有新文档，浏览器应该继续显示原来的文档。如果用户定期地刷新页面，而Servlet可以确定用户文档足够新，这个状态代码是很有用的
    int SC_RESET_CONTENT = 205;没有新的内容，但浏览器应该重置它所显示的内容。用来强制浏览器清除表单输入内容
    int SC_PARTIAL_CONTENT = 206;客户发送了一个带有Range头的GET请求，服务器完成了它
    int SC_MULTIPLE_CHOICES = 300;客户请求的文档可以在多个位置找到，这些位置已经在返回的文档内列出。如果服务器要提出优先选择，则应该在Location应答头指明。
    int SC_MOVED_PERMANENTLY = 301;客户请求的文档在其他地方，新的URL在Location头中给出，浏览器应该自动地访问新的URL。
    int SC_MOVED_TEMPORARILY = 302;类似于301，但新的URL应该被视为临时性的替代，而不是永久性的。
    int SC_FOUND = 302;
    int SC_SEE_OTHER = 303; 类似于301/302，不同之处在于，如果原来的请求是POST，Location头指定的重定向目标文档应该通过GET提取
    int SC_NOT_MODIFIED = 304;客户端有缓冲的文档并发出了一个条件性的请求（一般是提供If-Modified-Since头表示客户只想比指定日期更新的文档）。服务器告诉客户，原来缓冲的文档还可以继续使用。
    int SC_USE_PROXY = 305;客户请求的文档应该通过Location头所指明的代理服务器提取
    int SC_TEMPORARY_REDIRECT = 307; 和302（Found）相同。许多浏览器会错误地响应302应答进行重定向，即使原来的请求是 POST，即使它实际上只能在POST请求的应答是303时才能重定向。由于这个原因，HTTP 1.1新增了307，以便更加清除地区分几个状态代码： 当出现303应答时，浏览器可以跟随重定向的GET和POST请求；如果是307应答，则浏览器只能跟随对GET请求的重定向。
    int SC_BAD_REQUEST = 400;请求出现语法错误。
    int SC_UNAUTHORIZED = 401;  客户试图未经授权访问受密码保护的页面。应答中会包含一个WWW-Authenticate头，浏览器据此显示用户名字/密码对话框，然后在填写合适的Authorization头后再次发出请求。
    int SC_PAYMENT_REQUIRED = 402;
    int SC_FORBIDDEN = 403;资源不可用。
    int SC_NOT_FOUND = 404; 无法找到指定位置的资源
    int SC_METHOD_NOT_ALLOWED = 405;请求方法（GET、POST、HEAD、Delete、PUT、TRACE等）对指定的资源不适用。
    int SC_NOT_ACCEPTABLE = 406; 指定的资源已经找到，但它的MIME类型和客户在Accpet头中所指定的不兼容
    int SC_PROXY_AUTHENTICATION_REQUIRED = 407;类似于401，表示客户必须先经过代理服务器的授权。
    int SC_REQUEST_TIMEOUT = 408; 在服务器许可的等待时间内，客户一直没有发出任何请求。客户可以在以后重复同一请求。
    int SC_CONFLICT = 409; 通常和PUT请求有关。由于请求和资源的当前状态相冲突，因此请求不能成功。
    int SC_GONE = 410;所请求的文档已经不再可用，而且服务器不知道应该重定向到哪一个地址。它和404的不同在于，返回407表示文档永久地离开了指定的位置，而404表示由于未知的原因文档不可用。
    int SC_LENGTH_REQUIRED = 411; 服务器不能处理请求，除非客户发送一个Content-Length头。
    int SC_PRECONDITION_FAILED = 412;请求头中指定的一些前提条件失败
    int SC_REQUEST_ENTITY_TOO_LARGE = 413;目标文档的大小超过服务器当前愿意处理的大小。如果服务器认为自己能够稍后再处理该请求，则应该提供一个Retry-After头
    int SC_REQUEST_URI_TOO_LONG = 414;URI太长
    int SC_UNSUPPORTED_MEDIA_TYPE = 415;
    int SC_REQUESTED_RANGE_NOT_SATISFIABLE = 416;服务器不能满足客户在请求中指定的Range头
    int SC_EXPECTATION_FAILED = 417;
    int SC_INTERNAL_SERVER_ERROR = 500;服务器遇到了意料不到的情况，不能完成客户的请求
    int SC_NOT_IMPLEMENTED = 501;服务器不支持实现请求所需要的功能。例如，客户发出了一个服务器不支持的PUT请求
    int SC_BAD_GATEWAY = 502;服务器作为网关或者代理时，为了完成请求访问下一个服务器，但该服务器返回了非法的应答
    int SC_SERVICE_UNAVAILABLE = 503;服务器由于维护或者负载过重未能应答。例如，Servlet可能在数据库连接池已满的情况下返回503。服务器返回503时可以提供一个Retry-After头
    int SC_GATEWAY_TIMEOUT = 504; 由作为代理或网关的服务器使用，表示不能及时地从远程服务器获得应答
    int SC_HTTP_VERSION_NOT_SUPPORTED = 505; 服务器不支持请求中所指明的HTTP版本  */
