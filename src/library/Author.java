package library;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        if (name == null || surname == null || name.isEmpty() || surname.isEmpty()) {
            throw new IllegalArgumentException(
                    "Author name and surname must not be null or empty"
            );
        }
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    
  

    @Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}

	public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Author{" +
                "Name: '" + name + '\'' +
                ", Surname: '" + surname + '\'' +
                '}';
    }
}
