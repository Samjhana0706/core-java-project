package himalayantimes;

public class Category {

    //States
    /*
        Category Id - int
        Category Name - String
        Is Disabled - boolean
        order - int
        Is Deleted - boolean
        Created At - String
        Updated At - String
    */

    private int categoryId;
    private String categoryName;
    private boolean isDisabled;
    private int order;
    private boolean isDeleted;
    private String createdAt;
    private String updatedAt;

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isDisabled() {
        return isDisabled;
    }



    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }




    public String getCreatedAt() {
        return createdAt;
    }



    public String getUpdatedAt() {
        return updatedAt;
    }



    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", isDisabled=" + isDisabled +
                ", order=" + order +
                ", isDeleted=" + isDeleted +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}


