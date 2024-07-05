# Why do we set the adapter class as abstract?

- The adapter class is set as abstract because it is not meant to be instantiated. It is meant to be subclassed by the client class. The client class will then override the methods of the adapter class to provide the desired functionality.