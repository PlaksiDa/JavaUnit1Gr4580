public class Task7HW {
    // Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
    // используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
    // Если значение null, то параметр не должен попадать в запрос.
    // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

    public static String generateWhereClause(String jsonFilter) {
        StringBuilder sb = new StringBuilder();
        boolean isFirstCondition = true;

        if (!jsonFilter.isEmpty()) {
            sb.append("(");
            String[] filters = jsonFilter.split(", ");

            for (String filter : filters) {
                String[] keyValue = filter.split(":");
                String key = keyValue[0].replace("\"", "");
                String value = keyValue[1].replace("\"", "");

                if (!value.equals("null")) {
                    if (!isFirstCondition) {
                        sb.append(" AND ");
                    }

                    sb.append(key).append(" = ").append("'").append(value).append("'");
                    isFirstCondition = false;
                }
            }

            sb.append(")");
        }

        return sb.toString();
    }
}
