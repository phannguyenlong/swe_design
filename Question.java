abstract class Question {
    protected String content;
    protected float weight;

    protected Question(String content, float weight) { // set privacy for inheritance only
        this.content = content;
        this.weight = weight;
    }

    public abstract String getOption();

    public abstract float getPoint(Answer answer);
    
    @Override
    public String toString() {
        return content + " (" + weight + " pts)\n" + getOption();
    }
}