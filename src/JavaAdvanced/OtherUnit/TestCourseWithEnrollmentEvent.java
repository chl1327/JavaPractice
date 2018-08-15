package JavaAdvanced.OtherUnit;

/**
 * Created by chl1327 on 2018/6/24.
 */
public class TestCourseWithEnrollmentEvent {
    CourseWithEnrollmentEvent course =
            new CourseWithEnrollmentEvent("Java Programming");
    public TestCourseWithEnrollmentEvent(){
        course.setEnrollmentCap(2);
        EnrollmentListener listener = new NewListener();
        course.addEnrollmentListener(listener);
        course.addStudent("John Smith");
        course.addStudent("Jim Peterson");
        course.addStudent("Tim Johnson");
    }

    public static void main(String[] args){
        new TestCourseWithEnrollmentEvent();
    }
    private class NewListener implements EnrollmentListener{
        public void enrollmentExceeded(EnrollmentEvent e){
            System.out.println(e.getStudentToEnroll() +
                    " attempted to enroll\n" +
                    "The enrollment cap is " + e.getEnrollmentCap());
        }
    }
}
