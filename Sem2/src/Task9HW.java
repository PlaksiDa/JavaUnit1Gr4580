// 3.** Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"
// Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент
// [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Task9HW {
    public static void parseJsonAndPrint(String jsonString) {
        jsonString = jsonString.replace("[{", "").replace("}]", ""); // Удаление квадратных скобок в начале и конце строки
        String[] objects = jsonString.split("},\\{"); // Разделение объектов по запятой и фигурным скобкам

        for (String object : objects) {
            String[] properties = object.split(","); // Разделение свойств объекта по запятым

            String фамилия = getProperty(properties[0]);
            String оценка = getProperty(properties[1]);
            String предмет = getProperty(properties[2]);

            StringBuilder sb = new StringBuilder();
            sb.append("Студент ").append(фамилия)
                    .append(" получил ").append(оценка)
                    .append(" по предмету ").append(предмет)
                    .append(".");
            System.out.println(sb.toString());
        }
    }

    public static String getProperty(String property) {
        String[] keyValue = property.split(":");
        return keyValue[1].replace("\"", "").trim();
    }
}
