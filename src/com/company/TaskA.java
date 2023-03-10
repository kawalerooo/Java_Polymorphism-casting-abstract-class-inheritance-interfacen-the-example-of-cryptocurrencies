package com.company;


// an abstract class with a selected abstract method.
abstract  class  CryptoCurrency{
    //abstract method
    public abstract  void name();
}

// 2 classes that inherit from the abstract class and implement the selected method.
class Bitcoin extends CryptoCurrency{
    public void name(){
        System.out.println("Bitcoin Currency");
    }
}
class Ethereum extends CryptoCurrency{
    public void name(){
        System.out.println("Ethereum Currency");
    }
}
class BitcoinWallet extends Bitcoin{
    public void ownedCurrency(){
        System.out.println("User 1: "+10);
        System.out.println("User 2: "+20);
        System.out.println("User 3: "+30);
    }
}
class EthereumWallet extends Ethereum{
    public void ownedCurrency(){
        System.out.println("User 1: "+10);
        System.out.println("User 2: "+20);
        System.out.println("User 3: "+30);
    }
}

public class TaskA {
    public static void main(String[] args) {


        // instances of child classes
        Bitcoin btc = new Bitcoin();
        Ethereum eth = new Ethereum();
        //upward projection
        CryptoCurrency[] cryptoCrurrencies = new CryptoCurrency[]{btc, eth};

        //Making polymorphic calls to the implemented method, by iterating

        //if you want to Use Simple for Loop
        for (int i = 0; i < cryptoCrurrencies.length; i++) {
            cryptoCrurrencies[i].name();
        }

        //if you want to Use forEach Loop, you can use anyone
//        for (CryptoCurrency cr:cryptoCrurrencies) {
//            cr.name();
//        }
        BitcoinWallet btcWallet = new BitcoinWallet();
        EthereumWallet ethWallet = new EthereumWallet();
        btcWallet.name();
        btcWallet.ownedCurrency();
        ethWallet.name();
        ethWallet.ownedCurrency();
    }
}


