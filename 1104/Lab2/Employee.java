public class Employee {
  
    int salaryPerHour;
    int hours;

    public void reportHours(int addHours) {
        hours+=addHours;
    }

    public int findMinInsideUnsortedArray(int [] v) throws Exception {
        if(v==null || v.length==0 ) {
            throw new Exception("Vector is null");
        }
        int max=v[0];
        for(int i=1;i<v.length;i++) {
            if(max>v[i]) {
                max=v[i];
            }
        }
        return max;
    }

    public String getExam(int numberExam) throws Exception {//KISS
        if(ExamSubjects.getExamById(numberExam)!=null)
          return ExamSubjects.getExamById(numberExam);
        else 
          throw new Exception("exam must be in range 1 to 5");
    }
}
