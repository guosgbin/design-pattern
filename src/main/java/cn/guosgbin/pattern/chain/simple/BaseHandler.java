package cn.guosgbin.pattern.chain.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 14:20
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class BaseHandler implements Handler{
    protected static final Integer ONE_LEVEL = 1;
    protected static final Integer TWO_LEVEL = 7;
    protected static final Integer THREE_LEVEL = 15;

    // 下一个处理器
    protected Handler nextHandler;

    // 最多能批准的天数
    protected Integer dealDays;

    public BaseHandler(Integer dealDays) {
        this.dealDays = dealDays;
    }


    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleRequest(Request request);

    /**
     * 这个请假需求时
     */
    public void process(Request request) {
        handleRequest(request);
        // 有下一个处理器 且当前处理器无法继续处理
        if (nextHandler == null) {
            System.out.println("处理链结束...");
        }

        if (request.getDays() > dealDays) {
            // 让下一个处理器继续处理
            nextHandler.process(request);
        } else {
            System.out.println("流程结束");
        }
    }
}
