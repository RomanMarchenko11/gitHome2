public class Studentt implements Comparable {
   private String name;

   private int gradePointAverage;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getGradePointAverage() {
      return gradePointAverage;
   }

   public void setGradePointAverage(int gradePointAverage) {
      this.gradePointAverage = gradePointAverage;
   }
   public Studentt() {

   }
   public Studentt(String name, int gradePointAverage) {
      this.name = name;
      this.gradePointAverage = gradePointAverage;
   }

   @Override
   public void compareTo(Studentt studentt) {
      if (this.gradePointAverage > studentt.gradePointAverage) {
         System.out.println("Оцінки вище у " + this.name + " ніж у " + studentt.name);
      } else if (this.gradePointAverage == studentt.gradePointAverage) {
         System.out.println("Оцінки однакові у студентів: " + this.name + " та " +studentt.name );
      } else {
         System.out.println("Оцінки вище у " + studentt.name + " ніж у " + this.name);
      }
   }
}
