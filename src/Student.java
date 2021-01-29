public class Student {
  int rating;
  private String name;

  public static int count = 0;
  public static int totalRating = 0;

  public Student() {
    count++;
  }

  public Student(String name) {
    this.name = name;
    count++;
  }

  public Student(String name, int rating) {
    this.name = name;
    this.rating = rating;
    count++;
    totalRating += rating;
  }

  public static double getAvgRating() {
    double averageRating = 0.0;
    if (count > 0) averageRating = totalRating / (double) count;
    return averageRating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    totalRating += rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public void changeRating(int rating) {
    totalRating -= this.rating;
    this.rating = rating;
    setRating(rating);
  }

  public static void removeStudent(Student student) {
    count--;
    totalRating -= student.rating;
  }

  @Override
  public String toString() {
    return getName() + "" + getRating();
  }

  public static void main (String[] args) {
    Student stud1 = new Student("Marlin", 22);
    Student stud2 = new Student("Alex", 30);
    Student stud3 = new Student("Kurt", 27);

    System.out.println("Average students rating is: " + getAvgRating());
    stud1.changeRating(24);
    stud2.changeRating(23);
    stud3.changeRating(45);

    System.out.println("Average student rating is: " + getAvgRating());
  }
}
