package cn.guosgbin.pattern.chain.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 15:02
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Group extends BaseHandler {

    public Group() {
        super(BaseHandler.ONE_LEVEL);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("==============");
        System.out.println("小组长处理中");
        System.out.println("小组长同意...");
    }
}

class Manager extends BaseHandler {

    public Manager() {
        super(BaseHandler.TWO_LEVEL);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("==============");
        System.out.println("项目经理处理中");
        System.out.println("项目经理同意...");
    }
}

class Boss extends BaseHandler {

    public Boss() {
        super(BaseHandler.THREE_LEVEL);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("==============");
        System.out.println("老板处理中");
        System.out.println("老板同意...");
    }
}