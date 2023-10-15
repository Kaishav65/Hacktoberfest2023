import tkinter as tk

def button_click(event):
    current_text = result_var.get()
    button_text = event.widget.cget("text")

    if button_text == "=":
        try:
            result = str(eval(current_text))
            result_var.set(result)
        except Exception as e:
            result_var.set("Error")
    elif button_text == "C":
        result_var.set("")
    else:
        result_var.set(current_text + button_text)

root = tk.Tk()
root.title("Calculator")
root.geometry("300x400")

result_var = tk.StringVar()
result_var.set("")
result_display = tk.Entry(root, textvar=result_var, font=("Helvetica", 24), justify="right")
result_display.grid(row=0, column=0, columnspan=4, padx=10, pady=10, sticky="nsew")

button_texts = [
    ("7", "8", "9", "/"),
    ("4", "5", "6", "*"),
    ("1", "2", "3", "-"),
    ("0", "C", "=", "+")
]

for i in range(4):
    for j in range(4):
        button = tk.Button(root, text=button_texts[i][j], font=("Helvetica", 20), width=5, height=2)
        button.grid(row=i+1, column=j, padx=5, pady=5, sticky="nsew")
        button.bind("<Button-1>", button_click)

# Configure rows and columns to expand with the window
for i in range(5):
    root.grid_rowconfigure(i, weight=1)
    root.grid_columnconfigure(i, weight=1)

root.mainloop()
