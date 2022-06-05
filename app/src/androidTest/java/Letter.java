public class Letter {
    private int imgId;
    private String letter;

    public Letter(int imgId, String letter) {
        this.imgId = imgId;
        this.letter = letter;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
