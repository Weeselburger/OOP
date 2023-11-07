package Data;

import java.time.LocalDate;

public record Employee(int id, String firstName, String lastName, LocalDate birthDate,Type type,LocalDate entryDate) {
}
