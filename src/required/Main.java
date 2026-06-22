package required;

public class Main {

    public static List<Product> prod = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product pr1 = new Product("Galaxy S24", 1200000, "최신 스마트폰", 50);
        Product pr2 = new Product("Galaxy Tab S10", 340000, "고해상도 디스플레이를 지원하는 태블릿", 24);
        Product pr3 = new Product("Galaxy Book Pro", 1000000, "휴대성이 뛰어난 노트북", 15);
        Product pr4 = new Product("Odyssey G5", 450000, "고주사율 게이밍 모니터", 27);
        Product pr5 = new Product("Galaxy Watch 8", 60000, "건강 관리 기능을 지원하는 스마트워치", 30);
        Product pr6 = new Product("Galaxy Buds Pro", 100000, "노이즈 캔슬링 기능을 제공하는 무선 이어폰", 36);


        prod.add(pr1);
        prod.add(pr2);
        prod.add(pr3);
        prod.add(pr4);
        prod.add(pr5);
        prod.add(pr6);

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
