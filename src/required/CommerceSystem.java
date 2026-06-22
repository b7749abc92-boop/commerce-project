package required;

public class CommerceSystem {
    Scanner sc = new Scanner(System.in);
    private List<Product> prod;


    public CommerceSystem(List<Product> prod3) {
        this.prod = prod3;
    }
    public void start() {


        System.out.println("전자제품 상품 목록");
        int i = 1;
        for (Product p : prod) {

            System.out.println(i + ". " + p.getname() + "    │   " + p.getpri() + "   │   " + p.getdescrip());
            i++;
        }
        System.out.println("0. 종료       │   프로그램 종료");

        String s = sc.next();
        if ("0".equals(s)) {
            System.out.println("프로그램 종료");
            sc.close();
            System.exit(0);
        }

    }



}
