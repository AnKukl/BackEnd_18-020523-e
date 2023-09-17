package Homework;

import java.util.Objects;

public class PensionFund {

    private String fundName;
    private boolean isState;
    private String dateOfCreation;
    private int countOfMembers;

    public PensionFund(String fundName, boolean isState, String dateOfCreation, int countOfMembers) {
        this.fundName = fundName;
        this.isState = isState;
        this.dateOfCreation = dateOfCreation;
        this.countOfMembers = countOfMembers;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (isState != that.isState) return false;
        if (countOfMembers != that.countOfMembers) return false;
        if (!Objects.equals(fundName, that.fundName)) return false;
        return Objects.equals(dateOfCreation, that.dateOfCreation);
    }

    @Override
    public int hashCode() {
        int result = fundName != null ? fundName.hashCode() : 0;
        result = 31 * result + (isState ? 1 : 0);
        result = 31 * result + (dateOfCreation != null ? dateOfCreation.hashCode() : 0);
        result = 31 * result + countOfMembers;
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "fundName='" + fundName + '\'' +
                ", isState=" + isState +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", countOfMembers=" + countOfMembers +
                '}';
    }

    public void info() {
        System.out.println("Информация о фонде: ");
        System.out.println("Наименования фонда: " + fundName);
        System.out.println("Фонд является государственным: " + isState);
        System.out.println("Дата основания фонда: " + dateOfCreation);
        if (!isState) {
            System.out.println("Количество участников фонда: " + countOfMembers + " человек");
        } else {
            System.out.println("Количество участников фонда: " + countOfMembers / 1000 + "тысяч человек");
        }

    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        if (isState == true) {
            return obj.calculatePension();
        } else {
            return 0;
        }
    }
}
