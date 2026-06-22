package required;

public class Main {
    public static void main(String[] args) {
        List<Product> prod3=new ArrayList<>();


        Product pr1 = new Product("Galaxy S24", 1200000, "최신 스마트폰", 50);
        Product pr2 = new Product("Galaxy Tab S10", 340000, "고해상도 디스플레이를 지원하는 태블릿", 24);
        Product pr3 = new Product("Galaxy Book Pro", 1000000, "휴대성이 뛰어난 노트북", 15);
        Product pr4 = new Product("Odyssey G5", 450000, "고주사율 게이밍 모니터", 27);
        Product pr5 = new Product("Galaxy Watch 8", 60000, "건강 관리 기능을 지원하는 스마트워치", 30);
        Product pr6 = new Product("Galaxy Buds Pro", 100000, "노이즈 캔슬링 기능을 제공하는 무선 이어폰", 36);


        prod3.add(pr1);
        prod3.add(pr2);
        prod3.add(pr3);
        prod3.add(pr4);
        prod3.add(pr5);
        prod3.add(pr6);
        CommerceSystem cs = new CommerceSystem(prod3);

        cs.start();








    }
}
