package cn.guosgbin.pattern.prototype.type;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/4 9:02
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {

    private static void testClone() throws CloneNotSupportedException {
        Company company = new Company();
        company.load4Database();
        company.setName("滑稽公司");
        System.out.println("原来的对象 -->> " + company);


        System.out.println("=================");
        Company clone = company.clone();
        System.out.println("克隆的对象 -->> " + clone);

        System.out.println(company.hashCode());
        System.out.println(clone.hashCode());

        clone.getEmployees().add("xiaohua");


        System.out.println("给克隆对象增加员工, 原来的对象 -->> " + company);
        System.out.println("给克隆对象增加员工, 克隆的对象 -->> " + clone);


        System.out.println("=================");
        Company deepClone = company.deepClone();
//        System.out.println(deepClone.hashCode());
        System.out.println("给克隆对象增加员工, xu克隆的对象 -->> " + deepClone);

        System.out.println(deepClone == company);
    }

    public static void testCloneConstructor() throws CloneNotSupportedException {
        Company company = new Company();
        company.load4Database();
        company.setName("滑稽公司");
        System.out.println("原来的对象 -->> " + company);

        Company clone = company.clone();
        System.out.println(clone == company);
    }


    public static void main(String[] args) throws CloneNotSupportedException {
//        testClone();
        testCloneConstructor();
    }
}
