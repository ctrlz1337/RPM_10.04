package biblio;

import java.util.Currency;

public class bibl {
    public static void main(String[] args) {
        BookInHand book = new  BookInHand(1,"ddd","ddd",555,5,"dddd",55.2,"доллар","ddd","ddddd","Ddddddd");
        book.print();
        BookIsLost book1 = new BookIsLost("2","ddd","ddd",555,5,"dddd",55.2,"евро","ddd","ddddd","Ddddddd");
        book1.print();
        BookInPlace book2 = new BookInPlace(3,"ddd","ddd",555,5,"dddd",55.2,"рубли","ddd","ddddd","Ddddddd");
        book2.print();



    }
}
interface Book<T>{
    void print();
}
abstract class Book1<T> implements Book<T>{
    private T id;
    private String name;
    private String author;
    private int pages;
    private int vol;
    private String genre;
    private double price;
    private String currency;
    private String publishing;
    private String description;
    private String type;
    private enum Color{
        рубли("₽"), евро("€"), доллар("$"), тенге("₸");
        private String code;
        Color(String code){
            this.code = code;
        }
        public String getCode(){ return code;}
    }

    public abstract void print();

    public Book1(T id,String name, String author, int pages, int vol, String genre, double price, String currency, String publishing, String description, String type){
        this.id=id;
        this.name=name;
        this.author=author;
        this.pages=pages;
        this.vol=vol;
        this.genre=genre;
        this.price=price;
        this.currency=currency;
        this.publishing=publishing;
        this.description=description;
        this.type=type;
    }

    public T get1() {
        return id;
    }
    public String get2() {
        return name;
    }
    public String get3() {
        return author;
    }
    public int get4() {
        return pages;
    }
    public int get5() {
        return vol;
    }
    public String get6() {
        return genre;
    }
    public double get7() {
        return price;
    }
    public String get8(){
        if(currency.equals("рубли")) {
            return Color.рубли.getCode();
        }else if (currency.equals("доллар")){
            return Color.доллар.getCode();
        }else if (currency.equals("евро")){
            return Color.евро.getCode();
        }else {
            return Color.тенге.getCode();
        }
    }
    public String get9() {
        return publishing;
    }
    public String get10() {
        return description;
    }
    public String get11() {
        return type;
    }
}

class BookInHand<T> extends Book1<T>{

    public BookInHand(T id, String name, String author, int pages, int vol, String genre, double price, String currency, String publishing, String description, String type){
        super(id,name,author,pages,vol,genre,price,currency,publishing,description,type);
    }

    public void print(){
        System.out.printf("-------Книга-------\nid:%s \nНазвание:%s \nАвтор:%s \nКол-во странци:%s \nТом:%s \nЖанр:%s \nЦена:%s \nВалюта:%s \nИздательство:%s \nОписание:%s \nТип издания:%s \n-------Состояние-------\nВ данный момент выдана читателю\n",
                super.get1(),super.get2(),super.get3(),super.get4(),super.get5(),super.get6(),super.get7(),super.get8(),super.get9(),super.get10(),super.get11());
    }
}
class BookIsLost<T> extends Book1<T>{

    public BookIsLost(T id, String name, String author, int pages, int vol, String genre, double price, String currency, String publishing, String description, String type){
        super(id,name,author,pages,vol,genre,price,currency,publishing,description,type);
    }

    public void print(){
        System.out.printf("-------Книга-------\nid:%s \nНазвание:%s \nАвтор:%s \nКол-во странци:%s \nТом:%s \nЖанр:%s \nЦена:%s \nВалюта:%s \nИздательство:%s \nОписание:%s \nТип издания:%s \n-------Cостояние-------\nУтеряна\n",
                super.get1(),super.get2(),super.get3(),super.get4(),super.get5(),super.get6(),super.get7(),super.get8(),super.get9(),super.get10(),super.get11());
    }
}
class BookInPlace<T> extends Book1<T>{

    public BookInPlace(T id, String name, String author, int pages, int vol, String genre, double price, String currency, String publishing, String description, String type){
        super(id,name,author,pages,vol,genre,price,currency,publishing,description,type);
    }

    public void print(){
        System.out.printf("-------Книга-------\nid:%s \nНазвание:%s \nАвтор:%s \nКол-во странци:%s \nТом:%s \nЖанр:%s \nЦена:%s \nВалюта:%s \nИздательство:%s \nОписание:%s \nТип издания:%s \n-------Состояние-------\nВ данный момент находиться в библиотек\n",
                super.get1(),super.get2(),super.get3(),super.get4(),super.get5(),super.get6(),super.get7(),super.get8(),super.get9(),super.get10(),super.get11());
    }
}
