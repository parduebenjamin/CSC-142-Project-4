class Person {

    public String name;

    public Person(String personName) {
        name = personName;
    }

    public void setName(String personName) {
        name = personName;
    }

    public String getName() {
        return name;
    }

    public int getNameLength() {
        return name.length();
    }
}