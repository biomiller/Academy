import math        #import needed modules
import pyaudio     #sudo apt-get install python-pyaudio
import random
import time

PyAudio = pyaudio.PyAudio     #initialize pyaudio

#See https://en.wikipedia.org/wiki/Bit_rate#Audio

def toneGen(bit,freq,length):

    BITRATE = bit     #number of frames per second/frameset.      

    FREQUENCY = freq     #Hz, waves per second, 261.63=C4-note.
    LENGTH = length     #seconds to play sound

    if FREQUENCY > BITRATE:
        BITRATE = FREQUENCY+100

    NUMBEROFFRAMES = int(BITRATE * LENGTH)
    RESTFRAMES = NUMBEROFFRAMES % BITRATE
    WAVEDATA = ''    

    #generating waves
    for x in range(NUMBEROFFRAMES):
        WAVEDATA = WAVEDATA+chr(int(math.sin(x/((BITRATE/FREQUENCY)/math.pi))*127+128))    

    for x in range(RESTFRAMES): 
        WAVEDATA = WAVEDATA+chr(128)

    p = PyAudio()
    stream = p.open(format = p.get_format_from_width(1), 
                    channels = 1, 
                    rate = BITRATE, 
                    output = True)

    stream.write(WAVEDATA)
    stream.stop_stream()
    stream.close()
    p.terminate()

# def beep_boop():
#     while True:

#         num = random.randint(0,1)

#         if num ==1:
#             toneGen(20000,2000,0.1)
#         else:
#             toneGen(20000,1000,0.1)

# def noise():
#     while True:
#         num = random.randint(10,20000)
#         time = random.randint(1,10)/10
        
#         toneGen(20000, num, time)


CODE = {'A': '.-',     'B': '-...',   'C': '-.-.', 
        'D': '-..',    'E': '.',      'F': '..-.',
        'G': '--.',    'H': '....',   'I': '..',
        'J': '.---',   'K': '-.-',    'L': '.-..',
        'M': '--',     'N': '-.',     'O': '---',
        'P': '.--.',   'Q': '--.-',   'R': '.-.',
     	'S': '...',    'T': '-',      'U': '..-',
        'V': '...-',   'W': '.--',    'X': '-..-',
        'Y': '-.--',   'Z': '--..',
        
        '0': '-----',  '1': '.----',  '2': '..---',
        '3': '...--',  '4': '....-',  '5': '.....',
        '6': '-....',  '7': '--...',  '8': '---..',
        '9': '----.', ' ': ' '
        }



	
msg = input('MESSAGE: ')
	
for char in msg:
    morse = CODE[char.upper()]
    print(morse)
    
    for x in morse:
        if x == ".":
            #Boop
            toneGen(20000,900,0.05)
        elif x == "-":
            #Beep
            toneGen(20000,2000,0.07)
        elif x == " ":
            time.sleep(0.08)
        
        time.sleep(0.02)
