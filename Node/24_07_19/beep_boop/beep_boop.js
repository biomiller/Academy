const delay = require("delay");

function getRandomInt(max) {
  return Math.floor(Math.random() * Math.floor(max));
}


async function Beep_Boop() {
    while (true) {
        var num = getRandomInt(2);

        await delay(300);

        if (num == 1) {
            console.log("Beep");
        } else {
            console.log("Boop");
        }
    }
}

Beep_Boop();

