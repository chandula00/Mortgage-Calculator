# Simple Mortgage Calculator

This is a simple mortgage calculator written in Java. It calculates mortgage payments based on three inputs: principal, payment term, and annual interest rate.

## Usage

To use the mortgage calculator, follow these steps:

1. Run the `Main` class, which serves as the entry point of the program.
2. Enter the following information when prompted:
   - Principal: The principal amount (loan amount) in the range of $1,000 to $1,000,000.
   - Annual Interest Rate: The annual interest rate in the range of 1% to 30%.
   - Period (Years): The payment term in years, ranging from 1 to 30 years.
3. The program will calculate the mortgage and display the results, including the monthly payment amount and the payment schedule.


## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed

### Running the Program

1. Clone this repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Run the `Main` class.


## Classes

### `Main`
The `Main` class serves as the entry point for the mortgage calculator program. It prompts the user to enter the principal, annual interest rate, and payment term. It then creates instances of `MortgageCalculator` and `MortgageReport` to perform the calculations and display the results.

### `MortgageCalculator`
The `MortgageCalculato`r class handles the mortgage calculations based on the provided inputs. It contains methods to calculate the mortgage balance, mortgage payment, and remaining balances over time.

### `MortgageReport`
The `MortgageReport` class formats and prints the mortgage details, including the monthly payment amount and the payment schedule.


## Example

Here's an example of how the program output may look:
```
Principal: 100000
Annual Interest Rate: 12
Period (Years): 5

MORTGAGE
________
Monthly Payments: $2,224.45

PAYMENT SCHEDULE
________________
$98,775.55
$97,538.87
$96,289.81
$95,028.26
$93,754.10
$92,467.20
$91,167.42
$89,854.65
$88,528.75
$87,189.60
$85,837.05
$84,470.97
$83,091.24
$81,697.70
$80,290.24
$78,868.69
$77,432.94
$75,982.82
$74,518.20
$73,038.94
$71,544.88
$70,035.89
$68,511.80
$66,972.48
$65,417.76
$63,847.49
$62,261.52
$60,659.69
$59,041.84
$57,407.81
$55,757.45
$54,090.58
$52,407.04
$50,706.66
$48,989.29
$47,254.73
$45,502.84
$43,733.42
$41,946.31
$40,141.33
$38,318.30
$36,477.04
$34,617.36
$32,739.09
$30,842.04
$28,926.01
$26,990.83
$25,036.29
$23,062.21
$21,068.39
$19,054.63
$17,020.73
$14,966.49
$12,891.71
$10,796.19
$8,679.70
$6,542.06
$4,383.03
$2,202.42
$0.00
```
