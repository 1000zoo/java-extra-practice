package enum_practice;

public class StatusTest {

    private static void printEach() {
        Status ok = Status.OK;
        Status multipleChoice = Status.MULTIPLE_CHOICE;
        Status badRequest = Status.BAD_REQUEST;
        Status notFound = Status.NOT_FOUND;

        System.out.println("ok = " + ok);
        System.out.println("multipleChoice = " + multipleChoice);
        System.out.println("badRequest = " + badRequest);
        System.out.println("notFound = " + notFound);

        System.out.println("ok.getCode() = " + ok.getCode());
        System.out.println("multipleChoice.getCode() = " + multipleChoice.getCode());
        System.out.println("badRequest.getCode() = " + badRequest.getCode());
        System.out.println("notFound.getCode() = " + notFound.getCode());

        System.out.println("ok.getDetail() = " + ok.getDetail());

    }

    private static void nameTest() {
        Status[] statuses = Status.values();

        for (Status status : statuses) {
            System.out.println(status + " => " + status.name());
        }
    }

    private static void ordinalTest() {
        Status[] statuses = Status.values();

        for (Status status : statuses) {
            System.out.println(status + " => " + status.ordinal());
        }
    }

    private static void valueOfTest() {
        Status ok = Status.valueOf("O");
        System.out.println("ok = " + ok);
    }
    
    private static void valuesTest() {
        Status[] statuses = Status.values();

        for (Status status : statuses) {
            System.out.println("status = " + status);
        }
    }

    private static void toStringTest() {
        Status[] statuses = Status.values();

        for (Status status : statuses) {
            System.out.println("status = " + status.toString());
        }
    }

    private static void compareToTest() {
        Status ok = Status.OK;
        Status notFound = Status.NOT_FOUND;

        System.out.println(ok.compareTo(notFound));
    }

    private static void findByCodeTest() {
        int code = 300;
        System.out.println(Status.findByCode(code));
    }

    private static void findByMapTest() {
        int code = 200;
        System.out.println(Status.findByCodeMap(code));
    }

    public static void main(String[] args) {
        findByMapTest();
    }
}
