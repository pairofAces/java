// creating and adding elements into a list-arrayList

// ArrayList of strings
List<String> stringList = new ArrayList<String>();
stringList.add("Abigail");
stringList.add("Zachariah");
stringList.add("Damien");
stringList.add("Ralph");
stringList.add("Gabriel");

// sort the list with the inbuilt (sort) method, using lambda function
    // stringList will be sorted based on the size of the strings
stringList.sort((str1,str2)->str1.compareTo(str2));
System.out.println(stringList);


// creating a stream from the .stream() method
List<String> castList = List.of("Dean", "Sam", "Castiel", "Crowley");
Stream<String> supernatural = castList.stream();

// creating a stream from an array
Integer[] array = {672, 340, 999};
Stream<Integer> streamFromArray = Arrays.stream(array);

// ----------------------------------------------------------------------

// Creating a stream of objects

// user defined class Employee

class Employee {
    private String name;
    private Double salary;
    
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
}

// creating the stream
Stream<Employee> empStream = Stream.of(new Employee("Tom", 5699.5), new Employee("Jack", 7629.2), new Employee("Jane", 5289.8));