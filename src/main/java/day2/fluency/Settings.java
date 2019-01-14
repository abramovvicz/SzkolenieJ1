package day2.fluency;

public class Settings {

    private int size;
    private String name;
    private String color;
    private String style;
    private String family;


    public int getSize() {
        return size;
    }

    public Settings setSize(int size) {
        this.size = size;
        return this;
    }

    public String getName() {
        return name;
    }

    public Settings setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Settings setColor(String color) {
        this.color = color;
        return this;
    }

    public String getStyle() {
        return style;
    }

    public Settings setStyle(String style) {
        this.style = style;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Settings setFamily(String family) {
        this.family = family;
        return this;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
