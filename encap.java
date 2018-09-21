class Encap
{
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }


   public static void main(String[] args) {
      Encap e = new Encap();
      e.setName("abc def");
      e.setAge(50);
      e.setIdNum("123");

      System.out.print("Name : " + e.getName() + " \nAge : " + e.getAge() + "\nID :" +e.getIdNum());
   }
}