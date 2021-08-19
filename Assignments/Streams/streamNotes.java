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