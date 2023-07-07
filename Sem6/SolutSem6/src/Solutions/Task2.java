// package Solutions;

// // Для информационной системы ветеринарной клиники
// public class Cat1 {
//     private String name;
//     private int age;
//     private String breed;
//     private String ownerName;
//     private String medicalHistory;

//     // Конструкторы
//     public Cat1(String name, int age, String breed, String ownerName, String medicalHistory) {
//         this.name = name;
//         this.age = age;
//         this.breed = breed;
//         this.ownerName = ownerName;
//         this.medicalHistory = medicalHistory;
//     }

//     public Cat1(String name, int age, String breed) {
//         this(name, age, breed, "", "");
//     }

//     // Геттеры и сеттеры для полей

//     // Методы
//     public void showMedicalHistory() {
//         System.out.println(medicalHistory);
//     }

//     public void makeAppointment() {
//         // Логика создания записи на прием ветеринару
//     }

//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Breed: " + breed);
//         System.out.println("Owner: " + ownerName);
//     }
// }

// // Для архива выставки
// public class Cat2 {
//     private String name;
//     private int age;
//     private String breed;
//     private String exhibitionYear;

//     // Конструкторы
//     public Cat2(String name, int age, String breed, String exhibitionYear) {
//         this.name = name;
//         this.age = age;
//         this.breed = breed;
//         this.exhibitionYear = exhibitionYear;
//     }

//     public Cat2(String name, int age, String breed) {
//         this(name, age, breed, "");
//     }

//     // Геттеры и сеттеры для полей

//     // Методы
//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Breed: " + breed);
//         System.out.println("Exhibition Year: " + exhibitionYear);
//     }

//     public void addToExhibitionArchive() {
//         // Логика добавления информации о коте в архив выставки
//     }
// }

// // Для информационной системы Театра кошек Ю. Д. Куклачёва 
// public class Cat3 {
//     private String name;
//     private int age;
//     private String breed;
//     private String role;
//     private boolean isTrained;

//     // Конструкторы
//     public Cat3(String name, int age, String breed, String role, boolean isTrained) {
//         this.name = name;
//         this.age = age;
//         this.breed = breed;
//         this.role = role;
//         this.isTrained = isTrained;
//     }

//     public Cat3(String name, int age, String breed) {
//         this(name, age, breed, "", false);
//     }

//     // Геттеры и сеттеры для полей

//     // Методы
//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Breed: " + breed);
//         System.out.println("Role: " + role);
//         System.out.println("Trained: " + isTrained);
//     }

//     public void performTrick() {
//         if (isTrained) {
//             // Логика выполнения трюка
//         } else {
//             System.out.println("The cat is not trained to perform tricks.");
//         }
//     }

//     public void assignRole(String role) {
//         this.role = role;
//     }
// }