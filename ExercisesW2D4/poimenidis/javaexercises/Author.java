package poimenidis.javaexercises;

public class Author {
  private String name;
  private String email;
  private String gender;
  
  public Author(String name, String email, String gender){
	this.name = name;
	this.email = email;
	this.gender = gender;
  }

  public String getName() {
	return name;
  }

  public String getEmail() {
	return email;
  }

  public String getGender() {
	return gender;
  }
  
  @Override
  public String toString(){
	return "Author[name="+this.name+",email="+this.email+",gender="+this.gender+"]";
  }
  
}
