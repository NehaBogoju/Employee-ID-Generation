import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the training id");
        String trainingId = scanner.nextLine();
        if (trainingId.length() != 9) {
            System.out.println(trainingId + " is an invalid training id");
            return;
        }
        String yearStr = trainingId.substring(0, 4);
        int year;
        year = Integer.parseInt(yearStr);
        
        if (year != 2021) {
            System.out.println(year + " is an invalid year");
            return;
        }
        String teamCodeStr = trainingId.substring(4, 6);
        int teamCode;
        teamCode = Integer.parseInt(teamCodeStr);
       
        String team;
        switch (teamCode) {
            case 1:
                team = "LP";
                break;
            case 2:
                team = "TA";
                break;
            case 3:
                team = "CT";
                break;
            case 4:
                team = "PT";
                break;
            case 5:
                team = "TT";
                break;
            default:
                System.out.println(teamCodeStr + " is an invalid team code");
                return;
        }
        String rollNumberStr = trainingId.substring(6);
        int rollNumber;
        rollNumber = Integer.parseInt(rollNumberStr);
        if (rollNumber < 1 || rollNumber > 999) {
            System.out.println(rollNumberStr + " is an invalid roll number");
            return;
        }
        String employeeId = "SIET" + team + String.format("%03d", rollNumber);
        System.out.println("Employee Id: " + employeeId);
    }
}
