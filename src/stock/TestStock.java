public class TestStock {
    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");

        stock1.previousClosingPrice = 34.5;
        stock1.currentPrice = 34.35;

         System.out.println("hisse senedi sembolu:" +stock1.symbol);
         System.out.println("hisse senedi adi: "+stock1.name);
         System.out.println("onceki kapanis fiyati: "+stock1.previousClosingPrice);
        System.out.println("guncel fiyati :"+stock1.currentPrice);
        System.out.println("degisim yuzdesi : " + stock1.getChangePercent() + "%");
    }
}
