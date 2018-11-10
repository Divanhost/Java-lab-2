package DataBase.requests;

public class Processor {
    private Processor() {}

    private static Exception check1Arg(String req) {
        try {
            if (req.equals("add")) {
                throw  Exceptions.wrongAdd;
            } else {
                if (req.equals("sell")) {
                    throw Exceptions.wrongSell;
                } else
                    throw  Exceptions.wrongRequest;
            }
        } catch (Exception e) {
            return e;
        }
    }

    private static Exception check2to4Arg(String req) {
        try {
            if (req.equals("add")) {
                throw  Exceptions.wrongAdd;
            } else {
                if (req.equals("sell")) {
                    throw Exceptions.wrongSell;
                } else {
                    if (req.equals("load")) {
                        throw  Exceptions.wrongLoad;
                    } else {
                        if (req.equals("save"))
                            throw Exceptions.wrongSave;
                        else {
                            if (req.equals("report"))
                                throw  Exceptions.wrongReport;
                            else
                                throw  Exceptions.wrongRequest;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return e;
        }
    }

    private static Exception check5Arg(String req) {
        try {
            if (req.equals("info")) {
                throw  Exceptions.wrongInfo3;
            } else {
                if (req.equals("load")) {
                    throw  Exceptions.wrongLoad;
                } else {
                    if (req.equals("save"))
                        throw Exceptions.wrongSave;
                    else {
                        if (req.equals("report"))
                            throw  Exceptions.wrongReport;
                        else
                            throw  Exceptions.wrongRequest;
                    }
                }
            }
        } catch (Exception e) {
            return e;
        }
    }

    private static Exception checkOver5Arg(String req) {
        try {
            if (req.equals("add")) {
                throw  Exceptions.wrongAdd;
            } else {
                if (req.equals("sell")) {
                    throw Exceptions.wrongSell;
                } else {
                    if (req.equals("load")) {
                        throw  Exceptions.wrongLoad;
                    } else {
                        if (req.equals("save"))
                            throw Exceptions.wrongSave;
                        else {
                            if (req.equals("report"))
                                throw  Exceptions.wrongReport;
                            else {
                                if (req.equals("info"))
                                    throw Exceptions.wrongInfo3;
                                else
                                    throw  Exceptions.wrongRequest;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            return e;
        }
    }

    public static void processRequest(String com) {
        final String[] s = com.split(" ");
        boolean isProcessing = false;

        try {
            switch (s.length) {
                case 1:
                    if (s[0].equals("info")) {
                        Requests.info();
                    } else {
                        if (s[0].equals("report"))
                            Requests.report();
                        else {
                            if (s[0].equals("save"))
                                Requests.save();
                            else {
                                if (s[0].equals("load"))
                                    Requests.load();
                                else
                                    throw check1Arg(s[0]);
                            }
                        }
                    }
                    break;

                case 2:
                    if (s[0].equals("info")) {
                        if (s[1].equals("prices"))
                            Requests.infoPrices();
                        else
                            Requests.info(s[1]);
                    } else {
                        throw check2to4Arg(s[0]);
                    }
                    break;

                case 3:
                    if (s[0].equals("info")) {
                        if (s[1].equals("prices"))
                            throw Exceptions.wrongInfoPr;
                        else
                            Requests.info(s[1], s[2]);
                    } else
                        throw check2to4Arg(s[0]);
                    break;

                case 4:
                    if (s[0].equals("info")) {
                        if (s[1].equals("prices"))
                            throw Exceptions.wrongInfoPr;
                        else
                            Requests.info(s[1], s[2], s[3]);
                    } else
                        throw check2to4Arg(s[0]);
                    break;

                case 5:
                    if (s[0].equals("add")) {
                        if (Operations.isInteger(s[4]))
                            Requests.add(s[1], s[2], s[3], Integer.parseInt(s[4]));
                        else
                            throw  Exceptions.wrongAdd;

                    } else {
                        if (s[0].equals("sell")) {
                            if (Operations.isInteger(s[4]))
                                Requests.sell(s[1], s[2], s[3], Integer.parseInt(s[4]));
                            else
                                throw Exceptions.wrongSell;
                        } else
                            throw check5Arg(s[0]);
                    }
                    break;

                default:
                    throw checkOver5Arg(s[0]);
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Хотите продолжить?");
        }
    }
}
