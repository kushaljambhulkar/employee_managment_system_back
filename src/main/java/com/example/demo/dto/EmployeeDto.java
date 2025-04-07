package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;

    @NotEmpty(message = "Employee First name is mandatory, should not be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee First Name Invalid")
    private String firstName;

    @NotNull(message = "Employee Last name is mandatory, should not be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee Last Name Invalid")
    private String lastName;

    @NotEmpty(message = "Employee email should not be empty")
    @Email(message = "Email address should be valid")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Invalid email format")
    private String email;

    private String departmentName;
}
