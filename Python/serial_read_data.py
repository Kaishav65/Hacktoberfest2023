import serial
from prettytable import PrettyTable

# Define the serial port and baud rate
ser = serial.Serial('COM3', 9600)  # Replace 'COM3' and baud rate as needed

# Create a table
table = PrettyTable(["Data 1", "Data 2", "Data 3", "Data 4"])

try:
    while True:
        # Read data from the serial port
        data = ser.readline().decode('utf-8').strip()

        # Split the received data into a list of integers
        data_values = [int(value) for value in data.split(',')]

        # Check if there are exactly four integer values
        if len(data_values) == 4:
            # Add the data to the table
            table.add_row(data_values)

            # Print the table
            print(table)

except KeyboardInterrupt:
    # Close the serial port when the script is interrupted (e.g., Ctrl+C)
    ser.close()
