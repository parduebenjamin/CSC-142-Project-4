class Table {

    public int tableNum;
    public Person person1;
    public Person person2;
    public Person person3;
    public Person person4;

    public Table(int inTableNum, Person p1, Person p2, Person p3, Person p4) {
        tableNum = inTableNum;
        person1 = p1;
        person2 = p2;
        person3 = p3;
        person4 = p4;
    }

    public String toString() {
        return  "Table " + tableNum + "\n" +
                "--------------------\n" +
                person1.getName() + "\n" +
                person2.getName() + "\n" +
                person3.getName() + "\n" +
                person4.getName() + "\n";
    }
}