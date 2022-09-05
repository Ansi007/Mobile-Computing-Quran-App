package haqnawaz.org.navigationdrawer;

public class SurahDetails {
    String surahNumber;
    String surahNameEnglish;
    String surahNameUrdu;
    String surahType;

    @Override
    public String toString() {
        return "SurahDetails{" +
                "surahNumber=" + surahNumber +
                ", surahNameEnglish='" + surahNameEnglish + '\'' +
                ", surahNameUrdu='" + surahNameUrdu + '\'' +
                ", surahType='" + surahType + '\'' +
                '}';
    }

    public String getSurahNumber() {
        return surahNumber;
    }

    public void setSurahNumber(String surahNumber) {
        this.surahNumber = surahNumber;
    }

    public String getSurahNameEnglish() {
        return surahNameEnglish;
    }

    public void setSurahNameEnglish(String surahNameEnglish) {
        this.surahNameEnglish = surahNameEnglish;
    }

    public String getSurahNameUrdu() {
        return surahNameUrdu;
    }

    public void setSurahNameUrdu(String surahNameUrdu) {
        this.surahNameUrdu = surahNameUrdu;
    }

    public String getSurahType() {
        return surahType;
    }

    public void setSurahType(String surahType) {
        this.surahType = surahType;
    }

    public SurahDetails(String surahNumber, String surahNameEnglish, String surahNameUrdu, String surahType) {
        this.surahNumber = surahNumber;
        this.surahNameEnglish = surahNameEnglish;
        this.surahNameUrdu = surahNameUrdu;
        this.surahType = surahType;
    }
}
