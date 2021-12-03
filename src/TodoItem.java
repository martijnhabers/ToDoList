import java.time.LocalDate;

public class TodoItem extends App {
    private int id;
    private String name;
    private LocalDate date;
    private boolean isComplete;

    public String getName() {
		return name;
	}

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate(LocalDate date){
        return date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }
    
    public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

}
