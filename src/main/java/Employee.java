import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
  @Id
  private int id;

  @Column(name = "firstName")
  private String firstName;

  //@Column(name = "lastName")
  private String lastName;

  @Column(name = "salary")
  private int salary;

  public Employee() {

  }

  public Employee(String firstName, String lastName, int salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String first_name) {
    this.firstName = first_name;
  }
}