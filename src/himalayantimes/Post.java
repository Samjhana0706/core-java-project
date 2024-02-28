package himalayantimes;

public class Post {

    private long postId;
    private String imageUrl;
    private String postName;
    private int categoryId;
    private String title;
    private String shortDescription;
    private String longDescription;
    private String source;
    private String publishedDate;
    private String createdAt;
    private String isDeleted;
    private String updatedAt;


    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", imageUrl='" + imageUrl + '\'' +
                ", postName='" + postName + '\'' +
                ", categoryId=" + categoryId +
                ", title='" + title + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", source='" + source + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;

    }
}
