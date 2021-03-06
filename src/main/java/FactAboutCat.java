public class FactAboutCat {
    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;

    public FactAboutCat(String id, String text, String type,String user, int upvotes ){
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }
    public String getId(){
        return id;
    }

    public String getText(){
        return text;
    }

    public String getType(){
        return type;
    }

    public String getUser(){
        return user;
    }

    public int getUpvotes(){
        return upvotes;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setUser(String user){
        this.user = user;
    }

    public void setUpvotes(int upvotes){
        this.upvotes = upvotes;
    }

}
