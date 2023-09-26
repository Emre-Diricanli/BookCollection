public class Periodical extends Item{

    private int issueNum;

    public Periodical(String title, int issueNum) {
        super(title);
        this.issueNum = issueNum;
    }

    public Periodical() {
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    @Override
    public String getListing() {
        return "Periodical Title - " + toString() + "\nIssue # - " + getIssueNum()+ "\n";
    }
}
