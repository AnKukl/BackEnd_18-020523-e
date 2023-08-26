package Homework.HW2;

public class PensionFund {

    private String fundName;
    private boolean isState;
    private String dateOfCreation;
    private int countOfMembers;

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public boolean isState() {
        return isState;
    }


    public void setState(boolean state) {
        isState = state;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

//    public void setDateOfCreation(String dateOfCreation) {
//        this.dateOfCreation = dateOfCreation;
//    }

    public int getCountOfMembers() {
        return countOfMembers;
    }

    public void setCountOfMembers(int countOfMembers) {
        this.countOfMembers = countOfMembers;
    }

    public void info() {
        System.out.println("Информация о фонде: ");
        System.out.println("Наименования фонда: " + fundName);
        System.out.println("Фонд является государственным: " + isState);
        System.out.println("Дата основания фонда: " + dateOfCreation);
        if (!isState) {
            System.out.println("Количество участников фонда: " + countOfMembers / 1000 + "тысяч человек");
        } else {
            System.out.println("Количество участников фонда: " + countOfMembers + "человек");
        }

    }
}
