import java.util.Objects;

public class Cat {
    private String meow;

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "meow='" + meow + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(meow, cat.meow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meow);
    }
}
