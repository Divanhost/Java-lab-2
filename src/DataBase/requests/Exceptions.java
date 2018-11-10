package DataBase.requests;

public class Exceptions {

    private Exceptions() {
    }

    public final static Exception wrongRequest  = new Exception("Некорректная команда\n");
    public final static Exception wrongInfo1    = new Exception("Некорректная команда info\n" +
                                                                "info [Город]\n" +
                                                                "info prices\n");
    public final static Exception wrongInfo2    = new Exception("Некорректная команда info\n" +
                                                                "info [Город] [АЗС]\n");
    public final static Exception wrongInfo3    = new Exception("Некорректная команда info\n" +
                                                                "info [Город] [АЗС] [ТЦ]\n");
    public final static Exception wrongAdd      = new Exception("Некорректная команда add\n" +
                                                                "add [Город] [АЗС] [ТЦ] [объём]\n");
    public final static Exception wrongSell     = new Exception("Некорректная команда sell\n" +
                                                                "sell [Город] [АЗС] [ТЦ] [объём]\n");
    public final static Exception wrongReport   = new Exception("");
    public final static Exception wrongLoad     = new Exception("");
    public final static Exception wrongSave     = new Exception("");
    public final static Exception wrongInfoPr   = new Exception("Некорректная команда info\n" +
                                                                "info prices\n");


}
