package abstractionEmployeeSalary;
public abstract class Employee {
	private String name, company;
	private int id;
	public Employee(String name,String company, int id) {
		this.name=name;
		this.id=id;
		this.company=company;
		}
	
	public abstract void calculateSalary() ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	}
