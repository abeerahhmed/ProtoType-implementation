  public class Book implements Cloneable {
    private String id;
    private String title;
    private String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getters and setters

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(String string) {
		// TODO Auto-generated method stub
		
	}
}
