package com.learnersAcademy.dao;

import java.util.List;

import com.exception.BusinessException;
import com.learnersAcademy.model.ClassObj;
import com.learnersAcademy.model.StudentObj;
import com.learnersAcademy.model.SubjectObj;
import com.learnersAcademy.model.TeacherObj;

public interface LearnersAcadDAO {
	public boolean userLogin(String username, String password) throws BusinessException;
	public List<SubjectObj> listSubject() throws BusinessException;
	public List<ClassObj> listClasses() throws BusinessException;
	public List<TeacherObj> listTeacher() throws BusinessException;
	public List<StudentObj> listStudents() throws BusinessException;
	public boolean deleteSubject(Integer subjectID) throws BusinessException;
	public boolean deleteClass(Integer classID) throws BusinessException;
	public boolean deleteTeacher(Integer teacherID) throws BusinessException;
	public boolean deleteStudent(Integer studentID) throws BusinessException;
	public boolean addSubject(SubjectObj subject) throws BusinessException;
	public boolean addClass(ClassObj cls) throws BusinessException;
	public boolean addTeacher(TeacherObj teacher) throws BusinessException;
	public boolean addStudent(StudentObj student) throws BusinessException;
	public boolean updSubject(SubjectObj subject) throws BusinessException;
	public boolean updTeacher(TeacherObj teacher) throws BusinessException;
	public boolean updStudent(StudentObj student) throws BusinessException;
	public List<Object> generateReport(ClassObj cls) throws BusinessException;
}
