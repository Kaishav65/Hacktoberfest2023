# Import necessary libraries and modules
import win32com.client  # For text-to-speech
import os               # For system commands
import webbrowser       # For opening web pages
import speech_recognition as sr  # For speech recognition
import time             # For time-related operations


# Choose the voice for the virtual assistant
your_voice_index = 1
speaker = win32com.client.Dispatch("SAPI.SpVoice")
speaker.Voice = speaker.GetVoices().Item(your_voice_index)

# Function to recognize voice commands
def takeCommand():
    r = sr.Recognizer()
    r.pause_threshold = 0.6
    with sr.Microphone() as source:
        audio = r.listen(source)
        try:
            print("Recognizing.....")
            query = r.recognize_google(audio, language="en-in")
            print(f"User said: {query}")
            return query
        except Exception as e:
            return "some error occurred. Sorry from Friday"

# Main program execution
if __name__ == '__main__':
    # Greet the user
    speaker.speak("Hello, I am Friday! Your virtual AI assistant. How can I help you, sir?")
    
    while True:
        print("Listening.....")
        query = takeCommand().lower()
        
        # Define a list of websites to open
        sites = [["youtube", "https://www.youtube.com"],
                 ["instagram", "https://www.instagram.com"],
                 ["withub", "https://www.github.com"],
                 ["whatsapp", "https://www.whatsapp.com"],
                 ["geeksforgeeks", "https://practice.geeksforgeeks.org/explore?page=1&sortBy=submissions&utm_source=geeksforgeeks&utm_medium=main_header&utm_campaign=practice_header"]]
        
        # Check if the user wants to open a website
        for site in sites:
            if f"open {site[0]}" in query:
                speaker.speak(f"opening {site[0]} sir")
                webbrowser.open(site[1])
                
        # Check for time-based greetings
        greetings = ["good morning friday", "good afternoon friday", "good evening friday"]
        if any([greeting in query for greeting in greetings]): # replaces with list comprehension to make it faster
            # Get the current hour
            hour = time.localtime().tm_hour # moved into if statement to make sure response is correct after longer usage
            if hour > 6 and hour <= 12:
                speaker.speak(f"good morning sir, how can I help you")
            elif hour > 12 and hour <= 17:
                speaker.speak(f"good afternoon sir, how can I help you")
            elif hour > 17 or hour <= 6:
                speaker.speak(f"good evening sir, how can I help you") # removed unnecessary impossible case
            
        # Check for a "good night" command
        if "good night friday" in query:
            speaker.speak(f"good night sir, have a nice day ahead")
            break
        
        # Check for a "what is the time" command
        if "what is the time" in query:
            # Get the current timestamp
            timestamp = time.strftime('%H hours %M minutes %S seconds') # moved into if statement to make sure response is correct
            speaker.speak(f"time is: {timestamp}")
        
        # Check for a greeting
        if "hello friday" in query:
            speaker.speak(f"I'm fine sir, how are you")
        
        # Check for a command to stop the program
        if "friday stop" in query:
            speaker.speak(f"Sure sir")
            break
