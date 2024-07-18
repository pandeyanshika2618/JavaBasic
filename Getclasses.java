class GetClasses {
    // Java program to demonstrate working of getClass()
    public static void main(String[] args) {
        Object obj = new GetClasses(); // Instantiate the class itself
        Class cls = obj.getClass(); // Use getClass() to get the class object
        System.out.println("Class of Object obj is : " + cls.getName());
    }
}
