package java_eight_features.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
	private int id;
	private String name;
	private String dept;
	private List<Project> projects;
	private double salary;
	private String gender;
}
