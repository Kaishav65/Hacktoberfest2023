#First, you'll need to install the reportlab library if you haven't already. You can install it using pip:
# pip install reportlab

import csv
from reportlab.lib.pagesizes import letter
from reportlab.platypus import SimpleDocTemplate, Table, TableStyle

# Function to convert CSV to PDF
def csv_to_pdf(csv_file, pdf_file):
    # Open the CSV file for reading
    with open(csv_file, 'r', newline='') as csvfile:
        data = list(csv.reader(csvfile))

    # Create a PDF document
    doc = SimpleDocTemplate(pdf_file, pagesize=letter)
    elements = []

    # Create a table from the CSV data
    table = Table(data)

    # Add style to the table
    style = TableStyle([('BACKGROUND', (0, 0), (-1, 0), (0.8, 0.8, 0.8)),
                        ('TEXTCOLOR', (0, 0), (-1, 0), (0, 0, 0)),
                        ('ALIGN', (0, 0), (-1, -1), 'CENTER'),
                        ('FONTNAME', (0, 0), (-1, 0), 'Helvetica-Bold'),
                        ('BOTTOMPADDING', (0, 0), (-1, 0), 12),
                        ('BACKGROUND', (0, 1), (-1, -1), (0.95, 0.95, 0.95)),
                        ('GRID', (0, 0), (-1, -1), 0.5, (0, 0, 0))])

    table.setStyle(style)

    # Add the table to the PDF document
    elements.append(table)

    # Build the PDF document
    doc.build(elements)

if __name__ == "__main__":
    csv_file = "your_input.csv"   # Replace with your input CSV file name
    pdf_file = "output.pdf"       # Replace with your desired output PDF file name

    # Convert CSV to PDF
    csv_to_pdf(csv_file, pdf_file)

    print(f"Conversion complete. PDF saved as {pdf_file}")
