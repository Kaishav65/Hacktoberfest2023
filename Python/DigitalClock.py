# Make sure you have tkinter installed in your PC
import tkinter as tk
from time import strftime
# Create a function to update the time
def time():
    string = strftime('%H:%M:%S %p') # Get the current time in HH:MM:SS AM/PM format
    label.config(text=string) # Update the label text with the current time
    label.after(1000, time) # Update the time every 1000ms (1 second)

# Create a tkinter window
window = tk.Tk()
window.title('Digital Clock')

# Create a label widget to display the time
label = tk.Label(window, font=('calibri', 40, 'bold'), background='black', foreground='white')
label.pack(anchor='center')

# Run the time function to update the time
time()

# Run the tkinter main loop
window.mainloop()
