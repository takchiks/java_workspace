package com.cogent.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
	List<Project> findByProjectName(String projectName);

}
