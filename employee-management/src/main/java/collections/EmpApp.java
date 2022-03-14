package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmpApp {

	public EmpApp() {
	}

	public String findEmp(int empId) {

		if (EmpDB.db.containsKey(empId)) {
			return EmpDB.db.get(empId).getDetails();
		} else {
			return "No Person found";
		}
	}

	public List<String> listEmpById(String empCity) {

		List<String> employee = new ArrayList<String>();

		Set<Integer> keys = EmpDB.db.keySet();

		for (Integer key : keys) {
			Emp e = EmpDB.db.get(key);
			if (e.getCity().equals(empCity))
				employee.add(e.getDetails());
		}

		return employee;
	}

	public String addEmp(Emp e) {
		if (EmpDB.db.containsKey(e.getEmpId())) {
			return "person already exists";
		} else {

			EmpDB.db.put(e.getEmpId(), e);
			return "Person added";
		}
	}
}
