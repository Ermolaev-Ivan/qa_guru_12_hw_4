package ivan.ermolaev.pages.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class SubjectsComponent {
    public static void randomSubjects(int anountSubjects){
        int counter = 0;
        String[] subjectsList = new String[]{
                "Maths", "Accounting", "Arts", "Social Studies",
                "English", "Chemistry", "Hindi", "Computer Science", "Commerce",
                "Economics", "History", "Physics", "Biology", "Civics"
        };

        for (int i = 0; i < subjectsList.length; i++){
            int randomNumber = (int) (Math.random() * subjectsList.length);
//            $("#subjectsInput")
//                    .setValue(subjectsList[randomNumber])
//                    .pressEnter();
            System.out.println("Элемент "+subjectsList[randomNumber]);
            subjectsList = RemoveElementToArray(subjectsList, subjectsList[randomNumber]);
        }

    }
    public static String[] RemoveElementToArray(String[] arr, String elementToBeDeleted) {
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
    public static void main(String[] args){
        String[] subjectsList = new String[]{
                "Maths", "Accounting", "Arts", "Social Studies",
                "English", "Chemistry", "Hindi", "Computer Science", "Commerce",
                "Economics", "History", "Physics", "Biology", "Civics"
        };
        System.out.println("до изменения "+subjectsList.toString());
        RemoveElementToArray(subjectsList, "Maths");
        System.out.println("после изменения "+subjectsList.toString());
    }
}
