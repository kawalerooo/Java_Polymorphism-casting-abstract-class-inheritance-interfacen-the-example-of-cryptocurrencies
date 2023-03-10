package com.company;

//an interface with the chosen method.
interface VirtualCurrency {
    public void currencyDetails();
}

//classes that implement the interface.
class BTC implements VirtualCurrency{
    public void currencyDetails(){
        System.out.println("BTC Currency");
    }

}
class ETH implements VirtualCurrency{
    public void currencyDetails(){
        System.out.println("ETH Currency");
    }
}
class BTCWallet extends BTC{
    public void ownedCurrency(){
        System.out.println("User 1: "+10);
        System.out.println("User 2: "+20);
        System.out.println("User 3: "+30);
    }
}
class ETHWallet extends ETH{
    public void ownedCurrency(){
        System.out.println("User 1: "+10);
        System.out.println("User 2: "+20);
        System.out.println("User 3: "+30);
    }
}
public class TaskB{
    public static void main(String[] args){


        // instances of classes
        BTC btc = new BTC();
        ETH eth = new ETH();
        //upward projection
        VirtualCurrency[] cryptoCrurrencies = new VirtualCurrency[]{btc, eth};

        //Making polymorphic calls to the implemented method, by iterating

//        if you want to Use simple for Loop
        for (int i = 0; i < cryptoCrurrencies.length; i++) {
            cryptoCrurrencies[i].currencyDetails();
        }
        //if you want to Use forEach Loop, you can use anyone
//        for (VirtualCurrency cr:cryptoCrurrencies) {
//            cr.currencyDetails();
//        }

        BTCWallet btcWallet = new BTCWallet();
        ETHWallet ethWallet = new ETHWallet();
        btcWallet.currencyDetails();
        btcWallet.ownedCurrency();
        ethWallet.currencyDetails();
        ethWallet.ownedCurrency();

    }
}