package university;

import university.exception.*;

public class ExceptionHandling {
    public static void TryCatchForGradesOrSubjects(Student student){
        try{
            GpaCounter.studentGpa(student);
        }
        catch (SubjectsMissingException e) {
            e.printStackTrace();
        } catch (WrongGradesException e){
            e.printStackTrace();
        }
    }

    public static void TryCatchForGroupStudents(Group group, Subject subject){
        try{
            GpaCounter.subjectGpaForEachGroup(group, subject);
        } catch (StudentsMissingException e){
            e.printStackTrace();
        }
    }

    public static void TryCatchForFacultyGroups(Faculty faculty, Subject subject){
        try{
            GpaCounter.subjectGpaForEachFaculty(faculty, subject);
        } catch (GroupsMissingException e){
            e.printStackTrace();
        }
    }

    public static void TryCatchForUniversityFaculties(University university, Subject subject){
        try{
            GpaCounter.subjectGpaForUniversity(university, subject);
        } catch (FacultiesMissingException e){
            e.printStackTrace();
        }
    }
}