public class CommonElementsInArray {

    //Write a Java program to find the common elements between two arrays (string values)
    public static String[] findCommonElements(String[] array1, String[] array2) {
        int count = 0;

        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                }
            }
        }


        String[] result = new String[count];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    result[k] = array1[i];
                    k++;
                }
            }
        }
        return result;
          /*  String[] Array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] Array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        System.out.println(Arrays.toString(findCommonElements(Array1, Array2)));*/
    }
}
