package duoihinhbatchu.trungns.com.duoihinhbatchu;

/**
 * Created by Administrator on 04/06/2016.
 */
public class Question {
    private int idPicture;
    private String answer;

    public int getPicture() {
        return idPicture;
    }

    public void setPicture(int picture) {
        this.idPicture = picture;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question(int picture, String answer) {

        this.idPicture = picture;
        this.answer = answer;
    }
}
