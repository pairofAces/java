// reading a .properties file 
    // one way is to use third party library like Apache commons

// Apache commons contains a PropertiesConfiguration class that's used
// to read a properties file

org.apache.commons.configuration.PropertiesConfiguration
    // this loads values from the properties file

// To configure the PropertiesConfiguration class to load the properties file:

Configurations configurations = new Configurations();
PropertiesConfiguration config = configurations.properties("configuration.properties");
    
    // On lines 12-13, an object of the PropertiesConfiguration class is built.
    // this object can be used to access data form the specified properties file.

// Note, if I want to pass the properties name as shown on lines 12-13, keep the
// properties file in the src folder


// METHODS:

    // the PropertiesConfiguration class has a few methods like:

Iterator<String> getKeys() : // this will provide all the keys present in the properties file
    // example:
    Iterator<String> keys = config.getKeys();

Object getProperty(String key): // This provides the corresponding value present in the properties
                                // that belongs to the key passes. If the key value isn't there,
                                // it will return null.
    // example:
    System.out.println("Value for the key thisIsTheKey = " + config.getProperty("thisIsTheKey"));