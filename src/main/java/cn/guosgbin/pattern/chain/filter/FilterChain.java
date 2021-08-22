package cn.guosgbin.pattern.chain.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 17:29
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();

    private int index = 0;

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (filters.size() == index) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
