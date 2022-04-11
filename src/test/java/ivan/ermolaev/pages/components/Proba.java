package ivan.ermolaev.pages.components;

import java.util.Arrays;
import java.util.List;

public class Proba {
    public static void main(String[] args){
        List<String> subjectsList = Arrays.asList(
                "Maths", "Accounting", "Arts", "Social Studies",
                "English", "Chemistry", "Hindi", "Computer Science", "Commerce", "Economics",
                "History", "Physics", "Biology", "Civics");
        System.out.println("Размер до " + subjectsList.size());
        System.out.println("Выводим то что удалим " + subjectsList.get(1));
        try {
            subjectsList.remove("Accounting");
            subjectsList.remove(1);
        }
        catch (Exception E){
            System.out.println("исключение");
        }

        System.out.println("Размер после " + subjectsList.size());

    }
    public static String[] arrDeleteElement(String[] arr, String elementToBeDeleted) {
        String[] newArr = null;
        System.out.println("Original Array is: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == elementToBeDeleted) {
                newArr = new String[arr.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
                break;
            }
        }
        return newArr;
    }
}
