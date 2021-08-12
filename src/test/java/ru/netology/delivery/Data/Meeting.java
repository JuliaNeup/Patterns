package ru.netology.delivery.Data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class Meeting {
    private final String firstName;
    private final String lastName;
    private final String city;
    private final LocalDate dateFirstMeeting;
    private final String phoneNumber;
    private final LocalDate dateSecondMeeting;

}
