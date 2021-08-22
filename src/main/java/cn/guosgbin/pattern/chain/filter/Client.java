package cn.guosgbin.pattern.chain.filter;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 17:39
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        Request request = null;
        Response response = null;
        FilterChain chain = new FilterChain();
        // 添加过滤器链
        chain.addFilter(new FirstFilter())
                .addFilter(new SecondFilter());

        chain.doFilter(request, response);

    }
}
