package cn.guosgbin.pattern.chain.filter;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 17:29
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}

class FirstFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("第一个过滤器 before处理");
        chain.doFilter(request, response);
        System.out.println("第一个过滤器 after处理");
    }
}

class SecondFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("第二个过滤器 before处理");
        chain.doFilter(request, response);
        System.out.println("第二个过滤器 after处理");
    }
}
