

//a=new AudioContext() // browsers limit the number of concurrent audio contexts, so you better re-use'em

var audioCTX = require('audio-context')();

var a = require('web-audio-api').AudioContext;
var context = audioCTX;
var Speaker = require('speaker');



function beep(vol, freq, duration){
  v=a.createOscillator()
  u=a.createGain()
  v.connect(u)
  v.frequency.value=freq
  v.type="square"
  u.connect(a.destination)
  u.gain.value=vol*0.01
  v.start(a.currentTime)
  v.stop(a.currentTime+duration*0.001)
}

beep(20,20,1);
