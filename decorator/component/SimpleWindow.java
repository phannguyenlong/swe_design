package decorator.component;

/**
 * Concrete component
 */
public class SimpleWindow implements Window {
    private String description;

    public SimpleWindow() {
        this.description = "Simple window";
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + description);        
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    
}
